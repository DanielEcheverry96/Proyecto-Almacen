/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ManejadorHornosmicroondas;
import java.util.Scanner;
import modelo.Hornosmicroondas;

/**
 *
 * @author Daniel
 */
public class MenuHornosmicroondas {
    Scanner leer = new Scanner(System.in);
    ManejadorHornosmicroondas manhornmic = new ManejadorHornosmicroondas();

    public void insertarHornosmicroondas() {
        
        Hornosmicroondas hornmic = new Hornosmicroondas();
        
        System.out.println("Digite el Id del horno microondas");
        hornmic.setIdArticulo(leer.nextInt());
        System.out.println("Digite el Id de la marca del horno microondas");
        hornmic.setNombre(leer.next());
        System.out.println("Digite el Id de la categoria");
        hornmic.setIdCategoria(leer.nextInt());
        System.out.println("Digite el nombre del articulo");
        hornmic.setNombre(leer.next());
        System.out.println("Digite la cantidad del articulo");
        hornmic.setCantidad(leer.nextInt());
        System.out.println("Digite el precio");
        hornmic.setPrecio(leer.nextFloat());
        System.out.println("Color");
        hornmic.setColor(leer.next());
        System.out.println("Url Imagen");
        hornmic.setImagen(leer.next());
        System.out.println("Digite la capacidad del horno microondas");
        hornmic.setCapacidad(leer.next());
        System.out.println("Digite el compartimiento del horno microondas");
        hornmic.setCompartimiento(leer.next());
        System.out.println("Digite la potencia del horno microondas");
        hornmic.setPotencia(leer.next());
        System.out.println("Digite el voltaje del horno microondas");
        hornmic.setVoltaje(leer.next());
        
        if (manhornmic.insertar(hornmic)) {
            System.out.println("Horno microondas insertado");
        } else {
            System.out.println("Horno microondas No insertado");
        }

    }

    public void consultarUnHornomicroondas() {
        System.out.println("Digite el ID a buscar");
        int a = leer.nextInt();
        Hornosmicroondas resultado = (Hornosmicroondas) manhornmic.consultarId(a);
        if (resultado == null) {
            System.out.println("No se encontro el articulo");
        }
        else {
            System.out.println("Los datos consultados son " + resultado.toString());
        }
    }
    public void menuHornosmicroondas() {
        String condicion = "";

        do {
            Scanner menu = new Scanner(System.in);
            System.out.println("1- Insertar horno microondas");
            System.out.println("2- Consultar todos los hornos microondas");
            System.out.println("3- Consultar por Id del horno microondas");
            System.out.println("4- Modificar horno microondas");
            System.out.println("5- Eliminar horno microondas");
            System.out.println("Digite su opción");
            int opcion = menu.nextInt();
            switch (opcion) {
                case 1:
                    insertarHornosmicroondas();
                    break;
                case 2:
                    manhornmic.consultarTodos();
                    break;
                case 3:
                    consultarUnHornomicroondas();
                    break;
                case 4:
                    break;
                case 5:
                    manhornmic.borrarTodo();
                    break;

                default:
                    System.out.println("Opcion no permitida");
            }
            System.out.println("Desea retornar al menu de hornos microondas S/s");
            condicion = menu.next();
        } while (condicion.equalsIgnoreCase("s"));

        return;
    }
}