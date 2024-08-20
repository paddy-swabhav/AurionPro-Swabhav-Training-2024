<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer HomePage</title>
<style>
    body {
        margin: 0;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        height: 100vh;
        background: linear-gradient(120deg, #d0e6f2 0%, #e9f1f6 100%);
        color: #333;
    }

    h1 {
        font-size: 4rem; /* Increased font size for a bigger title */
        font-weight: 700;
        color: #4a90e2;
        margin-bottom: 1rem;
        animation: slideInDown 1s ease-out;
        text-shadow: 2px 2px 5px rgba(0, 0, 0, 0.2);
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
        border: 3px solid #4a90e2; /* Increased border width */
        border-radius: 5px;
        font-size: 1rem;
        font-weight: 600;
        color: white;
        background: linear-gradient(90deg, #4a90e2 0%, #6ab0f7 100%);
        cursor: pointer;
        transition: transform 0.3s ease, background 0.3s ease, border-color 0.3s ease;
        display: flex;
        align-items: center;
        justify-content: flex-start; /* Aligns content to the start (left) */
        gap: 20px; /* Space between icon and text */
    }

    button:hover {
        background: linear-gradient(90deg, #6ab0f7 0%, #4a90e2 100%);
        transform: scale(1.05);
        border-color: #6ab0f7; /* Change border color on hover */
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
    <h1>Customer Home</h1>
    <% String name = (String) session.getAttribute("name"); %>
    <h3>Welcome <%= name %></h3>
    <form action="CustomerHome" method="get">
        <button type="submit" name="operation" value="passbook">
            <i class="fas fa-book"></i> Passbook
        </button>
        <button type="submit" name="operation" value="newtransaction">
            <i class="fas fa-plus"></i> New Transaction
        </button>
        <button type="submit" name="operation" value="editprofile">
            <i class="fas fa-user-edit"></i> Edit Profile
        </button>
        <button type="submit" name="operation" value="logout">
            <i class="fas fa-sign-out-alt"></i> Logout
        </button>
    </form>
</body>
</html>
