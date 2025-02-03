package com.labs.orderapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Holds DB Connection details and provides Connection object
 */
public class DbConnection {
    private static Connection conn;

    static final String DB_URL = "jdbc:postgresql://localhost:5432/training";
    static final String USER = "postgres";
    static final String PASS = "postgres";
    private DbConnection() {
    }

    public static Connection getConnection() {
        if(conn == null) {
            try {
                conn = DriverManager.getConnection(DB_URL, USER, PASS);
                System.out.println("Connection created successfully.");
            } catch (SQLException e) {
                System.out.println("Error while creating connection. " + e.getMessage());
            }
        }
        return  conn;
    }

    public static void closeConnection() {
        if(conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("Error while closing the connection.");
            }
            System.out.println("Connection closed successfully.");
        }
    }
}
