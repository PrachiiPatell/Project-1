package Crud;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SaveDetailsSer")
public class SaveDetailsSer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		String city=request.getParameter("city");
		String country=request.getParameter("country");
		
		AddEmpDetails e=new AddEmpDetails();
		e.setName(name);
		e.setPassword(password);
		e.setEmail(email);
		e.setAddress(address);
		e.setCity(city);
		e.setCountry(country);
		
		int status=Employee_DAO.save(e);
		if(status>0) {
			out.println("<p>Record Saved Successfully!</p>");
			request.getRequestDispatcher("index.html").include(request, response);
		}
		else {
			out.println("Sorry! Unable to Save Record");
			
		}
		
		out.close();
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
