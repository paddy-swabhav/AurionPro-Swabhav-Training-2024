<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Auro Bank - Login</title>
    <style>
        body {
            margin: 0;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            display: flex;
            height: 100vh;
            background: linear-gradient(120deg, #84fab0 0%, #8fd3f4 100%);
            color: #333;
        }
        .left-side {
            width: 50%;
            display: flex;
            justify-content: center;
            align-items: center;
            padding: 2rem;
            color: white;
            background: linear-gradient(135deg, #00c6ff 0%, #0072ff 100%);
            position: relative;
        }
        .left-side h1 {
            font-size: 3.5rem;
            font-weight: 700;
            margin: 0;
            text-align: center;
            opacity: 0.9;
            animation: fadeIn 2s ease-in-out infinite alternate;
        }
        .right-side {
            width: 50%;
            display: flex;
            justify-content: center;
            align-items: center;
            padding: 2rem;
            background: white;
        }
        .container {
            background-color: white;
            padding: 2rem;
            border-radius: 15px;
            box-shadow: 0 10px 20px rgba(0, 0, 0, 0.15);
            width: 100%;
            max-width: 400px;
            box-sizing: border-box; /* Ensures padding is included within the width */
            animation: fadeInUp 0.6s ease-out;
            transition: transform 0.3s ease, box-shadow 0.3s ease; /* Smooth transition for the pop effect */
        }
        .container:hover {
            transform: scale(1.05); /* Slightly enlarges the form */
            box-shadow: 0 15px 30px rgba(0, 0, 0, 0.2); /* Increases the shadow for a more pronounced 3D effect */
        }
        @keyframes fadeIn {
            0% { opacity: 0.7; }
            100% { opacity: 1; }
        }
        @keyframes fadeInUp {
            0% { transform: translateY(30px); opacity: 0; }
            100% { transform: translateY(0); opacity: 1; }
        }
        h2 {
            color: #0072ff;
            margin-bottom: 1rem;
            font-size: 2rem;
            font-weight: 600;
        }
        .input-group {
            position: relative;
            margin-bottom: 1.5rem;
        }
        .input-group i {
            position: absolute;
            top: 50%;
            left: 15px;
            transform: translateY(-50%);
            color: #0072ff;
            font-size: 1.2rem;
        }
        .input-group input, .input-group select {
            width: 100%;
            padding: 0.75rem 0.75rem 0.75rem 2.75rem;
            border: 1px solid #ddd;
            border-radius: 5px;
            font-size: 1rem;
            color: #555;
            background: #f8f9fa;
            outline: none;
            transition: border-color 0.3s ease;
            box-sizing: border-box; /* Ensures padding is included within the width */
        }
        .input-group input:focus, .input-group select:focus {
            border-color: #0072ff;
        }
        .input-group select {
            -webkit-appearance: none;
            -moz-appearance: none;
            appearance: none;
            background: url('data:image/svg+xml;base64,...') no-repeat right 10px center;
            background-size: 12px;
        }
        button {
            width: 100%;
            padding: 0.75rem;
            border: none;
            border-radius: 5px;
            font-size: 1rem;
            font-weight: 600;
            color: white;
            background: linear-gradient(90deg, #00c6ff 0%, #0072ff 100%);
            cursor: pointer;
            transition: background 0.3s ease;
            margin-bottom: 0.5rem;
        }
        button:hover {
            background: linear-gradient(90deg, #0072ff 0%, #00c6ff 100%);
        }
        .reset-button {
            background: #6c757d;
        }
        .reset-button:hover {
            background: #5a6268;
        }
        .popup {
            display: none;
            position: fixed;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            background: #fff;
            border-radius: 10px;
            padding: 1.5rem;
            box-shadow: 0 10px 20px rgba(0, 0, 0, 0.15);
            text-align: center;
            z-index: 1000;
        }
        .popup.show {
            display: block;
            animation: fadeInUp 0.4s ease;
        }
        .popup h3 {
            margin: 0;
            font-size: 1.25rem;
            color: #333;
            margin-bottom: 1rem;
        }
        .popup button {
            width: auto;
            padding: 0.5rem 1rem;
            font-size: 1rem;
        }
    </style>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
</head>
<body>
    <div class="left-side">
        <h1>AURO BANK</h1>
    </div>
    <div class="right-side">
        <div class="container">
            <h2>LOGIN PAGE</h2>
            <form action="Login" method="Post">
                <div class="input-group">
                    <i class="fas fa-user"></i>
                    <input type="email" id="username" name="username" placeholder="Username" required>
                </div>
                <div class="input-group">
                    <i class="fas fa-lock"></i>
                    <input type="password" id="password" name="password" placeholder="Password" required>
                </div>
                <div class="input-group">
                    <i class="fas fa-users"></i>
                    <select id="type" name="type" required>
						<option value="" disabled selected>Select Type of User</option>
                        <option>Admin</option>
                        <option>Customer</option>
                    </select>
                </div>
                <button type="submit">Login</button>
                <button type="reset" class="reset-button">Reset</button>

                <% 
                    String errorMessage = (String) request.getAttribute("errorMessage"); 
                    if (errorMessage != null) { 
                %>
                    <script type="text/javascript">
                        const popup = document.createElement('div');
                        popup.className = 'popup show';
                        popup.innerHTML = `<h3><%= errorMessage %></h3><button onclick="closePopup()">OK</button>`;
                        document.body.appendChild(popup);

                        function closePopup() {
                            popup.classList.remove('show');
                            setTimeout(() => document.body.removeChild(popup), 300);
                            window.location = "LoginPage.jsp";
                        }
                    </script>
                <% 
                    } 
                %>
            </form>
        </div>
    </div>
</body>
</html>
