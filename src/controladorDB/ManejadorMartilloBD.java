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
import modelo.CategoriaHerramientas;
import modelo.Marca;
import modelo.Martillos;

/**
 *
 * @author danie
 */
public class ManejadorMartilloBD implements ICRUDDB {

    Connection conpost;
    int idcategoria = 5050;
    CategoriaHerramientas cateh = new CategoriaHerramientas();

    @Override
    public boolean insertar(Object obj) {
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        boolean insertado = false;
        Statement stmt;
        if (obj instanceof Martillos) {
            Martillos temp = new Martillos();
            temp = (Martillos) obj;
            try {
                stmt = conpost.createStatement();
                String sql = "insert into articulo(idarticulo, nombrearticulo,cantidad,color,precio,imagen,idmarca,idcategoria) values(" + temp.getIdArticulo() + "," + "'" + temp.getNombre() + "'" + "," + temp.getCantidad()
                        + "," + "'" + temp.getColor() + "'" + "," + temp.getPrecio() + "," + "'" + temp.getImagen() + "'" + "," + temp.getIdMarca() + "," + idcategoria + ");";
                stmt.executeUpdate(sql);
                sql = "insert into martillo(idarticulo,tipo_marti,material_mango_marti,material_cabezal_marti,peso_marti,tamaño_marti) values(" + temp.getIdArticulo() + "," + "'" + temp.getTipo() + "'" + "," + "'" + temp.getMatmango() + "'" + "," + "'" + temp.getMatcabezal() + "'" + "," + temp.getPeso() + "," + "'" + temp.getTamaño() + "'" + ");";
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
        Martillos temp = (Martillos) obj;
        try {
            String sql = "update articulo set nombrearticulo = ?, cantidad = ?, color = ?, "
                    + "precio = ?, imagen = ?, idmarca = ?, idcategoria = ? where idarticulo = "+ id + "";
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
            sql = "update martillo set material_mango = ?,material_cabezal = ?,peso = ?,tamaño= ?,tipo= ? where idarticulo = "+ id + "";
            stmt = conpost.prepareStatement(sql);
//            stmt.setInt(1, temp.getIdArticulo());
            stmt.setString(1, temp.getMatmango());
            stmt.setString(2, temp.getMatcabezal());
            stmt.setInt(3, temp.getPeso());
            stmt.setString(4, temp.getTamaño());
            stmt.setString(5, temp.getTipo());
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
        Martillos temp = null;
        Marca mar = null;
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        Statement stmt;
        try {
            //SELECT *
            //FROM producto INNER JOIN factura_producto ON (producto.referencia_producto = factura_producto.referencia_producto) AND (producto.referencia_producto=1023) INNER JOIN factura ON factura.numero_factura = factura_producto.numero_factura;
            stmt = conpost.createStatement();
            String sql = "select * from articulo inner join martillo on (articulo.idarticulo = martillo.idarticulo) AND (articulo.idarticulo = " + id + ") inner join marca on marca.idmarca = articulo.idmarca;";
            ResultSet resultado = stmt.executeQuery(sql);
            if (resultado.next()) {
                temp = new Martillos();
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
                temp.setMatmango(resultado.getString("material_mango"));
                temp.setMatcabezal(resultado.getString("material_cabezal"));
                temp.setPeso(resultado.getInt("peso"));
                temp.setTamaño(resultado.getString("tamaño"));
                temp.setTipo(resultado.getString("tipo"));
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
            String sql = "truncate table martillo";
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
            ResultSet resultado = stmt.executeQuery("select * from articulo inner join martillos on (articulo.idarticulo = martillos.idarticulo) inner join marca on marca.idmarca = articulo.idmarca");
            cateh.arreglomartillos.clear();
            while (resultado.next()) {
                Martillos temp = new Martillos();
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
                temp.setMatmango(resultado.getString("material_mango"));
                temp.setMatcabezal(resultado.getString("material_cabezal"));
                temp.setPeso(resultado.getInt("peso"));
                temp.setTamaño(resultado.getString("tamaño"));
                temp.setTipo(resultado.getString("tipo"));
                cateh.arreglomartillos.add(temp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}