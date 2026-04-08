package com.advanced.jdbc.bookstore;
import java.sql.*;
import java.util.Scanner;
public class BookstoreCRUD {
    // Database connection constants : Update password if necessary
    private static final String URL = "jdbc:mysql://localhost:3306/bookstore_db";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public static void main(String[] args) {
        // try block with resources [Connection] [Scanner] -> Auto Close
        try(Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        Scanner sc = new Scanner(System.in)) {
            // Loading the MySQl JDBC Driver for the connection to the Database
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Main Application Loop
            // Infinite Loop
            while (true){
                // Display menu options
                System.out.println("\n1. Create Book | 2. View All Books | 3. Update Book | 4. Delete Book | 5. Exit");
                System.out.print("Enter Your Choice: ");
                int ch = sc.nextInt(); //  This input say 4 will only take a part of the line
                sc.nextLine(); // This is to consume the leftover newline

                // ------------------------------ CREATE BOOK --------------------------------
                if (ch == 1){
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    // We will take a PreparedStatement to prevent SQL Injection
                    String sql = "INSERT INTO books (title, author, price) VALUES (?, ?, ?)";
                    try(PreparedStatement ps = conn.prepareStatement(sql)) {
                        ps.setString(1, title);
                        ps.setString(2, author);
                        ps.setDouble(3, price);
                        ps.executeUpdate(); // executes the INSERT
                        System.out.println("Book added");
                    }
                }
                // -------------------------- VIEW ALL BOOKS ----------------
                else if(ch == 2){
                    String sql = "SELECT * FROM BOOKS";
                    try(Statement st = conn.createStatement();
                        ResultSet rs = st.executeQuery(sql)) {
                        System.out.println("ID | Title | Author | Price");
                        // Loop through each row in the result set
                        while (rs.next()){
                            int id = rs.getInt("id");
                            String title = rs.getString("title");
                            String author = rs.getString("author");
                            double price = rs.getDouble("price");
                            System.out.println(id + "\t" + title + "\t" + author +
                                    "\t" + price);
                        }
                    }
                }
                // ---------------------------- UPDATE BOOK ------------------------
                else if(ch == 3){
                    System.out.print("Book ID to update: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // This will consume the remaining new line
                    System.out.print("New title: ");
                    String title = sc.nextLine();
                    System.out.print("New author: ");
                    String author = sc.nextLine();
                    System.out.print("New price: ");
                    double price = sc.nextDouble();

                    String sql = "UPDATE books SET title=?, author=?, price=? WHERE id=?";
                    try(PreparedStatement ps = conn.prepareStatement(sql)) {
                        ps.setString(1, title);
                        ps.setString(2, author);
                        ps.setDouble(3, price);
                        ps.setInt(4, id);
                        int rows = ps.executeUpdate(); // returns the numbers of affected rows
                        if (rows > 0) System.out.println("Updated.");
                        else System.out.println("ID not found.");
                    }
                }
                // ---------------------------- DELETE BOOK ----------------
                else if(ch == 4){
                    System.out.print("Book ID to delete: ");
                    int id = sc.nextInt();
                    String sql = "DELETE FROM books WHERE id=?";
                    try(PreparedStatement ps = conn.prepareStatement(sql)) {
                        ps.setInt(1, id);
                        int rows = ps.executeUpdate();
                        if(rows > 0) System.out.println("Deleted.");
                        else System.out.println("ID not found.");
                    }
                }
                // ------------------- EXIT --------------------------
                else if(ch == 5){
                    System.out.println("BYE BYE !!");
                    break; // Exit the while loop
                }
                // Handle Invalid Menu Choice
                else {
                    System.out.println("Invalid Choice. Choose from any of [1,2,3,4,5]");
                }
            }

        }catch (ClassNotFoundException e){
            System.out.println("MYSQL JDBC Driver not found. Add the jar.");
        }catch (SQLException e){
            System.out.println("Database Error: " + e.getMessage());
        }
    }
}
