<%@ taglib prefix="test" uri="/WEB-INF/sampleLib.tld" %>

<html><body>

<%
	application.setAttribute("attribute1", "somestring");
	session.setAttribute("attribute2", new Boolean(true));
	request.setAttribute("attribute3", new Integer(5));
%>

<test:implicit attributeName="attribute1" scopeName="application"/>
<test:implicit attributeName="attribute2" scopeName="session"/>
<test:implicit attributeName="attribute3" scopeName="request"/>

</body></html>
