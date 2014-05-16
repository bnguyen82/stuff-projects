<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html><body>
  <c:set var="numList" value="one,two,three,four,five,six" />
  Output of the forTokens tag:<p>
  <table border="1">
    <c:forTokens var="num" items="${numList}" delims=",">
      <tr><td>${num}</td></tr>
    </c:forTokens>
  </table>
</body></html>
