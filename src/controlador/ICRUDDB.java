/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author Daniel
 */
public interface ICRUDDB {

    public boolean insertar(Object obj);

    public boolean modificar(int id, Object obj);

    public int busquedaBinaria(int id);

    public Object consultarId(int id);

    public boolean borrar(int id);

    public boolean borrarTodo();

    public void consultarTodos();

}
