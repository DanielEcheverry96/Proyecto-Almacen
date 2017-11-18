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
import modelo.Hornoselectricosygas;
import modelo.Marca;

/**
 *
 * @author danie
 */
public class ManejadorHornoelectricoygasDB implements ICRUDDB {

    Connection conpost;
    int idcategoria = 4040;
    CategoriaElectrodomesticos catelec = new CategoriaElectrodomesticos();

    @Override
    public boolean insertar(Object obj) {
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        boolean insertado = false;
        Statement stmt;
        if (obj instanceof Hornoselectricosygas) {
            Hornoselectricosygas temp = new Hornoselectricosygas();
            temp = (Hornoselectricosygas) obj;
            try {
                stmt = conpost.createStatement();
                String sql = "insert into articulo(idarticulo, nombrearticulo,cantidad,color,precio,imagen,idmarca,idcategoria) values(" + temp.getIdArticulo() + "," + "'" + temp.getNombre() + "'" + "," + temp.getCantidad()
                        + "," + "'" + temp.getColor() + "'" + "," + temp.getPrecio() + "," + "'" + temp.getImagen() + "'" + "," + temp.getIdMarca() + "," + idcategoria + ");";
                stmt.executeUpdate(sql);
                sql = "insert into hornoelectricoygas(idarticulo,potencia_hornogas,numero_bandejas_hornogas,gratinador_hornogas,tipo_control_hornogas,temperatura_max_hornogas) values(" + temp.getIdArticulo() + "," + "'" + temp.getPotencia() + "'" + "," + temp.getNumbandejas() + "," + "'" + temp.getGratinador() + "'" + "," + "'" + temp.getTipocontrol() + "'" + "," + temp.getTemperaturamax() + ");";
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
        Hornoselectricosygas temp = (Hornoselectricosygas) obj;
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
            sql = "update hornoelectricoygas set potencia = ?,numero_bandejas = ?,gratinador = ?,tipo_control= ?,temperatura_maxima= ? where idaerticulo = "+ id + "";
            stmt = conpost.prepareStatement(sql);
//            stmt.setInt(1, temp.getIdArticulo());
            stmt.setString(1, temp.getPotencia());
            stmt.setInt(2, temp.getNumbandejas());
            stmt.setString(3, temp.getGratinador());
            stmt.setString(4, temp.getTipocontrol());
            stmt.setInt(5, temp.getTemperaturamax());
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
        Hornoselectricosygas temp = null;
        Marca mar = null;
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        Statement stmt;
        try {
            //SELECT *
            //FROM producto INNER JOIN factura_producto ON (producto.referencia_producto = factura_producto.referencia_producto) AND (producto.referencia_producto=1023) INNER JOIN factura ON factura.numero_factura = factura_producto.numero_factura;
            stmt = conpost.createStatement();
            String sql = "select * from articulo inner join hornoelectricoygas on (articulo.idarticulo = hornoelectricoygas.idarticulo) AND (articulo.idarticulo = " + id + ") inner join marca on marca.idmarca = articulo.idmarca;";
            ResultSet resultado = stmt.executeQuery(sql);
            if (resultado.next()) {
                temp = new Hornoselectricosygas();
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
                temp.setPotencia(resultado.getString("potencia"));
                temp.setNumbandejas(resultado.getInt("numero_bandejas"));
                temp.setGratinador(resultado.getString("gratinador"));
                temp.setTipocontrol(resultado.getString("tipo_control"));
                temp.setTemperaturamax(resultado.getInt("temperatura_maxima"));
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
            String sql = "truncate table hornoelectricoygas";
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
            ResultSet resultado = stmt.executeQuery("select * from articulo inner join hornoelectricoygas on (articulo.idarticulo = hornoelectricoygas.idarticulo) inner join marca on marca.idmarca = articulo.idmarca");
            catelec.arreglohornoselectricosygas.clear();
            while (resultado.next()) {
                Hornoselectricosygas temp = new Hornoselectricosygas();
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
                temp.setPotencia(resultado.getString("potencia"));
                temp.setNumbandejas(resultado.getInt("numero_bandejas"));
                temp.setGratinador(resultado.getString("gratinador"));
                temp.setTipocontrol(resultado.getString("tipo_control"));
                temp.setTemperaturamax(resultado.getInt("temperatura_maxima"));
                catelec.arreglohornoselectricosygas.add(temp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


