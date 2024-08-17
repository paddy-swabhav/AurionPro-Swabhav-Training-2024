<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Passbook</title>
<style>
    body {
        margin: 0;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: linear-gradient(120deg, #d0e6f2 0%, #e9f1f6 100%);
        color: #333;
        padding: 2rem;
    }

    h1 {
        font-size: 2.5rem;
        font-weight: 700;
        color: #4a90e2;
        margin-bottom: 2rem;
        text-align: center;
        animation: slideInDown 1s ease-out;
    }

    form {
        display: grid;
        grid-template-columns: 1fr 1fr;
        gap: 1rem;
        align-items: center;
        margin-bottom: 2rem;
        max-width: 600px;
        margin: 0 auto; /* Center the form */
    }

    .form-group {
        display: flex;
        flex-direction: column;
        width: 100%;
    }

    label {
        font-size: 1rem;
        color: #4a90e2;
        font-weight: bold;
        margin-bottom: 0.5rem;
    }

    select, input[type="date"] {
        padding: 0.75rem;
        border: 1px solid #ddd;
        border-radius: 5px;
        font-size: 1rem;
        background: #f8f9fa;
        width: 100%;
        max-width: 100%; /* Ensures it doesn't exceed the container's width */
        box-sizing: border-box; /* Ensures padding and border are included in the width */
    }

    button {
        width: 100%;
        padding: 0.75rem;
        border: none;
        border-radius: 5px;
        font-size: 1rem;
        font-weight: 600;
        color: white;
        background: linear-gradient(90deg, #4a90e2 0%, #6ab0f7 100%);
        cursor: pointer;
        margin-top: 1rem;
        transition: background 0.3s ease, transform 0.3s ease;
        grid-column: span 2; /* Span the button across both columns */
    }

    button:hover {
        background: linear-gradient(90deg, #6ab0f7 0%, #4a90e2 100%);
        transform: scale(1.05);
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
        background-color: #4a90e2;
        color: white;
    }

    td {
        background-color: #f8f9fa;
    }

    .back-button {
        display: block;
        width: 300px;
        padding: 0.75rem;
        font-size: 1rem;
        font-weight: 600;
        color: white;
        background: #4a90e2;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        margin: 2rem auto;
        text-align: center;
        transition: background 0.3s ease, transform 0.3s ease;
    }

    .back-button:hover {
        background: #6ab0f7;
        transform: scale(1.05);
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
    
    .balance-div {
    margin-top: 1rem;
    padding: 1rem;
    border: 1px solid #ddd;
    border-radius: 5px;
    background-color: #f8f9fa;
    max-width: 400px;
    margin-left: auto;
    margin-right: auto; /* Center the balance div */
	}
	
	.balance-label {
	    font-size: 1.2rem;
	    color: #4a90e2;
	    font-weight: bold;
	    margin-right: 0.5rem;
	}
	
	.balance-value {
	    font-size: 1.2rem;
	    color: #333;
	}
	    
    
    
</style>
</head>
<body>
    <h1>PASSBOOK</h1>

    <form action="PassbookController" method="get">
        <div class="form-group">
            <label for="accountnumber">SELECT ACCOUNT NUMBER:</label>
            <select id="accountnumber" name="accountnumber">
                <c:forEach var="accountnumber" items="${accountnumber}">
                    <option value="${accountnumber}">${accountnumber}</option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group">
            <label for="transactiontype">FILTER BY:</label>
            <select id="transactiontype" name="transactiontype">
                <option value="All">All</option>
                <option value="credit">Credit</option>
                <option value="debit">Debit</option>
            </select>
        </div>

        <div class="form-group">
            <label for="fromdate">FROM DATE:</label>
            <input type="date" id="fromdate" name="fromdate">
        </div>
        
        <div class="form-group">
            <label for="todate">TO DATE:</label>
            <input type="date" id="todate" name="todate">
        </div>

        <button type="submit">Filter</button>
    </form>
    
<div class="balance-div">
    <label class="balance-label">CURRENT BALANCE:</label>
    <label class="balance-value">${balance}</label>
</div>


    <table>
        <tr>
            <th>TRANSACTION ID</th>
            <th>RECEIVER ACCOUNT NUMBER</th>
            <th>TRANSACTION TYPE</th>
            <th>AMOUNT</th>
            <th>TRANSACTION DATE</th>
        </tr>
        <c:forEach var="passbook" items="${passbooks}">
            <tr>
                <td>${passbook.transactionid}</td>
                <td>
                    <c:choose>
                        <c:when test="${passbook.receiveraccountnumber == 0 || passbook.receiveraccountnumber == paramacntnumber}">
                            Self
                        </c:when>
                        <c:otherwise>
                            ${passbook.receiveraccountnumber}
                        </c:otherwise>
                    </c:choose>
                </td>
                <td>
                    <c:choose>
                        <c:when test="${passbook.transactiontype == 'transfer' || passbook.transactiontype == 'debit'}">
                            Debit
                        </c:when>
                        <c:otherwise>
                            ${passbook.transactiontype}
                        </c:otherwise>
                    </c:choose>
                </td>
                <td>${passbook.amount}</td>
                <td>${passbook.transactiondate}</td>
            </tr>
        </c:forEach>
    </table>

    <br>
    <form action="GoBackToCustomerHomeController" method="post">
        <button type="submit" name="back" class="back-button">GO BACK TO HOME</button>
    </form>
</body>
</html>
