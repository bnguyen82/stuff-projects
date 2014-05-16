package chapter6;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * This servlet prints out initialization parameters of the application.
 * 
 */
public class TestServlet extends HttpServlet 
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws javax.servlet.ServletException, java.io.IOException 
	{
		PrintWriter pw = res.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("Following are the application (or ServletContext) initialization parameters:<br>");
		ServletContext context = getServletConfig().getServletContext();
		Enumeration enum = context.getInitParameterNames();
		while(enum.hasMoreElements())
		{
			String name = (String) enum.nextElement();
			String val = context.getInitParameter(name);
			pw.println(name+" = "+val+"<br>");
		}

		pw.println("</body>");
		pw.println("</html>");
		
	}
}
