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
public class CategoriaRopa extends Categorias{

    public CategoriaRopa(int id, String descripcion) {
        super(id, descripcion);
    }

    public CategoriaRopa() {
    }
    
    public static ArrayList<Zapatos> arreglozapatos = new ArrayList<Zapatos>();
    public static ArrayList<VestidosCalle> arreglovestidoscalle = new ArrayList<VestidosCalle>();
    public static ArrayList<Pijamas> arreglopijamas = new ArrayList<Pijamas>();
    public static ArrayList<RopaDeportiva> arregloropadeportiva = new ArrayList<RopaDeportiva>();
}
