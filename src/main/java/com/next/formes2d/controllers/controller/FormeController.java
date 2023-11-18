/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.next.formes2d.controllers.controller;

/**
 *
 * @author MAXIMILIEN
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class FormeController {
     
     String dbUrl= "jdbc:mysql://localhost:3306/formdrawer2d";
    
    String username ="root";
    String password="#Madmax37";
   public FormeController(){
       try{
           Class.forName("com.mysql.jdbc.Driver");
            try {
          Connection  conn = DriverManager.getConnection(dbUrl,username,password);
          if(conn!=null){
         System.out.print("Connected");
          
     }
        } catch (SQLException ex) {
            Logger.getLogger(FormeController.class.getName()).log(Level.SEVERE, null, ex);
    
     }
    
       }catch(ClassNotFoundException e){
           System.out.print("Fail to load JDBC driver");
       }
          
         
    }


 
}
