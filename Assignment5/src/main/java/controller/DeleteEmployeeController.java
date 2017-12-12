package main.java.controller;

import main.java.service.ConnectionFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteEmployeeController extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException,ServletException{
        try {
            String redirect;
            ConnectionFactory connectionFactory = new ConnectionFactory();
            Connection connection =connectionFactory.getConnection();

            String name = request.getParameter("name");
            String delete = "DELETE FROM employees where name=?";
            PreparedStatement preparedStatement = connection.prepareStatement(delete);
            preparedStatement.setString(1, name);
            preparedStatement.executeUpdate();

            redirect ="displayEmployee.jsp";
            RequestDispatcher requestDispatcher = request.getRequestDispatcher(redirect);
            requestDispatcher.forward(request,response);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
