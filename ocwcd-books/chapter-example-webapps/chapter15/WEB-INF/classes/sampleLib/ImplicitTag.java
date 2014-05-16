package sampleLib;

import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class ImplicitTag extends TagSupport {

	public void setAttributeName(String name)
	{
		//Stores the passed object in the hashtable maintained by
		//TagSupport with the name "attributeName".
		setValue("attributeName",name);
	}

	public void setScopeName(String scope)
	{
		//Stores the passed object in the hashtable with
		//the name "scopeName".
		setValue("scopeName",scope);
	}

	//Our utility method to convert the scopeName String
	//to the integer constant defined in PageContext for each scope.
	//We need this method because we have to use
	//PageContext.getAttribute(String name, int scope) later.
	private int getScopeAsInt()
	{
		//Retrieve the scopeName value from the hashtable
		String scope = (String)getValue("scopeName");
		if ("request".equals(scope))
		return PageContext.REQUEST_SCOPE;
		if ("session".equals(scope))
		return PageContext.SESSION_SCOPE;
		if ("application".equals(scope))
		return PageContext.APPLICATION_SCOPE;
		//Default is page scope
		return PageContext.PAGE_SCOPE;
	}

	public int doStartTag() throws JspException
	{
		try
		{
			JspWriter out = pageContext.getOut();
			String attributeName = (String)getValue("attributeName");
			int scopeConstant = getScopeAsInt();
			out.print(pageContext.getAttribute(attributeName, scopeConstant));
			return SKIP_BODY;
		}
		catch(Exception e)
		{
			throw new JspException("Error in Implicit.doAfterBody()");
		}
	}
}
