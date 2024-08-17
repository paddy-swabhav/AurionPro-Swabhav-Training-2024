package com.techlabs.controller;

import java.io.IOException;
import java.util.regex.Pattern;

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

    private CustomerDatabaseConnection databaseConnection;
    private RequestDispatcher dispatcher;

    public UpdateProfileController() {
        super();
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

        // Validation
        String errorMessage = null;

        if (fname == null || lname == null || password == null || fname.isEmpty() || lname.isEmpty() || password.isEmpty()) {
            errorMessage = "All fields are required.";
        } else if (!Pattern.matches("[a-zA-Z]+", fname) || !Pattern.matches("[a-zA-Z]+", lname)) {
            errorMessage = "First name and last name cannot contain numbers.";
        } else if (!Pattern.matches("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}", password)) {
            errorMessage = "Password must contain at least one digit, one lowercase letter, one uppercase letter, and be at least 8 characters long.";
        }

        if (errorMessage != null) {
            request.setAttribute("errorMessage", errorMessage);
            dispatcher = request.getRequestDispatcher("/EditProfile.jsp");
            dispatcher.forward(request, response);
            return;
        }

        // If validation is successful, proceed with updating the customer
        databaseConnection = CustomerDatabaseConnection.getConnectionToDb();
        databaseConnection.connectToDatabase();
        databaseConnection.updateCustomer(customerId, fname, lname, password);

        request.setAttribute("message", "Profile updated successfully");
        dispatcher = request.getRequestDispatcher("/EditProfile.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
