/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeworld;
import java.awt.Color;
/**
 *
 * @author shawa1
 */
public class Block {
    Color color;
    Location location;
    boolean b;

    public Block() {
        location = new Location();
        b = true;
    }

    public Block(int r, int c) {
        location = new Location(r, c);
        b = true;
    }

    public boolean isNew() {
        return b;
    }

    public void makeOld() {
        b = false;
    }

    public int getR() {
        return location.getR();
    }

    public int getC() {
        return location.getC();
    }

    public void moveBlock(int newR, int newC) {
        location.setNewLocation(newR, newC);
    }
}
