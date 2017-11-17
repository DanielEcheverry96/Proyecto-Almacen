/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorDB;

import controlador.ICRUD;
import controlador.ICRUDDB;
import controlador.ManejadorObjetos;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class ManejadorMarcasDB implements ICRUDDB {

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
                conpost.close();
                stmt.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                return insertado;
            }
        }
        return insertado;
    }

    @Override
    public boolean modificar(int id, Object obj) {
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        PreparedStatement stmt = null;
        Marca temp = new Marca();
        temp = (Marca) obj;
        try {

            String sql = "update marca set idmarca = ?, descripcion = ? ";
            stmt = conpost.prepareStatement(sql);
            stmt.setInt(1, temp.getId());
            stmt.setString(2, temp.getDescripcion());
            stmt.executeUpdate();
            conpost.close();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }

        return true;
    }

    @Override
    public int busquedaBinaria(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object consultarId(int id) {
        Marca temp = null;
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        Statement stmt;
        try {
            stmt = conpost.createStatement();
            String sql = "select * from marca where id = " + id + ";";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                temp = new Marca();
                temp.setId(rs.getInt("idmarca"));
                temp.setDescripcion(rs.getString("descripcion"));

            }
            stmt.close();
            conpost.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return temp;
    }

    @Override
    public boolean borrar(int id) {
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        PreparedStatement stmt;
        try {
            String sql = "delete from marca where idmarca = ?";
            stmt = conpost.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
            conpost.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public boolean borrarTodo() {
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        PreparedStatement stmt;
        try {
            String sql = "truncate table marca";
            stmt = conpost.prepareStatement(sql);
            stmt.executeUpdate();
            stmt.close();
            conpost.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public void consultarTodos() {
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        Statement stmt;
        try {
            stmt = conpost.createStatement();
            String sql = "select * from marca order by idmarca";
            ResultSet rs = stmt.executeQuery(sql);
            ManejadorObjetos.arregloMarcas.clear();
            while (rs.next()) {
                Marca temp = new Marca();
                temp.setId(rs.getInt("idmarca"));
                temp.setDescripcion(rs.getString("descripcion"));
                ManejadorObjetos.arregloMarcas.add(temp);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
