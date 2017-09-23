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
public class Hornosmicroondas extends Articulos {
    
    private String capacidad;
    private String compartimiento;
    private String potencia;
    private String voltaje;

    public Hornosmicroondas(String capacidad, String compartimiento, String potencia, String voltaje, int idMarca, int idArticulo, String nombre, int cantidad, float precio, String descripcion, String color, String imagen, Marca mar) {
        super(idMarca, idArticulo, nombre, cantidad, precio, descripcion, color, imagen, mar);
        this.capacidad = capacidad;
        this.compartimiento = compartimiento;
        this.potencia = potencia;
        this.voltaje = voltaje;
    }

    public Hornosmicroondas(String capacidad, String compartimiento, String potencia, String voltaje) {
        this.capacidad = capacidad;
        this.compartimiento = compartimiento;
        this.potencia = potencia;
        this.voltaje = voltaje;
    }

    public Hornosmicroondas() {
    }
    

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getCompartimiento() {
        return compartimiento;
    }

    public void setCompartimiento(String compartimiento) {
        this.compartimiento = compartimiento;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(String voltaje) {
        this.voltaje = voltaje;
    }

    @Override
    public String toString() {
        return "Hornos microondas {" + "id Horno Microondas = "+ idArticulo + ", marca = " + mar + ", id Marca = " + idMarca+ ", id Categoria = "+ idCategoria+", Nombre = "+nombre+", Cantidad = "+cantidad+", Precio = "+precio+", Color = "+color+", Imagen = "+imagen+ ", capacidad = " + capacidad + ", compartimiento = " + compartimiento + ", potencia = " + potencia + ", voltaje = " + voltaje + '}';
    }
    
    
    
}
