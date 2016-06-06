/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;
import snakegame.Block;
import java.awt.Color;
import snakeworld.Location;
/**
 *
 * @author Connor Coale User AC
 */
public class FoodBlock extends Block{
    
    
    public FoodBlock(int r, int c){
        location = new Location(r, c);
        color = Color.BLUE;
    }
    public FoodBlock(){
        color = Color.BLUE;
    }
    public void generateNewLocation(Snake s){
        //TODO: make sure that the newly generated FoodBlock will not interfere with the Snake's SnakeBlock(s)
        int boardHeight = 10;
        int boardLength = 10;
        int randR = (int)(Math.random() * boardHeight);
        int randC = (int)(Math.random() * boardLength);
        location.setNewLocation(randR, randC);
        
        
    }
}
