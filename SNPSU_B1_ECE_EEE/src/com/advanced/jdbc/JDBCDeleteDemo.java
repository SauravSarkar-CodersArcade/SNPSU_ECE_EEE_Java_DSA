package com.advanced.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class JDBCDeleteDemo {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.
                getConnection("jdbc:mysql://localhost:3306/snpsu_ece_eee_b1",
                             "root",
                         "1234");
        System.out.println("Connection Established!!!!!!");
        String fname = "Saurav";
        // What is the best way to stop data hacking [SQL Injection]
        // We don't directly pass values, we use Question Marks ?,?
        // These Questions Marks are called SQL Injections
        PreparedStatement ps = connection.
                prepareStatement("DELETE FROM student WHERE firstName=?");
        ps.setString(1, fname);
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
