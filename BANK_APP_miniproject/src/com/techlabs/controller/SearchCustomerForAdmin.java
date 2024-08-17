package com.techlabs.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.connections.CustomerDatabaseConnection;
import com.techlabs.model.Customer1;

@WebServlet("/SearchCustomerForAdmin")
public class SearchCustomerForAdmin extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private CustomerDatabaseConnection databaseConnection = null;
    private RequestDispatcher dispatcher = null;

    public SearchCustomerForAdmin() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String searchInput = request.getParameter("searchInput");

        databaseConnection = CustomerDatabaseConnection.getConnectionToDb();
        databaseConnection.connectToDatabase();
        
        List<Customer1> customers = null;

        customers = databaseConnection.searchCustomersForAdmin(searchInput);

        request.setAttribute("customers", customers);
        dispatcher = request.getRequestDispatcher("/ViewCustomers.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
