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
public class ManejadorZapatos implements ICRUD {

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
    public boolean modificar(int posicion, Object obj) {
        boolean var = false;
        if (obj instanceof Zapatos) {
            Zapatos temp = new Zapatos();
            temp = (Zapatos) obj;
            catrop.arreglozapatos.set(posicion, temp);
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
        if (!(busquedaBinaria(id) == -1)) {
            Zapatos resultado = new Zapatos();
            resultado = catrop.arreglozapatos.get(busquedaBinaria(id));
            return resultado;
        }
        return null;
    }

    @Override
    public boolean borrar(int id) {

        int posicion = busquedaBinaria(id);
        if (!(posicion == -1)) {
            catrop.arreglozapatos.remove(posicion);
            return true;
        }

        return false;
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

    private static void mezcla(ArrayList<Zapatos> array, Zapatos temp[], int izq, int fizq, int der, int fder) {
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

    private static void mezclaDesc(ArrayList<Zapatos> array, Zapatos temp[], int izq, int fizq, int der, int fder) {
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

    private static void ordenarM(ArrayList<Zapatos> array, Zapatos temp[], int izq, int der) {
        int centro;
        if (izq < der) {
            centro = (int) (izq + der) / 2;
            ordenarM(array, temp, izq, centro);
            ordenarM(array, temp, centro + 1, der);
            mezcla(array, temp, izq, centro, centro + 1, der);
        }
    }

    private static void ordenarMDesc(ArrayList<Zapatos> array, Zapatos temp[], int izq, int der) {
        int centro;
        if (izq < der) {
            centro = (int) (izq + der) / 2;
            ordenarMDesc(array, temp, izq, centro);
            ordenarMDesc(array, temp, centro + 1, der);
            mezclaDesc(array, temp, izq, centro, centro + 1, der);
        }
    }

    public void ordenarMezcla() {
        Zapatos temp[] = new Zapatos[CategoriaRopa.arreglozapatos.size()];
        ordenarM(CategoriaRopa.arreglozapatos, temp, 0, CategoriaRopa.arreglozapatos.size() - 1);
    }

    public void ordenarMezclaDesc() {
        Zapatos temp[] = new Zapatos[CategoriaRopa.arreglozapatos.size()];
        ordenarMDesc(CategoriaRopa.arreglozapatos, temp, 0, CategoriaRopa.arreglozapatos.size() - 1);
    }

    public static void intercambio(ArrayList<Zapatos> array, int a, int b) {
        Zapatos temp;
        temp = array.get(a);
        array.set(a, array.get(b));
        array.set(b, temp);
    }

    public static int pivote(ArrayList<Zapatos> array, int prim, int ult, int piv) {
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

    public static int pivoteDesc(ArrayList<Zapatos> array, int prim, int ult, int piv) {
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

    public static void quicksortt(ArrayList<Zapatos> array, int inicio, int fin) {
        int medio;
        if (inicio < fin) {
            medio = pivote(array, inicio, fin, fin);
            quicksortt(array, inicio, medio - 1);
            quicksortt(array, medio + 1, fin);
        }
    }

    public static void quicksorttDesc(ArrayList<Zapatos> array, int inicio, int fin) {
        int medio;
        if (inicio < fin) {
            medio = pivoteDesc(array, inicio, fin, fin);
            quicksorttDesc(array, inicio, medio - 1);
            quicksorttDesc(array, medio + 1, fin);
        }
    }

    public void quicksort() {
        quicksortt(CategoriaRopa.arreglozapatos, 0, CategoriaRopa.arreglozapatos.size() - 1);
    }

    public void quicksortDesc() {
        quicksorttDesc(CategoriaRopa.arreglozapatos, 0, CategoriaRopa.arreglozapatos.size() - 1);
    }

    public void sort() {
        Collections.sort(CategoriaRopa.arreglozapatos);

    }
}
