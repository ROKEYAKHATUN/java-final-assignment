<%@ page isELIgnored="false" %>
<html>
<head>
    <style>
        /* custom-styles.css */

        body {
            background-color: #e6e6e6;
            color: #444;
            margin: 0;
            padding: 20px;
        }

        h2 {
            color: #3d9970;
        }

        hr {
            border: 1px solid #aaa;
            margin: 20px 0;
        }

        .button-container {
            margin-top: 30px;
        }



    </style>
</head>
<body>
<h2>Welcome to our Tax Calculator</h2>

<hr>

<div class="button-container">
    <p>Log in</p>
    <a href="${pageContext.request.contextPath}/login">Log In</a>

    <p>do not have account?</p>
    <a href="${pageContext.request.contextPath}/create">Sign Up</a>
</div>

</body>
</html>
