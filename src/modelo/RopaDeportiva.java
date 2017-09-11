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
public class RopaDeportiva extends Trajes{

    public RopaDeportiva(String tipo, String talla, String tipousuario, int idMarca, int idCategoria, int idArticulo, String nombre, int cantidad, float precio, String descripcion, String color, String imagen) {
        super(tipo, talla, tipousuario, idMarca, idCategoria, idArticulo, nombre, cantidad, precio, descripcion, color, imagen);
    }

    public RopaDeportiva(String tipo, String talla, String tipousuario) {
        super(tipo, talla, tipousuario);
    }

    public RopaDeportiva() {
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
        return "Ropa Deportiva{" + "id Ropa deportiva = " + idArticulo+ ", id Marca = " + idMarca+ ", id Categoria = "+ idCategoria+", Nombre = "+nombre+", Cantidad = "+cantidad+", Precio = "+precio+", Color = "+color+", Imagen = "+ imagen + ", Tipo = " +getTipo() + ", Talla = " + getTalla() + ", Tipo usuario = " + getTipousuario() + '}';
    }
    
    
}
