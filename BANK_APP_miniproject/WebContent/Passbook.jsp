<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Passbook</title>
</head>
<body>
<h1>PASSBOOK</h1>

<form action="PassbookController" method="get">
    <label>SELECT ACCOUNT NUMBER: </label>
    <select name="accountnumber">
        <c:forEach var="accountnumber" items="${accountnumber}">
            <option value="${accountnumber}">${accountnumber}</option>
        </c:forEach>
    </select>

    <label>FILTER BY: </label>
    <select name="transactiontype">
        <option value="All">All</option>
        <option value="credit">Credit</option>
        <option value="debit">Debit</option>
    </select>

    <label>FROM DATE: </label>
    <input type="date" name="fromdate">
    
    <label>TO DATE: </label>
    <input type="date" name="todate">

    <button type="submit">Filter</button>
</form>

<table border="1">
    <tr>
        <th>TRANSACTION ID</th>
        <th>RECEIVER ACCOUNT NUMBER</th>
        <th>TRANSACTION TYPE</th>
        <th>AMOUNT</th>
        <th>TRANSACTION DATE</th>
        <th>BALANCE</th>
    </tr>
    <c:forEach var="passbook" items="${passbooks}">
        <tr>
            <td>${passbook.transactionid}</td>
            <td>
                <c:choose>
                    <c:when test="${passbook.receiveraccountnumber == 0}">
                        Self
                    </c:when>
                    <c:otherwise>
                        ${passbook.receiveraccountnumber}
                    </c:otherwise>
                </c:choose>
            </td>
            <td>
                <c:choose>
                    <c:when test="${passbook.transactiontype == 'transfer' || passbook.transactiontype == 'debit'}">
                        Debit
                    </c:when>
                    <c:otherwise>
                        ${passbook.transactiontype}
                    </c:otherwise>
                </c:choose>
            </td>
            <td>${passbook.amount}</td>
            <td>${passbook.transactiondate}</td>
            <td>${passbook.balance}</td>
        </tr>
    </c:forEach>
</table>

<br>
<br>
<form action="GoBackToCustomerHomeController" method="post">
    <button type="submit" name="back">GO BACK TO HOME</button>
</form>

</body>
</html>
