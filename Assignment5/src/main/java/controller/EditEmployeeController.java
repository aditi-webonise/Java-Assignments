package main.java.controller;

import main.java.service.ConnectionFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

public class EditEmployeeController extends HttpServlet {

    protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{

        try {
            String redirect;
            ConnectionFactory connectionFactory = new ConnectionFactory();
            Connection connection =connectionFactory.getConnection();

            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            int contact = Integer.parseInt(request.getParameter("contact"));
            String email = request.getParameter("email");
            String bloodGroup = request.getParameter("bloodGroup");

            String save = "UPDATE employees SET name= ?, contact = ?, email = ?, blood_group = ? where id = ?";
            PreparedStatement statement = connection.prepareStatement(save);
            statement.setString(1, name);
            statement.setInt(2, contact);
            statement.setString(3, email);
            statement.setString(4, bloodGroup);
            statement.setInt(5,id);
            statement.executeUpdate();

            redirect ="displayEmployee.jsp";
            RequestDispatcher requestDispatcher = request.getRequestDispatcher(redirect);
            requestDispatcher.forward(request,response);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
