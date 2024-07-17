package com.anand.databases;

import java.sql.*;

public class DatabaseHandler {
    private static final String DB_url = "jdbc:derby:database/forum;create=true";
    private static Connection conn = null;
    private static Statement stmt = null;
    public static DatabaseHandler handler;

    public DatabaseHandler() {
        createConnection();
        createTable();
    }

    public static DatabaseHandler getHandler(){
        if(handler == null){
            handler = new DatabaseHandler();
            return handler;
        }else{
            return handler;
        }
    }

    private void createTable() {
        String TABLE_NAME = "MEMBER";
        try {
            stmt = conn.createStatement();
            DatabaseMetaData dmn = conn.getMetaData();
            ResultSet tables = dmn.getTables(null, null, TABLE_NAME, null);
            if (tables.next()) {
                System.out.println("Table " + TABLE_NAME + " exists");
            } else {
                String statement = "CREATE TABLE " + TABLE_NAME + " ("
                        + "id varchar(200) primary key, \n"
                        + "name varchar(200), \n"
                        + "email varchar(200), \n"
                        + "nickname varchar(200))";
                System.out.println(statement);
                stmt.execute(statement);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private void createConnection() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn = DriverManager.getConnection(DB_url);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean execAction(String qu) {
        try {
            stmt = conn.createStatement();
            stmt.execute(qu);
            return true;

        } catch (SQLException throwables) {
            System.out.println(throwables);
            System.out.println("Did not enter data");
        }
        return false;
    }

    public ResultSet execQuery(String query){
        ResultSet resultSet;
        try{
            stmt = conn.createStatement();
            resultSet = stmt.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
        return resultSet;
    }
}
