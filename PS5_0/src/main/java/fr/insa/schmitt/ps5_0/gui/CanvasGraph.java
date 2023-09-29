/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.schmitt.ps5_0.gui;

import java.util.List;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.transform.Affine;
import javafx.scene.transform.Transform;

/**
 *
 * @author schmi
 */
public class CanvasGraph extends Pane{
    
    private ManePane main;
    private Canvas realCanvas;
    
    public CanvasGraph(ManePane main){
        this.main = main;
        this.realCanvas = new Canvas(main.getWidth(), main.getHeight());
        this.getChildren().add(this.realCanvas);
        this.realCanvas.heightProperty().bind(this.heightProperty());
        this.realCanvas.heightProperty().addListener((o) -> {
            this.redrawAll();
        });
        this.realCanvas.widthProperty().bind(this.widthProperty());
        this.realCanvas.widthProperty().addListener((o) -> {
            this.redrawAll();
        });
        this.realCanvas.setOnMouseClicked(t ->{
            //Actionneur actionneur = this.main.getActionneur();
            //actionneur.clicDansZoneDessin(t);
        });
        this.redrawAll();
    }
    
    public void concatenateTransform(Transform trans) {
        Transform oldTrans = this.getRealCanvas().getGraphicsContext2D().getTransform();
        Transform newTrans = oldTrans.createConcatenation(trans);
        this.setTransform(newTrans);
    }

    public void setTransform(Transform trans) {
        this.getRealCanvas().getGraphicsContext2D().setTransform(new Affine(trans));
    }

    public Transform getTransform() {
        return this.getRealCanvas().getGraphicsContext2D().getTransform();
    }
    
    public void redrawAll(){
        GraphicsContext context = this.getRealCanvas().getGraphicsContext2D();
        context.setFill(Color.LIGHTGRAY);
        context.fillRect(0,0, this.realCanvas.getWidth(), this.realCanvas.getHeight());    
        
        //----------gestion des zooms:
        context.setTransform(new Affine());
        context.clearRect(0,0,this.getRealCanvas().getWidth(),this.getRealCanvas().getHeight());
        //this.zoneVue.setxMax(this.getRealCanvas().getWidth());
        //this.zoneVue.setyMax(this.getRealCanvas().getHeight());
        
        
        //on dessine autrement les objets selectionés:
        /*List<Trellis> select = this.main.getActionneur().getSelection();
        if (!select.isEmpty()){
            for (Trellis t: select){
                t.dessineSelection(context);
            }
        }*/
        
        context.setStroke(Color.ORANGE);
        context.setGlobalAlpha(0.4);
        for(int i = 0; i < 5000; i+=50){
           context.strokeLine(i,0,i,5000); 
           context.strokeLine(0,i,5000,i);
        }
        context.setGlobalAlpha(1);
        
    }

    /**
     * @return the realCanvas
     */
    public Canvas getRealCanvas() {
        return realCanvas;
    }

}
