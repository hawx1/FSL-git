/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

// https://moodle.epfc.eu/mod/page/view.php?id=25986

import java.util.ArrayList;

/**
 *
 * @author 2701faiqbal
 */
public class EnemiGrid extends BattleGrid {
    public EnemiGrid(int size) {
        super(size);
    }
    
    void createShips(ArrayList<Ship> ships) {
        // should be implemented through a deep clone
        for (Ship ship : ships) {
            Ship myShip = new Ship(ship.getType(), ship.getOrientation(), ship.getX(), ship.getY());
            this.ships.add(myShip);
        }
    }
}