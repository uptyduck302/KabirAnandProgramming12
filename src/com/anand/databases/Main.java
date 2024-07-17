package com.anand.databases;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    private static DatabaseHandler handler;

    public static void addMember(String id, String name, String email, String nickName) {
        String qu = "INSERT INTO MEMBER VALUES (" +
                "'" + id + "', " +
                "'" + name + "', " +
                "'" + email + "', " +
                "'" + nickName + "')";
        handler.execAction(qu);
    }

    public static void main(String[] args) {
        handler = DatabaseHandler.getHandler();

        // Add members to the table
        addMember("ID13123", "Kabir", "kabir@example.com", "kabird");
        addMember("ID32434", "Jack", "jack@example.com", "jackd");

        // Query the database and print results
        String qu = "SELECT * FROM MEMBER";
        ResultSet resultSet = handler.execQuery(qu);
        try {
            while (resultSet.next()) {
                String id = resultSet.getString("ID");
                String name = resultSet.getString("NAME");
                System.out.println("Entry: ID = " + id + "\tName: " + name);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
