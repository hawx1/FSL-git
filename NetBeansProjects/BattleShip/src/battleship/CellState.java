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
public enum CellState {
    WATER,      // la cellule n'a pas de bateau
    BOMB_WATER, // la cellule n'a pas de bateau et une bombe a été tirée
    SHIP,       // la cellule porte un bateau,
    TOUCH,      // le bateau est touché mais pas coulé => cellules touchés sont TOUCH
    SUNK        // le bateau est coulé => les cellules sont SUNK 
}