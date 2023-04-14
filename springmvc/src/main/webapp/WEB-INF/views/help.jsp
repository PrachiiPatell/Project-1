<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.time.LocalDateTime" %>
    <%@page isELIgnored="false" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>

<%
/* String name=(String)request.getAttribute("name");
String rollnumber=(String)request.getAttribute("rollnumber");
LocalDateTime time=(LocalDateTime)request.getAttribute("time");*/
%>

<h1>Hello My Name is <%--<%= name%> --%>
${name}
</h1>
<h1>Hello My RollNumber is <%--<%= rollnumber%> --%>
${rollnumber}
</h1>
<h1>This is Help Page</h1>

<h1>Date and Time is: <%--<%= time.toString()%> --%>
${time}
</h1>
<hr>
<c:forEach var="item" items="${marks}">
<h1>${item}</h1>
	
</c:forEach>
</body>
</html>