<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>View Transactions</title>
</head>
<body>
<h1>VIEW TRANSACTIONS</h1>

<form action="ViewTransactionController" method="post">
    <label>Filter By</label>
    <select name="type" required>
        <option value="All">All</option>
        <option value="credit">Credit</option>
        <option value="debit">Debit</option>
        <option value="transfer">Transfer</option>
    </select>

    <br>

    <label>From Date:</label>
    <input type="date" name="fromDate" />
    
    <label>To Date:</label>
    <input type="date" name="toDate" />
    
    <button type="submit">Submit</button>
</form>

<table border=1>
<tr>
    <th>TRANSACTION ID</th>
    <th>TRANSACTION TYPE</th>
    <th>SENDER ACCOUNT NUMBER</th>
    <th>RECEIVER ACCOUNT NUMBER</th>
    <th>AMOUNT</th>
    <th>DATE</th>
</tr>
<c:forEach var="transaction" items="${transactions}">
    <tr>
        <td>${transaction.getTransactionid()}</td>
        <td>${transaction.getTransactiontype()}</td>
        <td>${transaction.getSenderaccountnumber()}</td>
        <td>
            <c:choose>
                <c:when test="${transaction.getReceiveraccountnumber() == 0}">
                    NA
                </c:when>
                <c:otherwise>
                    ${transaction.getReceiveraccountnumber()}
                </c:otherwise>
            </c:choose>
        </td>
        <td>${transaction.getAmount()}</td>
        <td>${transaction.getDate()}</td>
    </tr>
</c:forEach>

</table>

<br>
<br>
<form action="GoBackToAdminHomeController" method="post">
    <button type="submit" name="back">GO BACK TO HOME</button>
</form>

</body>
</html>
