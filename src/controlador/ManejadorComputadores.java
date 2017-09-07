/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.CategoriaElectronicosOficina;
import modelo.Computadores;

/**
 *
 * @author Usuario
 */
public class ManejadorComputadores implements ICRUD {

    CategoriaElectronicosOficina cateofi = new CategoriaElectronicosOficina();

    private boolean existecomputador(Computadores comp) {
        boolean existe = false;
        if (cateofi.arreglocomputadores.contains(comp)) {
            existe = true;
        }
        return existe;
    }

    @Override
    public boolean insertar(Object obj) {
        boolean inserto = false;
        if (obj instanceof Computadores) {
            Computadores compu = new Computadores();
            compu = (Computadores) obj;
            if (!existecomputador(compu)) {
                cateofi.arreglocomputadores.add(compu);
                inserto = true;
            }
            return inserto;
        }
        return inserto;
    }

    @Override
    public boolean modificar(int id, Object obj) {
        boolean var = false;
        if (obj instanceof Computadores) {
            Computadores temp = new Computadores();
            temp = (Computadores) obj;
            cateofi.arreglocomputadores.set(id, temp);
            var = true;
        }
        return var;
    }

    @Override
    public int busquedaBinaria(int id) {
        Collections.sort(CategoriaElectronicosOficina.arreglocomputadores);
        int n = CategoriaElectronicosOficina.arreglocomputadores.size();
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (CategoriaElectronicosOficina.arreglocomputadores.get(centro).getIdArticulo() == id) {
                return centro;

            } else if (id < CategoriaElectronicosOficina.arreglocomputadores.get(centro).getIdArticulo()) {
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
            Computadores resultado = new Computadores();
            resultado = cateofi.arreglocomputadores.get(busquedaBinaria(id));
            return resultado;
        }
        return null;
    }

    @Override
    public boolean borrar(int id) {
        cateofi.arreglocomputadores.remove(id);
        return true;
    }

    @Override
    public ArrayList consultarTodos() {
        System.out.println(CategoriaElectronicosOficina.arreglocomputadores.toString());
        return CategoriaElectronicosOficina.arreglocomputadores;
    }

    @Override
    public boolean borrarTodo() {
        cateofi.arreglocomputadores.clear();
        return true;
    }

}
