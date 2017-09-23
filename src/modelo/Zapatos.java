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
public class Zapatos extends Articulos{
    
    private String tipozapato;
    private int tallanumerica;
    private String tipousuario;

    public Zapatos(String tipozapato, int tallanumerica, String tipousuario, int idMarca, int idArticulo, String nombre, int cantidad, float precio, String descripcion, String color, String imagen, Marca mar) {
        super(idMarca, idArticulo, nombre, cantidad, precio, descripcion, color, imagen, mar);
        this.tipozapato = tipozapato;
        this.tallanumerica = tallanumerica;
        this.tipousuario = tipousuario;
    }

    public Zapatos(String tipozapato, int tallanumerica, String tipousuario) {
        this.tipozapato = tipozapato;
        this.tallanumerica = tallanumerica;
        this.tipousuario = tipousuario;
    }

    public Zapatos() {
    }

    public String getTipozapato() {
        return tipozapato;
    }

    public void setTipozapato(String tipozapato) {
        this.tipozapato = tipozapato;
    }

    public int getTallanumerica() {
        return tallanumerica;
    }

    public void setTallanumerica(int tallanumerica) {
        this.tallanumerica = tallanumerica;
    }

    public String getTipousuario() {
        return tipousuario;
    }

    public void setTipousuario(String tipousuario) {
        this.tipousuario = tipousuario;
    }

    @Override
    public String toString() {
        return "Zapatos {" + "id Zapato = "+ idArticulo+ ", marca = " + mar + ", id Marca = " + idMarca+ ", id Categoria = "+ idCategoria+", Nombre = "+nombre+", Cantidad = "+cantidad+", Precio = "+precio+", Color = "+color+", Imagen = "+imagen+ ", tipo zapato = " + tipozapato + ", talla numerica = " + tallanumerica + ", tipo usuario = " + tipousuario + '}';
    }
    
    
    
}
