package chapter07;

import java.io.*;
import javax.servlet.*;

public class HelloWorldFilter implements Filter 
{
   private FilterConfig filterConfig;

   public void init(FilterConfig filterConfig)
   {
	  this.filterConfig = filterConfig;
 	  System.out.println("Chapter 7: HelloWorldFilter initialized");
   }            

   public void doFilter(
				  ServletRequest request,
				  ServletResponse response,
				  FilterChain filterChain
				 ) throws ServletException, IOException
   {
	  PrintWriter pw = response.getWriter();
	  pw.println("<html>");
	  pw.println("<head>");
	  pw.println("</head>");
	  pw.println("<body>");
	  pw.println("<h3>Hello Filter World!</h3>");
	  pw.println("</body>");
	  pw.println("</html>");
   }         

   public void destroy()
   {
   }      

}
