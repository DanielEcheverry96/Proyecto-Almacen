/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.CategoriaRopa;
import modelo.Zapatos;

/**
 *
 * @author Daniel
 */
public class ManejadorZapatos implements ICRUD{
    
    CategoriaRopa catrop = new CategoriaRopa();
    
    private boolean existezapatos(Zapatos zap) {
        boolean existe = false;
        if (catrop.arreglozapatos.contains(zap)) {
            existe = true;
        }
        return existe;
    }
    
    @Override
    public boolean insertar(Object obj) {
         boolean inserto = false;
        if (obj instanceof Zapatos) {
            Zapatos zap = new Zapatos();
            zap = (Zapatos) obj;
            if (!existezapatos(zap)) {
                catrop.arreglozapatos.add(zap);
                inserto = true;
            }
            return inserto;
        }
        return inserto;
    }

    @Override
    public boolean modificar(int id, Object obj) {
                boolean var = false;
        if (obj instanceof Zapatos) {
            Zapatos temp = new Zapatos();
            temp = (Zapatos) obj;
            catrop.arreglozapatos.set(id, temp);
            var = true;
        }
        return var;
    }

    @Override
    public int busquedaBinaria(int id) {
        Collections.sort(CategoriaRopa.arreglozapatos);
        int n = CategoriaRopa.arreglozapatos.size();
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (CategoriaRopa.arreglozapatos.get(centro).getIdArticulo() == id) {
                return centro;

            } else if (id < CategoriaRopa.arreglozapatos.get(centro).getIdArticulo()) {
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
        Zapatos resultado = new Zapatos();
            resultado = catrop.arreglozapatos.get(busquedaBinaria(id));
            return resultado;
        }
        return null;
    }

    @Override
    public boolean borrar(int id) {
        catrop.arreglozapatos.remove(id);
        return true;
    }

    @Override
    public boolean borrarTodo() {
         catrop.arreglozapatos.clear();
        return true;
    }

    @Override
    public ArrayList consultarTodos() {
       System.out.println(CategoriaRopa.arreglozapatos.toString());
        return CategoriaRopa.arreglozapatos; 
    }
    
}
