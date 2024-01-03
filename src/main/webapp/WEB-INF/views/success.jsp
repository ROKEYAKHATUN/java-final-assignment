<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success Page</title>
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

        .success-container {
            max-width: 600px;
            margin: auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        .result-message {
            font-size: 20px;
            margin-bottom: 20px;
            color: #4CAF50; /* Green color for success */
        }

        .back-to-home {
            display: block;
            margin-top: 20px;
            text-decoration: none;
            padding: 10px 20px;
            background-color: #4285f4;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease-in-out;
        }

        .back-to-home:hover {
            background-color: #357ae8;
        }
    </style>
</head>
<body>
    <h2>Success Page</h2>
    <div class="success-container">
        <div class="result-message" id="result-message">The tax has been calculated successfully!</div>
        <div class="result-message">Calculated Tax Amount: ${calculatedTax}</div>
        <a href="${pageContext.request.contextPath}/home" class="back-to-home">Back to Home</a>
    </div>
</body>
</html>
