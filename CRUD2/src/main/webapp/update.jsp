<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.mongodb.client.*"%>
<%@ page import="org.bson.Document"%>
<%@ page import="com.mongodb.client.*"%>
<%@ page import="java.util.*"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ page import="March.employeedao"  %>
    <%
MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
MongoDatabase database = mongoClient.getDatabase("empolyee");

MongoCollection<Document> collection = database.getCollection("employeedata");

FindIterable<Document> documents = collection.find();

List<Document> documentList = new ArrayList<Document>();


request.setAttribute("documentList", documentList);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
</head>
<body>

	<form action="updateservlet" method="post">
	<input type="hidden" name="id" value="prachi@patel" >
    FName: <input type="text" name="fname" value="abc"><br><br>
    LName: <input type="text" name="lname" value="efg"><br><br>
    Phone: <input type="text" name="phone" value="1234567894"><br><br>
    <input type="submit" >
	
	
	
	</form>
	
</body>
</html>