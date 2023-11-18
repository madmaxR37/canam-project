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
public class Carre extends Forme {
    public Carre(int x,int y, int width,Color color){
        super( x, y,  width, color);
    }
    
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(positionX, positionY, width, width);
    }

    @Override
    public double getArea() {
    return width*width;
    }

    @Override
    public double getPerimeter() {
      return 4*width;
    }

   
    @Override
    public boolean getSelected() {
        return super.isSelected;
    }

   
    
}
