/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.CategoriaVideojuegos;
import modelo.Consolas;

/**
 *
 * @author Daniel
 */
public class ManejadorConsolas implements ICRUD {
    
    CategoriaVideojuegos catevid = new CategoriaVideojuegos();

    private boolean existeconsola(Consolas cons) {
        boolean existe = false;
        if (catevid.arregloconsolas.contains(cons)) {
            existe = true;
        }
        return existe;
    }

    @Override
    public boolean insertar(Object obj) {
        boolean inserto = false;
        if (obj instanceof Consolas) {
            Consolas cons = new Consolas();
            cons = (Consolas) obj;
            if (!existeconsola(cons)) {
                catevid.arregloconsolas.add(cons);
                inserto = true;
            }
            return inserto;
        }
        return inserto;
    }

    @Override
    public boolean modificar(int id, Object obj) {
        boolean var = false;
        if (obj instanceof Consolas) {
            Consolas temp = new Consolas();
            temp = (Consolas) obj;
            catevid.arregloconsolas.set(id, temp);
            var = true;
        }
        return var;
    }

    @Override
    public int busquedaBinaria(int id) {
        Collections.sort(CategoriaVideojuegos.arregloconsolas);
        int n = CategoriaVideojuegos.arregloconsolas.size();
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (CategoriaVideojuegos.arregloconsolas.get(centro).getIdArticulo() == id) {
                return centro;

            } else if (id < CategoriaVideojuegos.arregloconsolas.get(centro).getIdArticulo()) {
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
        Consolas resultado = new Consolas();
            resultado = catevid.arregloconsolas.get(busquedaBinaria(id));
            return resultado;
        }
        return null;
    }

    @Override
    public boolean borrar(int id) {
        catevid.arregloconsolas.remove(id);
        return true;
    }

    @Override
    public ArrayList consultarTodos() {
        System.out.println(CategoriaVideojuegos.arregloconsolas.toString());
        return CategoriaVideojuegos.arregloconsolas;
    }

    @Override
    public boolean borrarTodo(int id) {
        catevid.arregloconsolas.clear();
        return true;
    }
    
    
    
}
