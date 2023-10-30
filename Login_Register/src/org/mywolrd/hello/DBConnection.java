/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mywolrd.hello;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author SIDDHANT CHAUHAN
 */
public class DBConnection {
    
    static final String DB_URL="jdbc:mysql://localhost/world";
    static final String USER="root";
    static final String PASS="";
    public static Connection connectDB() throws ClassNotFoundException{
        Connection conn =null;
        try{
           Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            return conn;
        }catch (ClassNotFoundException | SQLException ex){
            System.out.println("There were Error While connecting  DataBase");
            return null;
        }
    }
    
}
