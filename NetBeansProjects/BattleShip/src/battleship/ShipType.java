/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

/**
 *
 * @author 2701faiqbal
 */
public class ShipType {
    // Ship ID
    private String name;
    private int size;

    public ShipType(int size) {
        this.size = size;
    }

    public ShipType(String name, int size) {
        this.name = name;
        this.size = size;
    }

    private ShipType type;
    private Orientation orientation;
    private int x;
    private int y;

    

    public ShipType getType() {
        return type;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
    
    
}
