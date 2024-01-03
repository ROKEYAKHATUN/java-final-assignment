<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Secure Registration</title>
    <style>
        body {
            font-family: 'Verdana', sans-serif;
            color: #e0e0e0;
            margin: 0;
            padding: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            min-height: 100vh;
        }

        form {
            padding: 30px;
            border-radius: 15px;
            box-shadow: 0 0 20px rgba(255, 255, 255, 0.1);
            width: 400px;
            text-align: center;
        }

        h3 {
            margin-bottom: 20px;
        }

        label {
            margin-top: 15px;
            color: black;
        }

        input[type="text"],
        input[type="date"],
        input[type="email"],
        input[type="password"],
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border: 1px solid #555;
            border-radius: 8px;
            box-sizing: border-box;
            background-color: #fff;
            color: black;
        }

        input[type="submit"]:hover {
            background-color: #4CAF50;
            color: #fff;
        }

        a {
            display: block;
            margin-top: 20px;
            text-decoration: none;
            color: #777;
            font-weight: bold;
            border: 2px solid #777;
            padding: 10px 15px;
            border-radius: 5px;
            text-align: center;
        }

        a:hover {
            background-color: #777;
            color: #fff;
        }
    </style>
</head>
<body>

<form method="post" action="${pageContext.request.contextPath}/create" modelAttribute="user">
    <h3>Account Registration</h3>

    <label>Username</label>
    <input type="text" name="username" id="username"/>

    <label>Password</label>
    <input type="password" name="password" id="password"/>

    <label>Name</label>
    <input type="text" name="fullName" id="fullName"/>

    <label>Birth Date</label>
    <input type="date" name="dateOfBirth" id="dateOfBirth"/>

    <label>Contact Email</label>
    <input type="email" name="email" id="email"/>

    <label>Gender</label>
    <div>
        <input type="radio" name="gender" id="male" value="Male"/> Male
        <input type="radio" name="gender" id="female" value="Female"/> Female
    </div>

    <label>Father's Name</label>
    <input type="text" name="fatherName" id="fatherName"/>

    <label>Mother's Name</label>
    <input type="text" name="motherName" id="motherName"/>

    <label>National ID</label>
    <input type="text" name="nid" id="nid"/>

    <label>Tax ID</label>
    <input type="text" name="tin" id="tin"/>

    <br>

    <input type="submit" value="Activate Account"/>
    <a href="${pageContext.request.contextPath}">Back to Home</a>
</form>

</body>
</html>
