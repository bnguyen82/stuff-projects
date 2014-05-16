<html><body>
  <b>Expression Language Variables</b>
  <%! int x=4; %>
  <p>The script expression for x = <%= x %>.
  <p>The EL expression for x = ${x}.
    <form action="EL_Variables.jsp" method="GET">
    <p>What is x? <input type="text" size=2 name="num">
    <p><input type="submit">
  </form>
  <p>That's ${param.num == 4}!
</body></html>
