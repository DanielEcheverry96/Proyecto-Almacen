/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ManejadorTelevisores;
import java.util.Scanner;
import modelo.Televisores;

/**
 *
 * @author Daniel
 */
public class MenuTelevisores {
    Scanner leer = new Scanner(System.in);
    ManejadorTelevisores mantv = new ManejadorTelevisores();

    public void insertarTelevisores() {
        Televisores tv = new Televisores();
        System.out.println("Digite el ID de la nevera");
        tv.setIdArticulo(leer.nextInt());
        System.out.println("Digite la marca de la nevera");
        tv.setNombre(leer.next());
        System.out.println("Digite el precio");
        tv.setPrecio(leer.nextFloat());
        System.out.println("Digite el tipo de televisor");
        tv.setTipotelevisor(leer.next());
        System.out.println("Digite el tamaño de pantalla");
        tv.setTampantalla(leer.nextInt());
        System.out.println("Digite el tipo de pantalla");
        tv.setTipopantalla(leer.next());
        System.out.println("Digite la resolucion del televisor");
        tv.setResolucion(leer.next());
        
        if (mantv.insertar(tv)) {
            System.out.println("Televisor insertado");
        } else {
            System.out.println("Televisor No insertado");
        }

    }

    public void consultarUnTelevisor() {
        System.out.println("Digite el ID a buscar");
        int a = leer.nextInt();
        Televisores resultado = (Televisores) mantv.consultarId(a);
        System.out.println("Los datos consultados son " + resultado.toString());

    }
    public void menuTelevisores() {
        String condicion = "";

        do {
            Scanner menu = new Scanner(System.in);
            System.out.println("1- Insertar televisor");
            System.out.println("2- Consultar todos los televisores");
            System.out.println("3- Consultar por Id del televisor");
            System.out.println("4- Modificar televisor");
            System.out.println("5- Eliminar televisor");
            System.out.println("Digite su opción");
            int opcion = menu.nextInt();
            switch (opcion) {
                case 1:
                    insertarTelevisores();
                    break;
                case 2:
                    mantv.consultarTodos();
                    break;
                case 3:
                    consultarUnTelevisor();
                    break;

                default:
                    System.out.println("Opcion no permitida");
            }
            System.out.println("Desea retornar al menu de Televisores S/s");
            condicion = menu.next();
        } while (condicion.equalsIgnoreCase("s"));

        return;
    }
}
