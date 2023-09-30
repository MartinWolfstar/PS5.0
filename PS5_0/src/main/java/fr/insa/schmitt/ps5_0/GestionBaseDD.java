/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.schmitt.ps5_0;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Aurore
 */
public class GestionBaseDD {
    
     private Connection conn;
     
    public GestionBaseDD(Connection conn) {
        this.conn = conn;
    }
    
    public static Connection connectGeneralMySQL(String host,
        int port, String database,
        String user, String pass)
        throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://" + host + ":" + port
                + "/" + database,
                user, pass);
        con.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
        return con;
    }

    public static Connection connectSurServeurM3() throws SQLException {
        return connectGeneralMySQL("92.222.25.165", 3306,
                "m3_abinder01", "m3_abinder01",
                "c7b7bc39");
    }
    
    public static void debut() {
        try (Connection con = connectSurServeurM3()) {
            System.out.println("connecté");
        } catch (SQLException ex) {
            throw new Error("Connection impossible", ex);
        }
    }

    public static void main(String[] args) {
        debut();
    }

    /**
     * @return the conn
     */
    public Connection getConn() {
        return conn;
    }
}