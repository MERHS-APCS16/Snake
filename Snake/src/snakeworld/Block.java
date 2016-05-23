/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeworld;

/**
 *
 * @author shawa1
 */
public class Block {

    int r;
    int c;
    boolean b;

    public Block() {
        r = 0;
        c = 0;
        b = true;
    }

    public Block(int newR, int newC) {
        r = newR;
        c = newC;
        b = true;
    }

    public boolean isNew() {
        return b;
    }

    public void makeOld() {
        b = false;
    }

    public int getR() {
        return r;
    }

    public int getC() {
        return c;
    }

    public void moveBlock(int newR, int newC) {
        r = newR;
        c = newC;
    }
}
