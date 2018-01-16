/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2701faiqbal
 */
public class Rectangle {
        // Data Variables with default value 1
        double width = 1;
        double height = 1;
        // Rectangle calculate
        double getArea() {
            return width * height;
        }
        // Perimeter calculate
        double getPerimeter() {
            return 2 + (width + height);
        }
        // 
        public static void main(String[] args) {
        // First Triangle
            Rectangle r1 = new Rectangle();
            r1.height = 40;
            r1.width = 4;
            System.out.println(r1.getArea());
            System.out.println(r1.getPerimeter());
        // Second Triangle 
            Rectangle r2 = new Rectangle();
            r2.height = 35.9;
            r2.width = 3.5;
            System.out.println(r2.getArea());
            System.out.println(r2.getPerimeter());
        //End
    } 
}
