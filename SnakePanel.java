/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeworld;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Dimension;

/**
 *
 * @author konrad
 */
public class SnakePanel extends JPanel {

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

}
