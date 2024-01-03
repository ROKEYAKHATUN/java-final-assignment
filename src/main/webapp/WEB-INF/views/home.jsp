<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
    <!-- Include home.js script -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/home.js"></script>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f7f7f7;
            color: #333;
            margin: 20px;
            text-align: center;
        }

        h2 {
            color: #4285f4;
        }

        .welcome-container {
            max-width: 600px;
            margin: auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        .welcome-message {
            font-size: 20px;
            margin-bottom: 20px;
        }

        .button-container {
            display: flex;
            justify-content: space-around;
        }

        .action-button {
            padding: 10px 20px;
            margin: 10px;
            background-color: #4285f4;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease-in-out;
        }

        .action-button:hover {
            background-color: #357ae8;
        }
    </style>
</head>
<body>
    <h2>Tax Calculator BD</h2>
    <div class="welcome-container">
        <div class="welcome-message" id="welcome-message">Welcome, ${user.fullName}!</div>
        <div class="button-container">
            <button class="action-button" id="view-information-button">View Information</button>
            <button class="action-button" id="tax-calculation-button">Tax Calculation</button>
        </div>
    </div>
</body>
</html>
