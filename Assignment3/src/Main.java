import java.sql.*;

public class Main{
    public static Statement statement;
    public static PreparedStatement preparedStatement;
    public static ResultSet resultSet;
    public static Connection connection;

    public static void main(String[] args){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_demo","root","root");
            if (connection != null){
                System.out.println("Connected to the database");
            }
            connection.setAutoCommit(false);

            String select= "SELECT * FROM users";
            statement = connection.createStatement();
            display(select);

            String insert = "INSERT INTO users VALUES(?,?)";
            preparedStatement = connection.prepareStatement(insert);
            preparedStatement.setInt(1,2);
            preparedStatement.setString(2,"akanchha");
            preparedStatement.executeUpdate();
            System.out.println("New row inserted!!");
            display(select);

            String update = "UPDATE users SET name = ? WHERE id = ?";
            preparedStatement = connection.prepareStatement(update);
            preparedStatement.setString(1,"ashrami");
            preparedStatement.setInt(2,2);
            preparedStatement.executeUpdate();
            System.out.println("Row updated!!");
            display(select);

            String delete = "DELETE FROM users WHERE id = ?";
            preparedStatement = connection.prepareStatement(delete);
            preparedStatement.setInt(1,2);
            preparedStatement.executeUpdate();
            System.out.println("Row deleted!!");
            display(select);

            connection.commit();
            resultSet.close();
            statement.close();
            preparedStatement.close();
            connection.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    private static void display( String select) throws SQLException{
        resultSet = statement.executeQuery(select);
        while(resultSet.next()){
            int id  = resultSet.getInt("id");
            String name = resultSet.getString("name");
            System.out.print("ID: " + id);
            System.out.println(", Name: " + name);
        }
    }
}
