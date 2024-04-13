package Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private static DataBaseConnection instance;
    private Connection connection;


    private DataBaseConnection() {
        String url = "jdbc:mysql://localhost:3306/proyecto";
        String username = "root";
        String password = "proyecto";

        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DataBaseConnection getInstance() {
        if (instance == null) 
            instance = new DataBaseConnection();
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        if(connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
    }
}
