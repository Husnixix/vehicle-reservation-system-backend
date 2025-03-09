/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/mega_cab_service_dev";
    private static final String USER = "root"; 
    private static final String PASSWORD = "root123"; 

    public static Connection getConnection() {   
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("System connectioting");
            return conn;          
        } catch (ClassNotFoundException | SQLException e) {               
        }      
        return null;
    }
}
