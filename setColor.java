/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flag;

import java.awt.Color;
import java.awt.Graphics2D;


/**
 *
 * @author bishalblue
 */
public class setColor {
    outline oflag;
    void setobj(outline oflagtmp){
        oflag=oflagtmp;
    }
    void drawColor(Graphics2D g2){
        g2.setColor(Color.ORANGE);
        g2.fill(oflag.rect1);
        g2.setColor(Color.WHITE);
        g2.fill(oflag.rect2);
        g2.setColor(Color.GREEN);
        g2.fill(oflag.rect3);
        g2.setColor(Color.BLUE);
        g2.fill(oflag.ellipse);
        
    }
    
}

