/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.next.formes2d.controllers.controller;

import com.next.formes2d.models.Carre;
import com.next.formes2d.vues.InterfaceUtilisateur;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author MAXIMILIEN
 */
public class CarreSelectionController {
    
    Carre carre;
    InterfaceUtilisateur view;
    public CarreSelectionController( Carre carre, InterfaceUtilisateur view){
        this.carre= carre;
        this.view = view;
        clickCarre();
    }
    private boolean isSelected=carre.getSelected();
    
    private void clickCarre(){
        carre.addMouseListener(new MouseAdapter(){   
            @Override
             public void mouseClicked(MouseEvent e){
                 isSelected=!isSelected;
        if(isSelected){
            view.setAreaLabel(String.valueOf(carre.getArea()));
            view.setPerimeterLabel(String.valueOf(carre.getPerimeter()));
            System.out.print("ok");
        }
    
                 System.out.print("okey...");
                 
             }
             
        });
        
    }
    
}
