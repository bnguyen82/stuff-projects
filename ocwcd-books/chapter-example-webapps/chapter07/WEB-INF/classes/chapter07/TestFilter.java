package chapter07;

import java.io.*;
import javax.servlet.*;

public class TestFilter implements Filter 
{
   private FilterConfig filterConfig;

   public void init(FilterConfig filterConfig)
   {
	  this.filterConfig = filterConfig;
	  System.out.println("Chapter 7: TestFilter initialized");
   }            

   public void doFilter(
				  ServletRequest request,
				  ServletResponse response,
				  FilterChain filterChain
				 ) throws ServletException, IOException
   {
		System.out.println("Chapter 7: In doFilter of : "+filterConfig.getFilterName());
		filterChain.doFilter(request, response);
   }            

   public void destroy()
   {
   }      

}
