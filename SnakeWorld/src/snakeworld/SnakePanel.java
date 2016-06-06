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
import snakeworld.SnakeWorld;

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
          if (e.getKeyCode() == (KeyEvent.VK_S) ) {
            
            sw.getSnake().setDirection(3);
            //System.out.println("Down arrow pressed") ;
        }
        if (e.getKeyCode() == (KeyEvent.VK_W) ) {
           
            sw.getSnake().setDirection(1);
            //System.out.println("Down arrow pressed") ;
        }
          if (e.getKeyCode() == (KeyEvent.VK_D) ) {
           
            sw.getSnake().setDirection(2);
            //System.out.println("Down arrow pressed") ;
        }
        if (e.getKeyCode() == (KeyEvent.VK_A) ) {
            
            sw.getSnake().setDirection(4);
            //System.out.println("Down arrow pressed") ;
        }
        repaint();
        
    }
    public void keyTyped(){
        
    }
    public void KeyRealeased(KeyEvent e){
        
    }

}
