/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.next.formes2d.models;

import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


/**
 *
 * @author MAXIMILIEN
 */
public class Hexagone extends Forme {
    
    public Hexagone(int x,int y, int width,Color color){
        
           super( x, y,  width, color);
        
    }

    @Override
    public void draw(Graphics g) {
       int[] hexagonePointsX={positionX,positionX+width,positionX+width+(width/2),+positionX+width,positionX,positionX-(width/2) };
       int[] hexagonePointsY={positionY+(width/2),positionY+(width/2),positionY,positionY-(width/2),positionY-(width/2),positionY};
       g.setColor(color);
       g.fillPolygon(hexagonePointsX, hexagonePointsY, 6);
    }  
    

    @Override
    public double getArea() {
        return (3*sqrt(3)*pow(width,2))/2;
    }

    @Override
    public double getPerimeter() {
       return width*6;
    }

    public double getRadius() {
       return width;
    }

    @Override
    public boolean getSelected() {
       return super.isSelected;
    }

    
}
