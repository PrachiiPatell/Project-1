<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration page</title>
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
	<form action="RegisterServlet" method="post">
	<center><h1>Registration page</h1></center>
		<label>Enter your first name:</label> <input type="text" name="ufname" size="10" required="required">
		<br><br> 
		 <label>Enter your last name:</label> <input type="text"
			name="ulname" size="10" required="required"> <br><br> 
		<label>Enter your email id:</label>
		<input type="email" name="email" size="10" required="required"> <br><br>  
		<label>Enter your contact number:</label> <input type="text" name="country code"
			value="+91" size="2" readonly="readonly"> 
			<input type="text" name="phone" size="20" required="required"/>
		<br> <br>
		
		<label>Gender</label>
		<input type="radio" name="gender" required="required" value="Male">Male
		<input type="radio" name="gender" required="required" value="female">Female  
		<br> <br>
		
		<label>Enter password:</label>
		<input type="password" name="pass" required="required">
		<br><br>
		
		<label>Confirm password:</label>
		<input type="password" name="cpass" required="required">
		<br><br>
		<center><button type="submit">Submit</button><span style="color: red;">${message}</span></center>
	</form>
	<br><br>
	<center><label>Already user?<a href="Login.jsp">Login</a></label></center>
	</div>
</body>
</html>