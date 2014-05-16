<%@ taglib uri="sampleLib.tld" prefix="test" %>

<html>
Note that this example is for demonstrating the use of the taglib 
directive and the <required> tag. 
Clicking submit on the button will not submit the data back to the server.
<p>
Please enter your address and click submit.<br>
The fields marked with a <test:required /> are mandatory.

<form action="validateAddress.jsp">
<table>

<tr>
      <td><test:required /> Street 1</td>
      <td><input TYPE='text' NAME='street1'></td>
</tr>

<tr>  
      <td>          Street 2</td>
      <td><input TYPE='text' NAME='street2'></td>
</tr>

<tr>
      <td>          Street 3</td>
      <td><input TYPE='text' NAME='street3'></td>
</tr>

<tr>
      <td><test:required/> City    </td>
      <td><input TYPE='text' NAME='city'></td>
</tr>

<tr>
      <td><test:required/> State   </td>
      <td><input TYPE='text' NAME='state'></td>
</tr>

<tr>
      <td><test:required /> Zip     </td>
      <td><input TYPE='text' NAME='zip'></td>
</tr>

</table>

<input TYPE='submit' onClick="javascript:return false;" >



</form>
</html>
