package chapter6;

import javax.servlet.*;
import java.sql.*;

public class MyServletContextListener implements ServletContextListener
{
   public MyServletContextListener() 
   {
	super();
   }

   public void contextDestroyed(ServletContextEvent sce)
   {
	  try
	  {
		 //Connection c = (Connection) sce.getServletContext().getAttribute("connection");
		 //c.close();

		 System.out.println("Chapter 06: MyServletContextListener.contextDestroyed() called.");
	  }
	  catch(Exception e) { }
   }            

   public void contextInitialized(ServletContextEvent sce)
   {
	  try
	  {
	      //Connection con = create connection somehow;
	      
		 sce.getServletContext().setAttribute("connection", new Object() );
		 System.out.println("Chapter 06: MyServletContextListener.contextInitialized() called.");
	  }
	  catch(Exception e) { }
   }               
}
