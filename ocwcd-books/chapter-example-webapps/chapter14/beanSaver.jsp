<%--
	File: beanSaver.jsp
	This example shows how we can serialize instances of
	beans into the file system using java.io.Serialization
	mechanism and ObjectOutputStream
--%>

<!-- Tomcat 4.1.x requires bean classes to be part of a non-default package. So, AddressBean  has been made a part of scwcdkit package -->

<%@ page import="scwcdkit.AddressBean, java.io.*" %>
<%
   String message="";

   try
   {
      //Create an instance. Set the properties
      AddressBean address = new AddressBean();
      address.setCity(request.getParameter("city"));
      address.setState(request.getParameter("state"));

      //Get the user's name to build the file path
      String name = request.getParameter("name");

      String appRelativePath =
              "/WEB-INF/classes/businessData/visitorAddresses/"
            + name
            + ".ser";

      String realPath = application.getRealPath(appRelativePath);
   
      //Serialize the object into the file
      FileOutputStream fos = new FileOutputStream(realPath);
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(address);
      oos.close();

      message = "Successfully saved the bean as " + realPath;
   }
   catch(Exception e){
      message = "Error: Could not save the bean";
   }
%>
<html><body>
  <h3><%= message %></h3>
</body></html>
