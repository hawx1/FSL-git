/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fsl.git;

/**
 *
 * @author 2701faiqbal
 */
public class Voiture {
    String LicensePlate; // Number plate
    String year; // year of fab
    String color; // color
    String km; //  km
    String model; // Brand and model
    String GasType; // Gasoline type
    
    void print()    {
        System.out.println("La voiture est :\n" + 
                "\tmodel : " + model + "\n" + 
                "\tannee : " + year + "\n" +
                "\tcolor : " + color + "\n" +
                "\tkm : " + km + "\n");
    }
    
    String getDescription()   {
       String desc = "La voiture est :\n" + 
                "\tmodel : " + model + "\n" + 
                "\tannee : " + year + "\n" +
                "\tcolor : " + color + "\n" +
                "\t"
               + "km : " + km + "\n";
       return desc;
    }
}
