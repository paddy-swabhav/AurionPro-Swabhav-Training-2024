package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.connections.AccountDatabaseConnection;
import com.techlabs.model.Customer;

/**
 * Servlet implementation class AccountNumberGenerator
 */
@WebServlet("/AccountNumberGenerator")
public class AccountNumberGenerator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	AccountDatabaseConnection database = new AccountDatabaseConnection();
	RequestDispatcher dispatcher;
 
    public AccountNumberGenerator() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		database.connectToDatabase();
		
        int id = Integer.parseInt(request.getParameter("customerid"));
        double balance = Double.parseDouble(request.getParameter("balance"));
		database.generateAccountNumber(id,balance);
		
		request.setAttribute("message", "Account Generated Successfully");
		dispatcher = request.getRequestDispatcher("/AddBankAccount.jsp");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
