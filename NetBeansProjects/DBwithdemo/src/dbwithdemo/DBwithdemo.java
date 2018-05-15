/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbwithdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 2701faiqbal
 */
public class DBwithdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Load the JDBC driver
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded");

        // Connect to a database
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/stock" , "root", "root");
        System.out.println("Database connected");

        // Create a statement
        Statement statement = connection.createStatement();
 
        // Execute a statement
        ResultSet resultSet = statement.executeQuery
        ("select * from stock.product where description = 'Good product'");

        // Iterate through the result and print the student names
        while (resultSet.next())
        System.out.println(resultSet.getString(1) + "\t" +
        resultSet.getString(2) + "\t" + resultSet.getString(3));

        // Close the connection
        connection.close();
    }
}
      
   
