<%@ page import="main.java.model.Employee" %>
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
    <title>Display Page</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <form  method="get">


        <table border=1>
            <thead>
            <tr>
                <th>Employee Id</th>
                <th>Name</th>
                <th>Contact</th>
                <th>Email</th>
                <th>Blood Group</th>
            </tr>
            </thead>
            <%
                Connection connection;
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/e_portal", "root", "root");
                    Statement statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery("SELECT * FROM employees");
                    while (rs.next()) {
                    %>

                <tbody>
                <tr></tr>
                <td><%=rs.getInt(1)%></td>
                <td><%=rs.getString(2)%></td>
                <td><%=rs.getLong(3)%></td>
                <td><%=rs.getString(4)%></td>
                <td><%=rs.getString(5)%></td>
                    <%}
                    %>
                </tr>
                </tbody>

        </table>
    </form>
    <a href="add.jsp"><button name="add">Add new Employee</button></a>
    <a href="delete.jsp"><button name="delete">Delete Employee</button></a>
</body>
</html>
