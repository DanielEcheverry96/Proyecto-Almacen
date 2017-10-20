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
public class ManejadorSierras implements ICRUD {

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
        if (!(busquedaBinaria(id) == -1)) {
            Sierras resultado = new Sierras();
            resultado = cateher.arreglosierras.get(busquedaBinaria(id));
            return resultado;
        }
        return null;
    }

    @Override
    public boolean borrar(int id) {

        int posicion = busquedaBinaria(id);
        if (!(posicion == -1)) {
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

    private static void mezcla(ArrayList<Sierras> array, Sierras temp[], int izq, int fizq, int der, int fder) {
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

    private static void ordenarM(ArrayList<Sierras> array, Sierras temp[], int izq, int der) {
        int centro;
        if (izq < der) {
            centro = (int) (izq + der) / 2;
            ordenarM(array, temp, izq, centro);
            ordenarM(array, temp, centro + 1, der);
            mezcla(array, temp, izq, centro, centro + 1, der);
        }
    }

    public void ordenarMezcla() {
        Sierras temp[] = new Sierras[CategoriaHerramientas.arreglosierras.size()];
        ordenarM(CategoriaHerramientas.arreglosierras, temp, 0, CategoriaHerramientas.arreglosierras.size() - 1);
    }

    public static void intercambio(ArrayList<Sierras> array, int a, int b) {
        Sierras temp;
        temp = array.get(a);
        array.set(a, array.get(b));
        array.set(b, temp);
    }

    public static int pivote(ArrayList<Sierras> array, int prim, int ult, int piv) {
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

    public static void quicksortt(ArrayList<Sierras> array, int inicio, int fin) {
        int medio;
        if (inicio < fin) {
            medio = pivote(array, inicio, fin, fin);
            quicksortt(array, inicio, medio - 1);
            quicksortt(array, medio + 1, fin);
        }
    }

    public void quicksort() {
        quicksortt(CategoriaHerramientas.arreglosierras, 0, CategoriaHerramientas.arreglosierras.size() - 1);
    }
}
