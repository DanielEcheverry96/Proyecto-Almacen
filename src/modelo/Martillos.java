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
public class Martillos extends Articulos {
    
    private String matmango;
    private String matcabezal;
    private int peso;
    private String tamaño;
    private String tipo;

    public Martillos(String matmango, String matcabezal, int peso, String tamaño, String tipo, int idMarca, int idArticulo, String nombre, int cantidad, float precio, String descripcion, String color, String imagen, Marca mar) {
        super(idMarca, idArticulo, nombre, cantidad, precio, descripcion, color, imagen, mar);
        this.matmango = matmango;
        this.matcabezal = matcabezal;
        this.peso = peso;
        this.tamaño = tamaño;
        this.tipo = tipo;
    }

    public Martillos(String matmango, String matcabezal, int peso, String tamaño, String tipo) {
        this.matmango = matmango;
        this.matcabezal = matcabezal;
        this.peso = peso;
        this.tamaño = tamaño;
        this.tipo = tipo;
    }

    public Martillos() {
    }

    public String getMatmango() {
        return matmango;
    }

    public void setMatmango(String matmango) {
        this.matmango = matmango;
    }

    public String getMatcabezal() {
        return matcabezal;
    }

    public void setMatcabezal(String matcabezal) {
        this.matcabezal = matcabezal;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Martillos {" + "id Martillo = "+ idArticulo+ ", marca = " + mar + ", id Marca = " + idMarca+ ", id Categoria = "+ idCategoria+", Nombre = "+nombre+", Cantidad = "+cantidad+", Precio = "+precio+", Color = "+color+", Imagen = "+imagen+ ", material mango = " + matmango + ", material cabezal = " + matcabezal + ", peso = " + peso + ", tamaño = " + tamaño + ", tipo = " + tipo + '}';
    }
    
    
    
}
