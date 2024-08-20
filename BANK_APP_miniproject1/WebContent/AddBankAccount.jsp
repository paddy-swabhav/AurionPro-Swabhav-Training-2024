<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Bank Account</title>
<style>
    body {
        margin: 0;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: linear-gradient(120deg, #84fab0 0%, #8fd3f4 100%);
        color: #333;
    }

    .container {
        width: 100%;
        max-width: 500px;
        margin: 3rem auto;
        padding: 2rem;
        background: white;
        border-radius: 10px;
        box-shadow: 0 10px 20px rgba(0, 0, 0, 0.1);
        box-sizing: border-box;
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
    }

    span, label {
        font-size: 1rem;
        margin-bottom: 0.5rem;
    }

    .label-custom {
        color: blue; /* Custom color for the specified labels */
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

    .reset-button {
        background: #6c757d;
    }

    .reset-button:hover {
        background: #5a6268;
    }

    .status-message {
        color: blue;
        font-size: 0.9rem;
        margin-top: 1rem;
        text-align: center;
    }

    .back-button-container {
        width: 100%;
        max-width: 300px;
        margin: 1rem auto;
        text-align: center;
    }

    .back-button {
        width: 100%;
        padding: 0.75rem;
        font-size: 1rem;
        font-weight: 600;
        color: white;
        background: #0072ff;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        transition: background 0.3s ease;
    }

    .back-button:hover {
        background: #005bb5;
    }

    .customer-info {
        margin-bottom: 1.5rem;
    }

    .customer-info p {
        font-size: 1rem;
        margin: 0.5rem 0;
    }

    .retrieved-value {
        color: #333;
        font-weight: normal;
    }
</style>
</head>
<body>
    <div class="container">
        <h1>ADD BANK ACCOUNT</h1>
        <form action="AddBankAccount" method="get"> 
            <span class="label-custom">Enter Customer ID:</span>
            <input type="number" name="customerid" min="1"><br>
            <button type="submit">SEARCH</button>
        </form>

        <div class="customer-info">
            <p><span class="label-custom">Customer id:</span> <span class="retrieved-value">${customer.getCustomerid()}</span></p>
            <p><span class="label-custom">Customer Name :</span> <span class="retrieved-value">${customer.getFirstName()} ${customer.getLastName()}</span></p>
            <p><span class="label-custom">Email :</span> <span class="retrieved-value">${customer.getEmail()}</span></p>
        </div>

        <form action="AccountNumberGenerator" method="get">
            <input type="hidden" name="customerid" value="${customer.getCustomerid()}" />
            <label class="label-custom">Enter the account opening Balance:</label>
            <input type="number" name="balance" min="1000" required><br>
            <button type="submit">Generate Account Number</button>
        </form>

        <p class="status-message">${message}</p>
    </div>

    <div class="back-button-container">
        <form action="GoBackToAdminHome" method="post">
            <button type="submit" name="back" class="back-button">GO BACK TO HOME</button>
        </form>
    </div>
</body>
</html>
