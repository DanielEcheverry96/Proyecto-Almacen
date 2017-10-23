/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.CategoriaElectrodomesticos;
import modelo.Hornoselectricosygas;

/**
 *
 * @author Daniel
 */
public class ManejadorHornoselectricosygas implements ICRUD {
    CategoriaElectrodomesticos catedom = new CategoriaElectrodomesticos();
    
    private boolean existehornoelecgas(Hornoselectricosygas heg) {
        boolean existe = false;
        if (catedom.arreglohornoselectricosygas.contains(heg)) {
            existe = true;
        }
        return existe;
    }

    @Override
    public boolean insertar(Object obj) {
        boolean inserto = false;
        if (obj instanceof Hornoselectricosygas) {
            Hornoselectricosygas heg = new Hornoselectricosygas();
            heg = (Hornoselectricosygas) obj;
            if (!existehornoelecgas(heg)) {
                catedom.arreglohornoselectricosygas.add(heg);
                inserto=true;
            }
            return inserto;
        }
        return inserto;
    }

    @Override
    public boolean modificar(int posicion, Object obj) {
        boolean var = false;
        if (obj instanceof Hornoselectricosygas) {
            Hornoselectricosygas temp = new Hornoselectricosygas();
            temp = (Hornoselectricosygas) obj;
            catedom.arreglohornoselectricosygas.set(posicion, temp);
            var = true;
        }
        return var;
    }

    @Override
    public int busquedaBinaria(int id) {
        Collections.sort(CategoriaElectrodomesticos.arreglohornoselectricosygas);
        int n = CategoriaElectrodomesticos.arreglohornoselectricosygas.size();
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (CategoriaElectrodomesticos.arreglohornoselectricosygas.get(centro).getIdArticulo() == id) {
                return centro;

            } else if (id < CategoriaElectrodomesticos.arreglohornoselectricosygas.get(centro).getIdArticulo()) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        return -1;
    }

    @Override
    public Object consultarId(int id) {
         if (!(busquedaBinaria(id) == -1)){
            Hornoselectricosygas resultado = new Hornoselectricosygas();
            resultado = catedom.arreglohornoselectricosygas.get(busquedaBinaria(id));
            return resultado;
        }
        return null;
    }

    @Override
    public boolean borrar(int id) {
        
        int posicion = busquedaBinaria(id);
        if (!(posicion==-1)) {
            catedom.arreglohornoselectricosygas.remove(posicion);
            return true;
        }
        
        return false;
    }

    @Override
    public ArrayList consultarTodos() {
        System.out.println(CategoriaElectrodomesticos.arreglohornoselectricosygas.toString());
        return CategoriaElectrodomesticos.arreglohornoselectricosygas;
    }
    
    @Override
    public boolean borrarTodo() {
        catedom.arreglohornoselectricosygas.clear();
        return true;
    }

        private static void mezcla(ArrayList<Hornoselectricosygas> array, Hornoselectricosygas temp[], int izq, int fizq, int der, int fder){
        int postemp=izq, numele, i;
        numele=fder-izq+1;
        while(izq<=fizq && der<=fder)
        {
            if (array.get(izq).getNombre().compareTo(array.get(der).getNombre())<0)
                temp[postemp++]=array.get(izq++);
            else
                temp[postemp++]=array.get(der++);
        }
        while (izq<=fizq)
            temp[postemp++]=array.get(izq++);
        while (der<=fder)
            temp[postemp++]=array.get(der++);
        for (i=0; i<numele; i++,fder--)
            array.set(fder,temp[fder]);
    }
        
