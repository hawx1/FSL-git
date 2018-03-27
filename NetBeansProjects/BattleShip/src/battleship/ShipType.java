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
    private String Ship;
    private int size;

    public ShipType(int size) {
        this.size = size;
    }

    public ShipType(String Ship) {
        this.Ship = Ship;
    }

    public String getShip() {
        return Ship;
    }

    public int getSize() {
        return size;
    }
    
    
}
