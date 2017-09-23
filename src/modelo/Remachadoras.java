/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Daniel
 */
public class Remachadoras extends Articulos {
    
    private String potencia;
    private String tiporemache;
    private double calibre;

    public Remachadoras(String potencia, String tiporemache, double calibre, int idMarca, int idArticulo, String nombre, int cantidad, float precio, String descripcion, String color, String imagen, Marca mar) {
        super(idMarca, idArticulo, nombre, cantidad, precio, descripcion, color, imagen, mar);
        this.potencia = potencia;
        this.tiporemache = tiporemache;
        this.calibre = calibre;
    }

    public Remachadoras(String potencia, String tiporemache, double calibre) {
        this.potencia = potencia;
        this.tiporemache = tiporemache;
        this.calibre = calibre;
    }

    public Remachadoras() {
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getTiporemache() {
        return tiporemache;
    }

    public void setTiporemache(String tiporemache) {
        this.tiporemache = tiporemache;
    }

    public double getCalibre() {
        return calibre;
    }

    public void setCalibre(double calibre) {
        this.calibre = calibre;
    }

    @Override
    public String toString() {
        return "Remachadoras {" + "id Remachadora = "+ idArticulo+ ", marca = " + mar + ", id Marca = " + idMarca+ ", id Categoria = "+ idCategoria+", Nombre = "+nombre+", Cantidad = "+cantidad+", Precio = "+precio+", Color = "+color+", Imagen = "+imagen+ ", potencia = " + potencia + ", tipo remache = " + tiporemache + ", calibre = " + calibre + '}';
    }
    
    
}
