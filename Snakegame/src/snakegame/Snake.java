/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeworld;

/**
 *
 * @author Ledyard
 */

import java.util.ArrayList;

public class Snake {
    //Instance variables
    private ArrayList<Block> snakeList;
    private int direction;
    private boolean hit;

    // Default constructor
    public Snake(){
    snakeList = new ArrayList <Block>();
    direction = 2;
    hit = false;
    }
    
    // Parameter constructor
    public Snake(ArrayList <Block> newList, int dir){
        snakeList = newList;
        direction = dir;
        hit = false;
    }
    
    //Public Methods
    public void moveSnake (){
    //moves the tail block in front of the head block using direction as a guide
        if(direction == 1){
            snakeList.get(getTailBlock()).moveBlock(((snakeList.get(getHeadBlock()).getR()) - 1), (snakeList.get(getHeadBlock()).getC()));
        }
        
        else if(direction == 2){
            snakeList.get(getTailBlock()).moveBlock((snakeList.get(getHeadBlock()).getR()), ((snakeList.get(getHeadBlock()).getC()) + 1));
        }
        
        else if(direction == 3){
            snakeList.get(getTailBlock()).moveBlock((snakeList.get(getHeadBlock()).getR() + 1), (snakeList.get(getHeadBlock()).getC()));
        }
        
        else if(direction == 4){
            snakeList.get(getTailBlock()).moveBlock((snakeList.get(getHeadBlock()).getR()), ((snakeList.get(getHeadBlock()).getC()) - 1));
        }
        
        snakeList.get(getTailBlock()).makeOld();
        snakeList.set(0,snakeList.get(getTailBlock()));
        snakeList.remove(getTailBlock());

    }
    
    public void setDirection (int dir){
        //sets variable direction to a new direction between 1 and 4
        // direction can not be the oposite of the current direction
        if((Math.abs(direction - dir)) == 2){
            // direction is oposite
            //no change in direction occures;
        }

        else if (dir > 4){
            //sets numbers above 4 to 4 to prevent errors
            direction = 4;
        }
        
        else if(dir < 1){
            //sets number bellow 1 to 1 to prevent errors
            direction = 1;
        }
            
        else{
            //dir fits all parameters and direction is set to dir
            direction = dir;
        }
    }
    
    public void addBlocks (){
        //adds blocks to the arraylist at the tail location
        for (int i = 1; i <= 2; i++){
            snakeList.add(new Block((snakeList.get(getTailBlock())).getR(),(snakeList.get(getTailBlock())).getC()));
        }
    }
    
    public ArrayList <Block> getSnake (){
        //returns the arraylist of blocks
        return snakeList;
    }
    
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
    
    //Private Methods
    private int getHeadBlock (){
        return 0;
    }
    
    private int getTailBlock (){
        return snakeList.size();
    }
}
