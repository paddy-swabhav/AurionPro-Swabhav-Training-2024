package com.techlabs.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.connections.TransactionDatabaseConnection;

/**
 * Servlet implementation class TransactionController
 */
@WebServlet("/TransactionController")
public class TransactionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	TransactionDatabaseConnection databaseConnection;
	
    public TransactionController() {
        super();
        // TODO Auto-generated constructor stub
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session == null) {
            response.sendRedirect("LoginPage.jsp");
            return;
        }

        String operation = request.getParameter("operation");
        databaseConnection = TransactionDatabaseConnection.getConnectionToDb();
        databaseConnection.connectToDatabase();

        int id = (int) session.getAttribute("customerid");
        System.out.println(id);
        
        long accountNumber = Long.parseLong(request.getParameter("accountnumber"));
        double amount = Double.parseDouble(request.getParameter("amount"));
        String operation1 = request.getParameter("operation1");
        long receiverAccountNumber = request.getParameter("receiveraccountnumber") != null ? Long.parseLong(request.getParameter("receiveraccountnumber")) : 0;

        databaseConnection = TransactionDatabaseConnection.getConnectionToDb();
        databaseConnection.connectToDatabase();

        if ("credit".equals(operation1)) {
            databaseConnection.creditAmount(accountNumber, amount);
        } else if ("debit".equals(operation1)) {
            databaseConnection.debitAmount(accountNumber, amount);
        } else if ("transfer".equals(operation1)) {
            databaseConnection.transferAmount(accountNumber, receiverAccountNumber, amount);
        }

        request.setAttribute("message", "Transaction successful");
//        request.getRequestDispatcher("/NewTransaction.jsp").forward(request, response);
        
        
        request.setAttribute("operation", operation);

        request.getRequestDispatcher("/NewTransaction.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	HttpSession session = request.getSession(false);
        if (session == null) {
            response.sendRedirect("LoginPage.jsp");
            return;
        }

        String operation = request.getParameter("operation");
        databaseConnection = TransactionDatabaseConnection.getConnectionToDb();
        databaseConnection.connectToDatabase();

//        int id = (int) session.getAttribute("customerid");
//        System.out.println(id);
        
        long accountNumber = Long.parseLong(request.getParameter("accountnumber"));
        double amount = Double.parseDouble(request.getParameter("amount"));
        String operation1 = request.getParameter("operation1");
        long receiverAccountNumber = request.getParameter("receiveraccountnumber") != null ? Long.parseLong(request.getParameter("receiveraccountnumber")) : 0;

        databaseConnection = TransactionDatabaseConnection.getConnectionToDb();
        databaseConnection.connectToDatabase();

        if ("credit".equals(operation1)) {
            databaseConnection.creditAmount(accountNumber, amount);
        } else if ("debit".equals(operation1)) {
            databaseConnection.debitAmount(accountNumber, amount);
        } else if ("transfer".equals(operation1)) {
            databaseConnection.transferAmount(accountNumber, receiverAccountNumber, amount);
        }

        request.setAttribute("message", "Transaction successful");
//        request.getRequestDispatcher("/NewTransaction.jsp").forward(request, response);
        
        
        request.setAttribute("operation", operation);

        request.getRequestDispatcher("/NewTransaction.jsp").forward(request, response);

//    	HttpSession session = request.getSession(false);
//        if (session == null) {
//            response.sendRedirect("LoginPage.jsp");
//            return;
//        }
//
//        long accountNumber = Long.parseLong(request.getParameter("accountnumber"));
//        double amount = Double.parseDouble(request.getParameter("amount"));
//        String operation = request.getParameter("operation");
//        long receiverAccountNumber = request.getParameter("receiveraccountnumber") != null ? Long.parseLong(request.getParameter("receiveraccountnumber")) : 0;
//
//        databaseConnection = TransactionDatabaseConnection.getConnectionToDb();
//        databaseConnection.connectToDatabase();
//
//        if ("credit".equals(operation)) {
//            databaseConnection.creditAmount(accountNumber, amount);
//        } else if ("debit".equals(operation)) {
//            databaseConnection.debitAmount(accountNumber, amount);
//        } else if ("transfer".equals(operation)) {
//            databaseConnection.transferAmount(accountNumber, receiverAccountNumber, amount);
//        }
//
//        request.setAttribute("message", "Transaction successful");
//        request.getRequestDispatcher("/NewTransaction.jsp").forward(request, response);
    }

}
