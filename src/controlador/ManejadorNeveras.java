/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.CategoriaElectrodomesticos;
import modelo.Neveras;

/**
 *
 * @author Daniel
 */
public class ManejadorNeveras implements ICRUD {
    CategoriaElectrodomesticos catedom = new CategoriaElectrodomesticos();
    
    private boolean existenevera(Neveras nev) {
        boolean existe = false;
        if (catedom.arregloneveras.contains(nev)) {
            existe = true;
        }
        return existe;
    }

    @Override
    public boolean insertar(Object obj) {
        boolean inserto = false;
        if (obj instanceof Neveras) {
            Neveras nev = new Neveras();
            nev = (Neveras) obj;
            if (!existenevera(nev)) {
                catedom.arregloneveras.add(nev);
                inserto=true;
            }
            return inserto;
        }
        return inserto;
    }

    public boolean modificar(int id, Object obj) {
        boolean var = false;
        if (obj instanceof Neveras) {
            Neveras temp = new Neveras();
            temp = (Neveras) obj;
            catedom.arregloneveras.set(id, temp);
            var = true;
        }
        return var;
    }

    @Override
    public int busquedaBinaria(int id) {
    Collections.sort(CategoriaElectrodomesticos.arregloneveras);
        int n = CategoriaElectrodomesticos.arregloneveras.size();
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (CategoriaElectrodomesticos.arregloneveras.get(centro).getIdArticulo() == id) {
                return centro;

            } else if (id < CategoriaElectrodomesticos.arregloneveras.get(centro).getIdArticulo()) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        return -1;
    }

    @Override
    public Object consultarId(int id) {
       Neveras resultado = new Neveras();
       resultado = CategoriaElectrodomesticos.arregloneveras.get(busquedaBinaria(id));
       return resultado;
    }

    @Override
    public boolean borrar(int id) {
        catedom.arregloneveras.remove(id);
        return true;
    }

    @Override
    public ArrayList consultarTodos() {
        System.out.println(CategoriaElectrodomesticos.arregloneveras.toString());
        return CategoriaElectrodomesticos.arregloneveras;
    }

    @Override
    public boolean borrarTodo(int id) {
        catedom.arregloneveras.clear();
        return true;
    }
    
}
