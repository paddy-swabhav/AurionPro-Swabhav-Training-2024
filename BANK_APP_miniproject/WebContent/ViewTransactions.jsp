<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>VIEW TRANSACTIONS</h1>

<table>
<tr>
<th>TRANSACTION ID</th>
<th>SENDER ACCOUNT NUMBER</th>
<th>RECEIVER ACCOUNT NUMBER</th>
<th>AMOUNT</th>
<th>DATE</th>
</tr>
<c:forEach var="transaction" items="${transactions}">
<tr>
<td>${transaction.getTransactionid()}</td>
<td>${transaction.getTransactiontypeid()}</td>
<td>${transaction.getSenderaccountnumber()}</td>
<td>${transaction.getReceiveraccountnumber()}</td>
<td>${transaction.getAmount()}</td>
<td>${transaction.getDate()}</td>
</tr>
</c:forEach>

</table>



</body>
</html>