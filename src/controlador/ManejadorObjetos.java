/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.Marca;

/**
 *
 * @author Unalman
 */
public class ManejadorObjetos implements ICRUD {

    ArrayList<Marca> arregloMarcas;

    public ManejadorObjetos() {
        arregloMarcas = new ArrayList<Marca>();
    }

    private boolean existemarca(Marca mar){
        boolean existe = false;
        if (arregloMarcas.contains(mar)) {
            existe = true;
        }
        return existe;
    }
    
    @Override
    public boolean insertar(Object obj) {
        boolean insertado = false;
        if (obj instanceof Marca) {
            //adicionar datos al arreglo
            Marca mar = new Marca();
            mar = (Marca) obj;
            arregloMarcas.add(mar);
            if (!existemarca(mar)) {
                arregloMarcas.add(mar);
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

    @Override
    public Object consultarId(int id) {
        Marca resultado = new Marca();
        resultado = arregloMarcas.get(busquedaBinaria(id));
        return resultado;
    }

    @Override
    public int busquedaBinaria(int id) {
        Collections.sort(arregloMarcas);
        int n = arregloMarcas.size();
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (arregloMarcas.get(centro).getId() == id) {
                return centro;

            } else if (id < arregloMarcas.get(centro).getId()) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        return -1;
    }

    @Override
    public boolean borrar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList consultarTodos() {
        System.out.println(arregloMarcas.toString());
        return arregloMarcas;
    }

}
