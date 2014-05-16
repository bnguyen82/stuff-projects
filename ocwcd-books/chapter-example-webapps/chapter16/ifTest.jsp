<%@ taglib prefix="test" uri="/WEB-INF/sampleLib.tld" %>

<html><body><pre>


Hello<br>

<% boolean debug = "true".equals(request.getParameter("debug")); %>

<test:if condition="<%=debug%>" >
	DEBUG INFO:...
</test:if>


</pre></body></html>