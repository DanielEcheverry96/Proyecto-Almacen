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
public class Bicicletas extends Articulos {
    
    private int tamaniorueda;
    private String material;
    private String tipo;

    public Bicicletas(int tamaniorueda, String material, String tipo, int idMarca, int idArticulo, String nombre, int cantidad, float precio, String descripcion, String color, String imagen, Marca mar) {
        super(idMarca, idArticulo, nombre, cantidad, precio, descripcion, color, imagen, mar);
        this.tamaniorueda = tamaniorueda;
        this.material = material;
        this.tipo = tipo;
    }

    public Bicicletas(int tamaniorueda, String material, String tipo) {
        this.tamaniorueda = tamaniorueda;
        this.material = material;
        this.tipo = tipo;
    }

    public Bicicletas() {
    }

    public int getTamaniorueda() {
        return tamaniorueda;
    }

    public void setTamaniorueda(int tamaniorueda) {
        this.tamaniorueda = tamaniorueda;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Bicicletas {" + "id Bicicleta = "+ idArticulo +", marca = " + mar + ", id Marca = " + idMarca + ", Nombre = "+nombre+", Cantidad = "+cantidad+", Precio = "+precio+", Color = "+color+", Imagen = "+imagen+ ", tamaño rueda = " + tamaniorueda + ", material = " + material + ", tipo = " + tipo + '}';
    }
    
    
}
