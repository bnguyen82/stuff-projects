package sampleLib;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class LoopTag implements IterationTag
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

   
   //Attribute to maintain looping count
   private int count = 0;
   public void setCount(int count)  {   this.count = count;  }


   //actual tag handling code
   public int doStartTag() throws JspException 
   {
      if (count > 0)
         return EVAL_BODY_INCLUDE;
      else
         return SKIP_BODY;
   }

   public int doAfterBody() throws JspException 
   {
      if (--count > 0)
         return EVAL_BODY_AGAIN;
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
