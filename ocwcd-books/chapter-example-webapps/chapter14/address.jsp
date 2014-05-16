<!-- Tomcat 4.1.x requires bean classes to be part of a non-default package. So, AddressBean  has been made a part of scwcdkit package -->

<%@ page import='scwcdkit.AddressBean' %>

<%--
   The code below shows how we can use a scriptlet
   to capture address information in AddressBean
--%>
<%
      //Get an existing instance using the implicit variable session
      AddressBean address = null;

      synchronized(session)
      {
         address = (AddressBean) session.getAttribute("address");
         
         //Create a new instance if required
         if (address==null)
         {
            address = new AddressBean();
            session.setAttribute("address", address);
         }
      }

      //Get the parameters and fill up the address object
      address.setStreet(request.getParameter("street"));
      address.setCity(request.getParameter("city"));
      address.setState(request.getParameter("state"));
      address.setZip(request.getParameter("zip"));
%>


<%--
   The code below shows how we can use standard JSP actions
   to capture address information in AddressBean. To test them,
   comment the scriplet shown above and uncomment the actions below.
--%>
<%--
   <jsp:useBean id='address' class='AddressBean' scope='session' />
   <jsp:setProperty name='address' property='*' />
--%>


<%--
After saving the address into the session
forward the request to addressDisplay.jsp
--%>
<jsp:forward page="addressDisplay.jsp" />