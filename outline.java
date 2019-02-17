/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flag;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.util.Scanner;

/**
 *
 * @author bishalblue
 */
public class outline {
    int x, rx, y, ry, len, wid, rad, count;
    Rectangle rect1,rect2,rect3;
    Ellipse2D.Double ellipse;
    boolean flag=false;
    void setFlag(){
        if (flag!=true){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the X coordinate of the flag: ");
        x=input.nextInt();
        System.out.print("Enter the Y coordinate of the flag: ");
        y=input.nextInt();
        System.out.print("Enter the length of the flag: ");
        len=input.nextInt();
        System.out.print("Enter the width of the flag: ");
        wid=input.nextInt();
        flag=true;
        count=1;
        }
        else{
            y=y+wid;
            count++;
            setFlag(count);
        }
    }
    void setFlag(int i){
        if(i==2){
            rad=wid;
            rx=x+(len/2)-(wid/2);
            ry=y;
        }
    }
    public void drawoutline(Graphics2D g2){
        setFlag();
        rect1=new Rectangle(x,y,len,wid);
        g2.draw(rect1);
        setFlag();
        rect2=new Rectangle(x,y,len,wid);
        g2.draw(rect2);
        setFlag();
        rect3=new Rectangle(x,y,len,wid);
        g2.draw(rect3);
        ellipse=new Ellipse2D.Double(rx, ry, rad, rad);
        g2.draw(ellipse);
    }
}
