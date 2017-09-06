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
    public boolean modificar(int id, Object obj) {
        boolean var = false;
        if (obj instanceof Hornoselectricosygas) {
            Hornoselectricosygas temp = new Hornoselectricosygas();
            temp = (Hornoselectricosygas) obj;
            catedom.arreglohornoselectricosygas.set(id, temp);
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
        Hornoselectricosygas resultado = new Hornoselectricosygas();
       resultado = CategoriaElectrodomesticos.arreglohornoselectricosygas.get(busquedaBinaria(id));
       return resultado;
    }

    @Override
    public boolean borrar(int id) {
        catedom.arreglohornoselectricosygas.remove(id);
        return true;
    }

    @Override
    public ArrayList consultarTodos() {
        System.out.println(CategoriaElectrodomesticos.arreglohornoselectricosygas.toString());
        return CategoriaElectrodomesticos.arreglohornoselectricosygas;
    }
    
    @Override
    public boolean borrarTodo(int id) {
        catedom.arreglohornoselectricosygas.clear();
        return true;
    }

    
}
