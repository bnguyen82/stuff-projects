package sampleLib;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class MarkerTag implements BodyTag {

	//INITIALIZATION
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

	//attributes
	private String search = null;
	public void setSearch(String search)
	{
		this.search = search;
	}

	//BODY CONTENT RELATED MEMBERS
	private BodyContent bodyContent;
	public void setBodyContent(BodyContent bodyContent)
	{
		this.bodyContent = bodyContent;
	}

	public void doInitBody() throws JspException
	{
	}
	
	//START, ITERATE, AND END METHODS
	public int doStartTag() throws JspException
	{
		return EVAL_BODY_BUFFERED;
	}
	
	public int doAfterBody() throws JspException
	{
		try{
			JspWriter out = bodyContent.getEnclosingWriter();
			String text = bodyContent.getString();
			int len = search.length();
			int oldIndex=0, newIndex=0;

			while((newIndex = text.indexOf(search,oldIndex))>=0){
				if (newIndex<=oldIndex)
				{
				break;
				}
				out.print(text.substring(oldIndex,newIndex));
				out.print("<b>"+search+"</b>");
				oldIndex = newIndex + len;
			}

			out.print(text.substring(oldIndex));
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
	
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}
	
	public void release()
	{
	}
}
