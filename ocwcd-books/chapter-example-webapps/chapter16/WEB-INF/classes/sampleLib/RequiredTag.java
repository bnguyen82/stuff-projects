package sampleLib;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class RequiredTag implements Tag
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


   //actual tag handling code
   public int doStartTag() throws JspException
   {
      try
      {
         JspWriter out = pageContext.getOut();
         out.print("<font color='#ff0000'>*</font>");
      }
      catch(Exception e)
      {
         throw new JspException("Error in RequiredTag.doStartTag()");
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
