package myTags;

import java.io.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class SimpleTagExample extends SimpleTagSupport
{
  public void doTag() throws JspException, IOException
  {
    getJspContext().getOut().print(
      "I can't believe it's so simple!"
    );
  }
}
