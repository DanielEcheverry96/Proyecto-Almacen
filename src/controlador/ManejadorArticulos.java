package controlador;

import java.util.ArrayList;
import java.util.Collections;
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

      private boolean existearticulo(Articulos arti) {
        boolean existe = false;
        if (arregloArticulos.contains(arti)) {
            existe = true;
        }
        return existe;
    }
      
    @Override
    public boolean insertar(Object obj) {
        boolean insertado = false;
        if (obj instanceof Articulos) {
            //Adicionar datos al arreglo
            Articulos art = new Articulos();
            art = (Articulos) obj;
            arregloArticulos.add(art);
            if (!existearticulo(art)) {
                arregloArticulos.add(art);
                insertado = true;
            }
            return insertado;
        }
        return insertado;
    }

    @Override
    public boolean modificar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
//    public Object consultar(Object obj) {
//        Articulos art = new Articulos();
//        if (obj instanceof Articulos) {
//            art = (Articulos) obj;
//            for (Articulos art1 : arregloArticulos) {
//                return art1;
//            }
//        }
//        return art;
//    }
    @Override
    public boolean borrar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList consultarTodos() {
        System.out.println(arregloArticulos.toString());
        return arregloArticulos;
    }

    @Override
    public int busquedaBinaria(int id) {
        Collections.sort(arregloArticulos);
        int n = arregloArticulos.size();
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (arregloArticulos.get(centro).getIdArticulo() == id) {
                return centro;

            } else if (id < arregloArticulos.get(centro).getIdArticulo()) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        return -1;
    }

    @Override
    public Object consultarId(int id) {
        Articulos resultado = new Articulos();
        resultado = arregloArticulos.get(busquedaBinaria(id));
        return resultado;
    }

}
