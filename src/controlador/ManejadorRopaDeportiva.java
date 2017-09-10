/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.CategoriaRopa;
import modelo.RopaDeportiva;

/**
 *
 * @author danie
 */
public class ManejadorRopaDeportiva implements ICRUD{
    
    CategoriaRopa catrop = new CategoriaRopa();
    
    private boolean existeropadeportiva(RopaDeportiva ropdep) {
        boolean existe = false;
        if (catrop.arregloropadeportiva.contains(ropdep)) {
            existe = true;
        }
        return existe;
    }
    

    @Override
    public boolean insertar(Object obj) {
       boolean inserto = false;
        if (obj instanceof RopaDeportiva) {
            RopaDeportiva ropdep = new RopaDeportiva();
            ropdep = (RopaDeportiva) obj;
            if (!existeropadeportiva(ropdep)) {
                catrop.arregloropadeportiva.add(ropdep);
                inserto = true;
            }
            return inserto;
        }
        return inserto;
    }

    @Override
    public boolean modificar(int id, Object obj) {
        boolean var = false;
        if (obj instanceof RopaDeportiva) {
            RopaDeportiva temp = new RopaDeportiva();
            temp = (RopaDeportiva) obj;
            catrop.arregloropadeportiva.set(id, temp);
            var = true;
        }
        return var;
    }

    @Override
    public int busquedaBinaria(int id) {
        Collections.sort(CategoriaRopa.arregloropadeportiva);
        int n = CategoriaRopa.arregloropadeportiva.size();
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (CategoriaRopa.arregloropadeportiva.get(centro).getIdArticulo() == id) {
                return centro;

            } else if (id < CategoriaRopa.arregloropadeportiva.get(centro).getIdArticulo()) {
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
        RopaDeportiva resultado = new RopaDeportiva();
            resultado = catrop.arregloropadeportiva.get(busquedaBinaria(id));
            return resultado;
        }
        return null;
    }

    @Override
    public boolean borrar(int id) {
        catrop.arregloropadeportiva.remove(id);
        return true;
    }

    @Override
    public boolean borrarTodo() {
         catrop.arregloropadeportiva.clear();
        return true;
    }

    @Override
    public ArrayList consultarTodos() {
        System.out.println(CategoriaRopa.arregloropadeportiva.toString());
        return CategoriaRopa.arregloropadeportiva; 
    }
    
}
