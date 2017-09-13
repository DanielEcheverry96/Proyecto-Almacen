/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import modelo.Articulos;
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
    public boolean modificar(int posicion, Object obj) {
        boolean var = false;
        if (obj instanceof Bicicletas) {
            Bicicletas temp = new Bicicletas();
            temp = (Bicicletas) obj;
                catdep.arreglobicicletas.set(posicion, temp);
                var=true;
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
        
        int posicion = busquedaBinaria(id);
        if (!(posicion==-1)) {
            catdep.arreglobicicletas.remove(posicion);
            return true;
        }
        
        return false;
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
    
    public static int partition(ArrayList<Bicicletas> arreglo, int low, int high)
    {
        Bicicletas pivot = arreglo.get(high);
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arreglo.get(j).getPrecio() <= pivot.getPrecio())
            {
                i++;
                Collections.swap(arreglo, i, j);
                // swap arr[i] and arr[j]
               
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
         Collections.swap(arreglo, i, high);
 
        return i+1;
    }
 
 
    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    public static void sort(ArrayList<Bicicletas> arreglo, int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arreglo, low, high);
 
            // Recursively sort elements before
            // partition and after partition
            sort(arreglo, low, pi-1);
            sort(arreglo, pi+1, high);
        }
    }
}
