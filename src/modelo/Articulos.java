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

    protected int idMarca;
    protected int idCategoria;
    protected int idArticulo;
    protected String nombre;
    protected int cantidad;
    protected float precio;
    protected String descripcion;
    protected String color;
    protected String imagen;
    protected Marca mar;

    public Articulos(int idMarca, int idArticulo, String nombre, int cantidad, float precio, String descripcion, String color, String imagen, Marca mar) {
        this.idMarca = idMarca;
        this.idArticulo = idArticulo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descripcion = descripcion;
        this.color = color;
        this.imagen = imagen;
        this.mar = mar;
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

    public Marca getMar() {
        return mar;
    }

    public void setMar(Marca mar) {
        this.mar = mar;
    }
    
    
    @Override
    public String toString() {
        return "Articulos {" + "id Marca = " + idMarca + ", id Articulo = " + idArticulo + ", nombre = " + nombre + ", cantidad = " + cantidad + ", precio = " + precio + ", descripcion = " + descripcion + ", color = " + color + ", imagen = " + imagen + ", marca = "+ mar + '}';
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Articulos other = (Articulos) obj;
        if (this.idArticulo != other.idArticulo) {
            return false;
        }
        return true;
    }
    
    @Override
    public int compareTo(Articulos t) {
        return this.idArticulo - t.getIdArticulo();
    }

}
