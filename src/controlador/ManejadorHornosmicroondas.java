/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.CategoriaElectrodomesticos;
import modelo.Hornosmicroondas;

/**
 *
 * @author Daniel
 */
public class ManejadorHornosmicroondas implements ICRUD {
    CategoriaElectrodomesticos catedom = new CategoriaElectrodomesticos();
    
    private boolean existehorno(Hornosmicroondas horno) {
        boolean existe = false;
        if (catedom.arreglohornosmicroondas.contains(horno)) {
            existe = true;
        }
        return existe;
    }

    @Override
    public boolean insertar(Object obj) {
        boolean inserto = false;
        if (obj instanceof Hornosmicroondas) {
            Hornosmicroondas horno = new Hornosmicroondas();
            horno = (Hornosmicroondas) obj;
            if (!existehorno(horno)) {
                catedom.arreglohornosmicroondas.add(horno);
                inserto = true;
            }
            return inserto;
        }
        return inserto;
    }

    @Override
    public boolean modificar(int id, Object obj) {
        boolean var = false;
        if (obj instanceof Hornosmicroondas) {
            Hornosmicroondas temp = new Hornosmicroondas();
            temp = (Hornosmicroondas) obj;
            catedom.arreglohornosmicroondas.set(id, temp);
            var = true;
        }
        return var;
    }

    @Override
    public int busquedaBinaria(int id) {
        Collections.sort(CategoriaElectrodomesticos.arreglohornosmicroondas);
        int n = CategoriaElectrodomesticos.arreglohornosmicroondas.size();
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (CategoriaElectrodomesticos.arreglohornosmicroondas.get(centro).getIdArticulo() == id) {
                return centro;

            } else if (id < CategoriaElectrodomesticos.arreglohornosmicroondas.get(centro).getIdArticulo()) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        return -1;
    }

    @Override
    public Object consultarId(int id) {
        Hornosmicroondas resultado = new Hornosmicroondas();
        resultado = CategoriaElectrodomesticos.arreglohornosmicroondas.get(busquedaBinaria(id));
        return resultado;
    }

    @Override
    public boolean borrar(int id) {
        catedom.arreglohornosmicroondas.remove(id);
        return true;
    }

    @Override
    public ArrayList consultarTodos() {
        System.out.println(CategoriaElectrodomesticos.arreglohornosmicroondas.toString());
        return CategoriaElectrodomesticos.arreglohornosmicroondas;
    }

    
    @Override
    public boolean borrarTodo(int id) {
        catedom.arreglohornosmicroondas.clear();
        return true;
    }
    
}
