/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.CategoriaRopa;
import modelo.VestidosCalle;

/**
 *
 * @author danie
 */
public class ManejadorVestidosCalle implements ICRUD {

    CategoriaRopa catrop = new CategoriaRopa();

    private boolean existevestidoscalle(VestidosCalle vesca) {
        boolean existe = false;
        if (catrop.arreglovestidoscalle.contains(vesca)) {
            existe = true;
        }
        return existe;
    }

    @Override
    public boolean insertar(Object obj) {
        boolean inserto = false;
        if (obj instanceof VestidosCalle) {
            VestidosCalle vesca = new VestidosCalle();
            vesca = (VestidosCalle) obj;
            if (!existevestidoscalle(vesca)) {
                catrop.arreglovestidoscalle.add(vesca);
                inserto = true;
            }
            return inserto;
        }
        return inserto;
    }

    @Override
    public boolean modificar(int posicion, Object obj) {
        boolean var = false;
        if (obj instanceof VestidosCalle) {
            VestidosCalle temp = new VestidosCalle();
            temp = (VestidosCalle) obj;
            catrop.arreglovestidoscalle.set(posicion, temp);
            var = true;
        }
        return var;
    }

    @Override
    public int busquedaBinaria(int id) {
        Collections.sort(CategoriaRopa.arreglovestidoscalle);
        int n = CategoriaRopa.arreglovestidoscalle.size();
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (CategoriaRopa.arreglovestidoscalle.get(centro).getIdArticulo() == id) {
                return centro;

            } else if (id < CategoriaRopa.arreglovestidoscalle.get(centro).getIdArticulo()) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        return -1;
    }

    @Override
    public Object consultarId(int id) {
        if (!(busquedaBinaria(id) == -1)) {
            VestidosCalle resultado = new VestidosCalle();
            resultado = catrop.arreglovestidoscalle.get(busquedaBinaria(id));
            return resultado;
        }
        return null;
    }

    @Override
    public boolean borrar(int id) {

        int posicion = busquedaBinaria(id);
        if (!(posicion == -1)) {
            catrop.arreglovestidoscalle.remove(posicion);
            return true;
        }

        return false;
    }

    @Override
    public boolean borrarTodo() {
        catrop.arreglovestidoscalle.clear();
        return true;
    }

    @Override
    public ArrayList consultarTodos() {
        System.out.println(CategoriaRopa.arreglovestidoscalle.toString());
        return CategoriaRopa.arreglovestidoscalle;
    }

    private static void mezcla(ArrayList<VestidosCalle> array, VestidosCalle temp[], int izq, int fizq, int der, int fder) {
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

    private static void ordenarM(ArrayList<VestidosCalle> array, VestidosCalle temp[], int izq, int der) {
        int centro;
        if (izq < der) {
            centro = (int) (izq + der) / 2;
            ordenarM(array, temp, izq, centro);
            ordenarM(array, temp, centro + 1, der);
            mezcla(array, temp, izq, centro, centro + 1, der);
        }
    }

    public void ordenarMezcla() {
        VestidosCalle temp[] = new VestidosCalle[CategoriaRopa.arreglovestidoscalle.size()];
        ordenarM(CategoriaRopa.arreglovestidoscalle, temp, 0, CategoriaRopa.arreglovestidoscalle.size() - 1);
    }

    public static void intercambio(ArrayList<VestidosCalle> array, int a, int b) {
        VestidosCalle temp;
        temp = array.get(a);
        array.set(a, array.get(b));
        array.set(b, temp);
    }

    public static int pivote(ArrayList<VestidosCalle> array, int prim, int ult, int piv) {
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

    public static void quicksortt(ArrayList<VestidosCalle> array, int inicio, int fin) {
        int medio;
        if (inicio < fin) {
            medio = pivote(array, inicio, fin, fin);
            quicksortt(array, inicio, medio - 1);
            quicksortt(array, medio + 1, fin);
        }
    }

    public void quicksort() {
        quicksortt(CategoriaRopa.arreglovestidoscalle, 0, CategoriaRopa.arreglovestidoscalle.size() - 1);
    }
}
