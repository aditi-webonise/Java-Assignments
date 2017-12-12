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
    <form   method="get">
        <label>Name</label>
        <input name="name" type="text" placeholder="Name" value="" required>
        <button>DELETE</button>
        <%
            try {
                Connection connection;
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/e_portal", "root", "root");

                String name = request.getParameter("name");

                String delete = "DELETE FROM employees where name=?";
                PreparedStatement preparedStatement = connection.prepareStatement(delete);

                preparedStatement.setString(1, name);
                preparedStatement.executeUpdate();
            }
            catch (Exception e){
                e.printStackTrace();
            }

        %>
    </form>
<a href="display.jsp"><button name="display">Display Records</button></a>
</body>
</html>
