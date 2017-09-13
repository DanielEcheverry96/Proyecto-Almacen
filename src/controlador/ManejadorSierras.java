/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.CategoriaHerramientas;
import modelo.Sierras;

/**
 *
 * @author Daniel
 */
public class ManejadorSierras implements ICRUD{
    
    CategoriaHerramientas cateher = new CategoriaHerramientas();
    
    private boolean existesierra(Sierras sie) {
        boolean existe = false;
        if (cateher.arreglosierras.contains(sie)) {
            existe = true;
        }
        return existe;
    }
     
    @Override
    public boolean insertar(Object obj) {
        boolean inserto = false;
        if (obj instanceof Sierras) {
            Sierras sie = new Sierras();
            sie = (Sierras) obj;
            if (!existesierra(sie)) {
                cateher.arreglosierras.add(sie);
                inserto = true;
            }
            return inserto;
        }
        return inserto;
    }

    @Override
    public boolean modificar(int posicion, Object obj) {
         boolean var = false;
        if (obj instanceof Sierras) {
            Sierras temp = new Sierras();
            temp = (Sierras) obj;
            cateher.arreglosierras.set(posicion, temp);
            var = true;
        }
        return var;
    }

    @Override
    public int busquedaBinaria(int id) {
        Collections.sort(CategoriaHerramientas.arreglosierras);
        int n = CategoriaHerramientas.arreglosierras.size();
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (CategoriaHerramientas.arreglosierras.get(centro).getIdArticulo() == id) {
                return centro;

            } else if (id < CategoriaHerramientas.arreglosierras.get(centro).getIdArticulo()) {
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
        Sierras resultado = new Sierras();
            resultado = cateher.arreglosierras.get(busquedaBinaria(id));
            return resultado;
        }
        return null;
    }

    @Override
    public boolean borrar(int id) {
        
        int posicion = busquedaBinaria(id);
        if (!(posicion==-1)) {
            cateher.arreglosierras.remove(posicion);
            return true;
        }
        
        return false;
    }

    @Override
    public boolean borrarTodo() {
         cateher.arreglosierras.clear();
        return true;
    }

    @Override
    public ArrayList consultarTodos() {
        System.out.println(CategoriaHerramientas.arreglosierras.toString());
        return CategoriaHerramientas.arreglosierras;
    }
    
}
