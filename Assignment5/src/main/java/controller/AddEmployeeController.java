package main.java.controller;

import main.java.service.ConnectionFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;

public class AddEmployeeController extends HttpServlet{

    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
        try {
            String redirect;

            ConnectionFactory connectionFactory = new ConnectionFactory();
            Connection connection =connectionFactory.getConnection();

            String name = request.getParameter("name");
            Long contact = Long.valueOf(request.getParameter("contact"));
            String email = request.getParameter("email");
            String bloodGroup = request.getParameter("bloodGroup");

            String insert = "INSERT INTO employees (name,contact,email,blood_group)VALUES(?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insert);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, Math.toIntExact(contact));
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, bloodGroup);
            preparedStatement.executeUpdate();

            redirect ="display.jsp";
            RequestDispatcher requestDispatcher = request.getRequestDispatcher(redirect);
            requestDispatcher.forward(request,response);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
