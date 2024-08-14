package com.techlabs.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.connections.TransactionDatabaseConnection;
import com.techlabs.model.Transaction;

@WebServlet("/ViewTransactionController")
public class ViewTransactionController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private TransactionDatabaseConnection databaseconnection2 = null;
    private RequestDispatcher dispatcher = null;

    public ViewTransactionController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        databaseconnection2 = TransactionDatabaseConnection.getConnectionToDb();
        databaseconnection2.connectToDatabase();

        String type = request.getParameter("type");
        String fromDateStr = request.getParameter("fromDate");
        String toDateStr = request.getParameter("toDate");

        List<Transaction> transactions = null;

        // If both type and dates are provided, filter by type and date range
        if (type != null && !type.isEmpty() && fromDateStr != null && !fromDateStr.isEmpty() && toDateStr != null && !toDateStr.isEmpty()) {
            Date fromDate = Date.valueOf(fromDateStr);
            Date toDate = Date.valueOf(toDateStr);
            transactions = databaseconnection2.getTransactionsByTypeAndDate(type, fromDate, toDate);
        }
        // If only the type is provided, filter by type
        else if (type != null && !type.isEmpty()) {
            if ("All".equals(type)) {
                // If "All" is selected, retrieve all transactions
                transactions = databaseconnection2.getTransactionDetails();
            } else {
                transactions = databaseconnection2.getTransactionDetailsByType(type);
            }
        }
        // If only dates are provided, filter by date range
        else if (fromDateStr != null && !fromDateStr.isEmpty() && toDateStr != null && !toDateStr.isEmpty()) {
            Date fromDate = Date.valueOf(fromDateStr);
            Date toDate = Date.valueOf(toDateStr);
            transactions = databaseconnection2.getTransactionsByDateRange(fromDate, toDate);
        }
        // If neither type nor dates are provided, retrieve all transactions
        else {
            transactions = databaseconnection2.getTransactionDetails();
        }

        request.setAttribute("transactions", transactions);
        dispatcher = request.getRequestDispatcher("/ViewTransactions.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
