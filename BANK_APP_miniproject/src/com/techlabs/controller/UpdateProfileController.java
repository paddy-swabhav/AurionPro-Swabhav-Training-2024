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

@WebServlet("/UpdateProfileController")
public class UpdateProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	CustomerDatabaseConnection databaseConnection;
    RequestDispatcher dispatcher;

    public UpdateProfileController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
        if (session == null) {
            response.sendRedirect("LoginPage.jsp");
            return;
        }

        String name = (String) session.getAttribute("name");
        int customerId = Integer.parseInt(session.getAttribute("customerId").toString()); // Assuming customer ID is stored in session

        String fname = request.getParameter("firstname");
        String lname = request.getParameter("lastname");
        String password = request.getParameter("password");

        databaseConnection = CustomerDatabaseConnection.getConnectionToDb();
        databaseConnection.connectToDatabase();
        databaseConnection.updateCustomer(customerId, fname, lname, password);

        request.setAttribute("message", "Profile updated successfully");
        dispatcher = request.getRequestDispatcher("/EditProfile.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
