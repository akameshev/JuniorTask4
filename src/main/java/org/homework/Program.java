package org.homework;

import org.homework.models.ConnectionState;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(
                ConnectionState.URL,
                ConnectionState.USER,
                ConnectionState.PASSWORD);
        useDatabase(connection);
        createTable(connection);
    }

    public static void useDatabase(Connection connection){
        String useDatabaseQuery = "USE homeworkDB;";
        try(PreparedStatement statement = connection.prepareStatement(useDatabaseQuery)){
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void createTable(Connection connection){
        String createTableQuery = "CREATE TABLE IF NOT EXISTS persons(id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(45), age INT);";
        try(PreparedStatement statement = connection.prepareStatement(createTableQuery)){
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
