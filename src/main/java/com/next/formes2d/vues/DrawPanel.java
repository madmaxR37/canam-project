/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.next.formes2d.vues;


import com.next.formes2d.models.DrawingModel;
import com.next.formes2d.models.Forme;
import java.awt.Graphics;
import java.util.List;
import javax.swing.*;

/**
 *
 * @author MAXIMILIEN
 */
public class DrawPanel extends JPanel {
    
    private DrawingModel model;
    public void repaint(DrawingModel model){
        this.model=model;
        repaint();
    }
    
   @Override
   protected void paintComponent(Graphics g){
       super.paintComponent(g);
       List<Forme> formes = model.getFormes();
       
          for (Forme forme : formes){
           forme.draw(g);
       } 
             
   }
    
}
