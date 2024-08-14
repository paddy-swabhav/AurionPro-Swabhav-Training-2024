<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>ADD CUSTOMER</h1>

<form action="AddCustomerController" method="post">
<span>First Name: </span>
<input type="text" name="firstname" placeholder="Example: John">
<br>

<span>Last Name: </span>
<input type="text" name="lastname" placeholder="Example: Vinesmokes">
<br>

<span>Email: </span>
<input type="email" name="email" placeholder="Example: John@gmail.com">
<br>

<span>Password: </span>
<input type="password" name="password" >
<br>

<button type="submit"> ADD CUSTOMER</button>
<button type="reset">CANCEL</button>



<p style="color:red;">${addcustomerstatus}</p>

</form>

<br>
<br>
<form action="GoBackToAdminHomeController" method="post">
<button type="submit" name="back">GO BACK TO HOME</button>
</form>
</body>
</html>