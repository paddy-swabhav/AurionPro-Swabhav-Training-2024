<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bank Login</title>
</head>
<body>
<h2>LOGIN PAGE</h2>

<form action="LoginController" method="Post">
<label>Username: </label>
<input type="email" name="username" placeholder="example@gmail.com" required>
<br>
<label>Password: </label>
<input type="password" name="password" required>
<br>
<select name="type" required>
<option disabled selected>Select Type of user</option>
<option>Admin</option>
<option>Customer</option>
</select>
<br>
<button type="submit">Login</button>
<button type="reset">Reset</button>

</form>
</body>
</html>