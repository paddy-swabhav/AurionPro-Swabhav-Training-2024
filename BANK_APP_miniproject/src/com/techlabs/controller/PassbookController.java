package com.techlabs.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.connections.TransactionDatabaseConnection;
import com.techlabs.model.Passbook;


@WebServlet("/PassbookController")
public class PassbookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	  TransactionDatabaseConnection databaseconnection2;

    public PassbookController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String accountNumberParam = request.getParameter("accountnumber");
        long accountNumber = Long.parseLong(accountNumberParam);
        
        databaseconnection2 = TransactionDatabaseConnection.getConnectionToDb();
        databaseconnection2.connectToDatabase();
        
        List<Passbook> passbook = databaseconnection2.getPassbookDetails(accountNumber);

        // Set passbook details in the request scope
        request.setAttribute("passbooks", passbook);

        // Forward to the Passbook.jsp page
        RequestDispatcher dispatcher = request.getRequestDispatcher("/Passbook.jsp");
        dispatcher.forward(request, response);
	}

		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
