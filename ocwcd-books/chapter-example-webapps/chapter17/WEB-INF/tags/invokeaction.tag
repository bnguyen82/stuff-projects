<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ attribute name="frag" required="true" fragment="true"%>
<%@ attribute name="proc" required="true" %>
<c:if test='${proc == "yes"}'>
  <jsp:invoke fragment="frag"/>
</c:if>