package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.connections.CustomerDatabaseConnection;


@WebServlet("/AddCustomerController")
public class AddCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	CustomerDatabaseConnection database = new CustomerDatabaseConnection();
	RequestDispatcher dispatcher;
    public AddCustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		database.connectToDatabase();
		if(!firstname.equals("") && !lastname.equals("") && !email.equals("") && password.length()>8)
		{
			database.addCustomer(firstname, lastname, email, password);
			dispatcher = request.getRequestDispatcher("/AddCustomer.jsp");
//			session.setAttribute("addcustomerstatus", "Customer Added Successfuly");
			request.setAttribute("addcustomerstatus", "Customer Added Successfuly");
			dispatcher.forward(request, response);
			
		}
		else 
			System.out.println("WRONG INPUT");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
