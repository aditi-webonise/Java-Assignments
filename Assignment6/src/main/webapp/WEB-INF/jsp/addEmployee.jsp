<%--
  Created by IntelliJ IDEA.
  User: webonise
  Date: 12/12/17
  Time: 7:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title>Add Employee</title>
    </head>
    <body>
        <h1>Add New Employee</h1>
        <form:form method="post" action="save">
            <table >
                <tr>
                    <td>Name : </td>
                    <td><form:input path="name" type="text" value="" required="true"/></td>
                </tr>
                <tr>
                    <td>Contact :</td>
                    <td><form:input path="contact" type="tel"  value="" required="true"/></td>
                </tr>
                <tr>
                    <td>E-mail :</td>
                    <td><form:input path="email" type="email" value="" required="true"/></td>
                </tr>
                <tr>
                    <td>Blood Group :</td>
                    <td><form:input path="bloodGroup" type="text" value="" required="true"/></td>
                </tr>
                <tr>
                    <td> </td>
                    <td><input type="submit" value="Save"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>
