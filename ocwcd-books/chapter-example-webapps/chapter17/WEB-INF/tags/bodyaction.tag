<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ attribute name="att" required="true" %>
<c:choose>
  <c:when test='${att == "var"}'>
    <jsp:doBody var="bodyvar" scope="application"/>
  </c:when>
  <c:when test='${att == "reader"}'>
    <jsp:doBody varReader="bodyReader" />
  </c:when>
  <c:otherwise >
    <jsp:doBody />
  </c:otherwise>
</c:choose>