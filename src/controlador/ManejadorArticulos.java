package controlador;

import java.util.ArrayList;
import modelo.Articulos;

/**
 *
 * @author Usuario
 */
public class ManejadorArticulos implements ICRUD {

    ArrayList<Articulos> arregloArticulos;

    public ManejadorArticulos() {
        arregloArticulos = new ArrayList<Articulos>();
    }

    @Override
    public boolean insertar(Object obj) {
        boolean insertado = false;
        if (obj instanceof Articulos) {
            //Adicionar datos al arreglo
            Articulos art = new Articulos();
            art = (Articulos) obj;
            arregloArticulos.add(art);
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
        Articulos art = new Articulos();
        if (obj instanceof Articulos) {
            art = (Articulos) obj;
            for (Articulos art1 : arregloArticulos) {
                return art1;
            }
        }
        return art;
    }

    @Override
    public boolean borrar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList consultarTodos() {
        System.out.println(arregloArticulos.toString());
        return arregloArticulos;
    }

}
