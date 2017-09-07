/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.Bicicletas;
import modelo.CategoriaDeportivos;

/**
 *
 * @author danie
 */
public class ManejadorBicicletas implements ICRUD{
    
    CategoriaDeportivos catdep = new CategoriaDeportivos();
    
         private boolean existeBicicletas(Bicicletas bici){
        boolean existe = false;
        if (catdep.arreglobicicletas.contains(bici)) {
            existe = true;
        }
        return existe;
    }
         
    @Override
    public boolean insertar(Object obj) {
        boolean inserto = false;
        if (obj instanceof Bicicletas) {
            Bicicletas bici = new Bicicletas();
            bici = (Bicicletas)obj;
            if (!existeBicicletas(bici)) {
                catdep.arreglobicicletas.add(bici);
                inserto = true;
            }
            return inserto;
        }
        return inserto;
    }

    @Override
    public boolean modificar(int id, Object obj) {
        boolean var = false;
        if (obj instanceof Bicicletas) {
            Bicicletas temp = new Bicicletas();
            temp = (Bicicletas) obj;
            catdep.arreglobicicletas.set(id, temp);
            var = true;
        }
        return var;
    }

    @Override
    public int busquedaBinaria(int id) {
        Collections.sort(CategoriaDeportivos.arreglobicicletas);
        int n = CategoriaDeportivos.arreglobicicletas.size();
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (CategoriaDeportivos.arreglobicicletas.get(centro).getIdArticulo() == id) {
                return (centro);
            }
            else if (id<CategoriaDeportivos.arreglobicicletas.get(centro).getIdArticulo()) {
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
            Bicicletas resultado = new Bicicletas();
            resultado = catdep.arreglobicicletas.get(busquedaBinaria(id));
            return resultado;
        }
        return null;
    }

    @Override
    public boolean borrar(int id) {
        catdep.arreglobicicletas.remove(id);
        return true;
    }

    @Override
    public boolean borrarTodo() {
        catdep.arreglobicicletas.clear();
        return true;
    }

    @Override
    public ArrayList consultarTodos() {
       System.out.println(CategoriaDeportivos.arreglobicicletas.toString());
       return CategoriaDeportivos.arreglobicicletas;
    }
    
}
