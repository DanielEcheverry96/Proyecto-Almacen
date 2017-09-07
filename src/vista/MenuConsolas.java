/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ManejadorConsolas;
import java.util.Scanner;
import modelo.Consolas;

/**
 *
 * @author Daniel
 */
public class MenuConsolas {
    Scanner leer = new Scanner(System.in);
    ManejadorConsolas mancons = new ManejadorConsolas();
    
    public void insertarConsolas(){
        
        Consolas cons = new Consolas();
        
        System.out.println("Digite el ID de la consola");
        cons.setIdArticulo(leer.nextInt());
        System.out.println("Digite el Id de la marca de la consola");
        cons.setNombre(leer.next());
        System.out.println("Digite el Id de la categoria");
        cons.setIdCategoria(leer.nextInt());
        System.out.println("Digite el nombre del articulo");
        cons.setNombre(leer.next());
        System.out.println("Digite la cantidad del articulo");
        cons.setCantidad(leer.nextInt());
        System.out.println("Digite el precio");
        cons.setPrecio(leer.nextFloat());
        System.out.println("Color");
        cons.setColor(leer.next());
        System.out.println("Url Imagen");
        cons.setImagen(leer.next());
        System.out.println("Digite el tipo de consola");
        cons.setTipo(leer.next());
        System.out.println("Digite el numero de controles");
        cons.setNumcontroles(leer.nextInt());
        System.out.println("Digite si tiene realidad virtual incluida");
        cons.setRealidadvir(leer.next());
        System.out.println("Digite la capacidad del disco duro de la consola");
        cons.setCapdiscoduro(leer.next());
        
        if (mancons.insertar(cons)) {
            System.out.println("Consola insertada");
        } else {
            System.out.println("Consola No insertada");
        }

    }
public void consultarUnaConsola() {
        System.out.println("Digite el ID a buscar");
        int a = leer.nextInt();
        Consolas resultado = (Consolas) mancons.consultarId(a);
        if (resultado == null) {
            System.out.println("No se encontro el articulo");
        }
        else{
            System.out.println("Los datos consultados son " + resultado.toString());
        }
    }
    public void menuConsolas() {
        String condicion = "";

        do {
            Scanner menu = new Scanner(System.in);
            System.out.println("1- Insertar consola");
            System.out.println("2- Consultar todas las consolas");
            System.out.println("3- Consultar por Id de la consola");
            System.out.println("4- Modificar consola");
            System.out.println("5- Eliminar consola");
            System.out.println("Digite su opción");
            int opcion = menu.nextInt();
            switch (opcion) {
                case 1:
                    insertarConsolas();
                    break;
                case 2:
                    mancons.consultarTodos();
                    break;
                case 3:
                    consultarUnaConsola();
                    break;

                default:
                    System.out.println("Opcion no permitida");
            }
            System.out.println("Desea retornar al menu de Consolas S/s");
            condicion = menu.next();
        } while (condicion.equalsIgnoreCase("s"));

        return;
    }
}

