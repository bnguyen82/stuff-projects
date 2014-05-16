package chapter07;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RedServlet extends HttpServlet 
{

   public void service(
				  HttpServletRequest request,
				  HttpServletResponse response

				 ) throws ServletException, IOException
   {
	  System.out.println("Chapter 7: In service of RED SERVLET");
	  PrintWriter pw = response.getWriter();
	  pw.println("<html>");
	  pw.println("<head>");
	  pw.println("</head>");
	  pw.println("<body>");
	  pw.println("<h3>RED SERVLET!</h3>");
	  pw.println("</body>");
	  pw.println("</html>");

   }            
}
