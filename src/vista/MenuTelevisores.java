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
        
        System.out.println("Digite el ID del televisor");
        tv.setIdArticulo(leer.nextInt());
        System.out.println("Digite el Id de la marca del televisor");
        tv.setIdMarca(leer.nextInt());
        System.out.println("Digite el nombre del articulo");
        tv.setNombre(leer.next());
        System.out.println("Digite la cantidad del articulo");
        tv.setCantidad(leer.nextInt());
        System.out.println("Digite el precio");
        tv.setPrecio(leer.nextFloat());
        System.out.println("Color");
        tv.setColor(leer.next());
        System.out.println("Url Imagen");
        tv.setImagen(leer.next());
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
        if (resultado == null) {
            System.out.println("No se encontro el articulo");
        }
        else{
            System.out.println("Los datos consultados son " + resultado.toString());
        }
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
            System.out.println("6- Eliminar todos los televisores");
            System.out.println("Digite su opción");
            int opcion = menu.nextInt();
            int ideliminar;
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
                case 4:
                    Televisores tvmod = new Televisores();
                    
                    System.out.println("Digite el Id a modificar");
                    int a = leer.nextInt();
                    
                    int posicion = mantv.busquedaBinaria(a);
                    if (!(posicion==-1)) {
                    System.out.println("Digite el nuevo Id de la marca del televisor");
                    tvmod.setIdMarca(leer.nextInt());
                    System.out.println("Digite el nuevo nombre del articulo");
                    tvmod.setNombre(leer.next());
                    System.out.println("Digite la nueva cantidad del articulo");
                    tvmod.setCantidad(leer.nextInt());
                    System.out.println("Digite el nuevo precio");
                    tvmod.setPrecio(leer.nextFloat());
                    System.out.println("nuevo Color");
                    tvmod.setColor(leer.next());
                    System.out.println("nueva Url Imagen");
                    tvmod.setImagen(leer.next());
                    System.out.println("Digite el tipo de televisor");
                    tvmod.setTipotelevisor(leer.next());
                    System.out.println("Digite el tamaño de pantalla");
                    tvmod.setTampantalla(leer.nextInt());
                    System.out.println("Digite el tipo de pantalla");
                    tvmod.setTipopantalla(leer.next());
                    System.out.println("Digite la resolucion del televisor");
                    tvmod.setResolucion(leer.next());
                    
                    if (mantv.modificar(posicion, tvmod)) {
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
                    
                    if (mantv.borrar(ideliminar)) {
                        System.out.println("El articulo fue eliminado");
                    }
                    else{
                        System.out.println("El articulo no pudo ser borrado");
                    }
                    break;
                case 6:
                    mantv.borrarTodo();
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
