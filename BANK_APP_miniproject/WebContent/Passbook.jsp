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
<h1>PASSBOOK</h1>
<form action="PassbookController" method="get">
<label>SELECT ACCOUNT NUMBER: </label>

<select name="accountnumber">
<c:forEach var="accountnumber" items="${accountnumber}">
<option value="${accountnumber}">${accountnumber}</option>
</c:forEach>
</select>

<button type="submit">Submit</button>
</form>



<table>
<tr>
<th>TRANSACTION ID</th>
<th>RECEIVER ACCOUNT NUMBER</th>
<th>TRANSACTION TYPE</th>
<th>AMOUNT</th>
<th>TRANSACTION DATE</th>
<th>BALANCE</th>
</tr>
<c:forEach var="passbooks" items="${passbooks}">
<tr>
<td>${passbooks.getTransactionid()}</td>
<td>${passbooks.getReceiveraccountnumber()}</td>
<td>${passbooks.getTransactiontype()}</td>
<td>${passbooks.getAmount()}</td>
<td>${passbooks.getTransactiondate()}</td>
<td>${passbooks.getBalance()}</td>
</tr>
</c:forEach>
</table>


</body>
</html>