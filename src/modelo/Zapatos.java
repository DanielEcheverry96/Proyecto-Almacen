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
    
    private int tipozapato;
    private int tallanumerica;
    private int tipousuario;

    public Zapatos(int tipozapato, int tallanumerica, int tipousuario, int idMarca, int idCategoria, int idArticulo, String nombre, int cantidad, float precio, String descripcion, String color, String imagen) {
        super(idMarca, idCategoria, idArticulo, nombre, cantidad, precio, descripcion, color, imagen);
        this.tipozapato = tipozapato;
        this.tallanumerica = tallanumerica;
        this.tipousuario = tipousuario;
    }

    public Zapatos(int tipozapato, int tallanumerica, int tipousuario) {
        this.tipozapato = tipozapato;
        this.tallanumerica = tallanumerica;
        this.tipousuario = tipousuario;
    }

    public Zapatos() {
    }

    public int getTipozapato() {
        return tipozapato;
    }

    public void setTipozapato(int tipozapato) {
        this.tipozapato = tipozapato;
    }

    public int getTallanumerica() {
        return tallanumerica;
    }

    public void setTallanumerica(int tallanumerica) {
        this.tallanumerica = tallanumerica;
    }

    public int getTipousuario() {
        return tipousuario;
    }

    public void setTipousuario(int tipousuario) {
        this.tipousuario = tipousuario;
    }

    @Override
    public String toString() {
        return "Zapatos{" + "tipozapato=" + tipozapato + ", tallanumerica=" + tallanumerica + ", tipousuario=" + tipousuario + '}';
    }
    
    
    
}
