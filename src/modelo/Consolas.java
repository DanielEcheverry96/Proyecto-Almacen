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
public class Consolas extends Articulos {
    
    private String tipo;
    private int numcontroles;
    private String realidadvir;
    private String capdiscoduro;

    public Consolas(String tipo, int numcontroles, String realidadvir, String capdiscoduro, int idMarca, int idCategoria, int idArticulo, String nombre, int cantidad, float precio, String descripcion, String color, String imagen) {
        super(idMarca, idCategoria, idArticulo, nombre, cantidad, precio, descripcion, color, imagen);
        this.tipo = tipo;
        this.numcontroles = numcontroles;
        this.realidadvir = realidadvir;
        this.capdiscoduro = capdiscoduro;
    }

    public Consolas(String tipo, int numcontroles, String realidadvir, String capdiscoduro) {
        this.tipo = tipo;
        this.numcontroles = numcontroles;
        this.realidadvir = realidadvir;
        this.capdiscoduro = capdiscoduro;
    }

    public Consolas() {
    }
    
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumcontroles() {
        return numcontroles;
    }

    public void setNumcontroles(int numcontroles) {
        this.numcontroles = numcontroles;
    }

    public String getRealidadvir() {
        return realidadvir;
    }

    public void setRealidadvir(String realidadvir) {
        this.realidadvir = realidadvir;
    }

    public String getCapdiscoduro() {
        return capdiscoduro;
    }

    public void setCapdiscoduro(String capdiscoduro) {
        this.capdiscoduro = capdiscoduro;
    }

    @Override
    public String toString() {
        return "Consolas {" + "id Consola = "+ idArticulo+ ", id Marca = " + idMarca+ ", id Categoria = "+ idCategoria+", Nombre = "+nombre+", Cantidad = "+cantidad+", Precio = "+precio+", Color = "+color+", Imagen = "+imagen+ ", tipo =" + tipo + ", número controles = " + numcontroles + ", realidad virtual = " + realidadvir + ", capacidad discoduro = " + capdiscoduro + '}';
    }
    
    
}
