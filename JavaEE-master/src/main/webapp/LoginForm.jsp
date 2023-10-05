<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 10/05/2023
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page </title>
</head>
<body>

<form action="Login" method="post">
  <label for="Username">Entrez votre Username </label>
  <input type="text" name="username" id="Username"> <br>
  <label for="Password"> Entrez votre Mot de passe </label>
  <input type="text" name="password" id="Password"><br>
  <input type="submit" value="Se connecter ">
</form>
</body>
</html>
