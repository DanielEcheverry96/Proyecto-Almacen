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

    private boolean existeRaquetas(Raquetas raque) {
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
            raque = (Raquetas) obj;
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
                return centro;
            } else if (id < CategoriaDeportivos.arregloraquetas.get(centro).getIdArticulo()) {
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
            Raquetas resultado = new Raquetas();
            resultado = CategoriaDeportivos.arregloraquetas.get(busquedaBinaria(id));
            return resultado;
        }
        return null;
    }

    @Override
    public boolean borrar(int id) {
        int posicion = busquedaBinaria(id);
        if (!(posicion == -1)) {
            CategoriaDeportivos.arregloraquetas.remove(posicion);
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

    private static void mezcla(ArrayList<Raquetas> array, Raquetas temp[], int izq, int fizq, int der, int fder) {
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

    private static void mezclaDesc(ArrayList<Raquetas> array, Raquetas temp[], int izq, int fizq, int der, int fder) {
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

    private static void ordenarM(ArrayList<Raquetas> array, Raquetas temp[], int izq, int der) {
        int centro;
        if (izq < der) {
            centro = (int) (izq + der) / 2;
            ordenarM(array, temp, izq, centro);
            ordenarM(array, temp, centro + 1, der);
            mezcla(array, temp, izq, centro, centro + 1, der);
        }
    }

    private static void ordenarMDesc(ArrayList<Raquetas> array, Raquetas temp[], int izq, int der) {
        int centro;
        if (izq < der) {
            centro = (int) (izq + der) / 2;
            ordenarMDesc(array, temp, izq, centro);
            ordenarMDesc(array, temp, centro + 1, der);
            mezclaDesc(array, temp, izq, centro, centro + 1, der);
        }
    }

    public void ordenarMezcla() {
        Raquetas temp[] = new Raquetas[CategoriaDeportivos.arregloraquetas.size()];
        ordenarM(CategoriaDeportivos.arregloraquetas, temp, 0, CategoriaDeportivos.arregloraquetas.size() - 1);
    }

    public void ordenarMezclaDesc() {
        Raquetas temp[] = new Raquetas[CategoriaDeportivos.arregloraquetas.size()];
        ordenarMDesc(CategoriaDeportivos.arregloraquetas, temp, 0, CategoriaDeportivos.arregloraquetas.size() - 1);
    }

    public static void intercambio(ArrayList<Raquetas> array, int a, int b) {
        Raquetas temp;
        temp = array.get(a);
        array.set(a, array.get(b));
        array.set(b, temp);
    }

    public static int pivote(ArrayList<Raquetas> array, int prim, int ult, int piv) {
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

    public static int pivoteDesc(ArrayList<Raquetas> array, int prim, int ult, int piv) {
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

    public static void quicksortt(ArrayList<Raquetas> array, int inicio, int fin) {
        int medio;
        if (inicio < fin) {
            medio = pivote(array, inicio, fin, fin);
            quicksortt(array, inicio, medio - 1);
            quicksortt(array, medio + 1, fin);
        }
    }

    public static void quicksorttDesc(ArrayList<Raquetas> array, int inicio, int fin) {
        int medio;
        if (inicio < fin) {
            medio = pivoteDesc(array, inicio, fin, fin);
            quicksorttDesc(array, inicio, medio - 1);
            quicksorttDesc(array, medio + 1, fin);
        }
    }

    public void quicksort() {
        quicksortt(CategoriaDeportivos.arregloraquetas, 0, CategoriaDeportivos.arregloraquetas.size() - 1);
    }

    public void quicksortDesc() {
        quicksorttDesc(CategoriaDeportivos.arregloraquetas, 0, CategoriaDeportivos.arregloraquetas.size() - 1);
    }

    public void sort() {
        Collections.sort(CategoriaDeportivos.arregloraquetas);

    }
}
