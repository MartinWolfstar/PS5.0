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
    //private Accueil accueil;
    private MachineBarre machineBarre;
    private OperateurBarre operateurBarre;
    private GraphBarre graphBarre;

    public Ruban(ManePane main) {

        this.main = main;
        //this.accueil = new Accueil(main);
        this.machineBarre = new MachineBarre(main);
        this.operateurBarre = new OperateurBarre(main);
        this.graphBarre = new GraphBarre(main);
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
        
        //ruban.getTabs().addAll(getTerrainBarre().get(), getAccueil().get());
        ruban.getTabs().addAll(getMachineBarre().get(),getOperateurBarre().get(),getGraphBarre().get());
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
    /*public Accueil getAccueil() {
        return accueil;
    }*/

    /**
     * @return the terrainBarre
     */
    public MachineBarre getMachineBarre() {
        return machineBarre;
    }
    public OperateurBarre getOperateurBarre() {
        return operateurBarre;
    }
    public GraphBarre getGraphBarre() {
        return graphBarre;
    }
}
