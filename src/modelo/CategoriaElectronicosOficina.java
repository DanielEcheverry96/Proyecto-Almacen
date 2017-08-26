/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class CategoriaElectronicosOficina extends Categorias {

    public CategoriaElectronicosOficina(int id, String descripcion) {
        super(id, descripcion);
    }

    public CategoriaElectronicosOficina() {
    }

    public static ArrayList<Computadores> arreglocomputadores
            = new ArrayList<Computadores>();
}
