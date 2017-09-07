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
public class ManejadorTelefonosIp implements ICRUD{
    
    CategoriaElectronicosOficina   cateofi = new CategoriaElectronicosOficina();
        
    private boolean existeTelefonoIp(TelefonosIp telip){
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
            telip = (TelefonosIp)obj;
            if (!existeTelefonoIp(telip)) {
                cateofi.arreglotelefonosip.add(telip);
                inserto = true;
            }
            return inserto;
        }
        return inserto;
    }

    @Override
    public boolean modificar(int id, Object obj) {
        boolean var = false;
        if (obj instanceof TelefonosIp) {
            TelefonosIp temp = new TelefonosIp();
            temp = (TelefonosIp) obj;
            cateofi.arreglotelefonosip.set(id, temp);
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
            }
            else if (id<CategoriaElectronicosOficina.arreglotelefonosip.get(centro).getIdArticulo()) {
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
            TelefonosIp resultado = new TelefonosIp();
            resultado = cateofi.arreglotelefonosip.get(busquedaBinaria(id));
            return resultado;
        }
        return null;
        
    }

    @Override
    public boolean borrar(int id) {
        cateofi.arreglotelefonosip.remove(id);
        return true;
    }

    @Override
    public ArrayList consultarTodos() {
       System.out.println(CategoriaElectronicosOficina.arreglotelefonosip.toString());
       return CategoriaElectronicosOficina.arreglotelefonosip;
    }

    @Override
    public boolean borrarTodo(int id) {
        cateofi.arreglotelefonosip.clear();
        return true;
    }
    
}
