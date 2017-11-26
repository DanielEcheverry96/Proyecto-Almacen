/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorDB;

import controlador.ICRUDDB;
import controlador.ManejadorUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Usuario;

/**
 *
 * @author danie
 */
public class ManejadorUsuarioBD implements ICRUDDB {

    Connection conpost;

    @Override
    public boolean insertar(Object obj) {

        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        boolean insertado = false;
        PreparedStatement consulta = null;
        if (obj instanceof Usuario) {
            Usuario temp = new Usuario();
            temp = (Usuario) obj;
            try {
                consulta = conpost.prepareStatement("INSERT INTO usuario(cedula_usuario, permisos, nombre, apellido, email, telefono, usuario, password, direccion) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
                consulta.setInt(1, temp.getCedula());
                consulta.setInt(2, temp.getPermisos());
                consulta.setString(3, temp.getNombre());
                consulta.setString(4, temp.getApellido());
                consulta.setString(5, temp.getEmail());
                consulta.setString(6, temp.getTelefono());
                consulta.setString(7, temp.getUsuario());
                consulta.setString(8, temp.getPassword());
                consulta.setString(9, temp.getDireccion());
                consulta.executeUpdate();
                insertado = true;
                consulta.close();
                conpost.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                return insertado;
            }

        }
        return insertado;
    }

    @Override
    public boolean modificar(int id, Object obj) {
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        PreparedStatement consulta = null;
        Usuario temp = (Usuario) obj;
        try {
            consulta = conpost.prepareStatement("UPDATE usuario SET permisos = ?, nombre = ?, apellido = ?, email = ?, telefono = ?, usuario = ?, password = ?, direccion = ? WHERE cedula_usuario = " + id + "");
            //consulta.setInt(1, temp.getCedula());
            consulta.setInt(1, temp.getPermisos());
            consulta.setString(2, temp.getNombre());
            consulta.setString(3, temp.getApellido());
            consulta.setString(4, temp.getEmail());
            consulta.setString(5, temp.getTelefono());
            consulta.setString(6, temp.getUsuario());
            consulta.setString(7, temp.getPassword());
            consulta.setString(8, temp.getDireccion());
            //consulta.setInt(9, id);
            consulta.executeUpdate();
            consulta.close();
            conpost.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
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
        Usuario temp = null;
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        Statement consulta = null;
        try {
            consulta = conpost.createStatement();
            ResultSet resultado = consulta.executeQuery("SELECT * FROM usuario WHERE cedula_usuario =" + id + ";");
            if (resultado.next()) {
                temp = new Usuario(resultado.getInt("cedula_usuario"), resultado.getInt("permisos"), resultado.getString("nombre"), resultado.getString("apellido"), resultado.getString("direccion"), resultado.getString("email"), resultado.getString("telefono"), resultado.getString("usuario"), resultado.getString("password"));
            }
            resultado.close();
            consulta.close();
            conpost.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return temp;
    }

    @Override
    public boolean borrar(int id) {
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        PreparedStatement consulta = null;
        try {
            consulta = conpost.prepareStatement("DELETE FROM usuario WHERE cedula_usuario = ?");
            consulta.setInt(1, id);
            consulta.executeUpdate();
            consulta.close();
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
            String sql = "truncate table usuario";
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
        Statement consulta = null;
        try {
            consulta = conpost.createStatement();
            ResultSet resultado = consulta.executeQuery("SELECT * FROM usuario;");
            ManejadorUsuario.arregloUsuario.clear();
            while (resultado.next()) {
                Usuario temp = new Usuario(resultado.getInt("cedula_usuario"), resultado.getInt("permisos"), resultado.getString("nombre"), resultado.getString("apellido"), resultado.getString("direccion"), resultado.getString("email"), resultado.getString("telefono"), resultado.getString("usuario"), resultado.getString("password"));
                ManejadorUsuario.arregloUsuario.add(temp);
            }
            resultado.close();
            consulta.close();
            conpost.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public int validaLogin(Object obj) {
        Usuario temp = (Usuario) obj;
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        PreparedStatement consulta = null;
        try {
            consulta = conpost.prepareStatement("SELECT * FROM usuario WHERE usuario = ? AND password = ?");
            consulta.setString(1, temp.getUsuario());
            consulta.setString(2, temp.getPassword());
            ResultSet resultado = consulta.executeQuery();
            if (resultado.next()) {
                return resultado.getInt("permisos");
            }
            resultado.close();
            consulta.close();
            conpost.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 3;
        }
        return 3;
    }

}
