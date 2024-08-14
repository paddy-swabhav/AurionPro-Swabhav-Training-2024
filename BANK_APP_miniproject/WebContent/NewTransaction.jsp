<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Transaction</title>
    <style>
        .hidden { display: none; }
        .visible { display: block; }
    </style>
</head>
<body>
    <h1>Transaction</h1>

    <!-- Form to select operation -->
    <form action="TransactionController" method="post">
        <label>Choose Operation:</label><br/>
        <button type="submit" name="operation" value="credit">Credit</button>
        <button type="submit" name="operation" value="debit">Debit</button>
        <button type="submit" name="operation" value="transfer">Transfer</button>
    </form>

    <c:if test="${not empty operation}">
        <form action="TransactionController" method="post">
            <input type="hidden" name="operation" value="${operation}"/>
            
            <label>Choose Account Number:</label>
            <select name="accountnumber">
                <c:forEach var="accountnumber" items="${accountnumbers}">
                    <option value="${accountnumber}" <c:if test="${accountnumber == selectedAccountNumber}">selected</c:if>>${accountnumber}</option>
                </c:forEach>
            </select><br/>

            <label>Amount:</label>
            <input type="number" name="amount" step="0.01" value="${amount}" required /><br/>

            <c:choose>
                <c:when test="${operation == 'transfer'}">
                    <label>Receiver Account Number:</label>
                    <input type="number" name="receiveraccountnumber" value="${receiveraccountnumber}" required /><br/>
                </c:when>
                <c:otherwise>
                    <label>Receiver Account Number:</label>
                    <input type="number" name="receiveraccountnumber" class="hidden" /><br/>
                </c:otherwise>
            </c:choose>

            <button type="submit">Submit</button>
        </form>
    </c:if>


</body>
</html>
