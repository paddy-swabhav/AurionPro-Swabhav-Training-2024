<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Customers</title>
<style>
    body {
        margin: 0;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: linear-gradient(120deg, #84fab0 0%, #8fd3f4 100%);
        color: #333;
    }

    .container {
        width: 90%;
        max-width: 800px;
        margin: 2rem auto;
        padding: 2rem;
        background: white;
        border-radius: 10px;
        box-shadow: 0 10px 20px rgba(0, 0, 0, 0.1);
    }

    h1 {
        font-size: 2rem;
        font-weight: 600;
        color: #0072ff;
        margin-bottom: 1.5rem;
        text-align: center;
    }

    form {
        display: flex;
        flex-direction: column;
        margin-bottom: 1.5rem;
        text-align: center;
    }

    label {
        font-size: 1rem;
        margin-bottom: 0.5rem;
        color: #0072ff;
        font-weight: bold;
    }

    input {
        padding: 0.75rem;
        margin-bottom: 1rem;
        border: 1px solid #ddd;
        border-radius: 5px;
        font-size: 1rem;
        background: #f8f9fa;
    }

    button {
        padding: 0.75rem;
        border: none;
        border-radius: 5px;
        font-size: 1rem;
        font-weight: 600;
        color: white;
        background: #0072ff;
        cursor: pointer;
        margin-bottom: 0.5rem;
        transition: background 0.3s ease;
    }

    button:hover {
        background: #005bb5;
    }

    table {
        width: 100%;
        border-collapse: collapse;
        margin-top: 1rem;
    }

    th, td {
        padding: 1rem;
        text-align: left;
        border: 1px solid #ddd;
    }

    th {
        background-color: #0072ff;
        color: white;
    }

    td {
        background-color: #f8f9fa;
    }

    .back-button {
        display: block;
        width: 100%;
        max-width: 300px;
        margin: 2rem auto;
        padding: 0.75rem;
        font-size: 1rem;
        font-weight: 600;
        color: white;
        background: #0072ff;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        text-align: center;
        transition: background 0.3s ease;
    }

    .back-button:hover {
        background: #005bb5;
    }
</style>
</head>
<body>
    <div class="container">
        <h1>VIEW CUSTOMERS</h1>

        <form action="SearchCustomerForAdmin" method="get">
            <label>Search:</label>
            <input type="text" name="searchInput" required />
            <button type="submit">Search</button>
        </form>
		
		<form action="ViewAllCustomers" method="post">
		<button type="submit">View All Customers</button>
		</form>
		
        <table>
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
                <td>${customer.getAccountnumber() == 0 ? 'N.A.' : customer.getAccountnumber()}</td>
                <td>${customer.getBalance()}</td>
            </tr>
            </c:forEach>
        </table>
    </div>

    <form action="GoBackToAdminHomeController" method="post">
        <button type="submit" name="back" class="back-button">GO BACK TO HOME</button>
    </form>
</body>
</html>
