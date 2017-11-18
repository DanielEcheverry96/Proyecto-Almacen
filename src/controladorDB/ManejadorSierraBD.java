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
import modelo.CategoriaHerramientas;
import modelo.Marca;
import modelo.Sierras;

/**
 *
 * @author danie
 */
public class ManejadorSierraBD implements ICRUDDB {

    Connection conpost;
    int idcategoria = 5050;
    CategoriaHerramientas catherr = new CategoriaHerramientas();

    @Override
    public boolean insertar(Object obj) {
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        boolean insertado = false;
        Statement stmt;
        if (obj instanceof Sierras) {
            Sierras temp = new Sierras();
            temp = (Sierras) obj;
            try {
                stmt = conpost.createStatement();
                String sql = "insert into articulo(idarticulo, nombrearticulo,cantidad,color,precio,imagen,idmarca,idcategoria) values(" + temp.getIdArticulo() + "," + "'" + temp.getNombre() + "'" + "," + temp.getCantidad()
                        + "," + "'" + temp.getColor() + "'" + "," + temp.getPrecio() + "," + "'" + temp.getImagen() + "'" + "," + temp.getMar().getId() + "," + idcategoria + ");";
                stmt.executeUpdate(sql);
                sql = "insert into sierra(idarticulo,tipo_sierra,potencia_sierra,velocidad_sierra,peso_sierra,diametro_disco_sierra) values(" + temp.getIdArticulo() + "," + "'" + temp.getTipo() + "'" + "," + temp.getPotencia() + "," + temp.getVelocidad() + "," + temp.getPeso() + "," + temp.getDiametrodisco() + ");";
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
        Sierras temp = (Sierras) obj;
        try {
            String sql = "update articulo set nombrearticulo = ?, cantidad = ?, color = ?, "
                    + "precio = ?, imagen = ?,  idcategoria = ? where idarticulo = " + id + "";
            stmt = conpost.prepareStatement(sql);
            //stmt.setInt(1, temp.getIdArticulo());
            stmt.setString(1, temp.getNombre());
            stmt.setInt(2, temp.getCantidad());
            stmt.setString(3, temp.getColor());
            stmt.setFloat(4, temp.getPrecio());
            stmt.setString(5, temp.getImagen());
            //stmt.setInt(6, temp.getMar().getId());
            stmt.setInt(6, idcategoria);
            stmt.executeUpdate();
            stmt = null;
            sql = "update sierra set tipo_sierra = ?,potencia_sierra = ?,velocidad_sierra = ?,peso_sierra = ?, diametro_disco_sierra = ? where idarticulo = " + id + "";
            stmt = conpost.prepareStatement(sql);
            //stmt.setInt(1, temp.getIdArticulo());
            stmt.setString(1, temp.getTipo());
            stmt.setInt(2, temp.getPotencia());
            stmt.setInt(3, temp.getVelocidad());
            stmt.setFloat(4, temp.getPeso());
            stmt.setFloat(5, temp.getDiametrodisco());
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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object consultarId(int id) {
        Sierras temp = null;
        Marca mar = null;
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        Statement stmt;
        try {
            //SELECT *
            //FROM producto INNER JOIN factura_producto ON (producto.referencia_producto = factura_producto.referencia_producto) AND (producto.referencia_producto=1023) INNER JOIN factura ON factura.numero_factura = factura_producto.numero_factura;
            stmt = conpost.createStatement();
            String sql = "select * from articulo inner join sierra on (articulo.idarticulo = sierra.idarticulo) AND (articulo.idarticulo = " + id + ") inner join marca on marca.idmarca = articulo.idmarca;";
            ResultSet resultado = stmt.executeQuery(sql);
            if (resultado.next()) {
                //temp = new Bicicletas(idcategoria, material, tipo, id, id, nombre, id, id, descripcion, color, imagen, mar)
                temp = new Sierras();
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
                temp.setTipo(resultado.getString("tipo_sierra"));
                temp.setPotencia(resultado.getInt("potencia_sierra"));
                temp.setVelocidad(resultado.getInt("velocidad_sierra"));
                temp.setPeso(resultado.getFloat("peso_sierra"));
                temp.setDiametrodisco(resultado.getFloat("diametro_disco_sierra"));
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
            String sql = "truncate table sierra";
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
            catherr.arreglosierras.clear();
            while (resultado.next()) {
                Sierras temp = new Sierras();
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
                temp.setTipo(resultado.getString("tipo_sierra"));
                temp.setPotencia(resultado.getInt("potencia_sierra"));
                temp.setVelocidad(resultado.getInt("velocidad_sierra"));
                temp.setPeso(resultado.getFloat("peso_sierra"));
                temp.setDiametrodisco(resultado.getFloat("diametro_disco_sierra"));
                catherr.arreglosierras.add(temp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
