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
public class Sierras extends Articulos{
    private String tipo;
    private int potencia;
    private int velocidad;
    private float peso;
    private float diametrodisco;

    public Sierras(String tipo, int potencia, int velocidad, float peso, float diametrodisco, int idMarca, int idCategoria, int idArticulo, String nombre, int cantidad, float precio, String descripcion, String color, String imagen) {
        super(idMarca, idCategoria, idArticulo, nombre, cantidad, precio, descripcion, color, imagen);
        this.tipo = tipo;
        this.potencia = potencia;
        this.velocidad = velocidad;
        this.peso = peso;
        this.diametrodisco = diametrodisco;
    }

    public Sierras(String tipo, int potencia, int velocidad, float peso, float diametrodisco) {
        this.tipo = tipo;
        this.potencia = potencia;
        this.velocidad = velocidad;
        this.peso = peso;
        this.diametrodisco = diametrodisco;
    }

    public Sierras() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getDiametrodisco() {
        return diametrodisco;
    }

    public void setDiametrodisco(float diametrodisco) {
        this.diametrodisco = diametrodisco;
    }

    @Override
    public String toString() {
        return "Sierras{" + "tipo=" + tipo + ", potencia=" + potencia + ", velocidad=" + velocidad + ", peso=" + peso + ", diametrodisco=" + diametrodisco + '}';
    }
    
    
    
}
