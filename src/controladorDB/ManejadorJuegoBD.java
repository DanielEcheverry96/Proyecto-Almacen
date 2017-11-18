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
import modelo.CategoriaVideojuegos;
import modelo.Juegos;
import modelo.Marca;

/**
 *
 * @author danie
 */
public class ManejadorJuegoBD implements ICRUDDB {

    Connection conpost;
    int idcategoria = 3030;
    CategoriaVideojuegos catevid = new CategoriaVideojuegos();

    @Override
    public boolean insertar(Object obj) {
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        boolean insertado = false;
        Statement stmt;
        if (obj instanceof Juegos) {
            Juegos temp = new Juegos();
            temp = (Juegos) obj;
            try {
                stmt = conpost.createStatement();
                String sql = "insert into articulo(idarticulo, nombrearticulo,cantidad,precio,imagen,idmarca,idcategoria) values(" + temp.getIdArticulo() + "," + "'" + temp.getNombre() + "'" + "," + temp.getCantidad()
                        + "," + temp.getPrecio() + "," + "'" + temp.getImagen() + "'" + "," + temp.getIdMarca() + "," + idcategoria + ");";
                stmt.executeUpdate(sql);
                sql = "insert into videojuego(idarticulo,genero_juego,restriccion_edad_juego,plataforma_juego,numero_jugadores_juego) values(" + temp.getIdArticulo() + "," + "'" + temp.getGenero() + "'" + "," + "'" + temp.getRestedad() + "'" + "," + "'" + temp.getPlataforma() + "'" + "," + temp.getNumjugadores() + ");";
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
        Juegos temp = (Juegos) obj;
        try {
            String sql = "update articulo set nombrearticulo = ?, cantidad = ?, "
                    + "precio = ?, imagen = ?, idmarca = ?, idcategoria = ? where idarticulo = "+ id + "";
            stmt = conpost.prepareStatement(sql);
//            stmt.setInt(1, temp.getIdArticulo());
           stmt.setString(1, temp.getNombre());
            stmt.setInt(2, temp.getCantidad());
            stmt.setFloat(3, temp.getPrecio());
            stmt.setString(4, temp.getImagen());
            stmt.setInt(5, temp.getMar().getId());
            stmt.setInt(6, idcategoria);
            stmt.executeUpdate();
            stmt = null;
            sql = "update juego set genero = ?,restriccion_edad = ?,plataforma = ?,numero_jugadores = ? where idarticulo = "+ id + "";
            stmt = conpost.prepareStatement(sql);
//            stmt.setInt(1, temp.getIdArticulo());
            stmt.setString(1, temp.getGenero());
            stmt.setString(2, temp.getRestedad());
            stmt.setString(3, temp.getPlataforma());
            stmt.setInt(4, temp.getNumjugadores());
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
        Juegos temp = null;
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
                temp = new Juegos();
                mar = new Marca();
                temp.setIdArticulo(resultado.getInt("idarticulo"));
                mar.setId(resultado.getInt("idmarca"));
                mar.setDescripcion(resultado.getString("descripcion"));
                temp.setMar(mar);
                temp.setNombre(resultado.getString("nombrearticulo"));
                temp.setCantidad(resultado.getInt("cantidad"));
                temp.setPrecio(resultado.getFloat("precio"));
                temp.setImagen(resultado.getString("imagen"));
                temp.setGenero(resultado.getString("genero"));
                temp.setRestedad(resultado.getString("restriccion_edad"));
                temp.setPlataforma(resultado.getString("plataforma"));
                temp.setNumjugadores(resultado.getInt("numero_jugadores"));
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
            String sql = "truncate table juego";
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
            ResultSet resultado = stmt.executeQuery("select * from articulo inner join juego on (articulo.idarticulo = juego.idarticulo) inner join marca on marca.idmarca = articulo.idmarca");
            catevid.arreglojuegos.clear();
            while (resultado.next()) {
                Juegos temp = new Juegos();
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
                temp.setGenero(resultado.getString("genero"));
                temp.setRestedad(resultado.getString("restriccion_edad"));
                temp.setPlataforma(resultado.getString("plataforma"));
                temp.setNumjugadores(resultado.getInt("numero_jugadores"));
                catevid.arreglojuegos.add(temp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
