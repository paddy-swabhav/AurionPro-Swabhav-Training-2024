package com.techlabs.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.connections.CustomerDatabaseConnection;
import com.techlabs.model.Customer;



@WebServlet("/AddBankAccount")
public class AddBankAccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CustomerDatabaseConnection database = new CustomerDatabaseConnection();
	RequestDispatcher dispatcher;
	
    public AddBankAccountController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		database.connectToDatabase();
		int customerid = Integer.parseInt(request.getParameter("customerid"));
		Customer customer = database.getCustomer(customerid);

		if (customer == null) {
            request.setAttribute("message", "Wrong ID entered.");
        } else {
            request.setAttribute("customer", customer);
        }
		
		dispatcher = request.getRequestDispatcher("/AddBankAccount.jsp");
		dispatcher.forward(request, response);
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
