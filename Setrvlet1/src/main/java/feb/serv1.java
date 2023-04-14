package feb;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;


public class serv1 implements Servlet {
	ServletConfig conf;
public void init(ServletConfig conf) {
		this.conf=conf;
		System.out.println("object created");
		
}
public void service(ServletRequest req,ServletResponse resp) throws ServletException,IOException {
	System.out.println("Servicing");
	resp.setContentType("text/html");
	
	PrintWriter out=resp.getWriter();
	out.print("Welcome");
	
}
public void destroy(){
	System.out.println("going to destroy servlet");
	
}
public ServletConfig getServletConfig() {
	return this.conf;
	
}
public String getServletInfo() {
	return "this servlet is created";
}
}
