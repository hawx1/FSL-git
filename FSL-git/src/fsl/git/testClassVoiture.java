/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fsl.git;

import java.util.Scanner;

/**
 *
 * @author 2701faiqbal
 */
public class testClassVoiture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Voiture jaguar = new Voiture();
        
        
        jaguar.LicensePlate = "AZE-564";
        jaguar.color = "black ";
        jaguar.model = "2016 ";
        jaguar.km = "20159 ";
        jaguar.year = "2015 ";
        jaguar.GasType = "Petrol ";
        
        // jaguar.print(); // to print method
        System.out.println(jaguar.getDescription()); // to print differently 
    }
}
