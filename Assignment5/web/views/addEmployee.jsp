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
        <title>Add Page</title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <form  action="AddEmployeeController" method="post">
            <label>Name</label>
            <input name="name" type="text" placeholder="Name" value="" required>
            <br>
            <label>Contact</label>
            <input name="contact" type="number" placeholder="Contact" value="" required>
            <br>
            <label>Email</label>
            <input name="email" type="email" placeholder="Email Id" value="" required>
            <br>
            <label>Blood Group</label>
            <input name="bloodGroup" type="text" placeholder="Blood Group" value="" required>
            <br>
            <button>ADD</button>
        </form>
    </body>
</html>
