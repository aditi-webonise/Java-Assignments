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
<form action="EditEmployeeController" method="post">
<%
    try {
        Connection connection;
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/e_portal", "root", "root");

        int id = Integer.parseInt(request.getParameter("id"));

        String edit = "SELECT * FROM employees where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(edit);

        preparedStatement.setInt(1,id);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()){
%>

    <table>
        <tr>
            <td>Employee Id</td>&nbsp;
            <%--<td><label name="id"><%=rs.getInt(1)%></label ></td>--%>
            <td><input type="text" name="id" value="<%=rs.getInt(1)%>"></td>
        </tr>
        <tr>
            <td>Name</td>&nbsp;
            <td><input type="text" name="name" value="<%=rs.getString(2)%>"></td>
        </tr>
        <tr>
            <td>Contact</td>&nbsp;
            <td><input type="text" name="contact" value="<%=rs.getInt(3)%>"></td>
        </tr>
        <tr>
            <td>Email</td>&nbsp;
            <td><input type="email" name="email" value="<%=rs.getString(4)%>"></td>
        </tr>
        <tr>
            <td>Blood Group</td>&nbsp;
            <td><input type="text" name="bloodGroup" value="<%=rs.getString(5)%>"></td>
        </tr>
    </table>

    <%}
    }
        catch(Exception e){
            e.printStackTrace();
        }
    %>
    <button >SAVE</button>
</form>
<a href="display.jsp"><button name="display">Display Records</button></a>
</body>
</html>
