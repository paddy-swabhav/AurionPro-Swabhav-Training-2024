<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Customers</title>
</head>
<body>
<h1>VIEW CUSTOMERS</h1>

<form action="SearchCustomerForAdmin" method="get">
    <label>Search:</label>
    <input type="text" name="searchInput" required />
    <button type="submit">Search</button>
</form>

<table border="1">
<tr>
<th>CUSTOMER ID</th>
<th>FIRST NAME</th>
<th>LAST NAME</th>
<th>EMAIL</th>
<th>ACCOUNT NUMBER</th>
<th>BALANCE</th>
</tr>
<c:forEach var="customer" items="${customers}">
<tr>
<td>${customer.getCustomerid()}</td>
<td>${customer.getFirstName()}</td>
<td>${customer.getLastName()}</td>
<td>${customer.getEmail()}</td>
<td>${customer.getAccountnumber()}</td>
<td>${customer.getBalance()}</td>
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
