/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.schmitt.ps5_0.gui;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label ;

/**
 *
 * @author schmi
 */
public class Main extends Application{
    @Override
    public void start (Stage fen){
        
        ManePane main = new ManePane();
        
        //Scene sc = new Scene(main, 1000, 700);
        Scene sc = new Scene(new Label("hey"));
        fen.setScene(sc);
        fen.setTitle("Application BDD");
        fen.show(); 
        
    }
    public static void main(String[]args){
        launch();
    }

}

