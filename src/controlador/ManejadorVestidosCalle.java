/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.CategoriaRopa;
import modelo.VestidosCalle;

/**
 *
 * @author danie
 */
public class ManejadorVestidosCalle implements ICRUD {

    CategoriaRopa catrop = new CategoriaRopa();
    
    private boolean existevestidoscalle(VestidosCalle vesca) {
        boolean existe = false;
        if (catrop.arreglovestidoscalle.contains(vesca)) {
            existe = true;
        }
        return existe;
    }
    @Override
    public boolean insertar(Object obj) {
        boolean inserto = false;
        if (obj instanceof VestidosCalle) {
            VestidosCalle vesca = new VestidosCalle();
            vesca = (VestidosCalle) obj;
            if (!existevestidoscalle(vesca)) {
                catrop.arreglovestidoscalle.add(vesca);
                inserto = true;
            }
            return inserto;
        }
        return inserto;
    }

    @Override
    public boolean modificar(int posicion, Object obj) {
        boolean var = false;
        if (obj instanceof VestidosCalle) {
            VestidosCalle temp = new VestidosCalle();
            temp = (VestidosCalle) obj;
            catrop.arreglovestidoscalle.set(posicion, temp);
            var = true;
        }
        return var;
    }

    @Override
    public int busquedaBinaria(int id) {
        Collections.sort(CategoriaRopa.arreglovestidoscalle);
        int n = CategoriaRopa.arreglovestidoscalle.size();
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (CategoriaRopa.arreglovestidoscalle.get(centro).getIdArticulo() == id) {
                return centro;

            } else if (id < CategoriaRopa.arreglovestidoscalle.get(centro).getIdArticulo()) {
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
        VestidosCalle resultado = new VestidosCalle();
            resultado = catrop.arreglovestidoscalle.get(busquedaBinaria(id));
            return resultado;
        }
        return null;
    }

    @Override
    public boolean borrar(int id) {
        
        int posicion = busquedaBinaria(id);
        if (!(posicion==-1)) {
            catrop.arreglovestidoscalle.remove(posicion);
            return true;
        }
        
        return false;
    }

    @Override
    public boolean borrarTodo() {
        catrop.arreglovestidoscalle.clear();
        return true;
    }

    @Override
    public ArrayList consultarTodos() {
        System.out.println(CategoriaRopa.arreglovestidoscalle.toString());
        return CategoriaRopa.arreglovestidoscalle; 
    }
    
}
