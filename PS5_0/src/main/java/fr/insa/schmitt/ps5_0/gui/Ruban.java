/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.schmitt.ps5_0.gui;

import javafx.scene.control.TabPane;

/**
 *
 * @author schmi
 */
public class Ruban extends TabPane{
    
    private TabPane ruban;
    private ManePane main;
    private Accueil accueil;

    public Ruban(ManePane main) {

        this.main = main;
        this.accueil = new Accueil(main);
        ruban = new TabPane();
        buildTabs();
    }

    /**
     * get. Return instance of the RibbonBar (TabPane).
     * @return 
     */
    public TabPane get() {
        return this.ruban;
    }

    private void buildTabs() {
        
        ruban.getTabs().addAll(getAccueil().get());
        //ruban.getTabs().addAll(accueil.get());
    }

    /**
     * @return the main
     */
    public ManePane getMain() {
        return main;
    }

    /**
     * @return the accueil
     */
    public Accueil getAccueil() {
        return accueil;
    }
}