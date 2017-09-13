/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ManejadorRemachadoras;
import java.util.Scanner;
import modelo.Remachadoras;

/**
 *
 * @author Daniel
 */
public class MenuRemachadoras {
    Scanner leer = new Scanner(System.in);
    ManejadorRemachadoras manrem = new ManejadorRemachadoras();
    
    public void insertarRemachadoras(){
        
        Remachadoras rem = new Remachadoras();
        
        System.out.println("Digite el ID de la remachadora");
        rem.setIdArticulo(leer.nextInt());
        System.out.println("Digite el Id de la marca de la remachadora");
        rem.setIdMarca(leer.nextInt());
        System.out.println("Digite el Id de la categoria");
        rem.setIdCategoria(leer.nextInt());
        System.out.println("Digite el nombre del articulo");
        rem.setNombre(leer.next());
        System.out.println("Digite la cantidad del articulo");
        rem.setCantidad(leer.nextInt());
        System.out.println("Digite el precio");
        rem.setPrecio(leer.nextFloat());
        System.out.println("Color");
        rem.setColor(leer.next());
        System.out.println("Url Imagen");
        rem.setImagen(leer.next());
        System.out.println("Digite la potencia de la remachadora");
        rem.setPotencia(leer.next());
        System.out.println("Digite el tipo de remache");
        rem.setTiporemache(leer.next());
        System.out.println("Digite el calibre del remache");
        rem.setCalibre(leer.nextDouble());
    
       if (manrem.insertar(rem)) {
            System.out.println("Remachadora insertada");
        } else {
            System.out.println("Remachadora No insertada");
        }

    }
public void consultarUnaRemachadora() {
        System.out.println("Digite el ID a buscar");
        int a = leer.nextInt();
        Remachadoras resultado = (Remachadoras) manrem.consultarId(a);
        if (resultado == null) {
            System.out.println("No se encontro el articulo");
        }
        else{
            System.out.println("Los datos consultados son " + resultado.toString());
        }
    }
    public void menuRemachadoras() {
        String condicion = "";

        do {
            Scanner menu = new Scanner(System.in);
            System.out.println("1- Insertar Remachadora");
            System.out.println("2- Consultar todas las remachadoras");
            System.out.println("3- Consultar por Id de la remachadora");
            System.out.println("4- Modificar remachadora");
            System.out.println("5- Eliminar remachadora");
            System.out.println("6- Eliminar todos las remachadoras");
            System.out.println("Digite su opción");
            int opcion = menu.nextInt();
            int ideliminar;
            switch (opcion) {
                case 1:
                    insertarRemachadoras();
                    break;
                case 2:
                    manrem.consultarTodos();
                    break;
                case 3:
                    consultarUnaRemachadora();
                    break;
                case 4:
                    Remachadoras remmod = new Remachadoras();
                    
                    System.out.println("Digite el Id a modificar");
                    int a = leer.nextInt();
                    
                    int posicion = manrem.busquedaBinaria(a);
                    if (!(posicion==-1)) {
                    System.out.println("Digite el nuevo ID de la remachadora");
                    remmod.setIdArticulo(leer.nextInt());
                    System.out.println("Digite el nuevo Id de la marca de la remachadora");
                    remmod.setIdMarca(leer.nextInt());
                    System.out.println("Digite el nuevo Id de la categoria");
                    remmod.setIdCategoria(leer.nextInt());
                    System.out.println("Digite el nuevo nombre del articulo");
                    remmod.setNombre(leer.next());
                    System.out.println("Digite la nueva cantidad del articulo");
                    remmod.setCantidad(leer.nextInt());
                    System.out.println("Digite el nuevo precio");
                    remmod.setPrecio(leer.nextFloat());
                    System.out.println("nuevo Color");
                    remmod.setColor(leer.next());
                    System.out.println("nueva Url Imagen");
                    remmod.setImagen(leer.next());
                    System.out.println("Digite la potencia de la remachadora");
                    remmod.setPotencia(leer.next());
                    System.out.println("Digite el tipo de remache");
                    remmod.setTiporemache(leer.next());
                    System.out.println("Digite el calibre del remache");
                    remmod.setCalibre(leer.nextDouble());
                    
                    if (manrem.modificar(a, remmod)) {
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
                    
                    if (manrem.borrar(ideliminar)) {
                        System.out.println("El articulo fue eliminado");
                    }
                    else{
                        System.out.println("El articulo no pudo ser borrado");
                    }
                    break;
                case 6:
                    manrem.borrarTodo();
                    break;

                default:
                    System.out.println("Opcion no permitida");
            }
            System.out.println("Desea retornar al menu de Remachadoras S/s");
            condicion = menu.next();
        } while (condicion.equalsIgnoreCase("s"));

        return;
    }
}


