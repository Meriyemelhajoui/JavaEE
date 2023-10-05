<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 23/04/2023
  Time: 21:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <form method="post" action="HomeServlet">
        <label for="usr">Username</label>
        <input id="usr" name="Username" type="text"><br>
        <label for="pw">Password</label>
        <input id="pw" name="Password" type="password" required><br>
        <input type="submit" value="Se connecter">


    </form>

</body>
</html>
