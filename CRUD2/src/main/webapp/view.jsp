<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.mongodb.client.*"%>
<%@ page import="org.bson.Document"%>
<%
MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
MongoDatabase database = mongoClient.getDatabase("empolyee");

MongoCollection<Document> collection = database.getCollection("employeedata");

FindIterable<Document> documents = collection.find();

List<Document> documentList = new ArrayList<Document>();
for (Document doc : documents) {
	documentList.add(doc);
}

request.setAttribute("documentList", documentList);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View demo</title>
</head>
<body>

	<h1>Hello</h1>
	<%-- <c:forEach var="document" items="${documentList}">
		<ul>
			<li><b>ID:</b> ${document.id}</li>
			<li><b>Name:</b> ${document.fname}</li>
			<li><b>Phone:</b> ${document.phone}</li>
			<!-- add more fields here as needed -->
		</ul>
	</c:forEach> --%>
	<form action="deleteservlet" method="get">
<table>
<thead>
<tr>
<th>ID</th>
<th>Name</th>
<th>LastName</th>
<th>Phone</th>
<th>Edit</th>
<th>Delete</th>
</tr>
</thead>
<tbody>

<c:forEach var="document" items="${documentList}">
<tr>
<td>${document.id}</td>
<td>${document.fname}</td>
<td>${document.lname}</td>
<td>${document.phone}</td>
<td><a href="updateservlet?id=<c:out value='${document.id}'/>">edit</a></td>
<td><a href="deleteservlet?id=<c:out value='${document.id}'/>">delete</a></td>
</tr>


</c:forEach>
<tr></tr>
</tbody>

</table> 
 </form> 
</body>
</html>