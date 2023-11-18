/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.next.formes2d.models;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author MAXIMILIEN
 */
public class Rectangle extends Forme {
    
    protected int height;
    
    public Rectangle(int x,int y, int width,Color color, int height){
    
        super( x, y,  width, color);
        this.height=height;
    }

    @Override
    public void draw(Graphics g) {
  
         g.setColor(color);
        g.fillRect(positionX, positionY, width, height);
    }

    @Override
    public double getArea() {
         return height * width;
    }

    @Override
    public double getPerimeter() {
       return 2*(height+width);
    }
   

    @Override
    public boolean getSelected() {
        return super.isSelected;
    }

    
    
}
