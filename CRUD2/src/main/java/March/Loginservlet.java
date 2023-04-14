package March;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.bson.Document;


@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public employeedao employee;
    
    
	   public void init() {
		   employee= new employeedao(); 
	   }
	   public Loginservlet() {
	        super();}
	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String email = request.getParameter("email");
		
		String pass=request.getParameter("pass");
		String pass1="1234";
		Document doc =  employee.getuserbyid(email);
	
		if(doc!=null) {
		if(pass.equals(pass1)) {
			HttpSession session = request.getSession();
			session.setAttribute("user", doc);
			response.sendRedirect("view.jsp");
		}
		else {
			request.setAttribute("message", "authentication problem try again");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
		}
		else {
			request.setAttribute("message","Please register your self");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}
}
		//doGet(request, response);



