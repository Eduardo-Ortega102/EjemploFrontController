
<%@page import="java.time.Instant"%>
<%@page import="controller.commands.LocalDate"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hola mundo!</h1>
        <p>La fecha local es:  <%=Instant.now()%></p>
    </body>
</html>
