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
public class TelefonosIp extends Articulos{
    
    private String tipoprocesador;
    private String interfacered;

    public TelefonosIp(String tipoprocesador, String interfacered, int idMarca, int idCategoria, int idArticulo, String nombre, int cantidad, float precio, String descripcion, String color, String imagen) {
        super(idMarca, idCategoria, idArticulo, nombre, cantidad, precio, descripcion, color, imagen);
        this.tipoprocesador = tipoprocesador;
        this.interfacered = interfacered;
    }

    public TelefonosIp(String tipoprocesador, String interfacered) {
        this.tipoprocesador = tipoprocesador;
        this.interfacered = interfacered;
    }
    
    public TelefonosIp() {
    }

    public String getTipoprocesador() {
        return tipoprocesador;
    }

    public void setTipoprocesador(String tipoprocesador) {
        this.tipoprocesador = tipoprocesador;
    }

    public String getInterfacered() {
        return interfacered;
    }

    public void setInterfacered(String interfacered) {
        this.interfacered = interfacered;
    }

    @Override
    public String toString() {
        return "Telefonos Ip {" + "id Telefono ip = "+ idArticulo+ ", id Marca = " + idMarca+ ", id Categoria = "+ idCategoria+", Nombre = "+nombre+", Cantidad = "+cantidad+", Precio = "+precio+", Color = "+color+", Imagen = "+imagen+ ", tipo procesador=" + tipoprocesador + ", interface red=" + interfacered + '}';
    }
        
    
    
}
