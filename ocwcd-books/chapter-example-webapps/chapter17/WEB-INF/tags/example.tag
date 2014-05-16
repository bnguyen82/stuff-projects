<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<c:forTokens items="0 1 1 2 3 5" delims=" " var="fibNum">
  <c:out value="${fibNum}"/>
</c:forTokens>