<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style type="text/css">
.con{
	margin: auto;
	border: 2px solid black;
	width:40%;
	padding:20px;
	background-color: #f7c260b0;
}
button{
	font-size: 20px;
}
</style>
</head>
<body>
<div class="con">
	<form action="Loginservlet" method="post">
	<center><h1>Login Form</h1></center>
	<label>Enter email-id:</label>
	<input type="text" name="email" required="required">
	<br><br>
	
	<label>Enter password:</label>
	<input type="password" name="pass" required="required">
	<br><br>
	
	<center><button type="submit">Submit</button><span style="color: red;">${message}</span></center>
	<br><br>
	
	</form>
	<center><a href="index.jsp"><button>Register</button></a></center>
</div>
</body>
</html>