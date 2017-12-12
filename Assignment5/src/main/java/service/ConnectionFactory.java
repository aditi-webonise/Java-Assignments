package main.java.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private Connection connection;

    public Connection getConnection() throws ClassNotFoundException {
        if (connection != null){
            return connection;
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/e_portal", "root", "root");
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
