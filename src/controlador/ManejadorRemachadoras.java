/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.CategoriaHerramientas;
import modelo.Remachadoras;

/**
 *
 * @author Daniel
 */
public class ManejadorRemachadoras implements ICRUD {
    
    CategoriaHerramientas cateher = new CategoriaHerramientas();

    private boolean existeremachadora(Remachadoras rem) {
        boolean existe = false;
        if (cateher.arregloremachadoras.contains(rem)) {
            existe = true;
        }
        return existe;
    }

    @Override
    public boolean insertar(Object obj) {
        boolean inserto = false;
        if (obj instanceof Remachadoras) {
            Remachadoras rem = new Remachadoras();
            rem = (Remachadoras) obj;
            if (!existeremachadora(rem)) {
                cateher.arregloremachadoras.add(rem);
                inserto = true;
            }
            return inserto;
        }
        return inserto;
    }

    @Override
    public boolean modificar(int id, Object obj) {
        boolean var = false;
        if (obj instanceof Remachadoras) {
            Remachadoras temp = new Remachadoras();
            temp = (Remachadoras) obj;
            cateher.arregloremachadoras.set(id, temp);
            var = true;
        }
        return var;
    }

    @Override
    public int busquedaBinaria(int id) {
        Collections.sort(CategoriaHerramientas.arregloremachadoras);
        int n = CategoriaHerramientas.arregloremachadoras.size();
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (CategoriaHerramientas.arregloremachadoras.get(centro).getIdArticulo() == id) {
                return centro;

            } else if (id < CategoriaHerramientas.arregloremachadoras.get(centro).getIdArticulo()) {
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
        Remachadoras resultado = new Remachadoras();
            resultado = cateher.arregloremachadoras.get(busquedaBinaria(id));
            return resultado;
        }
        return null;
    }

    @Override
    public boolean borrar(int id) {
        cateher.arregloremachadoras.remove(id);
        return true;
    }

    @Override
    public ArrayList consultarTodos() {
        System.out.println(CategoriaHerramientas.arregloremachadoras.toString());
        return CategoriaHerramientas.arregloremachadoras;
    }

    @Override
    public boolean borrarTodo() {
        cateher.arregloremachadoras.clear();
        return true;
    }
    
    
    
}
