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
public class Car {
    private String LicensePlate; // Number plate
    private int year; // year of fab
    private String color; // color
    private int km; //  km
    private String model; // Brand and model
    

    public String getLicensePlate() {
        return LicensePlate;
    }

    public void setLicensePlate
    
    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color)  {
        // white, blue, yello, grey, green
        if (color.equals("blanc") ||
                color.equals("blue"))   {
            this.color = color;
        } else {
            System.err.println("bad color");
        }
    }
    
    public int getKm() {
        return km;
    }

    public void setKm(int Km) {
        if(0 < Km && Km > 1000000) {
            this.Km = Km;
        } else {
            System.err.print("bad km");
        }
   }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String Model)
    
}
