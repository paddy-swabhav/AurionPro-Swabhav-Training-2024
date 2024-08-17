<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Transaction</title>
    <style>
        body {
            margin: 0;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(120deg, #84fab0 0%, #8fd3f4 100%);
            color: #333;
        }

        .container {
            width: 100%;
            max-width: 600px;
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
            gap: 1rem;
        }

        .button-container {
            display: flex;
            justify-content: space-between; /* Distributes buttons evenly */
            margin-bottom: 1.5rem;
        }

        .button-container input {
            padding: 0.75rem 1.5rem;
            border: none;
            border-radius: 5px;
            font-size: 1rem;
            font-weight: 600;
            color: white;
            background: #b0c4de; /* Light color for background */
            cursor: pointer;
            transition: background 0.3s ease, transform 0.2s ease, box-shadow 0.3s ease;
            flex: 1; /* Allows buttons to take equal width */
            margin: 0 0.5rem; /* Space between buttons */
            text-transform: uppercase; /* Display button values in caps */
        }

        .button-container input:hover {
            background: #9ab0d0; /* Slightly darker shade for hover effect */
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.2);
        }

        .button-container input:active {
            transform: scale(0.98);
        }

        label {
            font-size: 1rem;
            margin-bottom: 0.5rem;
            color: #0072ff;
            font-weight: bold;
        }

        input, select {
            padding: 0.75rem;
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
            transition: background 0.3s ease, transform 0.2s ease;
        }

        button:hover {
            background: #005bb5;
        }

        button:active {
            transform: scale(0.98);
        }

        .status-message {
            color: red;
            font-size: 0.9rem;
            margin-top: 1rem;
            text-align: center;
        }

        .back-button-container {
            width: 100%;
            max-width: 300px;
            margin: 2rem auto;
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
            transition: background 0.3s ease, transform 0.2s ease;
        }

        .back-button:hover {
            background: #005bb5;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Transaction</h1>

        <form action="OperationSelectionController" method="post">
            <div class="button-container">
                <input type="submit" name="operation" value="credit" /> 
                <input type="submit" name="operation" value="debit" />
                <input type="submit" name="operation" value="transfer"/> 
            </div>
        </form>
        
        <form action="TransactionController" method="post">
            <input type="hidden" name="operation1" value="${operation}"/>
            
            <label>Choose Account Number:</label>
            <select name="accountnumber">
                <c:forEach var="accountnumber" items="${accountnumber}">
                <option value="${accountnumber}">${accountnumber}</option>
                </c:forEach>
            </select>

            <c:choose>
                <c:when test="${operation == 'transfer' or operation == 'credit' or operation == 'debit'}">
                    <label>Amount:</label>
                    <input type="number" name="amount" step="0.01" min="1" required />
                </c:when>
            </c:choose>
            
            <c:choose>
                <c:when test="${operation == 'transfer'}">
                    <label>Receiver Account Number:</label>
                    <input type="number" name="receiveraccountnumber" required />
                </c:when>
            </c:choose>
            
            <c:choose>
                <c:when test="${operation == 'transfer' or operation == 'credit' or operation == 'debit'}">
                    <button type="submit">Submit</button>
                </c:when>
            </c:choose>
        </form>

        <c:if test="${not empty message}">
            <p class="status-message">${message}</p>
        </c:if>
    </div>

    <div class="back-button-container">
        <form action="GoBackToCustomerHomeController" method="post">
            <button type="submit" name="back" class="back-button">GO BACK TO HOME</button>
        </form>
    </div>
</body>
</html>
