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
public class graphWithArray {
    public static void main(String[] args) {
        char[] table = makingArray();
        Scanner input = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Type I : Print table ");
            System.out.println("Type A : Add table ");
            System.out.println("Type Q to quit ");
            choice = input.next();
            switch(choice) {
                case "A":
                    addSegment(input, table);
                    break;
                case "I":
                    System.out.println(table);
                    break;
                case "Q":
                    break;
                default:
                    System.out.println(choice + " does not exit in menu");
            }
        } while( ! choice.equals("Q"));
        System.out.println("End of Programme");
    }

    private static char[] makingArray() {
        char[] table = new char[80];
        // initiliazed
        //for (char c : table) {
        //    c = '.';
        for(int i=0; i<table.length; i++) {
            table[i] = '.';
        }
        return table;
    }

    private static void addSegment(Scanner input, char[] table) {
        System.out.print("Character? ");
        char character = input.next().charAt(0);
        //
        System.out.print("Position? ");
        int position = input.nextInt();
        //
        System.out.print("Segment length? ");
        int length = input.nextInt();
        //
        for(int i=position; i<position+length; i++) {
            table[i] = character;
        }
    }
}
