/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.CategoriaElectronicosOficina;
import modelo.Computadores;

/**
 *
 * @author Usuario
 */
public class ManejadorComputadores implements ICRUD {

    CategoriaElectronicosOficina cateofi = new CategoriaElectronicosOficina();

    private boolean existecomputador(Computadores comp) {
        boolean existe = false;
        if (cateofi.arreglocomputadores.contains(comp)) {
            existe = true;
        }
        return existe;
    }

    @Override
    public boolean insertar(Object obj) {
        boolean inserto = false;
        if (obj instanceof Computadores) {
            Computadores compu = new Computadores();
            compu = (Computadores) obj;
            if (!existecomputador(compu)) {
                cateofi.arreglocomputadores.add(compu);
                inserto = true;
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
        Collections.sort(CategoriaElectronicosOficina.arreglocomputadores);
        int n = CategoriaElectronicosOficina.arreglocomputadores.size();
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (CategoriaElectronicosOficina.arreglocomputadores.get(centro).getIdArticulo() == id) {
                return centro;

            } else if (id < CategoriaElectronicosOficina.arreglocomputadores.get(centro).getIdArticulo()) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        return -1;
    }

    @Override
    public Object consultarId(int id) {
        Computadores resultado = new Computadores();
        resultado = CategoriaElectronicosOficina.arreglocomputadores.get(busquedaBinaria(id));
        return resultado;
    }

    @Override
    public boolean borrar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList consultarTodos() {
        System.out.println(CategoriaElectronicosOficina.arreglocomputadores.toString());
        return CategoriaElectronicosOficina.arreglocomputadores;
    }

}