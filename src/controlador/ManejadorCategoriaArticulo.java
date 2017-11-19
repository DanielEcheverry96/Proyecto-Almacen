/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.CategoriaArticulo;

/**
 *
 * @author danie
 */
public class ManejadorCategoriaArticulo{
    
     public static ArrayList<CategoriaArticulo> arreglocategoriaarticulo = new ArrayList<CategoriaArticulo>();

    
     private static void mezcla(ArrayList<CategoriaArticulo> array, CategoriaArticulo temp[], int izq, int fizq, int der, int fder) {
        int postemp = izq, numele, i;
        numele = fder - izq + 1;
        while (izq <= fizq && der <= fder) {
            if (array.get(izq).getNombre().compareTo(array.get(der).getNombre()) < 0) {
                temp[postemp++] = array.get(izq++);
            } else {
                temp[postemp++] = array.get(der++);
            }
        }
        while (izq <= fizq) {
            temp[postemp++] = array.get(izq++);
        }
        while (der <= fder) {
            temp[postemp++] = array.get(der++);
        }
        for (i = 0; i < numele; i++, fder--) {
            array.set(fder, temp[fder]);
        }
    }
    
     private static void mezclaDesc(ArrayList<CategoriaArticulo> array, CategoriaArticulo temp[], int izq, int fizq, int der, int fder) {
        int postemp = izq, numele, i;
        numele = fder - izq + 1;
        while (izq <= fizq && der <= fder) {
            if (array.get(izq).getNombre().compareTo(array.get(der).getNombre()) > 0) {
                temp[postemp++] = array.get(izq++);
            } else {
                temp[postemp++] = array.get(der++);
            }
        }
        while (izq <= fizq) {
            temp[postemp++] = array.get(izq++);
        }
        while (der <= fder) {
            temp[postemp++] = array.get(der++);
        }
        for (i = 0; i < numele; i++, fder--) {
            array.set(fder, temp[fder]);
        }
    }


    private static void ordenarM(ArrayList<CategoriaArticulo> array, CategoriaArticulo temp[], int izq, int der) {
        int centro;
        if (izq < der) {
            centro = (int) (izq + der) / 2;
            ordenarM(array, temp, izq, centro);
            ordenarM(array, temp, centro + 1, der);
            mezcla(array, temp, izq, centro, centro + 1, der);
        }
    }

        private static void ordenarMDesc(ArrayList<CategoriaArticulo> array, CategoriaArticulo temp[], int izq, int der) {
        int centro;
        if (izq < der) {
            centro = (int) (izq + der) / 2;
            ordenarMDesc(array, temp, izq, centro);
            ordenarMDesc(array, temp, centro + 1, der);
            mezclaDesc(array, temp, izq, centro, centro + 1, der);
        }
    }
    public void ordenarMezcla() {
        CategoriaArticulo temp[] = new CategoriaArticulo[arreglocategoriaarticulo.size()];
        ordenarM(arreglocategoriaarticulo, temp, 0, arreglocategoriaarticulo.size() - 1);
    }
    
     public void ordenarMezclaDesc() {
        CategoriaArticulo temp[] = new CategoriaArticulo[arreglocategoriaarticulo.size()];
        ordenarMDesc(arreglocategoriaarticulo, temp, 0, arreglocategoriaarticulo.size() - 1);
    }


    public static void intercambio(ArrayList<CategoriaArticulo> array, int a, int b) {
        CategoriaArticulo temp;
        temp = array.get(a);
        array.set(a, array.get(b));
        array.set(b, temp);
    }

    public static int pivote(ArrayList<CategoriaArticulo> array, int prim, int ult, int piv) {
        float p = array.get(piv).getPrecio();
        int j = prim;
        int i;
        intercambio(array, piv, ult);
        for (i = prim; i < ult; i++) {
            if (array.get(i).getPrecio() <= p) {
                intercambio(array, i, j);
                j++;
            }
        }
        intercambio(array, j, ult);
        return j;
    }

       public static int pivoteDesc(ArrayList<CategoriaArticulo> array, int prim, int ult, int piv) {
        float p = array.get(piv).getPrecio();
        int j = prim;
        int i;
        intercambio(array, piv, ult);
        for (i = prim; i < ult; i++) {
            if (array.get(i).getPrecio() > p) {
                intercambio(array, i, j);
                j++;
            }
        }
        intercambio(array, j, ult);
        return j;
    }
       
    public static void quicksortt(ArrayList<CategoriaArticulo> array, int inicio, int fin) {
        int medio;
        if (inicio < fin) {
            medio = pivote(array, inicio, fin, fin);
            quicksortt(array, inicio, medio - 1);
            quicksortt(array, medio + 1, fin);
        }
    }

     public static void quicksorttDesc(ArrayList<CategoriaArticulo> array, int inicio, int fin) {
        int medio;
        if (inicio < fin) {
            medio = pivoteDesc(array, inicio, fin, fin);
            quicksorttDesc(array, inicio, medio - 1);
            quicksorttDesc(array, medio + 1, fin);
        }
    }
    public void quicksort() {
        quicksortt(arreglocategoriaarticulo, 0, arreglocategoriaarticulo.size() - 1);
    }
    
        public void quicksortDesc() {
        quicksorttDesc(arreglocategoriaarticulo, 0, arreglocategoriaarticulo.size() - 1);
    }
        
        public void sort(){
            Collections.sort(arreglocategoriaarticulo);

        }
}
