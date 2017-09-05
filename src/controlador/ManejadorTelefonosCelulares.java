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
    
    private boolean existeCelular(TelefonosCelulares telcel){
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
            telcelu = (TelefonosCelulares)obj;
            if (!existeCelular(telcelu)) {
                cateofi.arreglotelefonoscelulares.add(telcelu);
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
       Collections.sort(CategoriaElectronicosOficina.arreglotelefonoscelulares);
       int n = CategoriaElectronicosOficina.arreglotelefonoscelulares.size();
       int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (CategoriaElectronicosOficina.arreglotelefonoscelulares.get(centro).getIdArticulo() == id) {
                return (centro);
            }
            else if (id<CategoriaElectronicosOficina.arreglotelefonoscelulares.get(centro).getIdArticulo()) {
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
       TelefonosCelulares resultado = new TelefonosCelulares();
       resultado = CategoriaElectronicosOficina.arreglotelefonoscelulares.get(busquedaBinaria(id));
       return resultado;
    }

    @Override
    public boolean borrar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList consultarTodos() {
       System.out.println(CategoriaElectronicosOficina.arreglotelefonoscelulares.toString());
       return CategoriaElectronicosOficina.arreglotelefonoscelulares;
    }
    
}