/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.CategoriaVideojuegos;
import modelo.Consolas;

/**
 *
 * @author Daniel
 */
public class ManejadorConsolas implements ICRUD {

    CategoriaVideojuegos catevid = new CategoriaVideojuegos();

    private boolean existeconsola(Consolas cons) {
        boolean existe = false;
        if (catevid.arregloconsolas.contains(cons)) {
            existe = true;
        }
        return existe;
    }

    @Override
    public boolean insertar(Object obj) {
        boolean inserto = false;
        if (obj instanceof Consolas) {
            Consolas cons = new Consolas();
            cons = (Consolas) obj;
            if (!existeconsola(cons)) {
                catevid.arregloconsolas.add(cons);
                inserto = true;
            }
            return inserto;
        }
        return inserto;
    }

    @Override
    public boolean modificar(int posicion, Object obj) {
        boolean var = false;
        if (obj instanceof Consolas) {
            Consolas temp = new Consolas();
            temp = (Consolas) obj;
            catevid.arregloconsolas.set(posicion, temp);
            var = true;
        }
        return var;
    }

    @Override
    public int busquedaBinaria(int id) {
        Collections.sort(CategoriaVideojuegos.arregloconsolas);
        int n = CategoriaVideojuegos.arregloconsolas.size();
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (CategoriaVideojuegos.arregloconsolas.get(centro).getIdArticulo() == id) {
                return centro;

            } else if (id < CategoriaVideojuegos.arregloconsolas.get(centro).getIdArticulo()) {
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
            Consolas resultado = new Consolas();
            resultado = catevid.arregloconsolas.get(busquedaBinaria(id));
            return resultado;
        }
        return null;
    }

    @Override
    public boolean borrar(int id) {

        int posicion = busquedaBinaria(id);
        if (!(posicion == -1)) {
            catevid.arregloconsolas.remove(posicion);
            return true;
        }

        return false;
    }

    @Override
    public ArrayList consultarTodos() {
        System.out.println(CategoriaVideojuegos.arregloconsolas.toString());
        return CategoriaVideojuegos.arregloconsolas;
    }

    @Override
    public boolean borrarTodo() {
        catevid.arregloconsolas.clear();
        return true;
    }

    private static void mezcla(ArrayList<Consolas> array, Consolas temp[], int izq, int fizq, int der, int fder) {
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

    private static void ordenarM(ArrayList<Consolas> array, Consolas temp[], int izq, int der) {
        int centro;
        if (izq < der) {
            centro = (int) (izq + der) / 2;
            ordenarM(array, temp, izq, centro);
            ordenarM(array, temp, centro + 1, der);
            mezcla(array, temp, izq, centro, centro + 1, der);
        }
    }

    public void ordenarMezcla() {
        Consolas temp[] = new Consolas[CategoriaVideojuegos.arregloconsolas.size()];
        ordenarM(CategoriaVideojuegos.arregloconsolas, temp, 0, CategoriaVideojuegos.arregloconsolas.size() - 1);
    }

    public static void intercambio(ArrayList<Consolas> array, int a, int b) {
        Consolas temp;
        temp = array.get(a);
        array.set(a, array.get(b));
        array.set(b, temp);
    }

    public static int pivote(ArrayList<Consolas> array, int prim, int ult, int piv) {
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

    public static void quicksortt(ArrayList<Consolas> array, int inicio, int fin) {
        int medio;
        if (inicio < fin) {
            medio = pivote(array, inicio, fin, fin);
            quicksortt(array, inicio, medio - 1);
            quicksortt(array, medio + 1, fin);
        }
    }

    public void quicksort() {
        quicksortt(CategoriaVideojuegos.arregloconsolas, 0, CategoriaVideojuegos.arregloconsolas.size() - 1);
    }

}
