package battleship;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// https://moodle.epfc.eu/mod/page/view.php?id=25986
/**
 *
 * @author 2701faiqbal
 */
public class FriendGrid extends BattleGrid {

    public FriendGrid(int size) {
        super(size);
    }

    void createShip(int size, Ship.Orientation orientation, int x, int y) {
        ShipType type = new ShipType(size);
        Ship ship = new Ship(type, orientation, x, y);
        ships.add(ship);
    }
}
