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
        System.out.println("Digite el Id de la marca del hornomicroondas");
        hornmic.setIdMarca(leer.nextInt());
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
            System.out.println("6- Eliminar todos los hornos microondas");
            System.out.println("Digite su opción");
            int opcion = menu.nextInt();
            int ideliminar;
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
                    Hornosmicroondas hormimod = new Hornosmicroondas();
                    
                    System.out.println("Digite el Id a modificar");
                    int a = leer.nextInt();
                    
                    System.out.println("Digite el nuevo ID del horno microonda");
                    hormimod.setIdArticulo(leer.nextInt());
                    System.out.println("Digite el nuevo Id de la marca del horno microonda");
                    hormimod.setNombre(leer.next());
                    System.out.println("Digite el nuevo Id de la categoria");
                    hormimod.setIdCategoria(leer.nextInt());
                    System.out.println("Digite el nuevo nombre del articulo");
                    hormimod.setNombre(leer.next());
                    System.out.println("Digite la nuevo cantidad del articulo");
                    hormimod.setCantidad(leer.nextInt());
                    System.out.println("Digite el nuevo precio");
                    hormimod.setPrecio(leer.nextFloat());
                    System.out.println("nuevo Color");
                    hormimod.setColor(leer.next());
                    System.out.println("nueva Url Imagen");
                    hormimod.setImagen(leer.next());
                    System.out.println("Digite la capacidad del horno microondas");
                    hormimod.setCapacidad(leer.next());
                    System.out.println("Digite el compartimiento del horno microondas");
                    hormimod.setCompartimiento(leer.next());
                    System.out.println("Digite la potencia del horno microondas");
                    hormimod.setPotencia(leer.next());
                    System.out.println("Digite el voltaje del horno microondas");
                    hormimod.setVoltaje(leer.next());
                    
                    if (manhornmic.modificar(a, hormimod)) {
                        System.out.println("Modificación correcta");
                    }
                    else{
                        System.out.println("Error al modificar");
                    }
                    
                    break;
                case 5:
                    System.out.println("Digite el ID a eliminar");
                    ideliminar = leer.nextInt();
                    if (manhornmic.borrar(ideliminar)) {
                        System.out.println("El articulo fue eliminado");
                    }
                    else{
                        System.out.println("El articulo no pudo ser borrado");
                    }
                    break;
                case 6:
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