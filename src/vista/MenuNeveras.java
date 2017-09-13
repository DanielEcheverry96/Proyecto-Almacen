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
        nev.setIdMarca(leer.nextInt());
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
            System.out.println("6- Eliminar todas las neveras");
            System.out.println("Digite su opción");
            int opcion = menu.nextInt();
            int ideliminar;
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
                case 4:
                    Neveras nevmod = new Neveras();
                    
                    System.out.println("Digite el Id a modificar");
                    int a = leer.nextInt();
                    
                    int posicion = mannev.busquedaBinaria(a);
                    if (!(posicion==-1)) {
                    System.out.println("Digite el nuevo Id de la marca de la nevera");
                    nevmod.setIdMarca(leer.nextInt());
                    System.out.println("Digite el nuevo nombre del articulo");
                    nevmod.setNombre(leer.next());
                    System.out.println("Digite la nueva cantidad del articulo");
                    nevmod.setCantidad(leer.nextInt());
                    System.out.println("Digite el nuevo precio");
                    nevmod.setPrecio(leer.nextFloat());
                    System.out.println("nuevo Color");
                    nevmod.setColor(leer.next());
                    System.out.println("nueva Url Imagen");
                    nevmod.setImagen(leer.next());
                    System.out.println("Digite la capacidad del congelador");
                    nevmod.setCapcongelador(leer.next());
                    System.out.println("Digite la capacidad del frigorífico");
                    nevmod.setCapfrigorifero(leer.next());
                    System.out.println("Digite el mateial de la nevera");
                    nevmod.setMaterial(leer.next());
                    System.out.println("Digite el tamaño de la nevera (m)");
                    nevmod.setTamaño((int) leer.nextFloat());
                    System.out.println("Digite el sistema de la nevera");
                    nevmod.setSistema(leer.next());
                    
                    if (mannev.modificar(posicion, nevmod)) {
                        System.out.println("Modificación correcta");
                    }
                    }
                    else{
                        System.out.println("Error al modificar");
                    }
                    
                    break;
                case 5:
                    System.out.println("Digite el ID a eliminar");
                    ideliminar = leer.nextInt();
                    
                    if (mannev.borrar(ideliminar)) {
                        System.out.println("El articulo fue eliminado");
                    }
                    else{
                        System.out.println("El articulo no pudo ser borrado");
                    }
                    break;
                case 6:
                    mannev.borrarTodo();
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