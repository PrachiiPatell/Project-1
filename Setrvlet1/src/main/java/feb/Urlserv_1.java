package feb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Urlserv_1")
public class Urlserv_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out=response.getWriter()){
			out.println("<!DOCTYPE html");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet Urlserv_1</title>");
			out.println("</head>");
			out.println("<body>");
			String name=request.getParameter("user_name");
			out.println("<h1>Hello your Name is: "+name+"</h1>");
			//out.println("<a href='Urlserv_2?user="+name+"'>Go to Second Servlet</a>");
			
			out.println(""
					+"<form action='Urlserv_2'>"
					+"<input type='hidden' name='user_name' value='"+name+"'/>"
					+"<button>Go to 2nd Servlet</button>"
					+""
					+""
					+""
					+"</form>");
			
			
			
			out.println("</body>");
			out.println("</html>");}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
