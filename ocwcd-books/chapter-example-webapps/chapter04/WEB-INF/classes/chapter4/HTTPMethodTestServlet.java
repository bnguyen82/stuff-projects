package chapter4;

import javax.servlet.*;
import java.util.*;
import java.io.*;
import javax.servlet.http.*;

/**
 * This servlet prints out HTTP method name and query string in it's service method.
 * 
 */
public class HTTPMethodTestServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws javax.servlet.ServletException, java.io.IOException 
	{
		System.out.println("Chapter 04: HTTPMethodTestServlet.doGet() called.");		
		PrintWriter pw = res.getWriter();		
		pw.println("<br>doGet() called");
		pw.println("</body>");
		pw.println("</html>");
		
		

	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws javax.servlet.ServletException, java.io.IOException 
	{
		System.out.println("HTTPMethodTestServlet.doPost() called.");		
		PrintWriter pw = res.getWriter();		
		pw.println("<br>doPost() called");
		pw.println("</body>");
		pw.println("</html>");

	}
	public void init()
	{
		System.out.println("Chapter 04: HTTPMethodTestServlet.init() called.");
		System.out.println("Chapter 04: HTTPMethodTestServlet initalization parameters:");
		ServletConfig config = getServletConfig();
		Enumeration enum = config.getInitParameterNames();
		while(enum.hasMoreElements())
		{
			String name = (String) enum.nextElement();
			String val = config.getInitParameter(name);
			System.out.println(name+" = "+val+"<br>");
		}
		
	}
	public void service(HttpServletRequest req, HttpServletResponse res) throws javax.servlet.ServletException, java.io.IOException 
	{
		System.out.println("Chapter 04: HTTPMethodTestServlet.service() called.");
		PrintWriter pw = res.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("HTTP method name = "+req.getMethod()+"<p>");		
		pw.println("Query String = "+req.getQueryString()+"<p>");
		super.service(req, res);
	}
}
