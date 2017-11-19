/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author danie
 */
public class CategoriaArticulo extends Articulos {

    private int idcategoria;
    private String nombrecat;

    public CategoriaArticulo(int idcategoria, String nombrecat, int idMarca, int idArticulo, String nombre, int cantidad, float precio, String descripcion, String color, String imagen, Marca mar) {
        super(idMarca, idArticulo, nombre, cantidad, precio, descripcion, color, imagen, mar);
        this.idcategoria = idcategoria;
        this.nombre = nombrecat;
    }

    public CategoriaArticulo(int idcategoria, String nombre) {
        this.idcategoria = idcategoria;
        this.descripcion = descripcion;
    }

    public CategoriaArticulo() {
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getNombrecat() {
        return nombrecat;
    }

    public void setNombrecat(String nombrecat) {
        this.nombrecat = nombrecat;
    }

    @Override
    public String toString() {
        return "id categoria=" + idcategoria + ", nombre categoria=" + nombrecat;
    }

}
