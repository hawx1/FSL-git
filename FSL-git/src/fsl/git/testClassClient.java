/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fsl.git;

import java.util.Scanner;

/**
 * Class pour tester explorer
 * @author 2701faiqbal
 */
public class testClassClient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Client olivier = new Client();
        olivier.identifier = "R2D2";
        olivier.firstName = "Olivier";
        olivier.familyname = "Durant";
        olivier.address = "16 rue de la loi ";
        olivier.telephone = "+65-684-25435";
        olivier.drivingLicense = "12855956";
        
        System.out.println("New client is " +olivier.firstName  + " " + olivier.familyname);
    }
}
