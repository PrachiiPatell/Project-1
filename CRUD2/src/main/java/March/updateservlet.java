package March;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/updateservlet")
public class updateservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 public employeedao employee;
	    
     
	   public void init() {
		   employee= new employeedao(); 
	   }
  public updateservlet() {
      super();
     
  }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id=request.getParameter("id");
		System.out.println("hello"+id);
		response.sendRedirect("update.jsp?id="+id);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id= request.getParameter("id");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String phone=request.getParameter("phone");

		System.out.println(id+fname+lname+phone);
		employee.updatedata(id, fname, lname, phone);
		response.sendRedirect("view.jsp");
	}

}
