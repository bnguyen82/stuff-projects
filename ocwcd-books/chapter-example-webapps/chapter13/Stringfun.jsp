<%@ taglib prefix="myString"
uri="http://myFunc/Functions"%>

<html><body>
  <b>Enter text:</b>
  <form action="Stringfun.jsp" method="GET">
    <input type="text" name="x">
    <p><input type="submit">
  </form>
  <table border="1">
    <tr>
      <td>Uppercase:</td>
      <td>${myString:upper(param.x)}</td>
    </tr>
    <tr>
      <td>String length:</td>
      <td>${myString:length(param.x)}</td>
    </tr>
  </table>
</body></html>
