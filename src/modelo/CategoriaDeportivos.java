/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author BP-LABREDES00
 */
public class CategoriaDeportivos extends Categorias{

    public CategoriaDeportivos(int id, String descripcion) {
        super(id, descripcion);
    }

    public CategoriaDeportivos() {
    }
    
    public static ArrayList<Raquetas> arregloraquetas = new ArrayList<Raquetas>(); 
    public static ArrayList<Bicicletas> arreglobicicletas = new ArrayList<Bicicletas>();
}
