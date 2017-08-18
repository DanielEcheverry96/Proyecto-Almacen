/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ManejadorObjetos;
import java.util.Scanner;
import modelo.Marca;

/**
 *
 * @author Unalman
 */
public class MenuMarcas {

    ManejadorObjetos manobj = new ManejadorObjetos();

    public void insertarMarcas() {
        String salir = "s";
        Scanner leer = new Scanner(System.in);
        do {
            Marca mar = new Marca();
            System.out.println("Digite el Id de la Marca");
            mar.setId(leer.nextInt());
            System.out.println("Digite el nombre de la Marca");
            mar.setDescripcion(leer.next());
            if (manobj.insertar(mar)) {
                System.out.println("Marca insertada ");
            } else {
                System.out.println("Problemas al insertar la marca");

            }
            System.out.println("Digite S/s si desea Continuar");
            salir = leer.next();
        } while (salir.equalsIgnoreCase("s"));
    }

    public void consultarUnaMarca() {
        System.out.println("Digite el id que quiere consultar");
        Scanner leer = new Scanner(System.in);
        Marca mar = new Marca();
        mar.setId(leer.nextInt());
        Marca mar2 = new Marca();
        mar2 = (Marca) manobj.consultar(mar);
        if (!mar2.getDescripcion().equals(null)) {
            System.out.println("Marca solicitada es" + mar2.toString());
        } else {
            System.out.println("Marca no encontrada");
        }

    }

    public void menuMarcas() {
        String condicion = "";

        do {
            Scanner menu = new Scanner(System.in);
            System.out.println("1- Insertar Marcas");
            System.out.println("2- Consultar Todas Marcas");
            System.out.println("3- Consultar Marcas por Id");
            System.out.println("Digite su opción");
            int opcion = menu.nextInt();
            switch (opcion) {
                case 1:
                    insertarMarcas();
                    break;
                case 2:
                    manobj.consultarTodos();
                    break;
                case 3:
                    consultarUnaMarca();
                    break;

                default:
                    System.out.println("Opcion no permitida");
            }
            System.out.println("Desea retornar al menu de Marcas S/s");
            condicion = menu.next();
        } while (condicion.equalsIgnoreCase("s"));

    }

}
