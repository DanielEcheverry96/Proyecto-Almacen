/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Marca;

/**
 *
 * @author Unalman
 */
public class ManejadorObjetos implements ICRUD{
    ArrayList<Marca> arregloMarcas;

    public ManejadorObjetos() {
        arregloMarcas = new ArrayList<Marca>();
    }
    
    @Override
    public boolean insertar(Object obj) {
        boolean insertado=false;
        if(obj instanceof Marca)
        {
            //adicionar datos al arreglo
            Marca mar= new Marca();
            mar=(Marca)obj;
            arregloMarcas.add(mar);
            insertado= true;
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
        Marca mar= new Marca();
        if(obj instanceof Marca)
        {
            
            mar=(Marca)obj;
            for(Marca mar1: arregloMarcas)
            {
                if(mar1.equals(mar))
                    return mar1;
            }    
            
        }
        
        return mar;
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
