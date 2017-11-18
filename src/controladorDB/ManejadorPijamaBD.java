/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorDB;

import controlador.ICRUDDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.CategoriaRopa;
import modelo.Marca;
import modelo.Pijamas;

/**
 *
 * @author danie
 */
public class ManejadorPijamaBD implements ICRUDDB {

    Connection conpost;
    int idcategoria = 6060;
    CategoriaRopa catrop = new CategoriaRopa();

    @Override
    public boolean insertar(Object obj) {
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        boolean insertado = false;
        Statement stmt;
        if (obj instanceof Pijamas) {
            Pijamas temp = new Pijamas();
            temp = (Pijamas) obj;
            try {
                stmt = conpost.createStatement();
                String sql = "insert into articulo(idarticulo, nombrearticulo,cantidad,color,precio,imagen,idmarca,idcategoria) values(" + temp.getIdArticulo() + "," + "'" + temp.getNombre() + "'" + "," + temp.getCantidad()
                        + "," + "'" + temp.getColor() + "'" + "," + temp.getPrecio() + "," + "'" + temp.getImagen() + "'" + "," + temp.getMar().getId() + "," + idcategoria + ");";
                stmt.executeUpdate(sql);
                sql = "insert into pijama(idarticulo,tipo_pij,talla_pij,tipo_usuario_pij) values(" + temp.getIdArticulo() + "," + "'" + temp.getTipo() + "'" + "," + "'" + temp.getTalla() + "'" + "," + "'" + temp.getTipousuario() + "'" + ");";
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
        Pijamas temp = (Pijamas) obj;
        try {
            String sql = "update articulo set nombrearticulo = ?, cantidad = ?, color = ?, "
                    + "precio = ?, imagen = ?, idmarca = ?, idcategoria = ? where idarticulo = " + id + "";
            stmt = conpost.prepareStatement(sql);
            //stmt.setInt(1, temp.getIdArticulo());
            stmt.setString(1, temp.getNombre());
            stmt.setInt(2, temp.getCantidad());
            stmt.setString(3, temp.getColor());
            stmt.setFloat(4, temp.getPrecio());
            stmt.setString(5, temp.getImagen());
            stmt.setInt(6, temp.getMar().getId());
            stmt.setInt(7, idcategoria);
            stmt.executeUpdate();
            stmt = null;
            sql = "update pijama set tipo_pij = ?,talla_pij = ?, tipo_usuario_pij  where idarticulo = " + id + "";
            stmt = conpost.prepareStatement(sql);
            //stmt.setInt(1, temp.getIdArticulo());
            stmt.setString(1, temp.getTipo());
            stmt.setString(2, temp.getTalla());
            stmt.setString(3, temp.getTipousuario());
            stmt.executeUpdate();
            conpost.close();
            stmt.close();
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
        Pijamas temp = null;
        Marca mar = null;
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        Statement stmt;
        try {
            stmt = conpost.createStatement();
            String sql = "select * from articulo inner join pijama on (articulo.idarticulo = pijama.idarticulo) AND (articulo.idarticulo = " + id + ") inner join marca on marca.idmarca = articulo.idmarca;";
            ResultSet resultado = stmt.executeQuery(sql);
            if (resultado.next()) {
                //temp = new Bicicletas(idcategoria, material, tipo, id, id, nombre, id, id, descripcion, color, imagen, mar)
                temp = new Pijamas();
                mar = new Marca();
                temp.setIdArticulo(resultado.getInt("idarticulo"));
                mar.setId(resultado.getInt("idmarca"));
                mar.setDescripcion(resultado.getString("descripcion"));
                temp.setMar(mar);
                temp.setNombre(resultado.getString("nombrearticulo"));
                temp.setCantidad(resultado.getInt("cantidad"));
                temp.setPrecio(resultado.getFloat("precio"));
                temp.setColor(resultado.getString("color"));
                temp.setImagen(resultado.getString("imagen"));
                temp.setTipo(resultado.getString("tipo_pij"));
                temp.setTalla(resultado.getString("talla_pij"));
                temp.setTipousuario(resultado.getString("tipo_usuario_pij"));
            }
            resultado.close();
            stmt.close();
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
        PreparedStatement stmt;
        try {
            String sql = "delete from articulo where idarticulo = ?";
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
            String sql = "truncate table pijama";
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
            ResultSet resultado = stmt.executeQuery("select * from articulo inner join pijama on (articulo.idarticulo = pijama.idarticulo) inner join marca on marca.idmarca = articulo.idmarca");
            catrop.arreglopijamas.clear();
            while (resultado.next()) {
                Pijamas temp = new Pijamas();
                Marca mar = new Marca();
                temp.setIdArticulo(resultado.getInt("idarticulo"));
                mar.setId(resultado.getInt("idmarca"));
                mar.setDescripcion(resultado.getString("descripcion"));
                temp.setMar(mar);
                temp.setNombre(resultado.getString("nombrearticulo"));
                temp.setCantidad(resultado.getInt("cantidad"));
                temp.setPrecio(resultado.getFloat("precio"));
                temp.setColor(resultado.getString("color"));
                temp.setImagen(resultado.getString("imagen"));
                temp.setTipo(resultado.getString("tipo_pij"));
                temp.setTalla(resultado.getString("talla_pij"));
                temp.setTipousuario(resultado.getString("tipo_usuario_pij"));
                catrop.arreglopijamas.add(temp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
