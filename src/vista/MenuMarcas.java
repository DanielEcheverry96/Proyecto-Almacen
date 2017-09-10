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
    Scanner leer = new Scanner(System.in);
    public void insertarMarcas() {
        String salir = "s";
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
        System.out.println("Digite el ID a buscar");
        int a = leer.nextInt();
        Marca resultado = (Marca) manobj.consultarId(a);
        if (resultado == null) {
            System.out.println("No se encontro la marca");
        }
        else{
            System.out.println("Los datos consultados son " + resultado.toString());
        }

    }

    public void menuMarcas() {
        String condicion = "";

        do {
            Scanner menu = new Scanner(System.in);
            System.out.println("1- Insertar Marcas");
            System.out.println("2- Consultar Todas Marcas");
            System.out.println("3- Consultar Marcas por Id");
            System.out.println("4- Modificar Marca");
            System.out.println("5- Eliminar Marca ");
            System.out.println("6- Eliminar todas las Marcas");
            System.out.println("Digite su opción");
            int opcion = menu.nextInt();
            int ideliminar;
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
                case 4:
                    Marca marmod = new Marca();
                    
                    System.out.println("Digite la posicion del Id a modificar");
                    int a = leer.nextInt();
                    
                    System.out.println("Digite el nuevo Id de la Marca");
                    marmod.setId(leer.nextInt());
                    System.out.println("Digite el nuevo nombre de la Marca");
                    marmod.setDescripcion(leer.next());
                    
                    if (manobj.modificar(a, marmod)) {
                        System.out.println("Modificación correcta");
                    }
                    else{
                        System.out.println("Error al modificar");
                    }
                    
                    break;
                case 5:
                    System.out.println("Digite la posicion del ID a eliminar");
                    ideliminar = leer.nextInt();
                    if (manobj.borrar(ideliminar)) {
                        System.out.println("El articulo fue eliminado");
                    }
                    else{
                        System.out.println("El articulo no pudo ser borrado");
                    }
                    break;
                case 6:
                    manobj.borrarTodo();
                    break;

                default:
                    System.out.println("Opcion no permitida");
            }
            System.out.println("Desea retornar al menu de Marcas S/s");
            condicion = menu.next();
        } while (condicion.equalsIgnoreCase("s"));

    }

}
