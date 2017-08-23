/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Unalman
 */
public class Articulos implements Comparable<Articulos> {

    private int idMarca;
    private int idCategoria;
    private int idArticulo;
    private String nombre;
    private int cantidad;
    private float precio;
    private String descripcion;
    private String color;
    private String imagen;

    public Articulos(int idMarca, int idCategoria, int idArticulo, String nombre, int cantidad, float precio, String descripcion, String color, String imagen) {
        this.idMarca = idMarca;
        this.idCategoria = idCategoria;
        this.idArticulo = idArticulo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descripcion = descripcion;
        this.color = color;
        this.imagen = imagen;
    }

    public Articulos() {
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Articulos{" + "idMarca=" + idMarca + ", idCategoria=" + idCategoria + ", idArticulo=" + idArticulo + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + ", descripcion=" + descripcion + ", color=" + color + ", imagen=" + imagen + '}';
    }

    @Override
    public int compareTo(Articulos t) {
        return this.idArticulo - t.getIdArticulo();
    }

}
