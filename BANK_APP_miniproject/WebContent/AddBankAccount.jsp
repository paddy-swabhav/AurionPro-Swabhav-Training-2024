<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>ADD BANK ACCOUNT</h1>
<br><br>

<form action="AddBankAccountController" method="get"> 
<span>Enter Customer ID:</span>
<input type="number" name="customerid"><br>
<button type="submit">SEARCH</button>
</form>

<br><br>
<div>
<p>Customer id: ${customer.getCustomerid()}</p>
<p>Customer Name : ${customer.getFirstName()} ${customer.getLastName()}</p>
<p>Email : ${customer.getEmail()}</p>
</div>

<br>
<br>
<form action="AccountNumberGenerator" method="get">
<input type="hidden" name="customerid" value="${customer.getCustomerid()}" />
<button type="submit">Generate Account Number</button>
</form>
</body>
</html>