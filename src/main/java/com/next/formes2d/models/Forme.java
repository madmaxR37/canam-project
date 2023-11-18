/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.next.formes2d.models;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author MAXIMILIEN
 */

public abstract class Forme extends JComponent {
    
    protected int id;
    
    protected int positionX;
    
    protected int positionY;
    
    protected Color color;
    
    protected int width;
    
    protected boolean isSelected;
    
    public Forme(int x,int y, int width,Color color){
        positionX = x;
        positionY=y;
        this.width=width;
        this.color=color;  
    }
    
     public abstract void draw(Graphics g);
     
     public abstract double getArea();
      
      public abstract double getPerimeter();

      
      public abstract boolean getSelected();
      
      
}
