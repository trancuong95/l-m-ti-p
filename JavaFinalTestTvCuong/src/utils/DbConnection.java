/**
 * (C) Copyright 2018 TranCuong-GDP05. All Rights Reserved.
 *
 * @author TranCuong
 * @date Jan 3, 2019
 * @version 1.0
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
        static final String DRIVER = "com.mysql.jdbc.Driver"; //driver
        static final String URL = "jdbc:mysql://localhost:3306/finaltest"; //url
        static final String USER_NAME = "root"; //user name
        static final String PASSWORD = "3690"; //password
        
        public static Connection connect() {
                //load driver
                try {
                        Class.forName(DRIVER);
                } catch (ClassNotFoundException e) {
                        System.out.println("Lỗi: " + e.getMessage());
                }
                
                //get connection instance
                Connection connection = null;
                try {
                        connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
                } catch (SQLException e) {
                        System.out.println("Lỗi: " + e.getMessage());
                }
                
                return connection;
        }
        
        public static void close(ResultSet rs, Statement st, Connection cnn) {              
                try {
                        if(rs!=null && !rs.isClosed()) {
                                rs.close();
                        }
                } catch (SQLException e) {
                        System.out.println("Lỗi: " + e.getMessage());
                }
                
                try {
                        if(st!=null && !st.isClosed()) {
                                st.close();
                        }
                } catch (SQLException e) {
                        System.out.println("Lỗi: " + e.getMessage());
                }
                
                try {
                        if(cnn!=null && !cnn.isClosed()) {
                                cnn.close();
                        }
                } catch (SQLException e) {
                        System.out.println("Lỗi: " + e.getMessage());
                }
       
        }
        
}