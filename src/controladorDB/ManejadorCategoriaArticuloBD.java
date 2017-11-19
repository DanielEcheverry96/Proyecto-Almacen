/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorDB;

import controlador.ManejadorCategoriaArticulo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import modelo.CategoriaArticulo;
import modelo.Marca;

/**
 *
 * @author danie
 */
public class ManejadorCategoriaArticuloBD {

    Connection conpost;

    public void consultarTodasCategorias() {
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        Statement stmt;
        try {
            stmt = conpost.createStatement();
            ResultSet resultado = stmt.executeQuery("select categoria.idcategoria, descripcion_categoria,idarticulo,nombrearticulo,cantidad,color,precio,imagen,articulo.idmarca, marca.descripcion from categoria inner join articulo on articulo.idcategoria = categoria.idcategoria inner join marca on articulo.idmarca = marca.idmarca");
            ManejadorCategoriaArticulo.arreglocategoriaarticulo.clear();
            while (resultado.next()) {
                CategoriaArticulo temp = new CategoriaArticulo();
                Marca mar = new Marca();
                temp.setIdcategoria(resultado.getInt("idcategoria"));
                temp.setNombrecat(resultado.getString("descripcion_categoria"));
                temp.setIdArticulo(resultado.getInt("idarticulo"));
                mar.setId(resultado.getInt("idmarca"));
                mar.setDescripcion(resultado.getString("descripcion"));
                temp.setMar(mar);
                temp.setNombre(resultado.getString("nombrearticulo"));
                temp.setCantidad(resultado.getInt("cantidad"));
                temp.setPrecio(resultado.getFloat("precio"));
                temp.setColor(resultado.getString("color"));
                temp.setImagen(resultado.getString("imagen"));
                ManejadorCategoriaArticulo.arreglocategoriaarticulo.add(temp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void consultarTodosArticulosCategorias(int id) {
        ConexionDB connDB = new ConexionDB();
        conpost = connDB.posgresConn();
        Statement stmt;
        try {
            stmt = conpost.createStatement();
            ResultSet resultado = stmt.executeQuery("select categoria.idcategoria, descripcion_categoria,idarticulo,nombrearticulo,cantidad,color,precio,imagen,articulo.idmarca, marca.descripcion from categoria inner join articulo on articulo.idcategoria = categoria.idcategoria inner join marca on articulo.idmarca = marca.idmarca where categoria.idcategoria = " + id + "");
            ManejadorCategoriaArticulo.arreglocategoriaarticulo.clear();
            while (resultado.next()) {
                CategoriaArticulo temp = new CategoriaArticulo();
                Marca mar = new Marca();
                temp.setIdcategoria(resultado.getInt("idcategoria"));
                temp.setNombrecat(resultado.getString("descripcion_categoria"));
                temp.setIdArticulo(resultado.getInt("idarticulo"));
                mar.setId(resultado.getInt("idmarca"));
                mar.setDescripcion(resultado.getString("descripcion"));
                temp.setMar(mar);
                temp.setNombre(resultado.getString("nombrearticulo"));
                temp.setCantidad(resultado.getInt("cantidad"));
                temp.setPrecio(resultado.getFloat("precio"));
                temp.setColor(resultado.getString("color"));
                temp.setImagen(resultado.getString("imagen"));
                ManejadorCategoriaArticulo.arreglocategoriaarticulo.add(temp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
