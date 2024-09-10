package org.homework.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

public class PersonRepository {
    public static void add(Person human) {
        try(Connection connection = DriverManager.getConnection(
                ConnectionState.URL,
                ConnectionState.USER,
                ConnectionState.PASSWORD
        )){
            String insertPersonSQL = "INSERT INTO persons(name, age) VALUES(?,?);";
            try(PreparedStatement statement = connection.prepareStatement(insertPersonSQL)){
                statement.setString(1, human.getName());
                statement.setInt(1,human.getAge());
                statement.executeUpdate();
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

    }


    public void update(Person human) {

    }


    public void delete(Person human) {

    }


    public Person getByID(Integer object) {
        return null;
    }

    public Collection getAll() {
        return List.of();
    }
}
