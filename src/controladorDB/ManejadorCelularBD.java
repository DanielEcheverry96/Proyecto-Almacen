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
import modelo.CategoriaElectronicosOficina;
import modelo.Marca;
import modelo.TelefonosCelulares;

/**
 *
 * @author danie
 */
public class ManejadorCelularBD implements ICRUDDB {

    Connection conpost;
    int idcategoria = 2020;
    CategoriaElectronicosOficina catel = new CategoriaElectronicosOficina();

    @Override
    public boolean insertar(Object obj) {
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        boolean insertado = false;
        Statement stmt;
        if (obj instanceof TelefonosCelulares) {
            TelefonosCelulares temp = new TelefonosCelulares();
            temp = (TelefonosCelulares) obj;
            try {
                stmt = conpost.createStatement();
                String sql = "insert into articulo(idarticulo, nombrearticulo,cantidad,color,precio,imagen,idmarca,idcategoria) values(" + temp.getIdArticulo() + "," + "'" + temp.getNombre() + "'" + "," + temp.getCantidad()
                        + "," + "'" + temp.getColor() + "'" + "," + temp.getPrecio() + "," + "'" + temp.getImagen() + "'" + "," + temp.getMar().getId() + "," + idcategoria + ");";
                stmt.executeUpdate(sql);
                sql = "insert into celular(idarticulo,tipo_procesador_cel,tamaño_pantalla_cel,tamaño_memoria_cel,capacidad_almacenamiento_cel,tipo_pantalla_cel,interface_red_cel) values(" + temp.getIdArticulo() + "," + "'" + temp.getTiprocesador() + "'" + "," + temp.getTamañodepantalla() + "," + temp.getTammemoria() + "," + temp.getCapalmacenamiento() + "," + "'" + temp.getTipodepantalla() + "'" + "," + "'" + temp.getInterfacered() + "'" + ");";
                stmt.executeUpdate(sql);
                insertado = true;
                conpost.close();
                stmt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
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
        TelefonosCelulares temp = (TelefonosCelulares) obj;
        try {
            String sql = "update articulo set nombrearticulo = ?, cantidad = ?, color = ?, "
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
            sql = "update celular set tipo_procesador_cel = ?,tamaño_pantalla_cel = ?,tamaño_memoria_cel = ?,capacidad_almcenamiento_cel= ?,tipo_pantalla_cel= ?,interface_red_cel= ? where idarticulo = " + id + "";
            stmt = conpost.prepareStatement(sql);
//            stmt.setInt(1, temp.getIdArticulo());
            stmt.setString(1, temp.getTiprocesador());
            stmt.setInt(2, temp.getTamañodepantalla());
            stmt.setInt(3, temp.getTammemoria());
            stmt.setInt(4, temp.getCapalmacenamiento());
            stmt.setString(5, temp.getTipodepantalla());
            stmt.setString(6, temp.getInterfacered());
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
        TelefonosCelulares temp = null;
        Marca mar = null;
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        Statement stmt;
        try {
            //SELECT *
            //FROM producto INNER JOIN factura_producto ON (producto.referencia_producto = factura_producto.referencia_producto) AND (producto.referencia_producto=1023) INNER JOIN factura ON factura.numero_factura = factura_producto.numero_factura;
            stmt = conpost.createStatement();
            String sql = "select * from articulo inner join celular on (articulo.idarticulo = celular.idarticulo) AND (articulo.idarticulo = " + id + ") inner join marca on marca.idmarca = articulo.idmarca;";
            ResultSet resultado = stmt.executeQuery(sql);
            if (resultado.next()) {
                temp = new TelefonosCelulares();
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
                temp.setTiprocesador(resultado.getString("tipo_procesador_cel"));
                temp.setTamañodepantalla(resultado.getInt("tamaño_pantalla_cel"));
                temp.setTammemoria(resultado.getInt("tamaño_memoria_cel"));
                temp.setCapalmacenamiento(resultado.getInt("capacidad_almacenamiento_cel"));
                temp.setTipodepantalla(resultado.getString("tipo_pantalla_cel"));
                temp.setInterfacered(resultado.getString("interface_red_cel"));
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
            String sql = "truncate table celular";
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
            ResultSet resultado = stmt.executeQuery("select * from articulo inner join celular on (articulo.idarticulo = celular.idarticulo) inner join marca on marca.idmarca = articulo.idmarca");
            catel.arreglotelefonoscelulares.clear();
            while (resultado.next()) {
                TelefonosCelulares temp = new TelefonosCelulares();
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
                temp.setTiprocesador(resultado.getString("tipo_procesador_cel"));
                temp.setTamañodepantalla(resultado.getInt("tamaño_pantalla_cel"));
                temp.setTammemoria(resultado.getInt("tamaño_memoria_cel"));
                temp.setCapalmacenamiento(resultado.getInt("capacidad_almacenamiento_cel"));
                temp.setTipodepantalla(resultado.getString("tipo_pantalla_cel"));
                temp.setInterfacered(resultado.getString("interface_red_cel"));
                catel.arreglotelefonoscelulares.add(temp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
