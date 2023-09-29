/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.schmitt.ps5_0.gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.layout.HBox;
/**
 *
 * @author schmi
 */
public class OperateurBarre {
    
    private Tab tab;
    private Button ajouter;
    private Label lll;
    
    private ManePane main;

    public OperateurBarre(ManePane main) {
        this.main = main;
        tab = new Tab("Opérateur");
        lll = new Label("Opérateur 12");
        buildTab();
    }

    public Tab get() {
        return this.tab;
    }

    private void buildTab() {

        //Do not allow tab to close.
        tab.setClosable(false);

        //Create Box
        HBox container = new HBox();
        container.setAlignment(Pos.CENTER);
        container.setSpacing(8);

        //Create Button
        //buildAjouterButton();


        //container.getChildren().addAll(getAjouter());
        container.getChildren().addAll(lll);
        tab.setContent(container);

    }
    
    private void buildAjouterButton(){
        //this.ajouter = new BoutonIcon("icon/ajouter.png",32,32);
        this.getAjouter().setText("ajouter");
        this.getAjouter().setContentDisplay(ContentDisplay.TOP);

        this.getAjouter().setOnAction((t) ->{
            //this.main.getActionneur().boutonAjouterAppui(t);
            //this.main.getActionneur().MiseAJour(t);
            System.out.println("ajouter Clicked.");
        });
    }

    /**
     * @return the ajouter
     */
    public Button getAjouter() {
        return ajouter;
    }

}
