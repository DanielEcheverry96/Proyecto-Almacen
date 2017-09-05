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
public class Neveras extends Articulos {
    
    private String capcongelador;
    private String capfrigorifero;
    private String material;
    private float tamaño;
    private String sistema;

    public Neveras(String capcongelador, String capfrigorifero, String material, int tamaño, String sistema, int idMarca, int idCategoria, int idArticulo, String nombre, int cantidad, float precio, String descripcion, String color, String imagen) {
        super(idMarca, idCategoria, idArticulo, nombre, cantidad, precio, descripcion, color, imagen);
        this.capcongelador = capcongelador;
        this.capfrigorifero = capfrigorifero;
        this.material = material;
        this.tamaño = tamaño;
        this.sistema = sistema;
    }

    public Neveras(String capcongelador, String capfrigorifero, String material, int tamaño, String sistema) {
        this.capcongelador = capcongelador;
        this.capfrigorifero = capfrigorifero;
        this.material = material;
        this.tamaño = tamaño;
        this.sistema = sistema;
    }

    public Neveras() {
    }

    public String getCapcongelador() {
        return capcongelador;
    }

    public void setCapcongelador(String capcongelador) {
        this.capcongelador = capcongelador;
    }

    public String getCapfrigorifero() {
        return capfrigorifero;
    }

    public void setCapfrigorifero(String capfrigorifero) {
        this.capfrigorifero = capfrigorifero;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    @Override
    public String toString() {
        return "Neveras{" + "capcongelador=" + capcongelador + ", capfrigorifero=" + capfrigorifero + ", material=" + material + ", tama\u00f1o=" + tamaño + ", sistema=" + sistema + '}';
    }
    
    
    
}
