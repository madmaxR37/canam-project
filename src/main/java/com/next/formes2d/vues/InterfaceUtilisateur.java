/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.next.formes2d.vues;


import com.next.formes2d.models.DrawingModel;
import java.awt.Color;


/**
 *
 * @author MAXIMILIEN
 */

public class InterfaceUtilisateur extends javax.swing.JFrame{
    
    public InterfaceUtilisateur() {
        initComponents();
       
    }
     private void initComponents() {

        saveButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        shapeSelector = new javax.swing.JComboBox<>();
        drawPanel = new DrawPanel();
        shapePropertiesPanel = new javax.swing.JPanel();
        areaLabel = new javax.swing.JLabel();
        perimeterLabel = new javax.swing.JLabel();
        radiusLabel = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        positionX = new javax.swing.JTextField();
        positionY = new javax.swing.JTextField();
        width = new javax.swing.JTextField();
        poseXLabel = new javax.swing.JLabel();
        poseYLabel = new javax.swing.JLabel();
        widthLabel = new javax.swing.JLabel();
        heightLabel = new javax.swing.JLabel();
        height = new javax.swing.JTextField();
        colorLabel = new javax.swing.JLabel();
        color = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formes Drawer 2D");
        setBackground(new java.awt.Color(255, 255, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        saveButton.setBackground(new java.awt.Color(153, 153, 255));
        saveButton.setForeground(new java.awt.Color(51, 51, 51));
        saveButton.setText("Sauvegarder");
       

        modifyButton.setBackground(new java.awt.Color(0, 204, 204));
        modifyButton.setForeground(new java.awt.Color(0, 51, 51));
        modifyButton.setText("Modifier");
       

        deleteButton.setBackground(new java.awt.Color(255, 51, 51));
        deleteButton.setForeground(new java.awt.Color(0, 51, 51));
        deleteButton.setText("Supprimer");
        

        jLabel1.setText("Proprieter Geometrique");

        jLabel2.setText("Selectioner une forme");
        jLabel2.setOpaque(true);

        shapeSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carre", "Rectangle", "Elipse", "Cercle", "Hexagone", "Losange" }));
       

        drawPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        drawPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout drawPanelLayout = new javax.swing.GroupLayout(drawPanel);
        drawPanel.setLayout(drawPanelLayout);
        drawPanelLayout.setHorizontalGroup(
            drawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );
        drawPanelLayout.setVerticalGroup(
            drawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        shapePropertiesPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        areaLabel.setText("Aire :");

        perimeterLabel.setText("Perimetre :");

        radiusLabel.setText("Rayon :");

        javax.swing.GroupLayout shapePropertiesPanelLayout = new javax.swing.GroupLayout(shapePropertiesPanel);
        shapePropertiesPanel.setLayout(shapePropertiesPanelLayout);
        shapePropertiesPanelLayout.setHorizontalGroup(
            shapePropertiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shapePropertiesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(shapePropertiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radiusLabel)
                    .addComponent(areaLabel)
                    .addComponent(perimeterLabel))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        shapePropertiesPanelLayout.setVerticalGroup(
            shapePropertiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shapePropertiesPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(areaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(perimeterLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(radiusLabel)
                .addGap(21, 21, 21))
        );

        createButton.setBackground(new java.awt.Color(51, 255, 51));
        createButton.setForeground(new java.awt.Color(0, 0, 0));
        createButton.setText("CREER");
       
        poseXLabel.setText("Position X :");

        poseYLabel.setText("Position Y : ");

        widthLabel.setText("Largeur :");

        heightLabel.setText("Hauteur :");


        colorLabel.setText("Couleur(HEX):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(modifyButton)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(drawPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(createButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(poseXLabel)
                                            .addComponent(poseYLabel)
                                            .addComponent(widthLabel))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(positionX))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(width))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(positionY))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(shapeSelector, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(heightLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(height))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(shapePropertiesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(colorLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(22, 22, 22))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(saveButton)
                        .addComponent(modifyButton)
                        .addComponent(deleteButton))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(shapePropertiesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(shapeSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(poseXLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(positionX, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(poseYLabel)
                            .addComponent(positionY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(widthLabel)
                            .addComponent(width, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(heightLabel)
                            .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(colorLabel)
                            .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(createButton)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(drawPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }                      

    public String getshapeSelected() {                                              
       return (String) shapeSelector.getSelectedItem();
    }                                             

    public int getYField(){
        return Integer.parseInt(positionY.getText());
    }
    
    public int getXField(){
        return Integer.parseInt(positionX.getText());
    }
    
    public int getWidthField(){
        return Integer.parseInt(width.getText());
    }
    
    public  javax.swing.JButton getCreateButton(){
        return createButton;
    }
     public int getHeightField(){
        return Integer.parseInt(height.getText());
    }
     
      public Color getColorField(){
        return Color.decode(color.getText()) ;
    }
      
      public void refresh(DrawingModel model){
          drawPanel.repaint(model);
          
      }
      
      public void setAreaLabel(String val){
          areaLabel.setText("Aire: "+val);
      }
      public void setPerimeterLabel(String val){
          perimeterLabel.setText("Perimetre: "+val);
      }
      public void setRadiusLabel(String val){
          radiusLabel.setText("Rayon: "+val);
      }
   

    // Variables declaration                     
    private javax.swing.JLabel areaLabel;
    private javax.swing.JTextField color;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JButton createButton;
    private javax.swing.JButton deleteButton;
    private DrawPanel drawPanel;
    private javax.swing.JTextField height;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton modifyButton;
    private javax.swing.JLabel perimeterLabel;
    private javax.swing.JLabel poseXLabel;
    private javax.swing.JLabel poseYLabel;
    private javax.swing.JTextField positionX;
    private javax.swing.JTextField positionY;
    private javax.swing.JLabel radiusLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JPanel shapePropertiesPanel;
    private javax.swing.JComboBox<String> shapeSelector;
    private javax.swing.JTextField width;
    private javax.swing.JLabel widthLabel;
    // End of variables declaration                   
}
