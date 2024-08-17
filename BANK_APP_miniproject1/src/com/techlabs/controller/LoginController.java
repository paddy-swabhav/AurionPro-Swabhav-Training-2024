package com.techlabs.controller;

import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.techlabs.connections.AdminDatabaseConnection;
import com.techlabs.connections.CustomerDatabaseConnection;
import com.techlabs.model.Admin;
import com.techlabs.model.Customer;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private CustomerDatabaseConnection databaseconnection = null;
    private AdminDatabaseConnection admindatabaseconnection = null;
    private RequestDispatcher dispatcher = null;

    public LoginController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        databaseconnection = CustomerDatabaseConnection.getConnectionToDb();
        databaseconnection.connectToDatabase();
        admindatabaseconnection = AdminDatabaseConnection.getConnectionToDb();
        admindatabaseconnection.connectToDatabase();

        // Session
        HttpSession session = request.getSession();

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String usertype = request.getParameter("type");

        // Email validation regex pattern
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);

        // Check if the email is valid
        if (!pattern.matcher(username).matches()) {
            request.setAttribute("errorMessage", "Invalid Email Format.");
            dispatcher = request.getRequestDispatcher("/LoginPage.jsp");
            dispatcher.forward(request, response);
            return;
        }

        if (usertype.equalsIgnoreCase("customer")) {
            List<Customer> customers = databaseconnection.getCustomerDetails();
            boolean validUser = false;

            for (Customer customer : customers) {
                if (customer.getEmail().equals(username) && customer.getPassword().equals(password)) {
                    request.setAttribute("username", customer.getFirstName());
                    session.setAttribute("name", customer.getFirstName());
                    session.setAttribute("customerId", customer.getCustomerid());
                    dispatcher = request.getRequestDispatcher("/CustomerHome.jsp");
                    validUser = true;
                    break;
                }
            }

            if (!validUser) {
                request.setAttribute("errorMessage", "Invalid Username or Password.");
                dispatcher = request.getRequestDispatcher("/LoginPage.jsp");
            }

            dispatcher.forward(request, response);
            return;
        }

        if (usertype.equalsIgnoreCase("admin")) {
            List<Admin> admins = admindatabaseconnection.getAdminDetails();
            boolean validUser = false;

            for (Admin admin : admins) {
                if (admin.getEmail().equals(username) && admin.getPassword().equals(password)) {
                    request.setAttribute("username", admin.getName());
                    session.setAttribute("name", admin.getName());
                    dispatcher = request.getRequestDispatcher("/AdminHome.jsp");
                    validUser = true;
                    break;
                }
            }

            if (!validUser) {
                request.setAttribute("errorMessage", "Invalid Username or Password.");
                dispatcher = request.getRequestDispatcher("/LoginPage.jsp");
            }

            dispatcher.forward(request, response);
            return;
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
