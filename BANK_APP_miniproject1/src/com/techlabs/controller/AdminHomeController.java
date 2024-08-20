package com.techlabs.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.connections.CustomerDatabaseConnection;
import com.techlabs.connections.TransactionDatabaseConnection;
import com.techlabs.model.Customer1;
import com.techlabs.model.Transaction;


@WebServlet("/AdminHome")
public class AdminHomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private  CustomerDatabaseConnection databaseconnection1 = null;
	private TransactionDatabaseConnection databaseconnection2 = null;
	RequestDispatcher dispatcher;
	
    public AdminHomeController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
	
		String operation = request.getParameter("operation");
		
		if(operation.equals("addnewcustomer"))
		{
			dispatcher = request.getRequestDispatcher("/AddCustomer.jsp");
			dispatcher.forward(request, response);
			return;
		}
		if(operation.equals("addbankaccount"))
		{
			dispatcher = request.getRequestDispatcher("/AddBankAccount.jsp");
			dispatcher.forward(request, response);	
			return;
		}
		if(operation.equals("viewcustomer"))
		{
			databaseconnection1 = CustomerDatabaseConnection.getConnectionToDb();
			databaseconnection1.connectToDatabase();
			List<Customer1> customers = databaseconnection1.getCustomerDetailsForAdmin();
			request.setAttribute("customers", customers);
			dispatcher = request.getRequestDispatcher("/ViewCustomers.jsp");
			dispatcher.forward(request, response);
			return;
		}
		if(operation.equals("viewtransaction"))
		{
			databaseconnection2 = TransactionDatabaseConnection.getConnectionToDb();
			databaseconnection2.connectToDatabase();
			List<Transaction> transactions = databaseconnection2.getTransactionDetails();
			request.setAttribute("transactions", transactions);
			dispatcher = request.getRequestDispatcher("/ViewTransactions.jsp");
			dispatcher.forward(request, response);
			return;
		}
		
		if(operation.equals("logout"))
		{
            session=request.getSession();  
            session.invalidate();  
            
            System.out.print("You are successfully logged out!");  

			
			dispatcher = request.getRequestDispatcher("/LoginPage.jsp");
			dispatcher.forward(request, response);
			return;
		}
		
		
		
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
