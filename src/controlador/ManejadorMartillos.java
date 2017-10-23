/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.CategoriaHerramientas;
import modelo.Martillos;

/**
 *
 * @author Daniel
 */
public class ManejadorMartillos implements ICRUD {

    CategoriaHerramientas cateher = new CategoriaHerramientas();

    private boolean existemartillo(Martillos mar) {
        boolean existe = false;
        if (cateher.arreglomartillos.contains(mar)) {
            existe = true;
        }
        return existe;
    }

    @Override
    public boolean insertar(Object obj) {
        boolean inserto = false;
        if (obj instanceof Martillos) {
            Martillos mar = new Martillos();
            mar = (Martillos) obj;
            if (!existemartillo(mar)) {
                cateher.arreglomartillos.add(mar);
                inserto = true;
            }
            return inserto;
        }
        return inserto;
    }

    @Override
    public boolean modificar(int posicion, Object obj) {
        boolean var = false;
        if (obj instanceof Martillos) {
            Martillos temp = new Martillos();
            temp = (Martillos) obj;
            cateher.arreglomartillos.set(posicion, temp);
            var = true;
        }
        return var;
    }

    @Override
    public int busquedaBinaria(int id) {
        Collections.sort(CategoriaHerramientas.arreglomartillos);
        int n = CategoriaHerramientas.arreglomartillos.size();
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (CategoriaHerramientas.arreglomartillos.get(centro).getIdArticulo() == id) {
                return centro;

            } else if (id < CategoriaHerramientas.arreglomartillos.get(centro).getIdArticulo()) {
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
            Martillos resultado = new Martillos();
            resultado = cateher.arreglomartillos.get(busquedaBinaria(id));
            return resultado;
        }
        return null;
    }

    @Override
    public boolean borrar(int id) {

        int posicion = busquedaBinaria(id);
        if (!(posicion == -1)) {
            cateher.arreglomartillos.remove(posicion);
            return true;
        }

        return false;
    }

    @Override
    public ArrayList consultarTodos() {
        System.out.println(CategoriaHerramientas.arreglomartillos.toString());
        return CategoriaHerramientas.arreglomartillos;
    }

    @Override
    public boolean borrarTodo() {
        cateher.arreglomartillos.clear();
        return true;
    }

    private static void mezcla(ArrayList<Martillos> array, Martillos temp[], int izq, int fizq, int der, int fder) {
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
    
     private static void mezclaDesc(ArrayList<Martillos> array, Martillos temp[], int izq, int fizq, int der, int fder) {
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

    private static void ordenarM(ArrayList<Martillos> array, Martillos temp[], int izq, int der) {
        int centro;
        if (izq < der) {
            centro = (int) (izq + der) / 2;
            ordenarM(array, temp, izq, centro);
            ordenarM(array, temp, centro + 1, der);
            mezcla(array, temp, izq, centro, centro + 1, der);
        }
    }
    
        private static void ordenarMDesc(ArrayList<Martillos> array, Martillos temp[], int izq, int der) {
        int centro;
        if (izq < der) {
            centro = (int) (izq + der) / 2;
            ordenarMDesc(array, temp, izq, centro);
            ordenarMDesc(array, temp, centro + 1, der);
            mezclaDesc(array, temp, izq, centro, centro + 1, der);
        }
    }

    public void ordenarMezcla() {
        Martillos temp[] = new Martillos[CategoriaHerramientas.arreglomartillos.size()];
        ordenarM(CategoriaHerramientas.arreglomartillos, temp, 0, CategoriaHerramientas.arreglomartillos.size() - 1);
    }
    
      public void ordenarMezclaDesc() {
        Martillos temp[] = new Martillos[CategoriaHerramientas.arreglomartillos.size()];
        ordenarMDesc(CategoriaHerramientas.arreglomartillos, temp, 0, CategoriaHerramientas.arreglomartillos.size() - 1);
    }


    public static void intercambio(ArrayList<Martillos> array, int a, int b) {
        Martillos temp;
        temp = array.get(a);
        array.set(a, array.get(b));
        array.set(b, temp);
    }

    public static int pivote(ArrayList<Martillos> array, int prim, int ult, int piv) {
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
    
        public static int pivoteDesc(ArrayList<Martillos> array, int prim, int ult, int piv) {
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


    public static void quicksortt(ArrayList<Martillos> array, int inicio, int fin) {
        int medio;
        if (inicio < fin) {
            medio = pivote(array, inicio, fin, fin);
            quicksortt(array, inicio, medio - 1);
            quicksortt(array, medio + 1, fin);
        }
    }
    
    
   
    public static void quicksorttDesc(ArrayList<Martillos> array, int inicio, int fin) {
        int medio;
        if (inicio < fin) {
            medio = pivoteDesc(array, inicio, fin, fin);
            quicksorttDesc(array, inicio, medio - 1);
            quicksorttDesc(array, medio + 1, fin);
        }
    }

    public void quicksort() {
        quicksortt(CategoriaHerramientas.arreglomartillos, 0, CategoriaHerramientas.arreglomartillos.size() - 1);
    }
    
    
    public void quicksortDesc() {
        quicksorttDesc(CategoriaHerramientas.arreglomartillos, 0, CategoriaHerramientas.arreglomartillos.size() - 1);
    }
    
    public void sort(){
            Collections.sort(CategoriaHerramientas.arreglomartillos);

        }

}
