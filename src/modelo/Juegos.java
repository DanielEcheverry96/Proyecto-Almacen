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
public class Juegos extends Articulos {
    
    private String genero;
    private String restedad;
    private String plataforma;
    private int numjugadores;

    public Juegos(String genero, String restedad, String plataforma, int numjugadores, int idMarca, int idCategoria, int idArticulo, String nombre, int cantidad, float precio, String descripcion, String color, String imagen) {
        super(idMarca, idCategoria, idArticulo, nombre, cantidad, precio, descripcion, color, imagen);
        this.genero = genero;
        this.restedad = restedad;
        this.plataforma = plataforma;
        this.numjugadores = numjugadores;
    }

    public Juegos(String genero, String restedad, String plataforma, int numjugadores) {
        this.genero = genero;
        this.restedad = restedad;
        this.plataforma = plataforma;
        this.numjugadores = numjugadores;
    }

    public Juegos() {
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRestedad() {
        return restedad;
    }

    public void setRestedad(String restedad) {
        this.restedad = restedad;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getNumjugadores() {
        return numjugadores;
    }

    public void setNumjugadores(int numjugadores) {
        this.numjugadores = numjugadores;
    }

    @Override
    public String toString() {
        return "Juegos{" + "genero=" + genero + ", restedad=" + restedad + ", plataforma=" + plataforma + ", numjugadores=" + numjugadores + '}';
    }
    
    
}
