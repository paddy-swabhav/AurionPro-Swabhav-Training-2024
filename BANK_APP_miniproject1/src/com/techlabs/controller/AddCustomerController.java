package com.techlabs.controller;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.connections.CustomerDatabaseConnection;

@WebServlet("/AddCustomer")
public class AddCustomerController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final String NAME_REGEX = "^[a-zA-Z]+$";
    private static final String PASSWORD_REGEX = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}";

    CustomerDatabaseConnection database = new CustomerDatabaseConnection();
    RequestDispatcher dispatcher;

    public AddCustomerController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        StringBuilder validationErrors = new StringBuilder();

        // Validate firstname and lastname
        if (firstname == null || !Pattern.matches(NAME_REGEX, firstname)) {
            validationErrors.append("Firstname cannot contain numbers. ");
        }
        if (lastname == null || !Pattern.matches(NAME_REGEX, lastname)) {
            validationErrors.append("Lastname cannot contain numbers. ");
        }

        // Validate password
        if (password == null || !Pattern.matches(PASSWORD_REGEX, password)) {
            validationErrors.append("Password must be at least 8 characters long and include at least one digit, one lowercase letter, and one uppercase letter.");
        }

        if (validationErrors.length() == 0) {
            database.connectToDatabase();
            database.addCustomer(firstname, lastname, email, password);
            request.setAttribute("addcustomerstatus", "Customer Added Successfully");
        } else {
            request.setAttribute("addcustomerstatus", validationErrors.toString());
        }

        dispatcher = request.getRequestDispatcher("/AddCustomer.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
