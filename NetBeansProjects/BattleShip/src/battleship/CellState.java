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
public class CellState {
    public enum CellState {
        UNKNOWN,
        NOTHING,
        WATER,
        SHIP,
        TOUCH,
        SUNK
        
    }
}
