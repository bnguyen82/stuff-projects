package sampleLib;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class DefaultTag extends TagSupport
{
	public int doStartTag() throws JspException
	{
		SwitchTag parent = (SwitchTag)
							findAncestorWithClass(this, SwitchTag.class);
	
		Object caseFound = parent.getValue("caseFound");

		//If the conditionValue attribute value of the switch tag
		//did not match with any of the caseValue attribute values,
		//then it includes the body of this tag; otherwise; it skips the body.
		if (caseFound.equals(Boolean.FALSE))
		{
			return EVAL_BODY_INCLUDE;
		}
		else
		{
			return SKIP_BODY;
		}
	}
}
