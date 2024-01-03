<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tax Calculation</title>
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

        .tax-form-container {
            max-width: 600px;
            margin: auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        label {
            display: block;
            color: #555;
            margin-top: 10px;
            text-align: left;
        }

        input {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            text-decoration: none;
            display: inline-block;
            width: 100%;
            padding: 10px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
            background-color: #4285f4;
            color: #fff;
            transition: background-color 0.3s ease-in-out, color 0.3s ease-in-out;
        }

        input[type="submit"]:hover {
            background-color: #357ae8;
            color: #fff;
        }
    </style>
</head>
<body>
    <h2>Tax Calculator BD</h2>
    <div class="tax-form-container">
        <h3>Income Details</h3>
        <form action="${pageContext.request.contextPath}/calculateTax" method="post">
            <label for="basicPay">Basic Pay:</label>
            <input type="text" id="basicPay" name="basicPay" required>

            <label for="houseRentAllowance">House Rent Allowance:</label>
            <input type="text" id="houseRentAllowance" name="houseRentAllowance" required>

            <label for="conveyanceAllowance">Conveyance Allowance:</label>
            <input type="text" id="conveyanceAllowance" name="conveyanceAllowance" required>

            <label for="medicalAllowance">Medical Allowance:</label>
            <input type="text" id="medicalAllowance" name="medicalAllowance" required>

            <label for="otherAllowance">Other Allowance:</label>
            <input type="text" id="otherAllowance" name="otherAllowance" required>

            <label for="deductionAmount">Deduction Amount:</label>
            <input type="text" id="deductionAmount" name="deductionAmount" required>

            <input type="submit" value="Calculate Tax">
        </form>
    </div>
</body>
</html>
