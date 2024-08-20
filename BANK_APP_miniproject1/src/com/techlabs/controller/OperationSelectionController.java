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

/**
 * Servlet implementation class OperationSelectionController
 */
@WebServlet("/OperationSelection")
public class OperationSelectionController extends HttpServlet {
    private static final long serialVersionUID = 1L;
	TransactionDatabaseConnection databaseconnection2;
	private RequestDispatcher dispatcher = null;
    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	
    	HttpSession session = request.getSession(false);
		 int id = (int) session.getAttribute("customerId");
    	
		 
		 databaseconnection2 = TransactionDatabaseConnection.getConnectionToDb();
	        databaseconnection2.connectToDatabase();
	        
	        List<Long> accountnumbers = databaseconnection2.getAccountNumbers(id);
			request.setAttribute("accountnumber", accountnumbers);
		 
		 System.out.println();
    	String operation = request.getParameter("operation");
//        String accountNumber = request.getParameter("accountnumber");

        request.setAttribute("operation", operation);
//        request.setAttribute("accountnumber", accountNumber);

        request.getRequestDispatcher("/NewTransaction.jsp").forward(request, response);
    }
}
