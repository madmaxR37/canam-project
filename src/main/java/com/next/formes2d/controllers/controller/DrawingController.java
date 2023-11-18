/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.next.formes2d.controllers.controller;

import com.next.formes2d.models.Carre;
import com.next.formes2d.models.Cercle;
import com.next.formes2d.models.DrawingModel;
import com.next.formes2d.models.Elipse;
import com.next.formes2d.models.Forme;
import com.next.formes2d.models.Hexagone;
import com.next.formes2d.models.Losange;
import com.next.formes2d.models.Rectangle;

import com.next.formes2d.vues.InterfaceUtilisateur;
import java.awt.Color;


/**
 *
 * @author MAXIMILIEN
 */
public class DrawingController {
    private DrawingModel model;
    private InterfaceUtilisateur view;
    
    public DrawingController(DrawingModel model, InterfaceUtilisateur view){
        this.model=model;
        this.view = view;
       initView();
    }
    


    public void createButtonActionPerformed() {
      String selectedForme = view.getshapeSelected();
       int x = view.getXField();
       int y = view.getYField();
       int width = view.getWidthField();
       int height = view.getHeightField();
       Color color = view.getColorField();
       Forme forme =null;
        switch (selectedForme) {
            case "Carre" ->forme = new Carre(x,y,width,color);
            case "Rectangle" -> forme = new Rectangle(x,y,width,color,height);
            case "Cercle" -> forme = new Cercle(x,y,width,color);
            case "Hexagone" -> forme = new Hexagone(x,y,width,color);
            case "Elipse" -> forme = new Elipse(x,y,width,color,height);
            case "Losange" -> forme = new Losange(x,y,width,color,height);
            default -> {
                System.out.print("pas de forme selectionner");
            }
        }
       if(forme!=null){
           model.addForme(forme);
               view.refresh(model);
       }
      
    }

    private void initView() {
       view.getCreateButton().addActionListener(e->createButtonActionPerformed());
    }
}

