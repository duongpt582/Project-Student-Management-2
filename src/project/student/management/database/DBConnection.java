/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.student.management.database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author DucNguyen
 */
public class DBConnection {
    private static Connection conn;
    private static String URL_DB = "jdbc:mysql://localhost:3306/student_management";
    private static String USER_NAME = "root";
    private static String PASS_WORD = "";
    
    public static Connection getConnection(){
        try {
            conn = DriverManager.getConnection(URL_DB, USER_NAME, PASS_WORD);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
