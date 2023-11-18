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
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
public class Losange extends Forme {
    protected int height;
    
    public Losange(int x,int y, int width,Color color,int height ){
        super( x, y,  width, color);
        this.height=height;
    }

    @Override
    public void draw(Graphics g) {
        int size;
        size= (int) sqrt(pow((height/2),2)+pow((width/2),2));
        int [] pointX ={positionX, positionX+(size/2), positionX, positionX-(size/2)};
        int [] pointY ={positionY-(size/2), positionY, positionY + (size/2), positionY};
        g.setColor(color);
        g.fillPolygon(pointX, pointY, 4);
    }

    @Override
    public double getArea() {
       return (width*height)/2;
    }

    @Override
    public double getPerimeter() {
    return 2*width+2*height;
    }

    
    public double getRadius() {
        return (width+height)/4;
    }

    @Override
    public boolean getSelected() {
       return super.isSelected;
    }

   
}
