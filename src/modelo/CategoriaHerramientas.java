/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class CategoriaHerramientas extends Categorias {

    public CategoriaHerramientas(int id, String descripcion) {
        super(id, descripcion);
    }

    public CategoriaHerramientas() {
    }
    
    public static ArrayList<Martillos> arreglomartillos = new ArrayList<Martillos>();
    public static ArrayList<Remachadoras> arregloremachadoras = new ArrayList<Remachadoras>();
    public static ArrayList<Sierras> arreglosierras = new ArrayList<Sierras>();
}
