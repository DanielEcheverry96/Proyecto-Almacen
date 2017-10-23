/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.CategoriaElectronicosOficina;
import modelo.TelefonosCelulares;

/**
 *
 * @author danie
 */
public class ManejadorTelefonosCelulares implements ICRUD {

    CategoriaElectronicosOficina cateofi = new CategoriaElectronicosOficina();

    private boolean existeCelular(TelefonosCelulares telcel) {
        boolean existe = false;
        if (cateofi.arreglotelefonoscelulares.contains(telcel)) {
            existe = true;
        }
        return existe;
    }

    @Override
    public boolean insertar(Object obj) {
        boolean inserto = false;
        if (obj instanceof TelefonosCelulares) {
            TelefonosCelulares telcelu = new TelefonosCelulares();
            telcelu = (TelefonosCelulares) obj;
            if (!existeCelular(telcelu)) {
                cateofi.arreglotelefonoscelulares.add(telcelu);
                inserto = true;
            }
            return inserto;
        }
        return inserto;
    }

    @Override
    public boolean modificar(int posicion, Object obj) {
        boolean var = false;
        if (obj instanceof TelefonosCelulares) {
            TelefonosCelulares temp = new TelefonosCelulares();
            temp = (TelefonosCelulares) obj;
            cateofi.arreglotelefonoscelulares.set(posicion, temp);
            var = true;
        }
        return var;
    }

    @Override
    public int busquedaBinaria(int id) {
        Collections.sort(CategoriaElectronicosOficina.arreglotelefonoscelulares);
        int n = CategoriaElectronicosOficina.arreglotelefonoscelulares.size();
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (CategoriaElectronicosOficina.arreglotelefonoscelulares.get(centro).getIdArticulo() == id) {
                return (centro);
            } else if (id < CategoriaElectronicosOficina.arreglotelefonoscelulares.get(centro).getIdArticulo()) {
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
            TelefonosCelulares resultado = new TelefonosCelulares();
            resultado = cateofi.arreglotelefonoscelulares.get(busquedaBinaria(id));
            return resultado;
        }
        return null;
    }

    @Override
    public boolean borrar(int id) {

        int posicion = busquedaBinaria(id);
        if (!(posicion == -1)) {
            cateofi.arreglotelefonoscelulares.remove(posicion);
            return true;
        }

        return false;
    }

    @Override
    public ArrayList consultarTodos() {
        System.out.println(CategoriaElectronicosOficina.arreglotelefonoscelulares.toString());
        return CategoriaElectronicosOficina.arreglotelefonoscelulares;
    }

    @Override
    public boolean borrarTodo() {
        cateofi.arreglotelefonoscelulares.clear();
        return true;
    }

    private static void mezcla(ArrayList<TelefonosCelulares> array, TelefonosCelulares temp[], int izq, int fizq, int der, int fder) {
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

    private static void mezclaDesc(ArrayList<TelefonosCelulares> array, TelefonosCelulares temp[], int izq, int fizq, int der, int fder) {
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

    private static void ordenarM(ArrayList<TelefonosCelulares> array, TelefonosCelulares temp[], int izq, int der) {
        int centro;
        if (izq < der) {
            centro = (int) (izq + der) / 2;
            ordenarM(array, temp, izq, centro);
            ordenarM(array, temp, centro + 1, der);
            mezcla(array, temp, izq, centro, centro + 1, der);
        }
    }

    private static void ordenarMDesc(ArrayList<TelefonosCelulares> array, TelefonosCelulares temp[], int izq, int der) {
        int centro;
        if (izq < der) {
            centro = (int) (izq + der) / 2;
            ordenarMDesc(array, temp, izq, centro);
            ordenarMDesc(array, temp, centro + 1, der);
            mezclaDesc(array, temp, izq, centro, centro + 1, der);
        }
    }

    public void ordenarMezcla() {
        TelefonosCelulares temp[] = new TelefonosCelulares[cateofi.arreglotelefonoscelulares.size()];
        ordenarM(cateofi.arreglotelefonoscelulares, temp, 0, cateofi.arreglotelefonoscelulares.size() - 1);
    }

    public void ordenarMezclaDesc() {
        TelefonosCelulares temp[] = new TelefonosCelulares[cateofi.arreglotelefonoscelulares.size()];
        ordenarMDesc(cateofi.arreglotelefonoscelulares, temp, 0, cateofi.arreglotelefonoscelulares.size() - 1);
    }

    public static void intercambio(ArrayList<TelefonosCelulares> array, int a, int b) {
        TelefonosCelulares temp;
        temp = array.get(a);
        array.set(a, array.get(b));
        array.set(b, temp);
    }

    public static int pivote(ArrayList<TelefonosCelulares> array, int prim, int ult, int piv) {
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

    public static int pivoteDesc(ArrayList<TelefonosCelulares> array, int prim, int ult, int piv) {
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

    public static void quicksortt(ArrayList<TelefonosCelulares> array, int inicio, int fin) {
        int medio;
        if (inicio < fin) {
            medio = pivote(array, inicio, fin, fin);
            quicksortt(array, inicio, medio - 1);
            quicksortt(array, medio + 1, fin);
        }
    }

    public static void quicksorttDesc(ArrayList<TelefonosCelulares> array, int inicio, int fin) {
        int medio;
        if (inicio < fin) {
            medio = pivoteDesc(array, inicio, fin, fin);
            quicksorttDesc(array, inicio, medio - 1);
            quicksorttDesc(array, medio + 1, fin);
        }
    }

    public void quicksort() {
        quicksortt(cateofi.arreglotelefonoscelulares, 0, cateofi.arreglotelefonoscelulares.size() - 1);
    }

    public void quicksortDesc() {
        quicksorttDesc(cateofi.arreglotelefonoscelulares, 0, cateofi.arreglotelefonoscelulares.size() - 1);
    }
    
    public void sort(){
            Collections.sort(CategoriaElectronicosOficina.arreglotelefonoscelulares);

        }
}
