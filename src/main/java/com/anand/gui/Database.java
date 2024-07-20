package com.anand.gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private static final String URL = "jdbc:sqlite:users.db";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
