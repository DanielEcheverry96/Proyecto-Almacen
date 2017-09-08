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
    public boolean modificar(int id, Object obj) {
        boolean var = false;
        if (obj instanceof Martillos) {
            Martillos temp = new Martillos();
            temp = (Martillos) obj;
            cateher.arreglomartillos.set(id, temp);
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
        if (!(busquedaBinaria(id) == -1)){
        Martillos resultado = new Martillos();
            resultado = cateher.arreglomartillos.get(busquedaBinaria(id));
            return resultado;
        }
        return null;
    }

    @Override
    public boolean borrar(int id) {
        cateher.arreglomartillos.remove(id);
        return true;
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
    
    
    
}
