<%@ taglib prefix="test" uri="/WEB-INF/sampleLib.tld" %>

<html><body>

<test:greet user='<%=request.getParameter("user")%>' />

</body></html>





