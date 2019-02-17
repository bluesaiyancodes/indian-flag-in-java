/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flag;

import java.awt.Graphics2D;

/**
 *
 * @author bishalblue
 */
public class setFlag {
    /**
     * 
     * @param g2 is the graphics drawing object
     */
    public void drawflag(Graphics2D g2){
        outline oline=new outline();
        oline.drawoutline(g2);
        setColor fcolor=new setColor();
        fcolor.setobj(oline);
        fcolor.drawColor(g2);
    }
}
