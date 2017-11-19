/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.Usuario;

/**
 *
 * @author danie
 */
public class ManejadorUsuario implements ICRUD {

    public static ArrayList<Usuario> arregloUsuario = new ArrayList<Usuario>();
    public static Usuario admin = new Usuario("admin", "admin", 2);

    private boolean existecomputador(Usuario comp) {
        boolean existe = false;
        if (arregloUsuario.contains(comp)) {
            existe = true;
        }
        return existe;
    }

    @Override
    public boolean insertar(Object obj) {
        boolean inserto = false;
        if (obj instanceof Usuario) {
            Usuario temp = new Usuario();
            temp = (Usuario) obj;
            if (!existecomputador(temp)) {
                arregloUsuario.add(temp);
                inserto = true;
            }
            return inserto;
        }
        return inserto;
    }

    @Override
    public boolean modificar(int id, Object obj) {
        boolean var = false;
        if (obj instanceof Usuario) {
            Usuario temp = new Usuario();
            temp = (Usuario) obj;
            arregloUsuario.set(id, temp);
            var = true;
        }
        return var;
    }

    @Override
    public int busquedaBinaria(int id) {
        Collections.sort(arregloUsuario);
        int n = arregloUsuario.size();
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (arregloUsuario.get(centro).getCedula() == id) {
                return centro;

            } else if (id < arregloUsuario.get(centro).getCedula()) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        return -1;
    }

    @Override
    public Object consultarId(int id) {
        if (!(busquedaBinaria(id) == -1)) {
            Usuario resultado = new Usuario();
            resultado = arregloUsuario.get(busquedaBinaria(id));
            return resultado;
        }
        return null;
    }

    @Override
    public boolean borrar(int id) {
        int posicion = busquedaBinaria(id);
        if (!(posicion == -1)) {
            arregloUsuario.remove(posicion);
            return true;
        }

        return false;
    }

    @Override
    public boolean borrarTodo() {
        arregloUsuario.clear();
        return true;
    }

    @Override
    public ArrayList consultarTodos() {
        System.out.println(arregloUsuario.toString());
        return arregloUsuario;
    }

    public void sort() {
        Collections.sort(arregloUsuario);

    }

}
