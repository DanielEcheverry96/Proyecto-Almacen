/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorDB;

import controlador.ICRUD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Marca;

/**
 *
 * @author danie
 */
public class ManejadorMarcasDB implements ICRUD {

    Connection conpost;

    @Override
    public boolean insertar(Object obj) {

        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        boolean insertado = false;
        Statement stmt;
        if (obj instanceof Marca) {
            Marca temp = new Marca();
            temp = (Marca) obj;
            try {
                stmt = conpost.createStatement();
                String sql = "insert into marca(idmarca, descripcion) values(" + temp.getId() + "," + "'" + temp.getDescripcion() + "');";
                stmt.executeUpdate(sql);
                insertado = true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                return insertado;
            }
        }
        return insertado;
    }

    @Override
    public boolean modificar(int id, Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int busquedaBinaria(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object consultarId(int id) {

        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        Statement stmt;
        try {
            stmt = conpost.createStatement();
            String sql = "select * from marca where id = " + id;
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String descripcion = rs.getString("nombre");
                System.out.println("ID marca = " + id);
                System.out.println("Nombre marca = " + descripcion);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorMarcasDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean borrar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean borrarTodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList consultarTodos() {
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        Statement stmt;
        try {
            stmt = conpost.createStatement();
            String sql = "select * from marca order by idmarca";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("idmarca");
                String descripcion = rs.getString("nombre");
                System.out.println("ID marca = " + id);
                System.out.println("Nombre marca = " + descripcion);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorMarcasDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
