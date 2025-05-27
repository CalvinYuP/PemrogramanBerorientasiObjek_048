/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.*;
public class DatabaseConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/rental.sql";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }
    
}
