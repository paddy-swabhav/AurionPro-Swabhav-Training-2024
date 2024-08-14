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

import com.techlabs.connections.TransactionDatabaseConnection;
import com.techlabs.model.Passbook;


@WebServlet("/CustomerHomeController")
public class CustomerHomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	TransactionDatabaseConnection databaseconnection2;
	RequestDispatcher dispatcher;

    public CustomerHomeController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

		HttpSession session = request.getSession(false);
		 String name = (String) session.getAttribute("name");
		 int id = (int) session.getAttribute("customerId");
//		 session.getAttribute("customerId");

	
		String operation = request.getParameter("operation");
		
		if(operation.equals("passbook"))
		{
			databaseconnection2 = TransactionDatabaseConnection.getConnectionToDb();
			databaseconnection2.connectToDatabase();
			
			System.out.println(name);
			
			List<Long> accountnumbers = databaseconnection2.getAccountNumbers(id);
			request.setAttribute("accountnumber", accountnumbers);
			
			dispatcher = request.getRequestDispatcher("/Passbook.jsp");
			dispatcher.forward(request, response);
			return;
		}
		if(operation.equals("newtransaction"))
		{
	        
	        databaseconnection2 = TransactionDatabaseConnection.getConnectionToDb();
	        databaseconnection2.connectToDatabase();
	        
	        List<Long> accountnumbers = databaseconnection2.getAccountNumbers(id);
			request.setAttribute("accountnumbers", accountnumbers);
	        
			
			dispatcher = request.getRequestDispatcher("/NewTransaction.jsp");
			dispatcher.forward(request, response);	
			return;
		}
		if(operation.equals("editprofile"))
		{
			dispatcher = request.getRequestDispatcher("/EditProfile.jsp");
			dispatcher.forward(request, response);
			return;
		}
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
