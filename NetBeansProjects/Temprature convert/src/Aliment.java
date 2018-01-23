/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2701faiqbal
 */
public class Aliment {
    String name;
    Category category;
    double kcal;
    double price;
    // Constructor
    // By Using Alt+Insert 
    public Aliment(String name, Category category, double kcal, double price) {
        this.name = name;
        this.category = category;
        this.kcal = kcal;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Aliment{" + "name=" + name + ", category=" + category + ", kcal=" + kcal + ", price=" + price + '}';
    }
    
    public static void main(String[] args) {
        Aliment carotte = new Aliment("carotte", new Category("legume"), 100, 1.13);
        System.out.println(carotte); 
    }
}
