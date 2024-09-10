package org.homework.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionState {
    public static final String URL = "jdbc:mysql://localhost:3306/";
    public static final String USER = "root";
    public static final String PASSWORD = "password";

    public static Connection getConnectionDB() throws SQLException {
        try(Connection connection = DriverManager.getConnection(URL,USER,PASSWORD)){
            return connection;
        }
    }
}
