/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorDB;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author danie
 */
public class ConexionDB {

    private String url = "jdbc:postgresql://localhost:5432/almacenvirtual";
    private String usuario = "postgres";
    private String contrasenia = "admin";
    private String dbname = "almacenvirtual";

    public ConexionDB(String url, String usuario, String contrasenia, String dbname) {
        this.url = url;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.dbname = dbname;
    }

    public ConexionDB() {
    }

    public Connection posgresConn() {

        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(url, usuario, contrasenia);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
        return c;
    }
}
