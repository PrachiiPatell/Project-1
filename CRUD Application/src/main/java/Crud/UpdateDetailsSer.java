package Crud;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateDetailsSer")
public class UpdateDetailsSer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	     response.setContentType("text/html");
	     PrintWriter out=response.getWriter();
	     out.println("<h1>Update Employee</h1>");
	     String sid=request.getParameter("id");
	     int id=Integer.parseInt(sid);
	     
	     AddEmpDetails e=SelectDetails.getEmployeebyId(id);
	     
	     out.print("<form action='UpdateDetails2' method='post'>");
	     out.print("<table>");
	     out.print("<tr><td></td></tr><input type='hidden' name='id' value='"+e.getId()+"'/></td></tr>");
	     out.print("<tr><td>Name:</td></tr><input type='text' name='name' value='"+e.getName()+"'/></td></tr>");
	     out.print("<tr><td>Password</td></tr><input type='password' name='password' value='"+e.getPassword()+"'/></td></tr>");
	     out.print("<tr><td>Email</td></tr><input type='email' name='email' value='"+e.getEmail()+"'/></td></tr>");
	     out.print("<tr><td>Address</td></tr><input type='text' name='address' value='"+e.getAddress()+"'/></td></tr>");
	     
	     out.print("<tr><td>City:</td><td>");
	     out.print("<select name='city' style='width:150px'");
	     out.print("<option>option</option>");
	    out.print("<option>Mumbai</option>");
	    out.print("<option>Delhi</option>");
	     out.print("<option>Bangalore</option>");
	    out.print("<option>Ahmedabad</option>");
	     out.print("<option>Indore</option>");
	     out.print("</select>");
	     out.print("</td></tr>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
