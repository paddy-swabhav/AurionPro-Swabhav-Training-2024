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
import javax.servlet.http.HttpSession;

import com.techlabs.connections.TransactionDatabaseConnection;
import com.techlabs.model.Passbook;

@WebServlet("/PassbookController")
public class PassbookController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    private TransactionDatabaseConnection databaseconnection2;

    public PassbookController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession(false);
        int id = (int) session.getAttribute("customerId");

        String accountNumberParam = request.getParameter("accountnumber");
        long accountNumber = Long.parseLong(accountNumberParam);

        String transactionType = request.getParameter("transactiontype");
        String fromDateParam = request.getParameter("fromdate");
        String toDateParam = request.getParameter("todate");

        Date fromDate = fromDateParam != null && !fromDateParam.isEmpty() ? Date.valueOf(fromDateParam) : null;
        Date toDate = toDateParam != null && !toDateParam.isEmpty() ? Date.valueOf(toDateParam) : null;

        databaseconnection2 = TransactionDatabaseConnection.getConnectionToDb();
        databaseconnection2.connectToDatabase();

        List<Long> accountnumbers = databaseconnection2.getAccountNumbers(id);
        request.setAttribute("accountnumber", accountnumbers);

        List<Passbook> passbook = null;

        if ("All".equals(transactionType)) {
            if (fromDate != null && toDate != null) {
                passbook = databaseconnection2.getPassbookDetailsByDate(accountNumber, fromDate, toDate);
            } else {
                passbook = databaseconnection2.getPassbookDetails(accountNumber);
            }
        } else {
            if (fromDate != null && toDate != null) {
                passbook = databaseconnection2.getPassbookDetailsByTypeAndDate(accountNumber, transactionType, fromDate, toDate);
            } else {
                passbook = databaseconnection2.getPassbookDetailsByType(accountNumber, transactionType);
            }
        }

        request.setAttribute("passbooks", passbook);
        request.setAttribute("paramacntnumber", accountNumber);
        
        // GETTING THE BALANCE
        
        double balance = databaseconnection2.getBalance(accountNumber);
        request.setAttribute("balance", balance);
        
        
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/Passbook.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
