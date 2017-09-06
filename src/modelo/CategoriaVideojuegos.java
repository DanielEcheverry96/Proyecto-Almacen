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
public class CategoriaVideojuegos extends Categorias {

    public CategoriaVideojuegos(int id, String descripcion) {
        super(id, descripcion);
    }

    public CategoriaVideojuegos() {
    }
    
    public static ArrayList<Juegos> arreglojuegos = new ArrayList<Juegos>();
    public static ArrayList<Consolas> arregloconsolas = new ArrayList<Consolas>();
    
    
}
