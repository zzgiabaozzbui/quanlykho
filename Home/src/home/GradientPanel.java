/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

/**
 *
 * @author Admins
 */
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GradientPaint;
import java.awt.Color;
import java.awt.RenderingHints;
public class GradientPanel extends JPanel {

    @Override
    public void paintComponent(Graphics grp){
        Graphics2D g2 =(Graphics2D) grp;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        
        String colorTop ="#1cb5e0";
        String colorBottom ="#000046";
        
        GradientPaint g = new GradientPaint(0,0,Color.decode(colorTop),0,getHeight(),Color.decode(colorBottom));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(grp);
    }
    public GradientPanel(){
   // added default constructor
    }
}