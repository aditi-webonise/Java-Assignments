<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %><%--
  Created by IntelliJ IDEA.
  User: webonise
  Date: 7/12/17
  Time: 6:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Delete Page</title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <form  action="DeleteEmployeeController" method="post">
            <label>Name</label>
            <input name="name" type="text" placeholder="Name" value="" required>
            <button>DELETE</button>
        </form>
    </body>
</html>