                private static void mezclaDesc(ArrayList<Hornoselectricosygas> array, Hornoselectricosygas temp[], int izq, int fizq, int der, int fder){
        int postemp=izq, numele, i;
        numele=fder-izq+1;
        while(izq<=fizq && der<=fder)
        {
            if (array.get(izq).getNombre().compareTo(array.get(der).getNombre())>0)
                temp[postemp++]=array.get(izq++);
            else
                temp[postemp++]=array.get(der++);
        }
        while (izq<=fizq)
            temp[postemp++]=array.get(izq++);
        while (der<=fder)
            temp[postemp++]=array.get(der++);
        for (i=0; i<numele; i++,fder--)
            array.set(fder,temp[fder]);
    }
    
    
    private static void ordenarM(ArrayList<Hornoselectricosygas> array, Hornoselectricosygas temp[], int izq, int der){
        int centro;
        if (izq < der)
        {
            centro=(int)(izq+der)/2;
            ordenarM(array, temp, izq, centro);
            ordenarM(array, temp, centro+1, der);
            mezcla(array, temp, izq, centro, centro+1, der);
        }
    }
    
        
    private static void ordenarMDesc(ArrayList<Hornoselectricosygas> array, Hornoselectricosygas temp[], int izq, int der){
        int centro;
        if (izq < der)
        {
            centro=(int)(izq+der)/2;
            ordenarMDesc(array, temp, izq, centro);
            ordenarMDesc(array, temp, centro+1, der);
            mezclaDesc(array, temp, izq, centro, centro+1, der);
        }
    }
    
    public void ordenarMezcla(){
        Hornoselectricosygas temp[]=new Hornoselectricosygas [CategoriaElectrodomesticos.arreglohornoselectricosygas.size()];
        ordenarM(CategoriaElectrodomesticos.arreglohornoselectricosygas,temp,0,CategoriaElectrodomesticos.arreglohornoselectricosygas.size()-1);
    }
    
     public void ordenarMezclaDesc(){
        Hornoselectricosygas temp[]=new Hornoselectricosygas [CategoriaElectrodomesticos.arreglohornoselectricosygas.size()];
        ordenarMDesc(CategoriaElectrodomesticos.arreglohornoselectricosygas,temp,0,CategoriaElectrodomesticos.arreglohornoselectricosygas.size()-1);
    }
    
    public static void intercambio(ArrayList<Hornoselectricosygas> array, int a, int b){
        Hornoselectricosygas temp;
        temp = array.get(a);
        array.set(a, array.get(b));
        array.set(b, temp);
    }
    
    public static int pivote(ArrayList<Hornoselectricosygas> array, int prim, int ult, int piv)
{
     float p = array.get(piv).getPrecio();
     int j = prim;
     int i;
     intercambio(array, piv, ult);
     for (i = prim; i < ult; i++)
     {
          if (array.get(i).getPrecio() <= p)
          {
               intercambio(array, i, j);
               j++;
          }
     }
     intercambio(array, j, ult);
     return j;
}
    
        public static int pivoteDesc(ArrayList<Hornoselectricosygas> array, int prim, int ult, int piv)
{
     float p = array.get(piv).getPrecio();
     int j = prim;
     int i;
     intercambio(array, piv, ult);
     for (i = prim; i < ult; i++)
     {
          if (array.get(i).getPrecio() > p)
          {
               intercambio(array, i, j);
               j++;
          }
     }
     intercambio(array, j, ult);
     return j;
}
    public static void  quicksortt(ArrayList<Hornoselectricosygas> array, int inicio, int fin)
{
   int medio;
   if (inicio < fin)
   {
       medio=pivote(array, inicio, fin, fin);
       quicksortt(array, inicio, medio-1);
       quicksortt(array, medio+1, fin);
   }
}

        public static void  quicksorttDesc(ArrayList<Hornoselectricosygas> array, int inicio, int fin)
{
   int medio;
   if (inicio < fin)
   {
       medio=pivoteDesc(array, inicio, fin, fin);
       quicksorttDesc(array, inicio, medio-1);
       quicksorttDesc(array, medio+1, fin);
   }
}
public void quicksort()
{
   quicksortt(CategoriaElectrodomesticos.arreglohornoselectricosygas, 0, CategoriaElectrodomesticos.arreglohornoselectricosygas.size()-1);
}

public void quicksortDesc()
{
   quicksorttDesc(CategoriaElectrodomesticos.arreglohornoselectricosygas, 0, CategoriaElectrodomesticos.arreglohornoselectricosygas.size()-1);
}
}
