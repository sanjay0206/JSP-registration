<%--
  Created by IntelliJ IDEA.
  User: kingk
  Date: 9/15/2020
  Time: 10:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Form</title>
</head>
<body>

<h1>Register Account</h1>

<p>${error}</p>

<form method="post" action="/register">

    <label for="email">Email:</label>
    <input type="email" id="email" name="email"><br><br>

    <label for="name">Name:</label>
    <input type="text" id="name" name="name"><br><br>

    <label for="age">Age:</label>
    <input type="number" id="age" name="age"><br><br>

    <label for="password">Password:</label>
    <input type="password" id="password" name="password"><br><br>

    <label for="confirmPassword">Confirm Password:</label>
    <input type="password" id="confirmPassword" name="confirmPassword"><br><br>

    <button type="submit">Create Account</button>
</form>
</body>
</html>
