<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer HomePage</title>
</head>
<body>
<h1>Customer Home</h1>
<% String name = (String) session.getAttribute("name"); %>
<h3>Welcome <%= name %></h3>

<form action="CustomerHomeController" method="get">
<button type="submit" name="operation" value="passbook">Passbook</button>
<button type="submit" name="operation" value="newtransaction">New Transaction</button>
<button type="submit" name="operation" value="editprofile">Edit Profile</button>
</form>


</body>
</html>