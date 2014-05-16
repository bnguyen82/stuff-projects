package chapter9;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ProgramaticSecureServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		PrintWriter pw = res.getWriter();

		pw.println("<html><head>");
		pw.println("<title>Programatic Security Example</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("Hello! HTTP GET request is open to all employees.");
		pw.println("</body></html>");
		
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		PrintWriter pw = res.getWriter();
		
		System.out.println("Chapter 09 (Programmatic Approach): remote user="+req.getRemoteUser());
		System.out.println("Chapter 09 (Programmatic Approach): user principal="+req.getUserPrincipal());
		System.out.println("Chapter 09 (Programmatic Approach): req.isUserInRole(\"manager\") = "+req.isUserInRole("manager"));
		
		pw.println("<html><head>");
		pw.println("<title>Programatic Security Example</title>");
		pw.println("</head>");
		pw.println("<body>");

		String username = req.getRemoteUser();
		
		if(username != null) pw.println("<h4>Welcome, "+username+"!</h4>");
		if(req.isUserInRole("manager"))
		{
			pw.println("<b>Manager's Page!</b>");
		}
		else
		{
			pw.println("<b>Employee's Page!</b>");
		}

		pw.println("</body></html>");
		
	}
}
