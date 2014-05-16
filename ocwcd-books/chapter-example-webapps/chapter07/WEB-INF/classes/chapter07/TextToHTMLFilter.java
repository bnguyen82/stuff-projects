package chapter07;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class TextToHTMLFilter implements Filter 
{
   private FilterConfig filterConfig;

   public void init(FilterConfig filterConfig)
   {
	  this.filterConfig = filterConfig;
  	  System.out.println("Chapter 7: TextToHTMLFilter initialized");
   }         

   public void doFilter(
				  ServletRequest request,
				  ServletResponse response,
				  FilterChain filterChain
				 ) throws ServletException, IOException
   {

	  HttpServletRequest req = (HttpServletRequest) request;
	  HttpServletResponse res = (HttpServletResponse) response;
	  NonCachingRequestWrapper ncrw 
						 = new NonCachingRequestWrapper( req );
	  TextResponseWrapper trw = new TextResponseWrapper(res);


	  //Passes on the dummy request and response objects
	  filterChain.doFilter(ncrw, trw);
	  
	  String top = "<html><body background=\"textReport.gif\"><pre>";
	  String bottom = "</pre></body></html>";
	  
	  //Embeds the textual data into <html>, <body>, and <pre> tags.
	  StringBuffer htmlFile = new StringBuffer(top);     
	  String textFile = new String(trw.toByteArray());
	  htmlFile.append(textFile);
	  htmlFile.append("<br>"+bottom);      

	  //Sets the content type to text/html
	  res.setContentType("text/html");

	  //Sets the content type to new length
	  res.setContentLength(htmlFile.length());

	  //Writes the new data to the actual PrintWriter
	  PrintWriter pw = res.getWriter();
	  pw.println(htmlFile.toString());
   }                  

   public void destroy()
   {
   }   

}
