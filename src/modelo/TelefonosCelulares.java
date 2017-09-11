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

    public String getTiprocesador() {
        return tiprocesador;
    }

    public void setTiprocesador(String tiprocesador) {
        this.tiprocesador = tiprocesador;
    }

    public int getTamañodepantalla() {
        return tamañodepantalla;
    }

    public void setTamañodepantalla(int tamañodepantalla) {
        this.tamañodepantalla = tamañodepantalla;
    }

    public int getTammemoria() {
        return tammemoria;
    }

    public void setTammemoria(int tammemoria) {
        this.tammemoria = tammemoria;
    }

    public int getCapalmacenamiento() {
        return capalmacenamiento;
    }

    public void setCapalmacenamiento(int capalmacenamiento) {
        this.capalmacenamiento = capalmacenamiento;
    }

    public String getTipodepantalla() {
        return tipodepantalla;
    }

    public void setTipodepantalla(String tipodepantalla) {
        this.tipodepantalla = tipodepantalla;
    }

    public String getInterfacered() {
        return interfacered;
    }

    public void setInterfacered(String interfacered) {
        this.interfacered = interfacered;
    }
    
    @Override
    public String toString() {
        return "Telefonos Celulares {" + "id Telefono celular = "+ idArticulo+ ", id Marca = " + idMarca+ ", id Categoria = "+ idCategoria+", Nombre = "+nombre+", Cantidad = "+cantidad+", Precio = "+precio+", Color = "+color+", Imagen = "+imagen+ ", tipo procesador = " + tiprocesador + ", tamaño de pantalla = " + tamañodepantalla + ", tamaño memoria = " + tammemoria + ", capacidad almacenamiento = " + capalmacenamiento + ", tipo de pantalla = " + tipodepantalla + ", interface red = " + interfacered + '}';
    }

}
