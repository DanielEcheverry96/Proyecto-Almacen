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

    public Neveras(String capcongelador, String capfrigorifero, String material, int tamaño, String sistema, int idMarca, int idArticulo, String nombre, int cantidad, float precio, String descripcion, String color, String imagen, Marca mar) {
        super(idMarca, idArticulo, nombre, cantidad, precio, descripcion, color, imagen, mar);
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
        return "Neveras {" + "id Nevera = "+ idArticulo+ ", marca = " + mar + ", Nombre = "+nombre+", Cantidad = "+cantidad+", Precio = "+precio+", Color = "+color+", Imagen = "+imagen+ ", capacidad congelador = " + capcongelador + ", capacidad frigorifico = " + capfrigorifero + ", material = " + material + ", tamaño = " + tamaño + ", sistema = " + sistema + '}';
    }
    
    
    
}
