/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

import snakegame.Block;
import java.awt.Color;

/**
 *
 * @author Connor Coale User AC
 */
public class SnakeBlock extends Block{
    
    
    
    public SnakeBlock(int r, int c){
        location = new Location(r, c);
        color = Color.BLUE;
    }
    
}
