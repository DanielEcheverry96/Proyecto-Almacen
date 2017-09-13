/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ManejadorImpresores;
import java.util.Scanner;
import modelo.Impresores;

/**
 *
 * @author danie
 */
public class MenuImpresores {
    
    Scanner leer = new Scanner(System.in);
    ManejadorImpresores manimp = new ManejadorImpresores();
    
      public void insertarImpresores(){
        
        Impresores impre = new Impresores();
             
        System.out.println("Digite el Id del impresor");
        impre.setIdArticulo(leer.nextInt());
        System.out.println("Digite el Id de la marca del impresor");
        impre.setIdMarca(leer.nextInt());
        System.out.println("Digite el Id de la categoria");
        impre.setIdCategoria(leer.nextInt());
        System.out.println("Digite el nombre del articulo");
        impre.setNombre(leer.next());
        System.out.println("Digite la cantidad del articulo");
        impre.setCantidad(leer.nextInt());
        System.out.println("digite el precio");
        impre.setPrecio(leer.nextFloat());
        System.out.println("Color");
        impre.setColor(leer.next());
        System.out.println("Url Imagen");
        impre.setImagen(leer.next());
        System.out.println("Tipo de impresor");
        impre.setTipo(leer.next());
        System.out.println("Interface de red");
        impre.setInterfacered(leer.next());
        System.out.println("Paginas por minuto");
        impre.setPaginasminuto(leer.nextInt());
        System.out.println("Resolucion");
        impre.setResolucion(leer.next());
        
        if (manimp.insertar(impre)) {
            System.out.println("El impresor ha sido insertado");
        }
        else{
            System.out.println("El impresor no ha sido insertado");
        }
    }
      
    public void consultarUnImpresor(){
        System.out.println("Digite el Id a buscar");
        int a = leer.nextInt();
        Impresores resultado = (Impresores)manimp.consultarId(a);
        if (resultado == null) {
            System.out.println("No se encontro el articulo");
        }
        else{
            System.out.println("Los datos consultados son "+resultado.toString());
        }
    }  
    
      public void menuImpresor(){
        
        String condicion = "";
        
        do {
            Scanner menu = new Scanner(System.in);
            
            System.out.println("1- Insertar impresor");
            System.out.println("2- Consultar todos los impresores");
            System.out.println("3- Consultar por Id del impresor");
            System.out.println("4- Modificar impresor");
            System.out.println("5- Eliminar impresor");
            System.out.println("6- Eliminar todos los impresores");
            System.out.println("Digite su opción");
            int opcion = menu.nextInt();
            int ideliminar;
            switch (opcion) {
                case 1:
                        insertarImpresores();
                    break;
                case 2: 
                        manimp.consultarTodos();
                    break;
                case 3:
                        consultarUnImpresor();
                    break;
                case 4:
                    Impresores impmod = new Impresores();
                    
                    System.out.println("Digite el Id a modificar");
                    int a = leer.nextInt();
                    
                    int posicion = manimp.busquedaBinaria(a);
                    if (!(posicion==-1)) {
                    System.out.println("Digite el nuevo ID del impresor");
                    impmod.setIdArticulo(leer.nextInt());
                    System.out.println("Digite el nuevo Id de la marca del impresor");
                    impmod.setIdMarca(leer.nextInt());
                    System.out.println("Digite el nuevo Id de la categoria");
                    impmod.setIdCategoria(leer.nextInt());
                    System.out.println("Digite el nuevo nombre del articulo");
                    impmod.setNombre(leer.next());
                    System.out.println("Digite la nueva cantidad del articulo");
                    impmod.setCantidad(leer.nextInt());
                    System.out.println("Digite el nuevo precio");
                    impmod.setPrecio(leer.nextFloat());
                    System.out.println("nuevo Color");
                    impmod.setColor(leer.next());
                    System.out.println("nueva Url Imagen");
                    impmod.setImagen(leer.next());
                    System.out.println("Tipo de impresor");
                    impmod.setTipo(leer.next());
                    System.out.println("Interface de red");
                    impmod.setInterfacered(leer.next());
                    System.out.println("Paginas por minuto");
                    impmod.setPaginasminuto(leer.nextInt());
                    System.out.println("Resolucion");
                    impmod.setResolucion(leer.next());
                    
                    if (manimp.modificar(a, impmod)) {
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
                    
                    if (manimp.borrar(ideliminar)) {
                        System.out.println("El articulo fue eliminado");
                    }
                    else{
                        System.out.println("El articulo no pudo ser borrado");
                    }
                    break;
                case 6:
                    manimp.borrarTodo();
                    break;
                default:
                    System.out.println("Opcion no permitida");
            }
            
            System.out.println("Desea retornar al menu de impresores S/s");
            condicion = menu.next();
            
        } while (condicion.equalsIgnoreCase("s"));
       
        return;
    }
}
