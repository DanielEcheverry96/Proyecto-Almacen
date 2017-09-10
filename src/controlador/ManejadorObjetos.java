/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.Marca;

/**
 *
 * @author Unalman
 */
public class ManejadorObjetos implements ICRUD {

    public static ArrayList<Marca> arregloMarcas = new ArrayList<Marca>();
    public ManejadorObjetos() {
        
    }

    private boolean existemarca(Marca mar){
        boolean existe = false;
        if (arregloMarcas.contains(mar)) {
            existe = true;
        }
        return existe;
    }
    
    @Override
    public boolean insertar(Object obj) {
        boolean inserto = false;
        if (obj instanceof Marca) {
            Marca mar = new Marca();
            mar = (Marca)obj;
            if (!existemarca(mar)) {
                arregloMarcas.add(mar);
                inserto = true;
            }
            return inserto;
        }
        return inserto; 
    }

    @Override
    public boolean modificar(int id, Object obj) {
        boolean var = false;
        if (obj instanceof Marca) {
            Marca temp = new Marca();
            temp = (Marca) obj;
            arregloMarcas.set(id, temp);
            var = true;
        }
        return var;
    }

    @Override
    public Object consultarId(int id) {
         if (!(busquedaBinaria(id) == -1)){
            Marca resultado = new Marca();
            resultado = arregloMarcas.get(busquedaBinaria(id));
            return resultado;
        }
        return null;
    }

    @Override
    public int busquedaBinaria(int id) {
        Collections.sort(arregloMarcas);
        int n = arregloMarcas.size();
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (arregloMarcas.get(centro).getId() == id) {
                return centro;

            } else if (id < arregloMarcas.get(centro).getId()) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        return -1;
    }

    @Override
    public boolean borrar(int id) {
        arregloMarcas.remove(id);
        return true;
    }

    @Override
    public ArrayList consultarTodos() {
        System.out.println(arregloMarcas.toString());
        return arregloMarcas;
    }

    @Override
    public boolean borrarTodo() {
        arregloMarcas.clear();
        return true;
    }

}
