<%--
  Created by IntelliJ IDEA.
  User: webonise
  Date: 13/12/17
  Time: 4:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
    <head>
        <title>Edit Employee</title>
    </head>
    <body>
        <h1>Edit Employee</h1>
        <form:form method="POST" action="/update">
            <table >
                <tr>
                    <td>Employee Id :</td>
                    <td><form:input path="id" readonly="true" /></td>
                </tr>
                <tr>
                    <td>Name : </td>
                    <td><form:input path="name" type="text" /></td>
                </tr>
                <tr>
                    <td>Contact :</td>
                    <td><form:input path="contact" type="tel" /></td>
                </tr>
                <tr>
                    <td>Email :</td>
                    <td><form:input path="email" type="email"/></td>
                </tr>
                <tr>
                    <td>Blood Group :</td>
                    <td><form:input path="bloodGroup" type="text"/></td>
                </tr>
                <tr>
                    <td> </td>
                    <td><input type="submit" value="Save" /></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>
