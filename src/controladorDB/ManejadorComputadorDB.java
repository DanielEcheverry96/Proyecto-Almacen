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
import modelo.Computadores;
import modelo.Marca;

/**
 *
 * @author danie
 */
public class ManejadorComputadorDB implements ICRUDDB {

    Connection conpost;
    int idcategoria = 2020;
    CategoriaElectronicosOficina cate = new CategoriaElectronicosOficina();

    @Override
    public boolean insertar(Object obj) {
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        boolean insertado = false;
        Statement stmt;
        if (obj instanceof Computadores) {
            Computadores temp = new Computadores();
            temp = (Computadores) obj;
            try {
                stmt = conpost.createStatement();
                String sql = "insert into articulo(idarticulo, nombrearticulo,cantidad,color,precio,imagen,idmarca,idcategoria) values(" + temp.getIdArticulo() + "," + "'" + temp.getNombre() + "'" + "," + temp.getCantidad()
                        + "," + "'" + temp.getColor() + "'" + "," + temp.getPrecio() + "," + "'" + temp.getImagen() + "'" + "," + temp.getMar().getId() + "," + idcategoria + ");";
                stmt.executeUpdate(sql);
                sql = "insert into computador(idarticulo,capacidad_memoria_comp,tipo_teclado_comp,tipo_mouse_comp,tipo_pantalla_comp,capacidad_almacenamiento_comp) values(" + temp.getIdArticulo() + "," + "'" + temp.getCapmemoria() + "'" + "," + "'" + temp.getTipoteclado() + "'" + "," + "'" + temp.getTipomouse() + "'" + "," + "'" + temp.getTipopantalla() + "'" + "," + temp.getCapalmacenamiento() + ");";
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
        Computadores temp = (Computadores) obj;
        try {
            String sql = "update articulo set nombrearticulo = ?, cantidad = ?, color = ?, "
                    + "precio = ?, imagen = ?, idmarca = ?, idcategoria = ? where idarticulo = "+ id + "" ;
            stmt = conpost.prepareStatement(sql);
//            stmt.setInt(1, temp.getIdArticulo());
            stmt.setString(1, temp.getNombre());
            stmt.setInt(2, temp.getCantidad());
            stmt.setString(3, temp.getColor());
            stmt.setFloat(4, temp.getPrecio());
            stmt.setString(5, temp.getImagen());
            stmt.setInt(6, temp.getMar().getId());
            stmt.setInt(7, idcategoria);
            stmt.executeUpdate();
            stmt = null;
            sql = "update computador set capacidad_memoria = ?,tipo_teclado = ?,tipo_mouse = ?,tipo_pantalla= ?,capacidad_almacenamiento= ? where idarticulo = "+ id +"";
            stmt = conpost.prepareStatement(sql);
//            stmt.setInt(1, temp.getIdArticulo());
            stmt.setString(1, temp.getCapmemoria());
            stmt.setString(2, temp.getTipoteclado());
            stmt.setString(3, temp.getTipomouse());
            stmt.setString(4, temp.getTipopantalla());
            stmt.setInt(5, temp.getCapalmacenamiento());
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
        Computadores temp = null;
        Marca mar = null;
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        Statement stmt;
        try {
            //SELECT *
            //FROM producto INNER JOIN factura_producto ON (producto.referencia_producto = factura_producto.referencia_producto) AND (producto.referencia_producto=1023) INNER JOIN factura ON factura.numero_factura = factura_producto.numero_factura;
            stmt = conpost.createStatement();
            String sql = "select * from articulo inner join computador on (articulo.idarticulo = computador.idarticulo) AND (articulo.idarticulo = " + id + ") inner join marca on marca.idmarca = articulo.idmarca;";
            ResultSet resultado = stmt.executeQuery(sql);
            if (resultado.next()) {
                temp = new Computadores();
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
                temp.setCapmemoria(resultado.getString("capacidad_memoria"));
                temp.setTipoteclado(resultado.getString("tipo_teclado"));
                temp.setTipomouse(resultado.getString("tipo_mouse"));
                temp.setTipopantalla(resultado.getString("tipo_pantalla"));
                temp.setCapalmacenamiento(resultado.getInt("capacidad_almacenamiento"));
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
            String sql = "truncate table computador";
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
            ResultSet resultado = stmt.executeQuery("select * from articulo inner join computador on (articulo.idarticulo = computador.idarticulo) inner join marca on marca.idmarca = articulo.idmarca");
            cate.arreglocomputadores.clear();
            while (resultado.next()) {
                Computadores temp = new Computadores();
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
                temp.setCapmemoria(resultado.getString("capacidad_memoria"));
                temp.setTipoteclado(resultado.getString("tipo_teclado"));
                temp.setTipomouse(resultado.getString("tipo_mouse"));
                temp.setTipopantalla(resultado.getString("tipo_pantalla"));
                temp.setCapalmacenamiento(resultado.getInt("capacidad_almacenamiento"));
                cate.arreglocomputadores.add(temp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


