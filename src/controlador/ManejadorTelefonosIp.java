/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.CategoriaElectronicosOficina;
import modelo.TelefonosIp;

/**
 *
 * @author danie
 */
public class ManejadorTelefonosIp implements ICRUD {

    CategoriaElectronicosOficina cateofi = new CategoriaElectronicosOficina();

    private boolean existeTelefonoIp(TelefonosIp telip) {
        boolean existe = false;
        if (cateofi.arreglotelefonosip.contains(telip)) {
            existe = true;
        }
        return existe;
    }

    @Override
    public boolean insertar(Object obj) {
        boolean inserto = false;
        if (obj instanceof TelefonosIp) {
            TelefonosIp telip = new TelefonosIp();
            telip = (TelefonosIp) obj;
            if (!existeTelefonoIp(telip)) {
                cateofi.arreglotelefonosip.add(telip);
                inserto = true;
            }
            return inserto;
        }
        return inserto;
    }

    @Override
    public boolean modificar(int posicion, Object obj) {
        boolean var = false;
        if (obj instanceof TelefonosIp) {
            TelefonosIp temp = new TelefonosIp();
            temp = (TelefonosIp) obj;
            cateofi.arreglotelefonosip.set(posicion, temp);
            var = true;
        }
        return var;
    }

    @Override
    public int busquedaBinaria(int id) {
        Collections.sort(CategoriaElectronicosOficina.arreglotelefonosip);
        int n = CategoriaElectronicosOficina.arreglotelefonosip.size();
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (CategoriaElectronicosOficina.arreglotelefonosip.get(centro).getIdArticulo() == id) {
                return (centro);
            } else if (id < CategoriaElectronicosOficina.arreglotelefonosip.get(centro).getIdArticulo()) {
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
            TelefonosIp resultado = new TelefonosIp();
            resultado = cateofi.arreglotelefonosip.get(busquedaBinaria(id));
            return resultado;
        }
        return null;

    }

    @Override
    public boolean borrar(int id) {

        int posicion = busquedaBinaria(id);
        if (!(posicion == -1)) {
            cateofi.arreglotelefonosip.remove(posicion);
            return true;
        }

        return false;
    }

    @Override
    public ArrayList consultarTodos() {
        System.out.println(CategoriaElectronicosOficina.arreglotelefonosip.toString());
        return CategoriaElectronicosOficina.arreglotelefonosip;
    }

    @Override
    public boolean borrarTodo() {
        cateofi.arreglotelefonosip.clear();
        return true;
    }

    private static void mezcla(ArrayList<TelefonosIp> array, TelefonosIp temp[], int izq, int fizq, int der, int fder) {
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

    private static void ordenarM(ArrayList<TelefonosIp> array, TelefonosIp temp[], int izq, int der) {
        int centro;
        if (izq < der) {
            centro = (int) (izq + der) / 2;
            ordenarM(array, temp, izq, centro);
            ordenarM(array, temp, centro + 1, der);
            mezcla(array, temp, izq, centro, centro + 1, der);
        }
    }

    public void ordenarMezcla() {
        TelefonosIp temp[] = new TelefonosIp[cateofi.arreglotelefonosip.size()];
        ordenarM(cateofi.arreglotelefonosip, temp, 0, cateofi.arreglotelefonosip.size() - 1);
    }

    public static void intercambio(ArrayList<TelefonosIp> array, int a, int b) {
        TelefonosIp temp;
        temp = array.get(a);
        array.set(a, array.get(b));
        array.set(b, temp);
    }

    public static int pivote(ArrayList<TelefonosIp> array, int prim, int ult, int piv) {
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

    public static void quicksortt(ArrayList<TelefonosIp> array, int inicio, int fin) {
        int medio;
        if (inicio < fin) {
            medio = pivote(array, inicio, fin, fin);
            quicksortt(array, inicio, medio - 1);
            quicksortt(array, medio + 1, fin);
        }
    }

    public void quicksort() {
        quicksortt(cateofi.arreglotelefonosip, 0, cateofi.arreglotelefonosip.size() - 1);
    }
}
