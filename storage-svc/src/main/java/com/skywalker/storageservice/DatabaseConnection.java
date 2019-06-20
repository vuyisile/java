package com.skywalker.storageservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public Connection connect() {
        String url = "jdbc:postgresql://localhost:5432/storagesvcdb";
        String user = "postgres";
        String password = "testing";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

}
