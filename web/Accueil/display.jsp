

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
      String firstname=  session.getAttribute("firstname").toString();
      out.println("<h1>welcom in display"+firstname);
        
        %>
    </body>
</html>
