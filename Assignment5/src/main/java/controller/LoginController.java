package main.java.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController extends HttpServlet{

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username=request.getParameter("username");
        String password=request.getParameter("password");

        if( username.equals("admin") && password.equals("pass") ) {
            response.sendRedirect("home.jsp");
            return;
        } else {
            System.err.println("Invalid Username or Password");
            response.sendRedirect("error.jsp");
            return;
        }
    }

}

