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
public class Trajes extends Articulos{
    protected String tipo;
    protected String talla;
    protected String tipousuario;

    public Trajes(String tipo, String talla, String tipousuario, int idMarca, int idCategoria, int idArticulo, String nombre, int cantidad, float precio, String descripcion, String color, String imagen) {
        super(idMarca, idCategoria, idArticulo, nombre, cantidad, precio, descripcion, color, imagen);
        this.tipo = tipo;
        this.talla = talla;
        this.tipousuario = tipousuario;
    }

    public Trajes(String tipo, String talla, String tipousuario) {
        this.tipo = tipo;
        this.talla = talla;
        this.tipousuario = tipousuario;
    }

    public Trajes() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTipousuario() {
        return tipousuario;
    }

    public void setTipousuario(String tipousuario) {
        this.tipousuario = tipousuario;
    }

    @Override
    public String toString() {
        return "Trajes{" + "tipo=" + tipo + ", talla=" + talla + ", tipousuario=" + tipousuario + '}';
    }
    
    
}
