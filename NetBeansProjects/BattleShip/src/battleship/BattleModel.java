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
public class BattleModel {
    
    public enum State {
        CONFIGURING,
        PLAYING,
        DONE
    }
    FriendGrid friendGrid;
}