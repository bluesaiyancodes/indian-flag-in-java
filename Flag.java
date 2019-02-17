/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flag;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JFrame;


/**
 *
 * @author bishalblue
 */
class flagComponent extends JComponent{
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 =(Graphics2D)g;
        setFlag sF=new setFlag();
        sF.drawflag(g2);
    }
}
public class Flag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setTitle("Indian National Flag");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        flagComponent fc=new flagComponent();
       // frame.add(new flagComponent());
        frame.add(fc);
        frame.setVisible(true);
    }
    
}

