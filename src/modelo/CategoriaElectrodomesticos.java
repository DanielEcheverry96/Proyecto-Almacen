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
public class CategoriaElectrodomesticos extends Categorias {

    public CategoriaElectrodomesticos(int id, String descripcion) {
        super(id, descripcion);
    }

    public CategoriaElectrodomesticos() {
    }
    
    public static ArrayList<Neveras> arregloneveras = new ArrayList<Neveras>();
    public static ArrayList<Televisores> arreglotelevisores = new ArrayList<Televisores>();
    public static ArrayList<Hornoselectricosygas> arreglohornoselectricosygas = new ArrayList<Hornoselectricosygas>();
    public static ArrayList<Hornosmicroondas> arreglohornosmicroondas = new ArrayList<Hornosmicroondas>();
}
