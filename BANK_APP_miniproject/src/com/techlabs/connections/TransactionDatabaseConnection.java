package com.techlabs.connections;

import java.sql.Connection;
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
			
			preparedStatement = connection.prepareStatement("SELECT * FROM transactions");
			
			result = preparedStatement.executeQuery();
		
			while(result.next())
			{
				transactions.add((new Transaction(result.getInt(1),result.getInt(2),result.getLong(3),result.getLong(4),result.getDouble(5),result.getString(6))));
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
					"Where T.senderaccountnumber =?;");
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
	
	
}
