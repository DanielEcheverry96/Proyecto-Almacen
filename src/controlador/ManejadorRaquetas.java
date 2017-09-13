/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.CategoriaDeportivos;
import modelo.Raquetas;

/**
 *
 * @author BP-LABREDES00
 */
public class ManejadorRaquetas implements ICRUD {

    CategoriaDeportivos catdep = new CategoriaDeportivos();
    
     private boolean existeRaquetas(Raquetas raque){
        boolean existe = false;
        if (catdep.arregloraquetas.contains(raque)) {
            existe = true;
        }
        return existe;
    }
     
    @Override
    public boolean insertar(Object obj) {
        boolean inserto = false;
        if (obj instanceof Raquetas) {
            Raquetas raque = new Raquetas();
            raque = (Raquetas)obj;
            if (!existeRaquetas(raque)) {
                catdep.arregloraquetas.add(raque);
                inserto = true;
            }
            return inserto;
        }
        return inserto;
    }

    @Override
    public boolean modificar(int posicion, Object obj) {
       boolean var = false;
        if (obj instanceof Raquetas) {
            Raquetas temp = new Raquetas();
            temp = (Raquetas) obj;
            catdep.arregloraquetas.set(posicion, temp);
            var = true;
        }
        return var;
    }

    @Override
    public int busquedaBinaria(int id) {
        Collections.sort(CategoriaDeportivos.arregloraquetas);
       int n = CategoriaDeportivos.arregloraquetas.size();
       int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (CategoriaDeportivos.arregloraquetas.get(centro).getIdArticulo() == id) {
                return (centro);
            }
            else if (id<CategoriaDeportivos.arregloraquetas.get(centro).getIdArticulo()) {
                sup = centro - 1;
            }
            else {
                inf = centro + 1;
            }
        }
        return -1;
    }

    @Override
    public Object consultarId(int id) {
        if (!(busquedaBinaria(id) == -1)){
            Raquetas resultado = new Raquetas();
            resultado = catdep.arregloraquetas.get(busquedaBinaria(id));
            return resultado;
        }
        return null;
    }

    @Override
    public boolean borrar(int id) {
        int posicion = busquedaBinaria(id);
        if (!(posicion==-1)) {
            catdep.arregloraquetas.remove(id);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList consultarTodos() {
       System.out.println(CategoriaDeportivos.arregloraquetas.toString());
       return CategoriaDeportivos.arregloraquetas;
    }

    @Override
    public boolean borrarTodo() {
        catdep.arregloraquetas.clear();
        return true;
    }
    
}
