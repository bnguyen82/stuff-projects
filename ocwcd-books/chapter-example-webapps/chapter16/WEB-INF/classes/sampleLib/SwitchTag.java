package sampleLib;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class SwitchTag extends TagSupport
{
	public void setPageContext(PageContext pageContext)
	{
		super.setPageContext(pageContext);

		//Sets the internal flag that tells whether or not a matching
		//case tag has been found to be false.
		setValue("caseFound", Boolean.FALSE);
	}

	//stores the value of the match attribute
	public void setConditionValue(String value)
	{
		setValue("conditionValue", value);
	}

	public int doStartTag() throws JspException
	{
		return EVAL_BODY_INCLUDE;
	}
}
