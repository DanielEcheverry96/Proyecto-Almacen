/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;

/**
 *
 * @author Unalman
 */
public interface ICRUD {
    public boolean insertar(Object obj);
    public boolean modificar(Object obj);
    public Object  consultar(Object obj);
    public boolean borrar(Object obj);
    public ArrayList consultarTodos();
    
    
}
