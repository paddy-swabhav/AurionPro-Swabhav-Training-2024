<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Transactions</title>
<style>
    body {
        margin: 0;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: linear-gradient(120deg, #84fab0 0%, #8fd3f4 100%);
        color: #333;
    }

    .container {
        width: 90%;
        max-width: 1200px; /* Increased width */
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

    input, select {
        padding: 0.75rem;
        margin-bottom: 1rem;
        border: 1px solid #ddd;
        border-radius: 5px;
        font-size: 1rem;
        background: #f8f9fa;
        transition: border-color 0.3s ease, box-shadow 0.3s ease;
    }

    input:focus, select:focus {
        border-color: #0072ff;
        box-shadow: 0 0 5px rgba(0, 114, 255, 0.2);
        outline: none;
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
        transition: background 0.3s ease, transform 0.2s ease;
    }

    button:hover {
        background: #005bb5;
    }

    button:active {
        transform: scale(0.98);
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

    .date-column {
        min-width: 150px; /* Adjust width as needed */
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
        transition: background 0.3s ease, transform 0.2s ease;
    }

    .back-button:hover {
        background: #005bb5;
    }

    .back-button:active {
        transform: scale(0.98);
    }
</style>
</head>
<body>
    <div class="container">
        <h1>VIEW TRANSACTIONS</h1>

        <form action="ViewTransaction" method="post">
            <label>Filter By</label>
            <select name="type" required>
                <option value="All">All</option>
                <option value="credit">Credit</option>
                <option value="debit">Debit</option>
                <option value="transfer">Transfer</option>
            </select>

            <label>From Date:</label>
            <input type="date" name="fromDate" />
            
            <label>To Date:</label>
            <input type="date" name="toDate" />
            
            <button type="submit">Submit</button>
        </form>

        <table>
            <tr>
                <th>TRANSACTION ID</th>
                <th>TRANSACTION TYPE</th>
                <th>SENDER ACCOUNT NUMBER</th>
                <th>RECEIVER ACCOUNT NUMBER</th>
                <th>AMOUNT</th>
                <th class="date-column">DATE</th> <!-- Apply date-column class -->
            </tr>
            <c:forEach var="transaction" items="${transactions}">
                <tr>
                    <td>${transaction.getTransactionid()}</td>
                    <td>${transaction.getTransactiontype()}</td>
                    <td>${transaction.getSenderaccountnumber()}</td>
                    <td>
                        <c:choose>
                            <c:when test="${transaction.getReceiveraccountnumber() == 0}">
                                NA
                            </c:when>
                            <c:otherwise>
                                ${transaction.getReceiveraccountnumber()}
                            </c:otherwise>
                        </c:choose>
                    </td>
                    <td>${transaction.getAmount()}</td>
                    <td class="date-column">${transaction.getDate()}</td> <!-- Apply date-column class -->
                </tr>
            </c:forEach>
        </table>
    </div>

    <form action="GoBackToAdminHome" method="post">
        <button type="submit" name="back" class="back-button">GO BACK TO HOME</button>
    </form>
</body>
</html>
