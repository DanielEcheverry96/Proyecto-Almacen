/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ManejadorMartillos;
import java.util.Scanner;
import modelo.Martillos;


/**
 *
 * @author Daniel
 */
public class MenuMartillos {
    Scanner leer = new Scanner(System.in);
    ManejadorMartillos manmart = new ManejadorMartillos();
    
    public void insertarMartillos(){
        
        Martillos mar = new Martillos();
        
        System.out.println("Digite el ID del martillos");
        mar.setIdArticulo(leer.nextInt());
        System.out.println("Digite el Id de la marca del martillo");
        mar.setIdMarca(leer.nextInt());
        System.out.println("Digite el Id de la categoria");
        mar.setIdCategoria(leer.nextInt());
        System.out.println("Digite el nombre del articulo");
        mar.setNombre(leer.next());
        System.out.println("Digite la cantidad del articulo");
        mar.setCantidad(leer.nextInt());
        System.out.println("Digite el precio");
        mar.setPrecio(leer.nextFloat());
        System.out.println("Color");
        mar.setColor(leer.next());
        System.out.println("Url Imagen");
        mar.setImagen(leer.next());
        System.out.println("Digite el tipo de martillo");
        mar.setTipo(leer.next());
        System.out.println("Digite el material del mango del martillo");
        mar.setMatmango(leer.next());
        System.out.println("Digite el material del cabezal");
        mar.setMatcabezal(leer.next());
        System.out.println("Digite el peso del martillo");
        mar.setPeso(leer.nextInt());
        System.out.println("Digite el tamaño del martillo");
        mar.setTamaño(leer.next());
    
       if (manmart.insertar(mar)) {
            System.out.println("Martillo insertado");
        } else {
            System.out.println("Martillo No insertado");
        }

    }
public void consultarUnMartillo() {
        System.out.println("Digite el ID a buscar");
        int a = leer.nextInt();
        Martillos resultado = (Martillos) manmart.consultarId(a);
        if (resultado == null) {
            System.out.println("No se encontro el articulo");
        }
        else{
            System.out.println("Los datos consultados son " + resultado.toString());
        }
    }
    public void menuMartillos() {
        String condicion = "";

        do {
            Scanner menu = new Scanner(System.in);
            System.out.println("1- Insertar martillo");
            System.out.println("2- Consultar todos los martillos");
            System.out.println("3- Consultar por Id del martillo");
            System.out.println("4- Modificar martillo");
            System.out.println("5- Eliminar martillo");
            System.out.println("6- Eliminar todos los martillos");
            System.out.println("Digite su opción");
            int opcion = menu.nextInt();
            int ideliminar;
            switch (opcion) {
                case 1:
                    insertarMartillos();
                    break;
                case 2:
                    manmart.consultarTodos();
                    break;
                case 3:
                    consultarUnMartillo();
                    break;
                case 4:
                    Martillos martimod = new Martillos();
                    
                    System.out.println("Digite el Id a modificar");
                    int a = leer.nextInt();
                    
                    System.out.println("Digite el nuevo ID del martillo");
                    martimod.setIdArticulo(leer.nextInt());
                    System.out.println("Digite el nuevo Id de la marca del martillo");
                    martimod.setNombre(leer.next());
                    System.out.println("Digite el nuevo Id de la categoria");
                    martimod.setIdCategoria(leer.nextInt());
                    System.out.println("Digite el nuevo nombre del articulo");
                    martimod.setNombre(leer.next());
                    System.out.println("Digite la nuevo cantidad del articulo");
                    martimod.setCantidad(leer.nextInt());
                    System.out.println("Digite el nuevo precio");
                    martimod.setPrecio(leer.nextFloat());
                    System.out.println("nuevo Color");
                    martimod.setColor(leer.next());
                    System.out.println("nueva Url Imagen");
                    martimod.setImagen(leer.next());
                    System.out.println("Digite el tipo de martillo");
                    martimod.setTipo(leer.next());
                    System.out.println("Digite el material del mango del martillo");
                    martimod.setMatmango(leer.next());
                    System.out.println("Digite el material del cabezal");
                    martimod.setMatcabezal(leer.next());
                    System.out.println("Digite el peso del martillo");
                    martimod.setPeso(leer.nextInt());
                    
                    if (manmart.modificar(a, martimod)) {
                        System.out.println("Modificación correcta");
                    }
                    else{
                        System.out.println("Error al modificar");
                    }
                    
                    break;
                case 5:
                    System.out.println("Digite el ID a eliminar");
                    ideliminar = leer.nextInt();
                    if (manmart.borrar(ideliminar)) {
                        System.out.println("El articulo fue eliminado");
                    }
                    else{
                        System.out.println("El articulo no pudo ser borrado");
                    }
                    break;
                case 6:
                    manmart.borrarTodo();
                    break;

                default:
                    System.out.println("Opcion no permitida");
            }
            System.out.println("Desea retornar al menu de Martillos S/s");
            condicion = menu.next();
        } while (condicion.equalsIgnoreCase("s"));

        return;
    }
}

