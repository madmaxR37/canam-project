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
public class Elipse extends Forme {
    protected int height;
    
    public Elipse(int x,int y, int width,Color color,int height){
        super(x,y,width,color);
        this.height=height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(positionX, positionY, width, height);
    }

    @Override
    public double getArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double getPerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean getSelected() {
        return super.isSelected;
    }

   
}
