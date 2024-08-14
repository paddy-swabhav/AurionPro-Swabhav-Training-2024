<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Edit Profile</title>
</head>
<body>
    <h1>Edit Profile</h1><br>

    <c:if test="${not empty message}">
        <p style="color:red;">${message}</p>
    </c:if>
    <p>${errorMessage}</p>

    <form action="UpdateProfileController" method="post">
        <label>First Name:</label>
        <input type="text" name="firstname" value="${customer.firstName}" required /><br/>

        <label>Last Name:</label>
        <input type="text" name="lastname" value="${customer.lastName}" required /><br/>

        <label>Password:</label>
        <input type="password" name="password" value="${customer.password}" required /><br/>

        <button type="submit">Update</button>
    </form>



<br>
<br>
<form action="GoBackToCustomerHomeController" method="post">
<button type="submit" name="back">GO BACK TO HOME</button>
</form>
    
</body>
</html>
