package chapter8;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * This servlet just create a session to illustrate the use of the HttpSessionListener interface implemented by SessionCounter class.
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
		HttpSession session = req.getSession();
		pw.println("Session retrieved. Session ID = "+session.getId());
		pw.println("<br>Number of session are "+SessionCounter.activeSessions);		
		pw.println("</body>");
		pw.println("</html>");
		
	}
}
