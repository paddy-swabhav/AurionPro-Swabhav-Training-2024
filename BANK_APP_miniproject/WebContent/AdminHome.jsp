<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Admin Home</h1>

<% String name = (String) session.getAttribute("name"); %>
<h3>Welcome <%= name %></h3>
<form action="AdminHomeController" method="get">
<button type="submit" name="operation" value="addnewcustomer">Add New Customer</button>
<button type="submit" name="operation" value="addbankaccount">Add Bank Acount</button>
<button type="submit" name="operation" value="viewcustomer">View Customers</button>
<button type="submit" name="operation" value="viewtransaction">View Transaction</button>
</form>
</body>
</html>