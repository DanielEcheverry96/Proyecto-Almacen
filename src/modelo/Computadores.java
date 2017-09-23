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
public class Computadores extends Articulos {

    private String capmemoria;
    private String tipoteclado;
    private String tipomouse;
    private String tipopantalla;
    private int capalmacenamiento;

    public Computadores(String capmemoria, String tipoteclado, String tipomouse, String tipopantalla, int capalmacenamiento, int idMarca, int idArticulo, String nombre, int cantidad, float precio, String descripcion, String color, String imagen, Marca mar) {
        super(idMarca, idArticulo, nombre, cantidad, precio, descripcion, color, imagen, mar);
        this.capmemoria = capmemoria;
        this.tipoteclado = tipoteclado;
        this.tipomouse = tipomouse;
        this.tipopantalla = tipopantalla;
        this.capalmacenamiento = capalmacenamiento;
    }

    public Computadores(String capmemoria, String tipoteclado, String tipomouse, String tipopantalla, int capalmacenamiento) {
        this.capmemoria = capmemoria;
        this.tipoteclado = tipoteclado;
        this.tipomouse = tipomouse;
        this.tipopantalla = tipopantalla;
        this.capalmacenamiento = capalmacenamiento;
    }

    public Computadores() {

    }

    public String getCapmemoria() {
        return capmemoria;
    }

    public void setCapmemoria(String capmemoria) {
        this.capmemoria = capmemoria;
    }

    public String getTipoteclado() {
        return tipoteclado;
    }

    public void setTipoteclado(String tipoteclado) {
        this.tipoteclado = tipoteclado;
    }

    public String getTipomouse() {
        return tipomouse;
    }

    public void setTipomouse(String tipomouse) {
        this.tipomouse = tipomouse;
    }

    public String getTipopantalla() {
        return tipopantalla;
    }

    public void setTipopantalla(String tipopantalla) {
        this.tipopantalla = tipopantalla;
    }

    public int getCapalmacenamiento() {
        return capalmacenamiento;
    }

    public void setCapalmacenamiento(int capalmacenamiento) {
        this.capalmacenamiento = capalmacenamiento;
    }

    @Override
    public String toString() {
        return "Computadores {" + "id Computador = "+ idArticulo +", marca = " + mar + ", id Marca = "+ idMarca + ", id Categoria = "+ idCategoria +", Nombre = "+nombre+", Cantidad = "+cantidad+", Precio = "+precio+", Color = "+color+", Imagen = "+imagen+ ", capacidad memoria = " + capmemoria + ", tipo teclado = " + tipoteclado + ", tipo mouse = " + tipomouse + ", tipo pantalla = " + tipopantalla + '}';
    }

}
