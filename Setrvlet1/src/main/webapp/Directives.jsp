<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.Random,java.util.ArrayList" %>
    <%@taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Page</title>
</head>
<body>
<h1>Random Number:
<%
Random r=new Random();

int n=r.nextInt(100);
//out.println(n);
%>

<%=
n
%>
<br>
<br>
<p:set var="name" value="TechSoft India"></p:set>
<p:out value="${name}"></p:out>
</h1>
</body>
</html>