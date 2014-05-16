package chapter8;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * This servlet illustrates the use of HttpServletResponse.encodeURL() for rewriting URLs.
 * 
 */
public class URLReWriterServlet extends HttpServlet 
{

   public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
   {
	  HttpSession s = req.getSession();
	  PrintWriter pw = res.getWriter();
	  pw.println("<html>");
	  pw.println("<head></head>");
   
	  pw.println("<body>");
	  pw.println("A test page showing two URLs:<br>");
 	  pw.println("<br>");
  	  pw.println("<b>Do not click</b> on the following links because they are only"+
		  	  " meant to show how SESSIONID is associated with the URLs. <br>"+
		  	  "<b>Move the mouse over the links and observe the underlying URLs in the status bar of the browser.</b>"+
		  	  " If you have hidden the status bar or are unable to see the status bar, view the HTML source for this page and observe the links."+
		  	  " To view the HTML source go to Menu->View->Source"
		);
  	  pw.println("<br><br>");

	  pw.println("<a href=\""
				   + res.encodeURL("/servlet/ReportServlet")    
				   + "\">View Report</a><br>");
	  pw.println("<a href=\""
				   + res.encodeURL("/servlet/AccountServlet")   
				   +"\">View Account</a><br>");
	  System.out.println("Chapter 08: URLRewriterServlet.doGet(): "+res.encodeURL("/servlet/AccountServlet"));
	  pw.println("<br>");

  	  pw.println("<br><b>Make sure that cookies are turned off.</b> If they are not turned off, you will not see the SESSIONID appended to the URLs. "+
	  	  "To turn off cookies in IE, go to Tools->Internet Options->Security. Then click on 'Custom Level'. "+
	  	  "Scroll down to Cookies section and select 'Disable Cookies' options.<br>"+
	  	  "(Remember to turn on the cookies after experimenting with his example)");
  	  
	  pw.println("</body>");
	  
	  pw.println("</html>");
   }                                                                        
}
