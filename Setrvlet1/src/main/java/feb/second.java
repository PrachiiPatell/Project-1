package feb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class second extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("using generic servlet");
		arg1.setContentType("text/html");
		PrintWriter out=arg1.getWriter();
		out.println("<h1>this is my generic servlet</h1>");
		
	}

}
