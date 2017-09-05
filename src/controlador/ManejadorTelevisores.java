/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.CategoriaElectrodomesticos;
import modelo.Televisores;

/**
 *
 * @author Daniel
 */
public class ManejadorTelevisores implements ICRUD {
    CategoriaElectrodomesticos catedom = new CategoriaElectrodomesticos();
    
    private boolean existetelevisor(Televisores tv) {
        boolean existe = false;
        if (catedom.arreglotelevisores.contains(tv)) {
            existe = true;
        }
        return existe;
    }

    @Override
    public boolean insertar(Object obj) {
        boolean inserto = false;
        if (obj instanceof Televisores) {
            Televisores tv = new Televisores();
            tv = (Televisores) obj;
            if (!existetelevisor(tv)) {
                catedom.arreglotelevisores.add(tv);
                inserto=true;
            }
            return inserto;
        }
        return inserto;
    }

    @Override
    public boolean modificar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int busquedaBinaria(int id) {
        Collections.sort(CategoriaElectrodomesticos.arreglotelevisores);
        int n = CategoriaElectrodomesticos.arreglotelevisores.size();
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (CategoriaElectrodomesticos.arreglotelevisores.get(centro).getIdArticulo() == id) {
                return centro;

            } else if (id < CategoriaElectrodomesticos.arreglotelevisores.get(centro).getIdArticulo()) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        return -1;
    }

    @Override
    public Object consultarId(int id) {
        Televisores resultado = new Televisores();
       resultado = CategoriaElectrodomesticos.arreglotelevisores.get(busquedaBinaria(id));
       return resultado;
    }

    @Override
    public boolean borrar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList consultarTodos() {
        System.out.println(CategoriaElectrodomesticos.arreglotelevisores.toString());
        return CategoriaElectrodomesticos.arreglotelevisores;
    }
    
}
