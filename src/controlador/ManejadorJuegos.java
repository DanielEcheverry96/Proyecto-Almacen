/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.CategoriaVideojuegos;
import modelo.Juegos;

/**
 *
 * @author Daniel
 */
public class ManejadorJuegos implements ICRUD {
    
    CategoriaVideojuegos catevid = new CategoriaVideojuegos();

    private boolean existejuego(Juegos jueg) {
        boolean existe = false;
        if (catevid.arreglojuegos.contains(jueg)) {
            existe = true;
        }
        return existe;
    }

    @Override
    public boolean insertar(Object obj) {
        boolean inserto = false;
        if (obj instanceof Juegos) {
            Juegos jueg = new Juegos();
            jueg = (Juegos) obj;
            if (!existejuego(jueg)) {
                catevid.arreglojuegos.add(jueg);
                inserto = true;
            }
            return inserto;
        }
        return inserto;
    }

    @Override
    public boolean modificar(int posicion, Object obj) {
        boolean var = false;
        if (obj instanceof Juegos) {
            Juegos temp = new Juegos();
            temp = (Juegos) obj;
            catevid.arreglojuegos.set(posicion, temp);
            var = true;
        }
        return var;
    }

    @Override
    public int busquedaBinaria(int id) {
        Collections.sort(CategoriaVideojuegos.arreglojuegos);
        int n = CategoriaVideojuegos.arreglojuegos.size();
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (CategoriaVideojuegos.arreglojuegos.get(centro).getIdArticulo() == id) {
                return centro;

            } else if (id < CategoriaVideojuegos.arreglojuegos.get(centro).getIdArticulo()) {
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
        Juegos resultado = new Juegos();
            resultado = catevid.arreglojuegos.get(busquedaBinaria(id));
            return resultado;
        }
        return null;
    }

    @Override
    public boolean borrar(int id) {
        
        int posicion = busquedaBinaria(id);
        if (!(posicion==-1)) {
            catevid.arreglojuegos.remove(posicion);
            return true;
        }
        
        return false;
    }

    @Override
    public ArrayList consultarTodos() {
        System.out.println(CategoriaVideojuegos.arreglojuegos.toString());
        return CategoriaVideojuegos.arreglojuegos;
    }

    @Override
    public boolean borrarTodo() {
        catevid.arreglojuegos.clear();
        return true;
    }
    
    
    
}
