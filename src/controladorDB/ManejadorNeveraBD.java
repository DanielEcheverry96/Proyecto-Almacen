/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorDB;

import controlador.ICRUD;
import controlador.ICRUDDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.CategoriaElectrodomesticos;
import modelo.Marca;
import modelo.Neveras;

/**
 *
 * @author danie
 */
public class ManejadorNeveraBD implements ICRUDDB {

    Connection conpost;
    int idcategoria = 4040;
    CategoriaElectrodomesticos catelec = new CategoriaElectrodomesticos();

    @Override
    public boolean insertar(Object obj) {
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        boolean insertado = false;
        Statement stmt;
        if (obj instanceof Neveras) {
            Neveras temp = new Neveras();
            temp = (Neveras) obj;
            try {
                stmt = conpost.createStatement();
                String sql = "insert into articulo(idarticulo, nombrearticulo,cantidad,color,precio,imagen,idmarca,idcategoria) values(" + temp.getIdArticulo() + "," + "'" + temp.getNombre() + "'" + "," + temp.getCantidad()
                        + "," + "'" + temp.getColor() + "'" + "," + temp.getPrecio() + "," + "'" + temp.getImagen() + "'" + "," + temp.getMar().getId() + "," + idcategoria + ");";
                stmt.executeUpdate(sql);
                sql = "insert into nevera(idarticulo,capacidad_congelador_nev,capacidad_frigorifero_nev,material_nev,tamaño_nev,sistema_nev) values(" + temp.getIdArticulo() + "," + "'" + temp.getCapcongelador() + "'" + "," + "'" + temp.getCapfrigorifero() + "'" + "," + "'" + temp.getMaterial() + "'" + "," + temp.getTamaño() + "," + "'" + temp.getSistema() + "'" + ");";
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
        Neveras temp = (Neveras) obj;
        try {
            String sql = "update articulo set, nombrearticulo = ?, cantidad = ?, color = ?, "
                    + "precio = ?, imagen = ?, idcategoria = ? where idarticulo = " + id + "";
            stmt = conpost.prepareStatement(sql);
//            stmt.setInt(1, temp.getIdArticulo());
            stmt.setString(1, temp.getNombre());
            stmt.setInt(2, temp.getCantidad());
            stmt.setString(3, temp.getColor());
            stmt.setFloat(4, temp.getPrecio());
            stmt.setString(5, temp.getImagen());
            //stmt.setInt(6, temp.getMar().getId());
            stmt.setInt(6, idcategoria);
            stmt.executeUpdate();
            stmt = null;
            sql = "update nevera set capacidad_congelador_nev = ?,capacidad_frigorifero_nev = ?,material_nev= ?,tamaño_nev = ?,sistema_nev = ? where idarticulo = " + id + "";
            stmt = conpost.prepareStatement(sql);
//            stmt.setInt(1, temp.getIdArticulo());
            stmt.setString(1, temp.getCapcongelador());
            stmt.setString(2, temp.getCapfrigorifero());
            stmt.setString(3, temp.getMaterial());
            stmt.setFloat(4, temp.getTamaño());
            stmt.setString(5, temp.getSistema());
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
        Neveras temp = null;
        Marca mar = null;
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        Statement stmt;
        try {
            //SELECT *
            //FROM producto INNER JOIN factura_producto ON (producto.referencia_producto = factura_producto.referencia_producto) AND (producto.referencia_producto=1023) INNER JOIN factura ON factura.numero_factura = factura_producto.numero_factura;
            stmt = conpost.createStatement();
            String sql = "select * from articulo inner join nevera on (articulo.idarticulo = nevera.idarticulo) AND (articulo.idarticulo = " + id + ") inner join marca on marca.idmarca = articulo.idmarca;";
            ResultSet resultado = stmt.executeQuery(sql);
            if (resultado.next()) {
                temp = new Neveras();
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
                temp.setCapcongelador(resultado.getString("capacidad_congelador_nev"));
                temp.setCapfrigorifero(resultado.getString("capacidad_frigorifero_nev"));
                temp.setMaterial(resultado.getString("material_nev"));
                temp.setTamaño(resultado.getInt("tamaño_nev"));
                temp.setSistema(resultado.getString("sistema_nev"));
            }

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
            String sql = "truncate table nevera";
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
            ResultSet resultado = stmt.executeQuery("select * from articulo inner join nevera on (articulo.idarticulo = nevera.idarticulo) inner join marca on marca.idmarca = articulo.idmarca");
            catelec.arregloneveras.clear();
            while (resultado.next()) {
                Neveras temp = new Neveras();
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
                temp.setCapcongelador(resultado.getString("capacidad_congelador_nev"));
                temp.setCapfrigorifero(resultado.getString("capacidad_frigorifero_nev"));
                temp.setMaterial(resultado.getString("material_nev"));
                temp.setTamaño(resultado.getInt("tamaño_nev"));
                temp.setSistema(resultado.getString("sistema_nev"));
                catelec.arregloneveras.add(temp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
