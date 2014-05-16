<%@ taglib uri="/WEB-INF/sampleLib.tld" prefix="test" %>

<html><body>

	<test:switch conditionValue='<%=request.getParameter("action")%>' >

		<test:case caseValue="sayHello">
			Hello!
		</test:case>
		
		<test:case caseValue="sayGoodBye" >
			Good Bye!!
		</test:case>

		<test:default>
			I am Dumb!!!
		</test:default>

	</test:switch>

</body></html>
