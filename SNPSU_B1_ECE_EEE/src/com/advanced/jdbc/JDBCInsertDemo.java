package com.advanced.jdbc;
import java.sql.*;

public class JDBCInsertDemo {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.
                getConnection("jdbc:mysql://localhost:3306/snpsu_ece_eee_b1",
                             "root",
                         "1234");
        System.out.println("Connection Established!!!!!!");
        String fname = "Saurav";
        String lname = "R";
        // What is the best way to stop data hacking [SQL Injection]
        // We don't directly pass values, we use Question Marks ?,?
        // These Questions Marks are called SQL Injections
        PreparedStatement ps = connection.
                prepareStatement("INSERT INTO student VALUES (?, ?)");
        ps.setString(1, fname);
        ps.setString(2, lname);
        // If the output is > 0 it's successful, or else not
        int i = ps.executeUpdate();
        if (i > 0){
            System.out.println("Success");
        }else {
            System.out.println("Failure");
        }
        ps.close();
        connection.close();
    }
}
