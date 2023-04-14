<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Page</title>
</head>
<body style="background:#e2e2e2">
<h1>First JSP Page</h1>
<%!
int a=50;
int b=67;
String name="Prachi";
public int doSum(){
	return a+b;
}
public String reverse(){
	StringBuffer br=new StringBuffer(name);
	return br.reverse().toString();
	
}
%>

<%
out.println(a);
out.println("<br>");
out.println(b);
out.println("<br>");
out.println("Sum is:" + doSum());
out.println("<br>");
out.println(reverse());
%>
<h1 style=color:red>Sum is: <%=doSum() %></h1>

</body>
</html>