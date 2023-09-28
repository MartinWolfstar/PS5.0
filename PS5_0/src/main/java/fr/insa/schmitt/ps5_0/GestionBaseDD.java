/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.schmitt.ps5_0;

import java.sql.Connection;

/**
 *
 * @author Aurore
 */
public class GestionBaseDD {
    
     private Connection conn;
     
    public GestionBaseDD(Connection conn) {
        this.conn = conn;
    }
}
