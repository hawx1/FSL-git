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
        // Data Variables
        double height = 10;
        double width = 10;
        // Rectangle calcul
        double getArea() {
            return height * width;
        }
        // Perimeter calcul
        double getPerimeter() {
            return 2 + (height + width);
        }
        // 
        public static void main(String[] args) {
        //
        //Rectangle.main(args);
        //double number = Math.cos(Math.PI);
            Rectangle r1 = new Rectangle();
            r1.height = 10;
            r1.width = 10;
            System.out.println(r1.getArea());
            System.out.println(r1.getPerimeter());
            
    } 
}
