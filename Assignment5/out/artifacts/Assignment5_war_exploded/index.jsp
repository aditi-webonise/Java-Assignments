<%--
  Created by IntelliJ IDEA.
  User: webonise
  Date: 7/12/17
  Time: 2:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Login Page</title>
    <link rel="stylesheet" href="style.css">
  </head>
  <body>
    <h1>Employee Portal</h1>
    <h3>Please enter your credentials!</h3>
    <div>
      <form action="LoginController" method="post">
        <label >User Name</label>
        <input name="username" type="text" placeholder="username" value="" required>
        <br>
        <label >Password</label>
        <input name="password" type="password" placeholder="password" value="" required>
        <br>
        <button id="login">Login</button >
      </form>
    </div>
  </body>
</html>
