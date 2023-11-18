/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.next.formes2d.models;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MAXIMILIEN
 */
public class DrawingModel {
    
    private   List<Forme> formes;
   
    
    public DrawingModel(){
        formes = new ArrayList<>();
        
    }
    
    public void addForme(Forme forme){
        
        formes.add(forme);
    }
    
    public List<Forme> getFormes(){
        return formes;
    }
    
}
