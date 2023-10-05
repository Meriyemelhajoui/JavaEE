<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 10/05/2023
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3> Redirect from the servlet to the JSP file </h3>
Welcome ${username}
<a href="https://ensah.ma/";>Link </a>

   <form action="Logout"  method="get">
       <h3> Vous Voulez Se Deconnecter ?</h3>
       <input type="submit" value="Se deconnecter ! ">

   </form>

<%-- To clear Data , and prevent the user to come back --%>
<%--<% response.setHeader("Cache-Control","no-cache"); //HTTP 1.1--%>
<%--    response.setHeader("Pragma","no-cache"); //HTTP 1.0--%>
<%--    response.setDateHeader ("Expires", 0); //prevents caching at the proxy server--%>
<%--%>--%>




</body>
</html>
