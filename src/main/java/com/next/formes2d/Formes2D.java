/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.next.formes2d;

/**
 *
 * @author MAXIMILIEN
 */



import com.next.formes2d.controllers.controller.DrawingController;
import com.next.formes2d.controllers.controller.FormeController;
import com.next.formes2d.controllers.controller.CarreSelectionController;
import com.next.formes2d.models.Carre;
import com.next.formes2d.models.DrawingModel;
import com.next.formes2d.vues.InterfaceUtilisateur;
import java.awt.Color;

public class Formes2D {

    public static void main(String[] args) {
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             InterfaceUtilisateur view =   new InterfaceUtilisateur();
             view.setVisible(true);
             DrawingModel model = new DrawingModel();
             Carre carre = new Carre(0,0,0,Color.decode("1"));
             DrawingController controller = new DrawingController(model,view);
             FormeController formeController = new FormeController();
             CarreSelectionController selectioncontroller = new CarreSelectionController(carre,view);
            }
        });
    }
    
   
       
}
