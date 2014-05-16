<!-- Tomcat 4.1.x requires bean classes to be part of a non-default package. So, AddressBean  has been made a part of scwcdkit package -->

<%@ page import='scwcdkit.AddressBean' %>
<jsp:useBean id='address' class="scwcdkit.AddressBean" scope='session'/>

<html><body>
<table>
   <tr>
      <td>Street</td>
      <td><jsp:getProperty name='address' property='street'/></td>
   </tr>
   <tr>
      <td>City</td>
      <td><jsp:getProperty name='address' property='city'/></td>
   </tr>
   <tr>
      <td>State</td>
      <td><jsp:getProperty name='address' property='state'/></td>
   </tr>
   <tr>
      <td>Zip</td>
      <td><jsp:getProperty name='address' property='zip'/></td>
   </tr>
</table>


</body></html>
