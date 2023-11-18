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
public class Cercle extends Forme {
    public static final double PI =3.14;
    public Cercle(int x,int y, int width,Color color){
        super(x,y,width,color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(positionX, positionY, width, width);
    }

    @Override
    public double getArea() {
        double radius = this.getRadius();
        return radius*radius*PI;
    }

    @Override
    public double getPerimeter() {
        double radius = this.getRadius();
        return PI*2*radius;
    }

   
    public double getRadius() {
        return width/2;
    }

    @Override
    public boolean getSelected() {
       return super.isSelected;
    }

    
}
