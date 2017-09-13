/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ManejadorComputadores;
import java.util.Scanner;
import modelo.Computadores;

/**
 *
 * @author Usuario
 */
public class MenuComputadores {

    Scanner leer = new Scanner(System.in);
    ManejadorComputadores mancomp = new ManejadorComputadores();
    //MenuCategoriaElectronicosOficina menofi = new MenuCategoriaElectronicosOficina();

    public void insertarComputadores() {

        Computadores compu = new Computadores();
        
        System.out.println("Digite el ID del computador");
        compu.setIdArticulo(leer.nextInt());
        System.out.println("Digite el Id de la marca del computador");
        compu.setIdMarca(leer.nextInt());
        System.out.println("Digite el Id de la categoria");
        compu.setIdCategoria(leer.nextInt());
        System.out.println("Digite el nombre del articulo");
        compu.setNombre(leer.next());
        System.out.println("Digite la cantidad del articulo");
        compu.setCantidad(leer.nextInt());
        System.out.println("Digite el precio");
        compu.setPrecio(leer.nextFloat());
        System.out.println("Color");
        compu.setColor(leer.next());
        System.out.println("Url Imagen");
        compu.setImagen(leer.next());
        System.out.println("Digite el Tamaño de la pantalla");
        compu.setTipopantalla(leer.next());
        System.out.println("Digite el Tipo de mouse");
        compu.setTipomouse(leer.next());
        System.out.println("Digite el Tipo de teclado");
        compu.setTipoteclado(leer.next());
        System.out.println("Digite la capacidad memoria");
        compu.setCapmemoria(leer.next());
        System.out.println("Digite el Tipo de pantalla");
        compu.setTipopantalla(leer.next());

        if (mancomp.insertar(compu)) {
            System.out.println("Computador insertado");
        } else {
            System.out.println("Computador No insertado");
        }

    }

    public void consultarUnComputador() {
        System.out.println("Digite el ID a buscar");
        int a = leer.nextInt();
        Computadores resultado = (Computadores) mancomp.consultarId(a);
        if (resultado == null) {
            System.out.println("No se encontro el articulo");
        }
        else{
            System.out.println("Los datos consultados son " + resultado.toString());
        }
    }
    public void menuComputador() {
        String condicion = "";

        do {
            Scanner menu = new Scanner(System.in);
            System.out.println("1- Insertar computador");
            System.out.println("2- Consultar todos los computadores");
            System.out.println("3- Consultar por Id del computador");
            System.out.println("4- Modificar computador");
            System.out.println("5- Eliminar computador");
            System.out.println("6- Eliminar todos los computadores");
            System.out.println("Digite su opción");
            int opcion = menu.nextInt();
            int ideliminar;
            switch (opcion) {
                case 1:
                    insertarComputadores();
                    break;
                case 2:
                    mancomp.consultarTodos();
                    break;
                case 3:
                    consultarUnComputador();
                    break;
                case 4:
                     Computadores compmod = new Computadores();
                    
                    System.out.println("Digite el Id a modificar");
                    int a = leer.nextInt();
                    
                    int posicion = mancomp.busquedaBinaria(a);
                    if (!(posicion==-1)) {
                    System.out.println("Digite el nuevo ID del computador");
                    compmod.setIdArticulo(leer.nextInt());
                    System.out.println("Digite el nuevo Id de la marca del computador");
                    compmod.setIdMarca(leer.nextInt());
                    System.out.println("Digite el nuevo Id de la categoria");
                    compmod.setIdCategoria(leer.nextInt());
                    System.out.println("Digite el nuevo nombre del articulo");
                    compmod.setNombre(leer.next());
                    System.out.println("Digite la nueva cantidad del articulo");
                    compmod.setCantidad(leer.nextInt());
                    System.out.println("Digite el nuevo precio");
                    compmod.setPrecio(leer.nextFloat());
                    System.out.println("nuevo Color");
                    compmod.setColor(leer.next());
                    System.out.println("nueva Url Imagen");
                    compmod.setImagen(leer.next());
                    System.out.println("Digite el Tamaño de la pantalla");
                    compmod.setTipopantalla(leer.next());
                    System.out.println("Digite el Tipo de mouse");
                    compmod.setTipomouse(leer.next());
                    System.out.println("Digite el Tipo de teclado");
                    compmod.setTipoteclado(leer.next());
                    System.out.println("Digite la capacidad memoria");
                    compmod.setCapmemoria(leer.next());
                    System.out.println("Digite el Tipo de pantalla");
                    compmod.setTipopantalla(leer.next());
                    
                    if (mancomp.modificar(a, compmod)) {
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
                    
                    if (mancomp.borrar(ideliminar)) {
                        System.out.println("El articulo fue eliminado");
                    }
                    else{
                        System.out.println("El articulo no pudo ser borrado");
                    }
                    break;
                case 6:
                    mancomp.borrarTodo();
                    break;

                default:
                    System.out.println("Opcion no permitida");
            }
            System.out.println("Desea retornar al menu de Computadores S/s");
            condicion = menu.next();
        } while (condicion.equalsIgnoreCase("s"));

        return;
    }
}
