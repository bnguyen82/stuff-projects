package chapter5;

import java.io.*;
import javax.servlet.http.*;

/**
 * This servlet prints out the servlet name, context path, servlet path and path info of the request.
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
		pw.println("Servlet Name="+getServletName()+"<p>");		
		pw.println("Context Path="+req.getContextPath()+"<p>");
		pw.println("Servlet Path="+req.getServletPath()+"<p>");
		pw.println("Path Info="+req.getPathInfo()+"<p>");						
		pw.println("</body>");
		pw.println("</html>");
		
	}
}
