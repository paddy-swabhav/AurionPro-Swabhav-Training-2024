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

@WebServlet("/ViewTransaction")
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

        System.out.println("Type: " + type);
        System.out.println("From Date: " + fromDateStr);
        System.out.println("To Date: " + toDateStr);

        List<Transaction> transactions = null;

        try {
            boolean isTypeProvided = type != null && !type.isEmpty() && !"All".equals(type);
            boolean isFromDateProvided = fromDateStr != null && !fromDateStr.isEmpty();
            boolean isToDateProvided = toDateStr != null && !toDateStr.isEmpty();

            Date fromDate = isFromDateProvided ? Date.valueOf(fromDateStr) : null;
            Date toDate = isToDateProvided ? Date.valueOf(toDateStr) : null;

            // Check if both type and date range are provided
            if (isTypeProvided && isFromDateProvided && isToDateProvided) {
                transactions = databaseconnection2.getTransactionsByTypeAndDate(type, fromDate, toDate);
            } 
            // Check if only type is provided
            else if (isTypeProvided) {
                transactions = databaseconnection2.getTransactionDetailsByType(type);
            } 
            // Check if only date range is provided
            else if (isFromDateProvided && isToDateProvided) {
                transactions = databaseconnection2.getTransactionsByDateRange(fromDate, toDate);
            } 
            // If neither type nor date range is provided, fetch all transactions
            else {
                transactions = databaseconnection2.getTransactionDetails();
            }

        } catch (Exception e) {
            e.printStackTrace(); // Log the exception for debugging
        }

        request.setAttribute("transactions", transactions);
        dispatcher = request.getRequestDispatcher("/ViewTransactions.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
