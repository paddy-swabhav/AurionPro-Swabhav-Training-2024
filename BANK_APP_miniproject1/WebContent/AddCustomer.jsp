<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Customer</title>
<style>
    body {
        margin: 0;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: linear-gradient(120deg, #84fab0 0%, #8fd3f4 100%); /* Correct background gradient */
        color: #333;
    }
    
    .container {
        width: 100%;
        max-width: 500px;
        margin: 3rem auto; /* Creates space at the top */
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
    }

    span {
        font-size: 1rem;
        margin-bottom: 0.5rem;
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
        color: red;
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
</style>
</head>
<body>
    <div class="container">
        <h1>ADD CUSTOMER</h1>

        <form action="AddCustomerController" method="post">
            <span>First Name: </span>
            <input type="text" name="firstname" placeholder="Example: John">
            <span>Last Name: </span>
            <input type="text" name="lastname" placeholder="Example: Vinesmokes">
            <span>Email: </span>
            <input type="email" name="email" placeholder="Example: John@gmail.com">
            <span>Password: </span>
            <input type="password" name="password">
            <button type="submit">ADD CUSTOMER</button>
            <button type="reset" class="reset-button">CANCEL</button>
            <p class="status-message">${addcustomerstatus}</p>
        </form>
    </div>

    <div class="back-button-container">
        <form action="GoBackToAdminHomeController" method="post">
            <button type="submit" name="back" class="back-button">GO BACK TO HOME</button>
        </form>
    </div>
</body>
</html>
