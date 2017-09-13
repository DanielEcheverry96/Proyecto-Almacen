package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.Categorias;

/**
 *
 * @author Usuario
 */
public class ManejadorCategorias implements ICRUD {

    ArrayList<Categorias> arregloCategorias;

    public ManejadorCategorias() {
        arregloCategorias = new ArrayList<Categorias>();
    }

   private boolean existecategoria(Categorias cate) {
        boolean existe = false;
        if (arregloCategorias.contains(cate)) {
            existe = true;
        }
        return existe;
    }
      
    @Override
    public boolean insertar(Object obj) {
        boolean insertado = false;
        if (obj instanceof Categorias) {
            //Adicionar datos al arreglo
            Categorias cat = new Categorias();
            cat = (Categorias) obj;
            arregloCategorias.add(cat);
            if (!existecategoria(cat)) {
                arregloCategorias.add(cat);
                insertado = true;
            }
            return insertado;
        }
        return insertado;
    }

    @Override
    public boolean modificar(int posicion, Object obj) {
        boolean var = false;
        if (obj instanceof Categorias) {
            Categorias temp = new Categorias();
            temp = (Categorias) obj;
            arregloCategorias.set(posicion, temp);
            var = true;
        }
        return var;
    }

    @Override
    public boolean borrar(int id) {
        
        int posicion = busquedaBinaria(id);
        if (!(posicion==-1)) {
            arregloCategorias.remove(posicion);
            return true;
        }
        
        return false;
    }

    @Override
    public ArrayList consultarTodos() {
        System.out.println(arregloCategorias.toString());
        return arregloCategorias;
    }

    @Override
    public int busquedaBinaria(int id) {
        Collections.sort(arregloCategorias);
        int n = arregloCategorias.size();
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (arregloCategorias.get(centro).getId() == id) {
                return centro;

            } else if (id < arregloCategorias.get(centro).getId()) {
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
        Categorias resultado = new Categorias();
            resultado = arregloCategorias.get(busquedaBinaria(id));
            return resultado;
        }
        return null;
    }

    @Override
    public boolean borrarTodo() {
        arregloCategorias.clear();
        return true;
    }

}
