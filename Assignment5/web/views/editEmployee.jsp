<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: webonise
  Date: 7/12/17
  Time: 6:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Edit Page</title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <form action="saveEmployee.jsp" method="get">
            <label>Employee Id</label>
            <input name="id" type="text" placeholder="id" value="" required>
            <button>EDIT</button>
        </form>
    </body>
</html>
