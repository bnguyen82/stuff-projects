<%--
	File: initializationOfVariables.jsp
	This example shows that the variables declared
	in a scriptlet must be initialized before use.
--%>

<html>
<body>
   <%! int i; %>
   <%  int j; %>
   The value of i is <%= i++ %> <br> <%-- OK i is initialized --%>
   The value of j is <%= j++ %> <br> <%-- ERROR j not initialized --%>
</body>
</html>
