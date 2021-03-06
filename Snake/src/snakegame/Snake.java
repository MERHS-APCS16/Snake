/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

/**
 *
 * @author Ledyard
 */
import java.util.ArrayList;

public class Snake {

    //Instance variables
    private ArrayList<SnakeBlock> snakeList;
    private int direction;
    private SnakeWorld world;

    // Default constructor
    public Snake() {
        snakeList = new ArrayList<SnakeBlock>();
        direction = 2;
    }

    // Parameter constructor
    /**
     *
     * @param newList
     * @param dir
     */
    public Snake(ArrayList<SnakeBlock> newList, int dir, SnakeWorld world) {
        snakeList = newList;
        direction = dir;
        this.world = world;
    }

    //returns true if the new direction is opposite to the snake's current direction
    private boolean isOpposite(int newDirection) {
        return Math.abs(direction - newDirection) == 2;
    }

    //Public Methods
    public void moveSnake() {
        //moves the tail block in front of the head block using direction as a guide
        Location preTailLoc = this.getTailBlock().getLocation();
        world.setToBlock(preTailLoc);
        this.getTailBlock().moveBlock(this.getTailBlock().getNextLocationInDirection(direction));
        String blockType = world.getBlockType(this.getHeadBlock().getLocation());
        switch (blockType){
            case "SnakeBlock":
                this.die();
                
            case "FoodBlock":
                this.addBlocks();
        }
        snakeList.set(0, snakeList.remove(snakeList.size() - 1));
        

    }

    public void setDirection(int dir) {
        //sets variable direction to a new direction between 1 and 4
        // direction can not be the oposite of the current direction
        if (isOpposite(dir)) {
            // direction is oposite
            //no change in direction occures;

        } else {
            //dir fits all parameters and direction is set to dir
            direction = dir;
        }
    }

    public void addBlocks() {
        //adds blocks to the arraylist at the tail location
        for (int i = 1; i <= 2; i++) {
            snakeList.add(new SnakeBlock(this.getTailBlock()));
        }
    }
    
    public void die(){
        
    }
    
    public ArrayList<SnakeBlock> getBlocks() {
        //returns the arraylist of blocks
        return snakeList;
    }

    /*
    public boolean isHit(){
        //if two blocks share the same location return true
        //if snake has not hit it's self return false
        
        for (int i = 0; i < snakeList.size(); i++){
            for (int z = 0; z < snakeList.size(); z++)
                if (i != z && !(snakeList.get(i).isNew()) && !(snakeList.get(z).isNew())){
                    if(snakeList.get(i).getR() == snakeList.get(z).getR() && snakeList.get(i).getC() == snakeList.get(z).getC()){
                        hit = true;
                    }
                }
        }
        return hit;
    }
     */
    //Private Methods
    private SnakeBlock getHeadBlock() {
        return snakeList.get(0);
    }

    private SnakeBlock getTailBlock() {
        return snakeList.get(snakeList.size() - 1);
    }
}
