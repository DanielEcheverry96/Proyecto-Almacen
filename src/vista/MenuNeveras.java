/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ManejadorNeveras;
import java.util.Scanner;
import modelo.Neveras;

/**
 *
 * @author Daniel
 */
public class MenuNeveras {
    Scanner leer = new Scanner (System.in);
    ManejadorNeveras mannev = new ManejadorNeveras();
    
    public void insertarNeveras() {
        
        
        Neveras nev = new Neveras();
        
        System.out.println("Digite el Id de la nevera");
        nev.setIdArticulo(leer.nextInt());
        System.out.println("Digite el Id de la marca de la nevera");
        nev.setNombre(leer.next());
        System.out.println("Digite el Id de la categoria");
        nev.setIdCategoria(leer.nextInt());
        System.out.println("Digite el nombre del articulo");
        nev.setNombre(leer.next());
        System.out.println("Digite la cantidad del articulo");
        nev.setCantidad(leer.nextInt());
        System.out.println("Digite el precio");
        nev.setPrecio(leer.nextFloat());
        System.out.println("Color");
        nev.setColor(leer.next());
        System.out.println("Url Imagen");
        nev.setImagen(leer.next());
        System.out.println("Digite la capacidad del congelador");
        nev.setCapcongelador(leer.next());
        System.out.println("Digite la capacidad del frigorífico");
        nev.setCapfrigorifero(leer.next());
        System.out.println("Digite el mateial de la nevera");
        nev.setMaterial(leer.next());
        System.out.println("Digite el tamaño de la nevera (m)");
        nev.setTamaño((int) leer.nextFloat());
        System.out.println("Digite el sistema de la nevera");
        nev.setSistema(leer.next());
               
        if (mannev.insertar(nev)) {
            System.out.println("Nevera insertada");
        } else {
            System.out.println("Nevera No insertada");
        }

    }

    public void consultarUnaNevera() {
        System.out.println("Digite el ID a buscar");
        int a = leer.nextInt();
        Neveras resultado = (Neveras) mannev.consultarId(a);
        if (resultado == null) {
            System.out.println("No se encontro el articulo");
        }
        else {
            System.out.println("Los datos consultados son " + resultado.toString());
        }
    }
    public void menuNeveras() {
        String condicion = "";

        do {
            Scanner menu = new Scanner(System.in);
            System.out.println("1- Insertar nevera");
            System.out.println("2- Consultar todas las neveras");
            System.out.println("3- Consultar por Id de la nevera");
            System.out.println("4- Modificar nevera");
            System.out.println("5- Eliminar nevera");
            System.out.println("Digite su opción");
            int opcion = menu.nextInt();
            switch (opcion) {
                case 1:
                    insertarNeveras();
                    break;
                case 2:
                    mannev.consultarTodos();
                    break;
                case 3:
                    consultarUnaNevera();
                    break;

                default:
                    System.out.println("Opcion no permitida");
            }
            System.out.println("Desea retornar al menu de Neveras S/s");
            condicion = menu.next();
        } while (condicion.equalsIgnoreCase("s"));

        return;
    }
}