package chapter8;

import javax.servlet.http.*;

public class SessionCounter implements HttpSessionListener 
{
   public static int activeSessions = 0;

   public SessionCounter() 
   {
	super();
   }

   public void sessionCreated(HttpSessionEvent evt) 
   {
	  activeSessions++;
	  System.out.println("Chapter 08: No. of active sessions at:"+ 
			   new java.util.Date()+" : "+activeSessions);
   }      

   public void sessionDestroyed (HttpSessionEvent evt) 
   {
	  activeSessions--;
   }   
}
