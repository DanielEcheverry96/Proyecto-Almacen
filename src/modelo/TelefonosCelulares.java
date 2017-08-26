/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class TelefonosCelulares extends Articulos {

    private String tiprocesador;
    private int tamañodepantalla;
    private int tammemoria;
    private int capalmacenamiento;
    private String tipodepantalla;
    private String interfacered;

    public TelefonosCelulares(String tiprocesador, int tamañodepantalla, int tammemoria, int capalmacenamiento, String tipodepantalla, String interfacered, int idMarca, int idCategoria, int idArticulo, String nombre, int cantidad, float precio, String descripcion, String color, String imagen) {
        super(idMarca, idCategoria, idArticulo, nombre, cantidad, precio, descripcion, color, imagen);
        this.tiprocesador = tiprocesador;
        this.tamañodepantalla = tamañodepantalla;
        this.tammemoria = tammemoria;
        this.capalmacenamiento = capalmacenamiento;
        this.tipodepantalla = tipodepantalla;
        this.interfacered = interfacered;
    }

    public TelefonosCelulares(String tiprocesador, int tamañodepantalla, int tammemoria, int capalmacenamiento, String tipodepantalla, String interfacered) {
        this.tiprocesador = tiprocesador;
        this.tamañodepantalla = tamañodepantalla;
        this.tammemoria = tammemoria;
        this.capalmacenamiento = capalmacenamiento;
        this.tipodepantalla = tipodepantalla;
        this.interfacered = interfacered;
    }

    public TelefonosCelulares() {

    }

    @Override
    public String toString() {
        return "TelefonosCelulares{" + "tiprocesador=" + tiprocesador + ", tama\u00f1odepantalla=" + tamañodepantalla + ", tammemoria=" + tammemoria + ", capalmacenamiento=" + capalmacenamiento + ", tipodepantalla=" + tipodepantalla + ", interfacered=" + interfacered + '}';
    }

}