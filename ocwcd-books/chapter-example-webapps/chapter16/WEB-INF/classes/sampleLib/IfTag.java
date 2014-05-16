package sampleLib;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class IfTag implements Tag
{
   //initialization part
   private PageContext pageContext;
   private Tag parentTag;
 
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

   
   //Condition attribute
   private boolean condition = false;
   public void setCondition(boolean condition)  {   this.condition = condition;  }


   //actual tag handling code
   public int doStartTag() throws JspException 
   {
      if (condition)
         return EVAL_BODY_INCLUDE;
      else
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
