/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.Marca;

/**
 *
 * @author Unalman
 */
public class ManejadorObjetos implements ICRUD {

    public static ArrayList<Marca> arregloMarcas = new ArrayList<Marca>();
    public ManejadorObjetos() {
        
    }

    private boolean existemarca(Marca mar){
        boolean existe = false;
        if (arregloMarcas.contains(mar)) {
            existe = true;
        }
        return existe;
    }
    
    @Override
    public boolean insertar(Object obj) {
        boolean inserto = false;
        if (obj instanceof Marca) {
            Marca mar = new Marca();
            mar = (Marca)obj;
            if (!existemarca(mar)) {
                arregloMarcas.add(mar);
                inserto = true;
            }
            return inserto;
        }
        return inserto; 
    }

    @Override
    public boolean modificar(int posicion, Object obj) {
        boolean var = false;
        if (obj instanceof Marca) {
            Marca temp = new Marca();
            temp = (Marca) obj;
            arregloMarcas.set(posicion, temp);
            var = true;
        }
        return var;
    }

    @Override
    public Object consultarId(int id) {
         if (!(busquedaBinaria(id) == -1)){
            Marca resultado = new Marca();
            resultado = arregloMarcas.get(busquedaBinaria(id));
            return resultado;
        }
        return null;
    }

    @Override
    public int busquedaBinaria(int id) {
        Collections.sort(arregloMarcas);
        int n = arregloMarcas.size();
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (arregloMarcas.get(centro).getId() == id) {
                return centro;

            } else if (id < arregloMarcas.get(centro).getId()) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        return -1;
    }

    @Override
    public boolean borrar(int id) {
        
        int posicion = busquedaBinaria(id);
        if (!(posicion==-1)) {
            arregloMarcas.remove(posicion);
            return true;
        }
        
        return false;
    }

    @Override
    public ArrayList consultarTodos() {
        System.out.println(arregloMarcas.toString());
        return arregloMarcas;
    }

    @Override
    public boolean borrarTodo() {
        arregloMarcas.clear();
        return true;
    }
    
    private static void mezcla(ArrayList<Marca> array, Marca temp[], int izq, int fizq, int der, int fder) {
        int postemp = izq, numele, i;
        numele = fder - izq + 1;
        while (izq <= fizq && der <= fder) {
            if (array.get(izq).getDescripcion().compareTo(array.get(der).getDescripcion()) < 0) {
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
    
     private static void mezclaDesc(ArrayList<Marca> array, Marca temp[], int izq, int fizq, int der, int fder) {
        int postemp = izq, numele, i;
        numele = fder - izq + 1;
        while (izq <= fizq && der <= fder) {
            if (array.get(izq).getDescripcion().compareTo(array.get(der).getDescripcion()) > 0) {
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


    private static void ordenarM(ArrayList<Marca> array, Marca temp[], int izq, int der) {
        int centro;
        if (izq < der) {
            centro = (int) (izq + der) / 2;
            ordenarM(array, temp, izq, centro);
            ordenarM(array, temp, centro + 1, der);
            mezcla(array, temp, izq, centro, centro + 1, der);
        }
    }

        private static void ordenarMDesc(ArrayList<Marca> array, Marca temp[], int izq, int der) {
        int centro;
        if (izq < der) {
            centro = (int) (izq + der) / 2;
            ordenarMDesc(array, temp, izq, centro);
            ordenarMDesc(array, temp, centro + 1, der);
            mezclaDesc(array, temp, izq, centro, centro + 1, der);
        }
    }
    public void ordenarMezcla() {
        Marca temp[] = new Marca[arregloMarcas.size()];
        ordenarM(arregloMarcas, temp, 0, arregloMarcas.size() - 1);
    }
    
     public void ordenarMezclaDesc() {
        Marca temp[] = new Marca[arregloMarcas.size()];
        ordenarMDesc(arregloMarcas, temp, 0, arregloMarcas.size() - 1);
    }


    public static void intercambio(ArrayList<Marca> array, int a, int b) {
        Marca temp;
        temp = array.get(a);
        array.set(a, array.get(b));
        array.set(b, temp);
    }

        
        public void sort(){
            Collections.sort(arregloMarcas);

        }

}
