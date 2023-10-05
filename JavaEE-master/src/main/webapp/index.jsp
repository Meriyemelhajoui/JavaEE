<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>

<%--in Java Applications , everything is transformed into Servlets , because TomCat runs servlets Only , --%>
<%--We have 3 types of Tags in Java ,--%>
<%--for importing librairies .... we can use : <%@ %>--%>
<%--To use parametres that exists in the servlet , : <% int i = request.getParameter("")%>--%>
<%--If we want to declare a variable that will be outside the Service methods (After transforming the jsp into servlets : <%! %>--%>
<%--To print something ( which means , that in the servlet method will be in the printwriter : <%= %>--%>
</body>
</html>