package sampleLib;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class CaseTag extends TagSupport
{
	public void setCaseValue(String caseValue)
	{
		setValue("caseValue",caseValue);
	}
	
	public int doStartTag() throws JspException
	{
		//gets the reference of the enclosing switch tag handler.
		SwitchTag parent =
		(SwitchTag) findAncestorWithClass(this, SwitchTag.class);
		Object caseValue = this.getValue("caseValue");
		Object conditionValue = parent.getValue("conditionValue");

		//If the value of the caseValue attribute of this case tag
		//matches with the value of the conditionValue attribute of
		//the parent switch tag, it sets the caseFound flag to true and
		//includes the body; otherwise, it skips the body.
		if( conditionValue.equals(caseValue) )
		{
			//Sets the caseFound flag to true
			parent.setValue("caseFound",Boolean.TRUE);
			//Includes the body contents in the output HTML
			return EVAL_BODY_INCLUDE;
		}
		else
		{
			return SKIP_BODY;
		}
	}
}
