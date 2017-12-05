package operations;

import java.io.*;
import java.sql.*;

public class Operations {

    private Statement statement;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private BufferedReader input;
    private Connection connection;

    public Operations() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/chatting_app", "root", "root");
    }

    public void display(String user) throws SQLException {
        String select;
        if( user.equals("server") ) {
            select= "SELECT * FROM server";
        } else {
            select= "SELECT * FROM client";
        }
        statement = connection.createStatement();
        resultSet = statement.executeQuery(select);
        while(resultSet.next()){
            int id  = resultSet.getInt("id");
            String message = resultSet.getString("message");
            System.out.print("Id: " + id);
            System.out.println("\t Message: " + message);
        }
    }

    public void delete(String user) throws SQLException, IOException {
        input = new BufferedReader(new InputStreamReader(System.in));
        int deleteId = Integer.parseInt(input.readLine());
        String delete;
        if( user.equals("server") ) {
            delete = "DELETE FROM server WHERE id = ?";
        } else {
            delete = "DELETE FROM client WHERE id = ?";
        }
        preparedStatement = connection.prepareStatement(delete);
        preparedStatement.setInt(1,deleteId);
        preparedStatement.executeUpdate();
        System.out.println("Message Deleted");
    }

    /*public void deleteMultiple(String user) throws SQLException, IOException {

        input = new BufferedReader(new InputStreamReader(System.in));
        int deleteIds[] = new int[10];
        int i =0;
        while(i<10 && !input.readLine().isEmpty()) {
            deleteIds[i] = Integer.parseInt(input.readLine());
            i++;
        }
        String delete;
        if(user =="server") {
            delete = "DELETE FROM server WHERE id IN (?) ";
        }else{
            delete = "DELETE FROM client WHERE id IN (?)";
        }
        preparedStatement = connection.prepareStatement(delete);
        i =0;
        while(i<10) {
            preparedStatement.setInt(1,deleteIds[i]);
            preparedStatement.executeUpdate();
            i++;
        }
        System.out.println("Message Deleted");
    }*/

    public void insert(String user,String message) throws SQLException, IOException{
        String insert;
        if( user.equals("server") ) {
            insert = "INSERT INTO server (message) VALUES (?)";
        } else {
            insert = "INSERT INTO client (message) VALUES (?)";
        }
        preparedStatement = connection.prepareStatement(insert);
        preparedStatement.setString(1, message);
        preparedStatement.executeUpdate();
    }

    public void edit(String user) throws SQLException, IOException{
        input = new BufferedReader(new InputStreamReader(System.in));
        int editId = Integer.parseInt(input.readLine());
        String message = input.readLine();
        String edit;
        if( user.equals("server") ) {
            edit = "UPDATE server SET message= ? WHERE id= ?";
        } else {
            edit = "UPDATE client SET message= ? WHERE id= ?";
        }
        preparedStatement = connection.prepareStatement(edit);
        preparedStatement.setString(1,message);
        preparedStatement.setInt(2,editId);
        preparedStatement.executeUpdate();
        System.out.println("Message Updated");
    }
}
