<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Edit Profile</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <style>
        body {
            margin: 0;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(120deg, #84fab0 0%, #8fd3f4 100%);
            color: #333;
            padding: 2rem;
        }

        h1 {
            font-size: 2rem;
            font-weight: 600;
            color: #0072ff;
            margin-bottom: 1.5rem;
            text-align: center;
        }

        form {
            max-width: 500px;
            margin: 0 auto;
            padding: 2rem;
            background: white;
            border-radius: 10px;
            box-shadow: 0 10px 20px rgba(0, 0, 0, 0.1);
            box-sizing: border-box;
            display: flex;
            flex-direction: column;
            gap: 1rem;
        }

        .form-group {
            display: flex;
            flex-direction: column; /* Stack label and input vertically */
            gap: 0.5rem;
        }

        label {
            font-size: 1rem;
            font-weight: bold;
            color: #0072ff;
            display: flex;
            align-items: center;
        }

        .form-group i {
            font-size: 1.2rem;
            color: #0072ff;
            margin-right: 0.5rem;
        }

        input {
            padding: 0.75rem;
            border: 1px solid #ddd;
            border-radius: 5px;
            font-size: 1rem;
            background: #f8f9fa;
            transition: border-color 0.3s ease, box-shadow 0.3s ease;
        }

        input:focus {
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
            text-align: center;
            margin-top: 2rem;
        }

        .back-button {
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
    <h1>Edit Profile</h1>

    <c:if test="${not empty message}">
        <p class="status-message">${message}</p>
    </c:if>
    <p class="status-message">${errorMessage}</p>

    <form action="UpdateProfile" method="post">
        <div class="form-group">
            <label for="firstname">
                <i class="fas fa-user"></i>
                First Name:
            </label>
            <input id="firstname" type="text" name="firstname" value="${customer.firstName}" required />
        </div>

        <div class="form-group">
            <label for="lastname">
                <i class="fas fa-user"></i>
                Last Name:
            </label>
            <input id="lastname" type="text" name="lastname" value="${customer.lastName}" required />
        </div>

		<div class="form-group">
		    <label for="oldpassword">
		        <i class="fas fa-lock"></i>
		        Old Password:
		    </label>
		    <input id="oldpassword" type="password" name="oldpassword" required />
		</div>
		
		
        <div class="form-group">
            <label for="password">
                <i class="fas fa-key"></i>
                Password:
            </label>
            <input id="password" type="password" name="password" value="${customer.password}" required />
        </div>

        <button type="submit">Update</button>
    </form>

    <form action="GoBackToCustomerHome" method="post" class="back-button-container">
        <button type="submit" name="back" class="back-button">GO BACK TO HOME</button>
    </form>
</body>
</html>
