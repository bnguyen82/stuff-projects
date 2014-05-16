<html><body><pre>

In paramTest1:
First name is <%=request.getParameter("first")%>
Last  name is <%=request.getParameter("last")%>

<jsp:include page="paramTest2.jsp" >
  <jsp:param name="first" value="mary" />
</jsp:include>

</pre></body></html>
