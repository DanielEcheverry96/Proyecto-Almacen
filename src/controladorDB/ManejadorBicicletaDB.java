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
import modelo.Bicicletas;
import modelo.CategoriaDeportivos;
import modelo.Marca;

/**
 *
 * @author danie
 */
public class ManejadorBicicletaDB implements ICRUDDB {

    Connection conpost;
    int idcategoria = 1010;
    CategoriaDeportivos catdep = new CategoriaDeportivos();

    @Override
    public boolean insertar(Object obj) {
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        boolean insertado = false;
        PreparedStatement stmt = null;
        if (obj instanceof Bicicletas) {
            Bicicletas temp = new Bicicletas();
            temp = (Bicicletas) obj;
            try {

                //String sql = "insert into articulo(idarticulo, nombrearticulo,cantidad,color,precio,imagen,idmarca,idcategoria) values(?, ?, ?, ?, ?, ?, ?, ?);";
                //stmt = conpost.createStatement();
                stmt = conpost.prepareStatement("INSERT INTO articulo(idarticulo,nombrearticulo,cantidad,color,precio,imagen,idmarca,idcategoria) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
                stmt.setInt(1, temp.getIdArticulo());
                stmt.setString(2, temp.getNombre());
                stmt.setInt(3, temp.getCantidad());
                stmt.setString(4, temp.getColor());
                stmt.setFloat(5, temp.getPrecio());
                stmt.setString(6, temp.getImagen());
                stmt.setInt(7, temp.getMar().getId());
                stmt.setInt(8, idcategoria);
//idarticulo, nombrearticulo,cantidad,color,precio,imagen,idmarca,idcategoria
//                String sql = "insert into articulo() values(" + temp.getIdArticulo() + "," + "'" + temp.getNombre() + "'" + "," + temp.getCantidad()
//                        + "," + "'" + temp.getColor() + "'" + "," + temp.getPrecio() + "," + "'" + temp.getImagen() + "'" + "," + 4 + "," + idcategoria + ");";
                stmt.executeUpdate();
                //sql = "insert into bicicleta(idarticulo,tamaño_rueda,material_bici,tipo_bici) values(?, ?, ?, ?);";
                stmt = null;
                stmt = conpost.prepareStatement("INSERT INTO bicicleta(idarticulo,tamaño_rueda,material_bici,tipo_bici) VALUES(?, ?, ?, ?)");
                stmt.setInt(1, temp.getIdArticulo());
                stmt.setInt(2, temp.getTamaniorueda());
                stmt.setString(3, temp.getMaterial());
                stmt.setString(4, temp.getTipo());
//idarticulo,tamaño_rueda,material_bici,tipo_bici
                //sql = "insert into bicicleta() values(" + temp.getIdArticulo() + "," + temp.getTamaniorueda() + "," + "'" + temp.getMaterial() + "'" + "," + "'" + temp.getTipo() + "'" + ");";
                stmt.executeUpdate();
                insertado = true;
                conpost.close();
                stmt.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());;
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
        Bicicletas temp = (Bicicletas) obj;
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
            sql = "update bicicleta set tamaño_rueda = ?,material_bici = ?,tipo_bici = ? where idarticulo = " + id + "";
            stmt = conpost.prepareStatement(sql);
            //stmt.setInt(1, temp.getIdArticulo());
            stmt.setInt(1, temp.getTamaniorueda());
            stmt.setString(2, temp.getMaterial());
            stmt.setString(3, temp.getTipo());
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
        Bicicletas temp = null;
        Marca mar = null;
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        Statement stmt;
        try {
            //SELECT *
            //FROM producto INNER JOIN factura_producto ON (producto.referencia_producto = factura_producto.referencia_producto) AND (producto.referencia_producto=1023) INNER JOIN factura ON factura.numero_factura = factura_producto.numero_factura;
            stmt = conpost.createStatement();
            String sql = "select * from articulo inner join bicicleta on (articulo.idarticulo = bicicleta.idarticulo) AND (articulo.idarticulo = " + id + ") inner join marca on marca.idmarca = articulo.idmarca;";
            ResultSet resultado = stmt.executeQuery(sql);
            if (resultado.next()) {
                //temp = new Bicicletas(idcategoria, material, tipo, id, id, nombre, id, id, descripcion, color, imagen, mar)
                temp = new Bicicletas();
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
                temp.setTamaniorueda(resultado.getInt("tamaño_rueda"));
                temp.setMaterial(resultado.getString("material_bici"));
                temp.setTipo(resultado.getString("tipo_bici"));
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
            String sql = "truncate table bicicleta";
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
            catdep.arreglobicicletas.clear();
            while (resultado.next()) {
                Bicicletas temp = new Bicicletas();
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
                temp.setTamaniorueda(resultado.getInt("tamaño_rueda"));
                temp.setMaterial(resultado.getString("material_bici"));
                temp.setTipo(resultado.getString("tipo_bici"));
                catdep.arreglobicicletas.add(temp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
