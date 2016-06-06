/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeworld;
import java.util.ArrayList;
/**
 *
 * @author Connor Coale User AC
 */
public class SnakeWorld {

    private Block[][] world;
    private Snake snake;

    public SnakeWorld(int numRows, int numCols) {
        world = new Block[numRows][numCols];
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                world[row][col] = new Block(row, col);
            }
        }
    }

    public void init() {
        int randRow;
        int randCol;
        SnakeBlock s;
        randRow = (int)(Math.random() * world.length);
        randCol = (int)(Math.random() * world[0].length);
        s = new SnakeBlock(randRow, randCol);
        ArrayList<SnakeBlock> list = new ArrayList<>();
        list.add(s);
        snake = new Snake(list, 1, this);
    }
    public void run(){
        
    }

}
