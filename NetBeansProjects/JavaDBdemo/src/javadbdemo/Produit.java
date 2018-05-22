package javadbdemo;


public class Produit {

    private String label;
    private double price;
    private String unit;
    private String description;

    public Produit() {
    }

    public Produit(String label, double price, String unit, String description) {
        this.label = label;
        this.price = price;
        this.unit = unit;
        this.description = description;
    }
    
    /**
     * Constructeur de copie
     * (copie l'objet en un autre objet)
     * @param product : une instance de Product
     */
    public Produit(Produit produit) {
        this.label = produit.getLabel();
        this.price = produit.price;
        this.unit = produit.unit;
        this.description = produit.description;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" + "label=" + label + ", price=" + price + ", unit=" + unit + ", description=" + description + '}';
    }

}