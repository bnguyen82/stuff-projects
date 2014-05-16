<%--
	File: orderOfScriptlets.jsp
	This example shows the importance of the order of scriptlets.
--%>

<html>
<body>
   <%  String s  = s1+s2;   %>   <%-- Error: undefined variable s2 --%>
   <%! String s1 = "hello"; %>   <%-- Member variable s1           --%>
   <%  String s2 = "world"; %>   <%-- Local variable s2            --%>
   <%  out.print(s);        %>
</body>
</html>
