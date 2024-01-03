<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Secure Access Portal</title>
    <style>
        /* mystyles.css */

        body {
            font-family: 'Roboto', sans-serif;
            color: white;
            margin: 0;
            padding: 30px;
            text-align: center;
        }

        h2 {
            color: #21a1f1;
        }

        hr {
            border: 1px solid #555;
            margin: 30px 0;
        }

        .access-container {
            max-width: 450px;
            margin: auto;
            background-color: white;
            padding: 30px;
            border-radius: 15px;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.2);
        }

        label {
            display: block;
            text-align: left;
            color: #777;
            margin-top: 15px;
            width: 100%;
        }

        input {
            width: 100%;
            padding: 12px;
            margin-bottom: 20px;
            border: 1px solid #444;
            border-radius: 8px;
            box-sizing: border-box;
            background-color: white;
            color: black;
        }

        input[type="submit"] {
            text-decoration: none;
            display: inline-block;
            width: 100%;
            padding: 12px;
            border: none;
            border-radius: 8px;
            cursor: pointer;
            font-size: 16px;
            background-color: darkblue;
            color: white;
            transition: background-color 0.3s ease-in-out, color 0.3s ease-in-out;
        }

        input[type="submit"]:hover {
            background-color: #1874a8;
            color: #f0f0f0;
        }

        .signup-link {
            margin-top: 30px;
            font-size: 14px;
        }

        .signup-link a {
            color: #21a1f1;
            text-decoration: none;
            font-weight: bold;
        }

        .signup-link a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<h2>Secure Access Portal</h2>

<hr>

<div class="access-container">
    <h3>Authentication</h3>
    <form action="${pageContext.request.contextPath}/authenticate" method="post">
        <label for="user">User ID:</label>
        <input type="text" id="user" name="user" required>

        <label for="pass">Passcode:</label>
        <input type="password" id="pass" name="pass" required>

        <input type="submit" value="Access Now">

    </form>

    <div class="signup-link">
        <p>New here? <a href="${pageContext.request.contextPath}/enlist">Sign Up</a></p>
    </div>
</div>

</body>
</html>
