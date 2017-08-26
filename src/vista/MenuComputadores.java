/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ManejadorComputadores;
import java.util.Scanner;
import modelo.Computadores;

/**
 *
 * @author Usuario
 */
public class MenuComputadores {

    Scanner leer = new Scanner(System.in);
    ManejadorComputadores mancomp = new ManejadorComputadores();
    //MenuCategoriaElectronicosOficina menofi = new MenuCategoriaElectronicosOficina();

    public void insertarComputadores() {

        Computadores compu = new Computadores();
        System.out.println("digite el id");
        compu.setIdArticulo(leer.nextInt());
        System.out.println("La marca");
        compu.setNombre(leer.next());
        System.out.println("Precio");
        compu.setPrecio(leer.nextFloat());
        System.out.println("Tipo pantalla");
        compu.setTipopantalla(leer.next());
        System.out.println("Tipo mouse");
        compu.setTipomouse(leer.next());
        System.out.println("Tipo teclado");
        compu.setTipoteclado(leer.next());
        System.out.println("Capacidad memoria");
        compu.setCapmemoria(leer.next());
        System.out.println("Tipo pantalla");
        compu.setTipopantalla(leer.next());

        if (mancomp.insertar(compu)) {
            System.out.println("Compu insertado");
        } else {
            System.out.println("Compu No insertado");
        }

    }

//    public void consultarUnComputador() {
//        System.out.println("Digite el ID a buscar");
//        int a = leer.nextInt();
//        Computadores resultado = (Computadores) mancomp.consultarId(a);
//        System.out.println("Los datos consultados son " + resultado.toString());
//
//    }
    public void menuComputador() {
        String condicion = "";

        do {
            Scanner menu = new Scanner(System.in);
            System.out.println("1- Insertar computador");
            System.out.println("2- Consultar todos los computadores");
            System.out.println("3- Consultar por Id del computador");
            System.out.println("4- Modificar computador");
            System.out.println("5- Eliminar computador");
            System.out.println("Digite su opción");
            int opcion = menu.nextInt();
            switch (opcion) {
                case 1:
                    insertarComputadores();
                    break;
//                case 2:
//                    mancomp.consultarTodos();
//                    break;
//                case 3:
//                    consultarUnComputador();
//                    break;

                default:
                    System.out.println("Opcion no permitida");
            }
            System.out.println("Desea retornar al menu de Marcas S/s");
            condicion = menu.next();
        } while (condicion.equalsIgnoreCase("s"));

        return;
    }
}
