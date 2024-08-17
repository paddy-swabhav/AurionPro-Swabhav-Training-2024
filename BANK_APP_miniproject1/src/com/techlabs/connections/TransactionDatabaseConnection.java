package com.techlabs.connections;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Passbook;
import com.techlabs.model.Transaction;

public class TransactionDatabaseConnection {

	private Connection connection=null;
	private PreparedStatement preparedStatement= null;
	private static TransactionDatabaseConnection databaseConnection = null;
	
	
	public TransactionDatabaseConnection() {
		
	}
	
	public static TransactionDatabaseConnection getConnectionToDb()
	{
		if(databaseConnection==null)
		{
			databaseConnection = new TransactionDatabaseConnection();
		}
		return  databaseConnection;
	}




	public void connectToDatabase()
	{
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//CREATE CONNECTION
			String username = "root";
			String password = "root";
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank",username,password);
			System.out.println("Connection Successful");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		} 
	}
	
	
	public List<Transaction> getTransactionDetails()
	{
		databaseConnection.connectToDatabase();
		ResultSet result = null;
		List<Transaction> transactions = new ArrayList<Transaction>();
	
		try {
			
			preparedStatement = connection.prepareStatement("SELECT t.transactionid,tt.transactiontype, t.senderaccountnumber, t.receiveraccountnumber, t.amount,t.transactiondate\r\n" + 
															"FROM transactions t\r\n" + 
															"JOIN transactiontypes tt ON t.transactiontypeid = tt.transactiontypeid ORDER BY t.transactiondate DESC;");
			
			result = preparedStatement.executeQuery();
		
			while(result.next())
			{
				transactions.add((new Transaction(result.getInt(1),result.getString(2),result.getLong(3),result.getLong(4),result.getDouble(5),result.getString(6))));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return transactions;
	}
	
	public List<Passbook> getPassbookDetails(long accountnumber)
	{
		databaseConnection.connectToDatabase();
		ResultSet result = null;
		List<Passbook> passbook = new ArrayList<Passbook>();
		System.out.println("IN PASSbook method");
	
		try {
			System.out.println("inside try");
			preparedStatement = connection.prepareStatement("SELECT T.transactionid, T.receiveraccountnumber, TY.transactiontype, T.amount, T.transactiondate, A.balance\r\n" + 
					"FROM transactions T\r\n" + 
					"JOIN transactiontypes TY ON T.transactiontypeid = TY.transactiontypeid\r\n" + 
					"JOIN accounts A ON T.senderaccountnumber = A.accountnumber\r\n" + 
					"Where T.senderaccountnumber =? ORDER BY T.transactionid DESC;");
			preparedStatement.setLong(1, accountnumber);
			result = preparedStatement.executeQuery();
			System.out.println("qury exe");
			while(result.next())
			{
				passbook.add((new Passbook(result.getInt(1),result.getLong(2),result.getString(3),result.getDouble(4),result.getString(5),result.getDouble(6))));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return passbook;
	}
	
	public List<Long> getAccountNumbers(int id)
	{
		databaseConnection.connectToDatabase();
		ResultSet result = null;
		List<Long> accountnumbers = new ArrayList<Long>();
		
		try {
			preparedStatement = connection.prepareStatement("SELECT a.accountnumber\r\n" + 
															"FROM accounts a\r\n" + 
															"JOIN customers c ON a.customerid = c.customerid\r\n" + 
															"WHERE c.customerid = ?;");
			preparedStatement.setInt(1, id);
			result = preparedStatement.executeQuery();
			
			while(result.next())
			{
				accountnumbers.add(result.getLong(1));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accountnumbers;
	}
	
	
	public void creditAmount(long accountNumber, double amount) {
        connectToDatabase();
        try {
            connection.setAutoCommit(false);
            
            preparedStatement = connection.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE accountnumber = ?");
            preparedStatement.setDouble(1, amount);
            preparedStatement.setLong(2, accountNumber);
            preparedStatement.executeUpdate();
            
            preparedStatement = connection.prepareStatement("INSERT INTO transactions (transactiontypeid, senderaccountnumber, receiveraccountnumber, amount, transactiondate) VALUES (?, ?, ?, ?, NOW())");
            preparedStatement.setInt(1, 1); 
            preparedStatement.setLong(2, accountNumber);
            preparedStatement.setLong(3, accountNumber);
            preparedStatement.setDouble(4, amount);
            preparedStatement.executeUpdate();
            
            connection.commit();
            System.out.println("Amount credited successfully");
        } catch (SQLException e) {
            try {
                if (connection != null) connection.rollback();
            } catch (SQLException se) {
                se.printStackTrace();
            }
            e.printStackTrace();
        }
    }

    public void debitAmount(long accountNumber, double amount) {
        connectToDatabase();
        try {
            connection.setAutoCommit(false);

            preparedStatement = connection.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE accountnumber = ?");
            preparedStatement.setDouble(1, amount);
            preparedStatement.setLong(2, accountNumber);
            preparedStatement.executeUpdate();

            preparedStatement = connection.prepareStatement("INSERT INTO transactions (transactiontypeid, senderaccountnumber, receiveraccountnumber, amount, transactiondate) VALUES (?, ?, ?, ?, NOW())");
            preparedStatement.setInt(1, 2); 
            preparedStatement.setLong(2, accountNumber);
            preparedStatement.setLong(3, accountNumber);
            preparedStatement.setDouble(4, amount);
            preparedStatement.executeUpdate();

            connection.commit();
            System.out.println("Amount debited successfully");
        } catch (SQLException e) {
            try {
                if (connection != null) connection.rollback();
            } catch (SQLException se) {
                se.printStackTrace();
            }
            e.printStackTrace();
        }
    }

    public void transferAmount(long senderAccountNumber, long receiverAccountNumber, double amount) {
        connectToDatabase();
        try {
            connection.setAutoCommit(false);

            preparedStatement = connection.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE accountnumber = ?");
            preparedStatement.setDouble(1, amount);
            preparedStatement.setLong(2, senderAccountNumber);
            preparedStatement.executeUpdate();

            preparedStatement = connection.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE accountnumber = ?");
            preparedStatement.setDouble(1, amount);
            preparedStatement.setLong(2, receiverAccountNumber);
            preparedStatement.executeUpdate();

            preparedStatement = connection.prepareStatement("INSERT INTO transactions (transactiontypeid, senderaccountnumber, receiveraccountnumber, amount, transactiondate) VALUES (?, ?, ?, ?, NOW())");
            preparedStatement.setInt(1, 3); 
            preparedStatement.setLong(2, senderAccountNumber);
            preparedStatement.setLong(3, receiverAccountNumber);
            preparedStatement.setDouble(4, amount);
            preparedStatement.executeUpdate();

            connection.commit();
            System.out.println("Amount transferred successfully");
        } catch (SQLException e) {
            try {
                if (connection != null) connection.rollback();
            } catch (SQLException se) {
                se.printStackTrace();
            }
            e.printStackTrace();
        }
    }

	public List<Transaction> getTransactionDetailsByType(String type) {
		
		databaseConnection.connectToDatabase();
		ResultSet result = null;
		List<Transaction> transactions = new ArrayList<Transaction>();
	
		try {
			
			preparedStatement = connection.prepareStatement("SELECT t.transactionid,tt.transactiontype, t.senderaccountnumber, t.receiveraccountnumber, t.amount,t.transactiondate\r\n" + 
															"FROM transactions t\r\n" + 
															"JOIN transactiontypes tt ON t.transactiontypeid = tt.transactiontypeid\r\n" + 
															"where tt.transactiontype=? ORDER BY t.transactiondate DESC;");
			preparedStatement.setString(1, type);
			
			result = preparedStatement.executeQuery();
		
			while(result.next())
			{
				transactions.add((new Transaction(result.getInt(1),result.getString(2),result.getLong(3),result.getLong(4),result.getDouble(5),result.getString(6))));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return transactions;
	}
	
	
	
	public List<Transaction> getTransactionsByDateRange(Date fromDate, Date toDate) {
	    connectToDatabase();
	    ResultSet result = null;
	    List<Transaction> transactions = new ArrayList<>();

	    try {
	        preparedStatement = connection.prepareStatement(
	            "SELECT t.transactionid,tt.transactiontype, t.senderaccountnumber, t.receiveraccountnumber, t.amount,t.transactiondate\r\n" + 
	            "FROM transactions t\r\n" + 
	            "JOIN transactiontypes tt ON t.transactiontypeid = tt.transactiontypeid\r\n" + 
	            "where t.transactiondate BETWEEN ? AND ?\r\n" + 
	            "ORDER BY t.transactionid;"
	        );

	        preparedStatement.setDate(1, fromDate);
	        preparedStatement.setDate(2, toDate);
	        
	        result = preparedStatement.executeQuery();

	        while (result.next()) {
	            transactions.add(new Transaction(
	                result.getInt(1),
	                result.getString(2),
	                result.getLong(3),
	                result.getLong(4),
	                result.getDouble(5),
	                result.getString(6)
	            ));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    
	    return transactions;
	}

	
	 public List<Transaction> getTransactionsByTypeAndDate(String type, Date fromDate, Date toDate) {
	        connectToDatabase();
	        ResultSet result = null;
	        List<Transaction> transactions = new ArrayList<>();

	        try {
	            preparedStatement = connection.prepareStatement(
	                "SELECT t.transactionid, tt.transactiontype, t.senderaccountnumber, " +
	                "t.receiveraccountnumber, t.amount, t.transactiondate " +
	                "FROM transactions t " +
	                "JOIN transactiontypes tt ON t.transactiontypeid = tt.transactiontypeid " +
	                "WHERE tt.transactiontype = ? AND t.transactiondate BETWEEN ? AND ? ORDER BY t.transactiondate DESC;"
	            );

	            preparedStatement.setString(1, type);
	            preparedStatement.setDate(2, fromDate);
	            preparedStatement.setDate(3, toDate);

	            result = preparedStatement.executeQuery();

	            while (result.next()) {
	                transactions.add(new Transaction(
	                    result.getInt(1),
	                    result.getString(2),
	                    result.getLong(3),
	                    result.getLong(4),
	                    result.getDouble(5),
	                    result.getString(6)
	                ));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return transactions;
	    }
	
	
	 public List<Passbook> getPassbookDetailsByType(long accountNumber, String type) {
	        connectToDatabase();
	        ResultSet result = null;
	        List<Passbook> passbook = new ArrayList<>();
	        
	        try {
	            preparedStatement = connection.prepareStatement(
	                "SELECT T.transactionid, T.receiveraccountnumber, TY.transactiontype, T.amount, T.transactiondate, A.balance " +
	                "FROM transactions T " +
	                "JOIN transactiontypes TY ON T.transactiontypeid = TY.transactiontypeid " +
	                "JOIN accounts A ON T.senderaccountnumber = A.accountnumber " +
	                "WHERE T.senderaccountnumber = ? AND TY.transactiontype = ? ORDER BY T.transactionid DESC;"
	            );
	            preparedStatement.setLong(1, accountNumber);
	            preparedStatement.setString(2, type);
	            result = preparedStatement.executeQuery();
	            
	            while (result.next()) {
	                passbook.add(new Passbook(
	                    result.getInt(1),
	                    result.getLong(2),
	                    result.getString(3),
	                    result.getDouble(4),
	                    result.getString(5),
	                    result.getDouble(6)
	                ));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return passbook;
	    }

	    // Method to get passbook details filtered by date
	    public List<Passbook> getPassbookDetailsByDate(long accountNumber, Date fromDate, Date toDate) {
	        connectToDatabase();
	        ResultSet result = null;
	        List<Passbook> passbook = new ArrayList<>();
	        
	        try {
	            preparedStatement = connection.prepareStatement(
	                "SELECT T.transactionid, T.receiveraccountnumber, TY.transactiontype, T.amount, T.transactiondate, A.balance " +
	                "FROM transactions T " +
	                "JOIN transactiontypes TY ON T.transactiontypeid = TY.transactiontypeid " +
	                "JOIN accounts A ON T.senderaccountnumber = A.accountnumber " +
	                "WHERE T.senderaccountnumber = ? AND T.transactiondate BETWEEN ? AND ? ORDER BY T.transactionid DESC;"
	            );
	            preparedStatement.setLong(1, accountNumber);
	            preparedStatement.setDate(2, fromDate);
	            preparedStatement.setDate(3, toDate);
	            result = preparedStatement.executeQuery();
	            
	            while (result.next()) {
	                passbook.add(new Passbook(
	                    result.getInt(1),
	                    result.getLong(2),
	                    result.getString(3),
	                    result.getDouble(4),
	                    result.getString(5),
	                    result.getDouble(6)
	                ));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return passbook;
	    }

	    // Method to get passbook details filtered by type and date
	    public List<Passbook> getPassbookDetailsByTypeAndDate(long accountNumber, String type, Date fromDate, Date toDate) {
	        connectToDatabase();
	        ResultSet result = null;
	        List<Passbook> passbook = new ArrayList<>();
	        
	        try {
	            preparedStatement = connection.prepareStatement(
	                "SELECT T.transactionid, T.receiveraccountnumber, TY.transactiontype, T.amount, T.transactiondate, A.balance " +
	                "FROM transactions T " +
	                "JOIN transactiontypes TY ON T.transactiontypeid = TY.transactiontypeid " +
	                "JOIN accounts A ON T.senderaccountnumber = A.accountnumber " +
	                "WHERE T.senderaccountnumber = ? AND TY.transactiontype = ? AND T.transactiondate BETWEEN ? AND ? ORDER BY T.transactionid DESC;;"
	            );
	            preparedStatement.setLong(1, accountNumber);
	            preparedStatement.setString(2, type);
	            preparedStatement.setDate(3, fromDate);
	            preparedStatement.setDate(4, toDate);
	            result = preparedStatement.executeQuery();
	            
	            while (result.next()) {
	                passbook.add(new Passbook(
	                    result.getInt(1),
	                    result.getLong(2),
	                    result.getString(3),
	                    result.getDouble(4),
	                    result.getString(5),
	                    result.getDouble(6)
	                ));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return passbook;
	    }
	    
	    
	    public double getBalance(long accountNumber)
	    {
	    	 connectToDatabase();
		        ResultSet result = null;
		        double balance = 0;
		        
		        try {
		            preparedStatement = connection.prepareStatement(
		                "SELECT balance from accounts WHERE accountnumber = ?;"
		            );
		            preparedStatement.setLong(1, accountNumber);
		            
		            result = preparedStatement.executeQuery();
		            
		            while (result.next()) {
		             
		            	balance = result.getDouble("balance");
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		        return balance;
	    }
	
}
