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
    public boolean modificar(int id, Object obj) {
        boolean var = false;
        if (obj instanceof Impresores) {
            Impresores temp = new Impresores();
            temp = (Impresores) obj;
            cateofi.arregloimpresores.set(id, temp);
            var = true;
        }
        return var;
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
         if (!(busquedaBinaria(id) == -1)){
            Impresores resultado = new Impresores();
            resultado = cateofi.arregloimpresores.get(busquedaBinaria(id));
            return resultado;
        }
        return null;
    }

    @Override
    public boolean borrar(int id) {
        cateofi.arregloimpresores.remove(id);
        return true;
    }

    @Override
    public ArrayList consultarTodos() {
       System.out.println(CategoriaElectronicosOficina.arregloimpresores.toString());
       return CategoriaElectronicosOficina.arregloimpresores;
    }

    @Override
    public boolean borrarTodo(int id) {
        cateofi.arregloimpresores.clear();
        return true;
    }
    
}
