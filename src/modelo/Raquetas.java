/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author BP-LABREDES00
 */
public class Raquetas extends Articulos{
    
    private String tipomarco;
    private int longitud;
    private float ancho;
    private float peso;

    public Raquetas(String tipomarco, int longitud, float ancho, float peso, int idMarca, int idArticulo, String nombre, int cantidad, float precio, String descripcion, String color, String imagen, Marca mar) {
        super(idMarca, idArticulo, nombre, cantidad, precio, descripcion, color, imagen, mar);
        this.tipomarco = tipomarco;
        this.longitud = longitud;
        this.ancho = ancho;
        this.peso = peso;
    }

    public Raquetas(String tipomarco, int longitud, float ancho, float peso) {
        this.tipomarco = tipomarco;
        this.longitud = longitud;
        this.ancho = ancho;
        this.peso = peso;
    }

    public Raquetas() {
    }

    public String getTipomarco() {
        return tipomarco;
    }

    public void setTipomarco(String tipomarco) {
        this.tipomarco = tipomarco;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Raquetas {" + "id Raqueta = "+ idArticulo+ ", marca = " + mar + ", id Marca = " + idMarca+ ", id Categoria = "+ idCategoria+", Nombre = "+nombre+", Cantidad = "+cantidad+", Precio = "+precio+", Color = "+color+", Imagen = "+imagen+ ", tipo marco = " + tipomarco + ", longitud = " + longitud + ", ancho = " + ancho + ", peso = " + peso + '}';
    }
    
    
    
    
}
