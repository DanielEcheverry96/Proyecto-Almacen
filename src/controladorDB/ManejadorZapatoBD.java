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
import modelo.Zapatos;

/**
 *
 * @author danie
 */
public class ManejadorZapatoBD implements ICRUDDB {

    Connection conpost;
    int idcategoria = 6060;
    CategoriaRopa catrop = new CategoriaRopa();

    @Override
    public boolean insertar(Object obj) {
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        boolean insertado = false;
        Statement stmt;
        if (obj instanceof Zapatos) {
            Zapatos temp = new Zapatos();
            temp = (Zapatos) obj;
            try {
                stmt = conpost.createStatement();
                String sql = "insert into articulo(idarticulo, nombrearticulo,cantidad,color,precio,imagen,idmarca,idcategoria) values(" + temp.getIdArticulo() + "," + "'" + temp.getNombre() + "'" + "," + temp.getCantidad()
                        + "," + "'" + temp.getColor() + "'" + "," + temp.getPrecio() + "," + "'" + temp.getImagen() + "'" + "," + temp.getMar().getId() + "," + idcategoria + ");";
                stmt.executeUpdate(sql);
                sql = "insert into zapato(idarticulo,tipo_zapato,tipo_usuario_zapato,talla_zapato) values(" + temp.getIdArticulo() + "," + "'" + temp.getTipozapato() + "'" + "," + "'" + temp.getTipousuario() + "'" + "," + temp.getTallanumerica() + ");";
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
        Zapatos temp = (Zapatos) obj;
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
            sql = "update zapato set tipo_zapato = ?,tipo_usuario_zapato = ?,talla_zapato = ? where idarticulo = " + id + "";
            stmt = conpost.prepareStatement(sql);
            //stmt.setInt(1, temp.getIdArticulo());
            stmt.setString(1, temp.getTipozapato());
            stmt.setString(2, temp.getTipousuario());
            stmt.setInt(3, temp.getTallanumerica());
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
        Zapatos temp = null;
        Marca mar = null;
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        Statement stmt;
        try {
            //SELECT *
            //FROM producto INNER JOIN factura_producto ON (producto.referencia_producto = factura_producto.referencia_producto) AND (producto.referencia_producto=1023) INNER JOIN factura ON factura.numero_factura = factura_producto.numero_factura;
            stmt = conpost.createStatement();
            String sql = "select * from articulo inner join zapato on (articulo.idarticulo = zapato.idarticulo) AND (articulo.idarticulo = " + id + ") inner join marca on marca.idmarca = articulo.idmarca;";
            ResultSet resultado = stmt.executeQuery(sql);
            if (resultado.next()) {
                //temp = new Bicicletas(idcategoria, material, tipo, id, id, nombre, id, id, descripcion, color, imagen, mar)
                temp = new Zapatos();
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
                temp.setTipozapato(resultado.getString("tipo_zapato"));
                temp.setTipousuario(resultado.getString("tipo_usuario_zapato"));
                temp.setTallanumerica(resultado.getInt("talla_zapato"));
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
            String sql = "truncate table zapato";
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
            ResultSet resultado = stmt.executeQuery("select * from articulo inner join bicicleta on (articulo.idarticulo = bicicleta.idarticulo) inner join marca on marca.idmarca = articulo.idmarca");
            catrop.arreglozapatos.clear();
            while (resultado.next()) {
                Zapatos temp = new Zapatos();
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
                temp.setTipozapato(resultado.getString("tipo_zapato"));
                temp.setTipousuario(resultado.getString("tipo_usuario_zapato"));
                temp.setTallanumerica(resultado.getInt("talla_zapato"));
                catrop.arreglozapatos.add(temp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
