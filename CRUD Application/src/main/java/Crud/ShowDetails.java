package Crud;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ShowDetails")
public class ShowDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<a href='index.html'>Add New Employee</a>");
		out.println("<h1>Employees List</h1>");
		
		List<AddEmpDetails> list=SelectDetails.getAllEmployees();
		out.println("<link rel='stylesheet' type='text/css' href='style.css'>");
		out.print("<table border='1' id='customers' ");
		out.print("<tr><th>Id</th><th>Name</th><th>Password</th><th>Email</th><th>Address</th><th>City</th>");
		for(AddEmpDetails e:list) {
			out.print("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getPassword()+"</td><td>"+e.getEmail()+"</td><td>"+e.getCity()+"</td><td>"+e.getCountry()+"</td><td>"+e.getAddress()+"</td><td><a href='UpdateDetailsSer?id="+e.getId()+"'>Edit</a></td> <td><a href='DeleteDetails?id="+e.getId()+"'>Delete</a></td></tr>");
		}
		out.println("</table>");
		out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
