/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.CategoriaElectronicosOficina;
import modelo.Impresores;

/**
 *
 * @author danie
 */
public class ManejadorImpresores implements ICRUD{

    CategoriaElectronicosOficina   cateofi = new CategoriaElectronicosOficina();
    
      private boolean existeImpresor(Impresores impre){
        boolean existe = false;
        if (cateofi.arregloimpresores.contains(impre)) {
            existe = true;
        }
        return existe;
    }
      
    @Override
    public boolean insertar(Object obj) {
        boolean inserto = false;
        if (obj instanceof Impresores) {
            Impresores impre = new Impresores();
            impre = (Impresores)obj;
            if (!existeImpresor(impre)) {
                cateofi.arregloimpresores.add(impre);
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
       Collections.sort(CategoriaElectronicosOficina.arregloimpresores);
       int n = CategoriaElectronicosOficina.arregloimpresores.size();
       int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (CategoriaElectronicosOficina.arregloimpresores.get(centro).getIdArticulo() == id) {
                return (centro);
            }
            else if (id<CategoriaElectronicosOficina.arregloimpresores.get(centro).getIdArticulo()) {
                sup = centro - 1;
            }
            else {
                inf = centro + 1;
            }
        }
        return -1;
        
    }

    @Override
    public Object consultarId(int id) {
       Impresores resultado = new Impresores();
       resultado = CategoriaElectronicosOficina.arregloimpresores.get(busquedaBinaria(id));
       return resultado;
    }

    @Override
    public boolean borrar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList consultarTodos() {
       System.out.println(CategoriaElectronicosOficina.arregloimpresores.toString());
       return CategoriaElectronicosOficina.arregloimpresores;
    }
    
}
