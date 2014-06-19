<%
   // Read previous comments from session
   String comments = (String)session.getAttribute("comments");
   if(null == comments){
     comments = "";
   }
   // If this is a form submission, add the new comment
   // to the existing ones
   String comment  = request.getParameter("comment");
   if(null != comment){
     comments = comments + comment + "<br />";
     session.setAttribute("comments", comments);
     response.sendRedirect(request.getContextPath() + "/prg.jsp");
     return;
   }
 %>
 
 <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
 <html>
   <head>
     <title>Simple Post Redirect Get Pattern</title>
     <meta http-equiv="Expires"       content="Sat, 01 Dec 2001 00:00:00 GMT" />
     <meta http-equiv="pragma"        content="no-cache" />
     <meta http-equiv="Cache-Control" content="no-cache" />
   </head>
   <body>
     <fieldset>
       <legend>Previous Comments</legend>
       <%=comments%>
     </fieldset>
     <form method="post" action="<%=request.getContextPath()%>/prg.jsp">
       <fieldset>
         <legend>Add a new comment</legend>
         <input type="text" name="comment" id="comment" />
         <input type="submit" name="enter_button" id="Enter" />
       </fieldset>
     </form>
   </body>
 </html>