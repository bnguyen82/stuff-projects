<%@ taglib prefix="inv" tagdir="/WEB-INF/tags" %>
<html><body>
  <inv:invokeaction proc="yes">
    <jsp:attribute name="frag">
      Two + two = ${2+2}
    </jsp:attribute>
  </inv:invokeaction >
</body></html>