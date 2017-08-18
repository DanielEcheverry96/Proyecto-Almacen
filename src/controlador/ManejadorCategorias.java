package controlador;

import java.util.ArrayList;
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

    @Override
    public boolean insertar(Object obj) {
        boolean insertado = false;
        if (obj instanceof Categorias) {
            //Adicionar datos al arreglo
            Categorias cat = new Categorias();
            cat = (Categorias) obj;
            arregloCategorias.add(cat);
            insertado = true;
            return insertado;
        }
        return insertado;
    }

    @Override
    public boolean modificar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object consultar(Object obj) {
        Categorias cat = new Categorias();
        if (obj instanceof Categorias) {
            cat = (Categorias) obj;
            for (Categorias cat1 : arregloCategorias) {
                return cat1;
            }
        }
        return cat;
    }

    @Override
    public boolean borrar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList consultarTodos() {
        System.out.println(arregloCategorias.toString());
        return arregloCategorias;
    }

}
