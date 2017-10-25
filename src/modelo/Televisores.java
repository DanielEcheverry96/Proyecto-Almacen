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
public class Televisores extends Articulos {
    
    private String tipotelevisor;
    private int tampantalla;
    private String tipopantalla;
    private String resolucion;

    public Televisores(String tipotelevisor, int tampantalla, String tipopantalla, String resolucion, int idMarca, int idArticulo, String nombre, int cantidad, float precio, String descripcion, String color, String imagen, Marca mar) {
        super(idMarca, idArticulo, nombre, cantidad, precio, descripcion, color, imagen, mar);
        this.tipotelevisor = tipotelevisor;
        this.tampantalla = tampantalla;
        this.tipopantalla = tipopantalla;
        this.resolucion = resolucion;
    }

    public Televisores(String tipotelevisor, int tampantalla, String tipopantalla, String resolucion) {
        this.tipotelevisor = tipotelevisor;
        this.tampantalla = tampantalla;
        this.tipopantalla = tipopantalla;
        this.resolucion = resolucion;
    }

    public Televisores() {
    }

    public String getTipotelevisor() {
        return tipotelevisor;
    }

    public void setTipotelevisor(String tipotelevisor) {
        this.tipotelevisor = tipotelevisor;
    }

    public int getTampantalla() {
        return tampantalla;
    }

    public void setTampantalla(int tampantalla) {
        this.tampantalla = tampantalla;
    }

    public String getTipopantalla() {
        return tipopantalla;
    }

    public void setTipopantalla(String tipopantalla) {
        this.tipopantalla = tipopantalla;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public String toString() {
        return "Televisores {" + "id Televisor = "+ idArticulo+ ", marca = " + mar + ", Nombre = "+nombre+", Cantidad = "+cantidad+", Precio = "+precio+", Color = "+color+", Imagen = "+imagen+ ", tipo televisor = " + tipotelevisor + ", tamaño pantalla = " + tampantalla + ", tipo pantalla = " + tipopantalla + ", resolucion = " + resolucion + '}';
    }
    
    
    
}
