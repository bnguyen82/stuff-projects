package sampleLib;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class GreetTag implements Tag
{
   private PageContext pageContext;
   private Tag parentTag;

   //initialization part
   public void setPageContext(PageContext pageContext)
   {
      this.pageContext = pageContext;
   }
	
   public void setParent(Tag parentTag)
   {
      this.parentTag = parentTag;
   }

   public Tag getParent()
   {
      return this.parentTag;
   }

   //A String that holds the user attribute
   private String user;


   //The setter method that is called by the container
   public void setUser(String user){ this.user = user; }


  //actual tag handling code
   public int doStartTag() throws JspException
   {
      JspWriter out = pageContext.getOut();

      try
      {
		  if (user==null)
			  out.print("Hello!");
		  else
			  out.print("Hello "+user+"!");
      }
      catch(Exception e)
      {
         throw new JspException("Error in Greet.doStartTag()");
      }

      return SKIP_BODY;
   }

   public int doEndTag() throws JspException
   {
      return EVAL_PAGE;
   }

   //clean up the resources (if any)
   public void release()
   {
   }
}
