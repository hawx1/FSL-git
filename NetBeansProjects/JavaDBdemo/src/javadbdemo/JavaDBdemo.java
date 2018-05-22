/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadbdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 2701faiqbal
 */
public class JavaDBdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Loading driver class
        Class.forName("com.mysql.jdbc.Driver");
        // Create connection for DB and Table 'produit'
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/stock", "root", "root");
        //
        // create statement : object to manage command SQL
        Statement statement = connection.createStatement();
        // to SQL command
        ResultSet resultSet = statement.executeQuery("SELECT * FROM stock.produit WHERE label = 'petit coca'");
        //
        // crée une liste de produits (vide)
        ArrayList<Produit> produits = new ArrayList<>();
        
        // récupère les records
        while(resultSet.next()) {               // tant qu'il y a un une record
            Produit produit = new Produit(      // crée un nouveau Product
                    resultSet.getString(1), 
                    resultSet.getDouble(2), 
                    resultSet.getString(3), 
                    resultSet.getString(4)
            );
            produits.add(produit);              // ajoute un Product à la liste
        }
        
        // affiche les résultats
        for (Produit produit : produits) {
            System.out.println(produit);
        }
      
    }
}
