<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Transaction</title>
</head>
<body>
    <h1>Transaction</h1>


	<form action="OperationSelectionController" method="post">
        <input type="submit" name="operation" value="credit" /> 
        <input type="submit" name="operation" value="debit" />
        <input type="submit" name="operation" value="transfer"/> <br/>
	</form>
	
    <form action="TransactionController" method="post">
    
    <input type="hidden" name="operation1" value="${operation}"/>
    
        <label>Choose Account Number:</label>
        <select name="accountnumber">
			<c:forEach var="accountnumber" items="${accountnumber}">
			<option value="${accountnumber}">${accountnumber}</option>
			</c:forEach>
		</select><br/>

		<c:choose>
			<c:when test="${operation == 'transfer' or operation == 'credit' or operation == 'debit'}">
		        <label>Amount:</label>
		        <input type="number" name="amount" step="0.01" min="1" required /><br/>
	        </c:when>
        </c:choose>
        
        
        <c:choose>
            <c:when test="${operation == 'transfer'}">
                <label>Receiver Account Number:</label>
                <input type="number" name="receiveraccountnumber" required /><br/>
            </c:when>
        </c:choose>
		
		<c:choose>
			<c:when test="${operation == 'transfer' or operation == 'credit' or operation == 'debit'}">
        		<button type="submit">Submit</button>
        	</c:when>
        </c:choose>
        
    </form>

    <c:if test="${not empty message}">
        <p>${message}</p>
    </c:if>
    
    
    
    <br>
<br>
<form action="GoBackToCustomerHomeController" method="post">
<button type="submit" name="back">GO BACK TO HOME</button>
</form>
</body>
</html>
