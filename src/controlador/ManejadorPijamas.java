/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.CategoriaRopa;
import modelo.Pijamas;

/**
 *
 * @author danie
 */
public class ManejadorPijamas implements ICRUD{
    
    CategoriaRopa catrop = new CategoriaRopa();
    
    private boolean existepijama(Pijamas pijam) {
        boolean existe = false;
        if (catrop.arreglopijamas.contains(pijam)) {
            existe = true;
        }
        return existe;
    }
    
    @Override
    public boolean insertar(Object obj) {
       boolean inserto = false;
        if (obj instanceof Pijamas) {
            Pijamas pijam = new Pijamas();
            pijam = (Pijamas) obj;
            if (!existepijama(pijam)) {
                catrop.arreglopijamas.add(pijam);
                inserto = true;
            }
            return inserto;
        }
        return inserto;
    }

    @Override
    public boolean modificar(int posicion, Object obj) {
        boolean var = false;
        if (obj instanceof Pijamas) {
            Pijamas temp = new Pijamas();
            temp = (Pijamas) obj;
            catrop.arreglopijamas.set(posicion, temp);
            var = true;
        }
        return var;
    }

    @Override
    public int busquedaBinaria(int id) {
        Collections.sort(CategoriaRopa.arreglopijamas);
        int n = CategoriaRopa.arreglopijamas.size();
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (CategoriaRopa.arreglopijamas.get(centro).getIdArticulo() == id) {
                return centro;

            } else if (id < CategoriaRopa.arreglopijamas.get(centro).getIdArticulo()) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        return -1;
        
    }

    @Override
    public Object consultarId(int id) {
        if (!(busquedaBinaria(id) == -1)){
        Pijamas resultado = new Pijamas();
            resultado = catrop.arreglopijamas.get(busquedaBinaria(id));
            return resultado;
        }
        return null;
    }

    @Override
    public boolean borrar(int id) {
        
        int posicion = busquedaBinaria(id);
        if (!(posicion==-1)) {
            catrop.arreglopijamas.remove(posicion);
            return true;
        }
        
        return false;
    }

    @Override
    public boolean borrarTodo() {
         catrop.arreglopijamas.clear();
        return true;
    }

    @Override
    public ArrayList consultarTodos() {
        System.out.println(CategoriaRopa.arreglopijamas.toString());
        return CategoriaRopa.arreglopijamas; 
    }
    
}
