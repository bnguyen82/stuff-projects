package chapter4;

import java.io.*;
import javax.servlet.http.*;

/**
 * This servlet simply prints out HTTP method name and query string in it's service method.
 * 
 */
public class HelloWorldServlet extends HttpServlet 
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws javax.servlet.ServletException, java.io.IOException 
	{
		PrintWriter pw = res.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h3>Hello World!</h3><p>");				
		pw.println("</body>");
		pw.println("</html>");
		
	}
}
