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
public class Impresores extends Articulos{
    
    private String tipo;
    private String interfacered;
    private int paginasminuto;
    private String resolucion;

    public Impresores(String tipo, String interfacered, int paginasminuto, String resolucion, int idMarca, int idCategoria, int idArticulo, String nombre, int cantidad, float precio, String descripcion, String color, String imagen) {
        super(idMarca, idCategoria, idArticulo, nombre, cantidad, precio, descripcion, color, imagen);
        this.tipo = tipo;
        this.interfacered = interfacered;
        this.paginasminuto = paginasminuto;
        this.resolucion = resolucion;
    }

    public Impresores(String tipo, String interfacered, int paginasminuto, String resolucion) {
        this.tipo = tipo;
        this.interfacered = interfacered;
        this.paginasminuto = paginasminuto;
        this.resolucion = resolucion;
    }

    public Impresores() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getInterfacered() {
        return interfacered;
    }

    public void setInterfacered(String interfacered) {
        this.interfacered = interfacered;
    }

    public int getPaginasminuto() {
        return paginasminuto;
    }

    public void setPaginasminuto(int paginasminuto) {
        this.paginasminuto = paginasminuto;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public String toString() {
        return "Impresores{" + "tipo=" + tipo + ", interfacered=" + interfacered + ", paginasminuto=" + paginasminuto + ", resolucion=" + resolucion + '}';
    }
    
    
}
