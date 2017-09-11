/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ManejadorJuegos;
import java.util.Scanner;
import modelo.Juegos;

/**
 *
 * @author Daniel
 */
public class MenuJuegos {
    
    Scanner leer = new Scanner(System.in);
    ManejadorJuegos manjueg = new ManejadorJuegos();
    
    public void insertarJuegos() {

        Juegos jueg = new Juegos();
        
        System.out.println("Digite el ID del Juego");
        jueg.setIdArticulo(leer.nextInt());
        System.out.println("Digite el Id de la marca del juego");
        jueg.setIdMarca(leer.nextInt());
        System.out.println("Digite el Id de la categoria");
        jueg.setIdCategoria(leer.nextInt());
        System.out.println("Digite el nombre del articulo");
        jueg.setNombre(leer.next());
        System.out.println("Digite la cantidad del articulo");
        jueg.setCantidad(leer.nextInt());
        System.out.println("Digite el precio");
        jueg.setPrecio(leer.nextFloat());
        System.out.println("Url Imagen");
        jueg.setImagen(leer.next());
        System.out.println("Digite el género del juego");
        jueg.setGenero(leer.next());
        System.out.println("Digite la restriccíon de edad");
        jueg.setRestedad(leer.next());
        System.out.println("Digite la plataforma del juego");
        jueg.setPlataforma(leer.next());
        System.out.println("Digite el número de jugadores");
        jueg.setNumjugadores(leer.nextInt());
        

        if (manjueg.insertar(jueg)) {
            System.out.println("Juego insertado");
        } else {
            System.out.println("Juego No insertado");
        }

    }
public void consultarUnJuego() {
        System.out.println("Digite el ID a buscar");
        int a = leer.nextInt();
        Juegos resultado = (Juegos) manjueg.consultarId(a);
        if (resultado == null) {
            System.out.println("No se encontro el articulo");
        }
        else{
            System.out.println("Los datos consultados son " + resultado.toString());
        }
    }
    public void menuJuegos() {
        String condicion = "";

        do {
            Scanner menu = new Scanner(System.in);
            System.out.println("1- Insertar juego");
            System.out.println("2- Consultar todos los juegos");
            System.out.println("3- Consultar por Id del juego");
            System.out.println("4- Modificar juego");
            System.out.println("5- Eliminar juego");
            System.out.println("6- Eliminar todos los juegos");
            System.out.println("Digite su opción");
            int opcion = menu.nextInt();
            int ideliminar;
            switch (opcion) {
                case 1:
                    insertarJuegos();
                    break;
                case 2:
                    manjueg.consultarTodos();
                    break;
                case 3:
                    consultarUnJuego();
                    break;
                case 4:
                    Juegos juemod = new Juegos();
                    
                    System.out.println("Digite la posicion del Id a modificar");
                    int a = leer.nextInt();
                    
                    System.out.println("Digite el nuevo ID del juego");
                    juemod.setIdArticulo(leer.nextInt());
                    System.out.println("Digite el nuevo Id de la marca del juego");
                    juemod.setNombre(leer.next());
                    System.out.println("Digite el nuevo Id de la categoria");
                    juemod.setIdCategoria(leer.nextInt());
                    System.out.println("Digite el nuevo nombre del articulo");
                    juemod.setNombre(leer.next());
                    System.out.println("Digite la nueva cantidad del articulo");
                    juemod.setCantidad(leer.nextInt());
                    System.out.println("Digite el nuevo precio");
                    juemod.setPrecio(leer.nextFloat());
                    System.out.println("nuevo Color");
                    juemod.setColor(leer.next());
                    System.out.println("nueva Url Imagen");
                    juemod.setImagen(leer.next());
                    System.out.println("Digite el género del juego");
                    juemod.setGenero(leer.next());
                    System.out.println("Digite la restriccíon de edad");
                    juemod.setRestedad(leer.next());
                    System.out.println("Digite la plataforma del juego");
                    juemod.setPlataforma(leer.next());
                    System.out.println("Digite el número de jugadores");
                    juemod.setNumjugadores(leer.nextInt());
                    
                    if (manjueg.modificar(a, juemod)) {
                        System.out.println("Modificación correcta");
                    }
                    else{
                        System.out.println("Error al modificar");
                    }
                    
                    break;
                case 5:
                    System.out.println("Digite la posicion del ID a eliminar");
                    ideliminar = leer.nextInt();
                    if (manjueg.borrar(ideliminar)) {
                        System.out.println("El articulo fue eliminado");
                    }
                    else{
                        System.out.println("El articulo no pudo ser borrado");
                    }
                    break;
                case 6:
                    manjueg.borrarTodo();
                    break;

                default:
                    System.out.println("Opcion no permitida");
            }
            System.out.println("Desea retornar al menu de Juegos S/s");
            condicion = menu.next();
        } while (condicion.equalsIgnoreCase("s"));

        return;
    }
}
