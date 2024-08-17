<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home</title>
<style>
    body {
        margin: 0;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        height: 100vh;
        background: linear-gradient(120deg, #84fab0 0%, #8fd3f4 100%);
        color: #333;
    }

    h1 {
        font-size: 4rem; /* Increased font size for a bigger title */
        font-weight: 700;
        color: #0072ff;
        margin-bottom: 1rem;
        animation: slideInDown 1s ease-out;
        text-shadow: 2px 2px 5px rgba(0, 0, 0, 0.3);
    }

    h3 {
        color: #555;
        margin-bottom: 2rem;
        font-size: 1.5rem;
        animation: fadeIn 1.5s ease-in-out;
    }

    form {
        display: flex;
        flex-direction: column;
        align-items: center;
    }

    button {
        width: 350px; /* Increased width for lengthier buttons */
        padding: 0.75rem 3.5rem; /* Increased left and right padding */
        margin: 0.5rem 0;
        border: 3px solid #0072ff; /* Increased border width */
        border-radius: 5px;
        font-size: 1rem;
        font-weight: 600;
        color: white;
        background: linear-gradient(90deg, #00c6ff 0%, #0072ff 100%);
        cursor: pointer;
        transition: transform 0.3s ease, background 0.3s ease, border-color 0.3s ease;
        display: flex;
        align-items: center;
        justify-content: flex-start; /* Aligns content to the start (left) */
        gap: 20px; /* Space between icon and text */
    }

    button:hover {
        background: linear-gradient(90deg, #0072ff 0%, #00c6ff 100%);
        transform: scale(1.05);
        border-color: #00c6ff; /* Change border color on hover */
    }

    button i {
        font-size: 1.5rem; /* Adjusted icon size */
    }

    @keyframes slideInDown {
        0% {
            transform: translateY(-100px);
            opacity: 0;
        }
        100% {
            transform: translateY(0);
            opacity: 1;
        }
    }

    @keyframes fadeIn {
        0% {
            opacity: 0;
        }
        100% {
            opacity: 1;
        }
    }
</style>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
</head>
<body>
    <h1>Admin Home</h1>
    <% String name = (String) session.getAttribute("name"); %>
    <h3>Welcome <%= name %></h3>
    <form action="AdminHomeController" method="get">
        <button type="submit" name="operation" value="addnewcustomer">
            <i class="fas fa-user-plus"></i> Add New Customer
        </button>
        <button type="submit" name="operation" value="addbankaccount">
            <i class="fas fa-credit-card"></i> Add Bank Account
        </button>
        <button type="submit" name="operation" value="viewcustomer">
            <i class="fas fa-users"></i> View Customers
        </button>
        <button type="submit" name="operation" value="viewtransaction">
            <i class="fas fa-list"></i> View Transaction
        </button>
        <button type="submit" name="operation" value="logout">
            <i class="fas fa-sign-out-alt"></i> Logout
        </button>
    </form>
</body>
</html>
