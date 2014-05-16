<html><body>

<%@ page isThreadSafe="true" %>

<%! int j=0; %>

<%
   for (int i=0; i<10; i++)
   {
      out.print("The value of j is " + j + "<br>");
      j++;
      Thread.currentThread().sleep(1000);
   }
%>

</body></html>
