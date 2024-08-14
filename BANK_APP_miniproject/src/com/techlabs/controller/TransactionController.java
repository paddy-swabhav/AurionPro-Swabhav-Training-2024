package com.techlabs.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.connections.TransactionDatabaseConnection;
import com.techlabs.model.Passbook;

@WebServlet("/TransactionController")
public class TransactionController extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    TransactionDatabaseConnection databaseConnection;
    RequestDispatcher dispatcher;

    public TransactionController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String operation = request.getParameter("operation");
        String accountnumberParam = request.getParameter("accountnumber");
        String amountParam = request.getParameter("amount");
        String receiverAccountParam = request.getParameter("receiveraccountnumber");

        long accountnumber = accountnumberParam != null ? Long.parseLong(accountnumberParam) : 0;
        double amount = amountParam != null ? Double.parseDouble(amountParam) : 0;
        long receiverAccountNumber = receiverAccountParam != null ? Long.parseLong(receiverAccountParam) : 0;

        databaseConnection = TransactionDatabaseConnection.getConnectionToDb();
        databaseConnection.connectToDatabase();

        // Handle operations
        switch (operation) {
            case "credit":
                databaseConnection.creditAmount(accountnumber, amount);
                request.setAttribute("message", "Amount credited successfully.");
                break;
            case "debit":
                databaseConnection.debitAmount(accountnumber, amount);
                request.setAttribute("message", "Amount debited successfully.");
                break;
            case "transfer":
                databaseConnection.transferAmount(accountnumber, receiverAccountNumber, amount);
                request.setAttribute("message", "Amount transferred successfully.");
                break;
        }

        // Re-fetch account numbers for the form
        HttpSession session = request.getSession(false);
        int id = (int) session.getAttribute("customerId");
        List<Long> accountnumbers = databaseConnection.getAccountNumbers(id);
        request.setAttribute("accountnumbers", accountnumbers);
        request.setAttribute("operation", operation);
        request.setAttribute("amount", amount);
        request.setAttribute("receiveraccountnumber", receiverAccountNumber);
        request.setAttribute("selectedAccountNumber", accountnumber);

        dispatcher = request.getRequestDispatcher("/NewTransaction.jsp");
        dispatcher.forward(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}

