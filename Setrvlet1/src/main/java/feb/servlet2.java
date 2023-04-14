package feb;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out=response.getWriter()){
			out.println("<!DOCTYPE html");
			out.println("<html>");
			out.println("<head>"); 
			out.println("<title>servlet1</title>");
		 	out.println("</head>");
			out.println("<body>");
			Cookie[] cookies=request.getCookies();
			boolean f=false;
		    String name = "";
		    if(cookies==null)
		    {
		    	out.println("<h1>You are new user go to home page and submit your name");
		    	 return;	
		    }
		    else {
		    	for(Cookie c:cookies) {
		    		String tname=c.getName();
		    		if(tname.equals("user_name")) {
		    			f=true;
		    			name=c.getValue();
		    		}
		    	}
		    }
		    if(f)
		    {
			
			out.println("<h1>Hello ," + name + "Welcome back to my website...</h1>");
			out.println("<h1>ThankYou</h1>");
			}
		    else {
		    	out.println("<h1>You are new user go to home page and submit your name");
		    }
			out.println("</body>");
			out.println("</html>");
	}}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
