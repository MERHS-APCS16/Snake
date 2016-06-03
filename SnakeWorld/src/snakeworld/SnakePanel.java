/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author konrad
 */
public class SnakePanel extends JPanel implements KeyListener {

    private SnakeWorld sw;

    public SnakePanel(SnakeWorld sn) {
        sw = sn;
    }
    public SnakePanel(){
        super();
        this.setBackground(Color.BLACK);
        this.setPreferredSize(new Dimension(800, 800));
        this.requestFocus();
        
        
    }
    public void run(){
        while (!gameover){
            
        }
    }
   
    public void KeyPressed(KeyEvent e){
          if (e.getKeyCode() == (KeyEvent.VK_S) && paddle.getY() <= 600 - paddle.getHeight()) {
            int y1 = snakeworld.getY();
            paddle.setY(y1 + speed1);
            //System.out.println("Down arrow pressed") ;
        }
        if (e.getKeyCode() == (KeyEvent.VK_W) && paddle.getY() >= 0) {
            int y1 = paddle.getY();
            paddle.setY(y1 - speed1);
            //System.out.println("Down arrow pressed") ;
        }
        repaint();
        
    }
    public void keyTyped(){
        
    }
    public void KeyRealeased(KeyEvent e){
        
    }

}
