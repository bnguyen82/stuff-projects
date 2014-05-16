package chapter9;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
/**
 * Insert the type's description here.
 * Creation date: (12/15/2001 9:23:53 AM)
 * @author: 
 */
public class DeclarativeSecureServlet extends HttpServlet 
{
   public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
   {
	PrintWriter pw = res.getWriter();

	pw.println("<html><head>");
	pw.println("<title>Declarative Security Example</title>");
	pw.println("</head>");
	pw.println("<body>");
	pw.println("Hello! HTTP GET request is open to all users.");
	pw.println("</body></html>");
	
  }

  public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
  {
	PrintWriter pw = res.getWriter();

	pw.println("<html><head>");
	pw.println("<title>Declarative Security Example</title>");
	pw.println("</head>");
	pw.println("<body>");
	String name = req.getParameter("username");
	pw.println("Welcome, "+name+"!");
	pw.println("<br>You are seeing this page because you are a supervisor.");
	pw.println("</body></html>");
	
  }
}
