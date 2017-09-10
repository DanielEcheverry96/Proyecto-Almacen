/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ManejadorTelefonosCelulares;
import java.util.Scanner;
import modelo.TelefonosCelulares;

/**
 *
 * @author danie
 */
public class MenuTelefonosCelulares {
    
    Scanner leer = new Scanner(System.in);
    ManejadorTelefonosCelulares mancel = new ManejadorTelefonosCelulares();
    
    public void insertarTelefonosCelulares(){
        
        TelefonosCelulares telcel = new TelefonosCelulares();
        
        System.out.println("Digite el Id del telefono celular");
        telcel.setIdArticulo(leer.nextInt());
        System.out.println("Digite el Id de la marca del telefono celular");
        telcel.setIdMarca(leer.nextInt());
        System.out.println("Digite el Id de la categoria");
        telcel.setIdCategoria(leer.nextInt());
        System.out.println("Digite el nombre del articulo");
        telcel.setNombre(leer.next());
        System.out.println("Digite la cantidad del articulo");
        telcel.setCantidad(leer.nextInt());
        System.out.println("digite el precio");
        telcel.setPrecio(leer.nextFloat());
        System.out.println("Color");
        telcel.setColor(leer.next());
        System.out.println("Url Imagen");
        telcel.setImagen(leer.next());
        System.out.println("Tipo de procesador");
        telcel.setTiprocesador(leer.next());
        System.out.println("Tamaño de pantalla");
        telcel.setTamañodepantalla(leer.nextInt());
        System.out.println("Tamaño de memoria");
        telcel.setTammemoria(leer.nextInt());
        System.out.println("Capacidad de almacenamiento");
        telcel.setCapalmacenamiento(leer.nextInt());
        System.out.println("Tipo de pantalla");
        telcel.setTipodepantalla(leer.next());
        System.out.println("Interface de red");
        telcel.setInterfacered(leer.next());
        
        if (mancel.insertar(telcel)) {
            System.out.println("El celular ha sido insertado");
        }
        else{
            System.out.println("El celular no ha sido insertado");
        }
        
    }
    
    public void consultarUnCelular(){
        System.out.println("Digite el Id a buscar");
        int a = leer.nextInt();
        TelefonosCelulares resultado = (TelefonosCelulares)mancel.consultarId(a);
        if (resultado == null) {
            System.out.println("No se encontro el articulo");
        }
        else{
            System.out.println("Los datos consultados son "+resultado.toString());
        }
    }
    
    public void menuTelefonoCelular(){
        
        String condicion = "";
        
        do {
            Scanner menu = new Scanner(System.in);
            
            System.out.println("1- Insertar telefono celular");
            System.out.println("2- Consultar todos los telefonos celulares");
            System.out.println("3- Consultar por Id del telefono celular");
            System.out.println("4- Modificar telefono celular");
            System.out.println("5- Eliminar telefono celular");
            System.out.println("6- Eliminar todos los telefonos celulares");
            System.out.println("Digite su opción");
            int opcion = menu.nextInt();
            int ideliminar;
            switch (opcion) {
                case 1:
                        insertarTelefonosCelulares();
                    break;
                case 2: 
                        mancel.consultarTodos();
                    break;
                case 3:
                        consultarUnCelular();
                    break;
                case 4:
                    TelefonosCelulares telcelpmod = new TelefonosCelulares();
                    
                    System.out.println("Digite el Id a modificar");
                    int a = leer.nextInt();
                    
                    System.out.println("Digite el nuevo ID del telefono celular");
                    telcelpmod.setIdArticulo(leer.nextInt());
                    System.out.println("Digite el nuevo Id de la marca del telefono celular");
                    telcelpmod.setNombre(leer.next());
                    System.out.println("Digite el nuevo Id de la categoria");
                    telcelpmod.setIdCategoria(leer.nextInt());
                    System.out.println("Digite el nuevo nombre del articulo");
                    telcelpmod.setNombre(leer.next());
                    System.out.println("Digite la nuevo cantidad del articulo");
                    telcelpmod.setCantidad(leer.nextInt());
                    System.out.println("Digite el nuevo precio");
                    telcelpmod.setPrecio(leer.nextFloat());
                    System.out.println("nuevo Color");
                    telcelpmod.setColor(leer.next());
                    System.out.println("nueva Url Imagen");
                    telcelpmod.setImagen(leer.next());
                    System.out.println("Tipo de procesador");
                    telcelpmod.setTiprocesador(leer.next());
                    System.out.println("Tamaño de pantalla");
                    telcelpmod.setTamañodepantalla(leer.nextInt());
                    System.out.println("Tamaño de memoria");
                    telcelpmod.setTammemoria(leer.nextInt());
                    System.out.println("Capacidad de almacenamiento");
                    telcelpmod.setCapalmacenamiento(leer.nextInt());
                    System.out.println("Tipo de pantalla");
                    telcelpmod.setTipodepantalla(leer.next());
                    System.out.println("Interface de red");
                    telcelpmod.setInterfacered(leer.next());
                    
                    if (mancel.modificar(a, telcelpmod)) {
                        System.out.println("Modificación correcta");
                    }
                    else{
                        System.out.println("Error al modificar");
                    }
                    
                    break;
                case 5:
                    System.out.println("Digite el ID a eliminar");
                    ideliminar = leer.nextInt();
                    if (mancel.borrar(ideliminar)) {
                        System.out.println("El articulo fue eliminado");
                    }
                    else{
                        System.out.println("El articulo no pudo ser borrado");
                    }
                    break;
                case 6:
                    mancel.borrarTodo();
                    break;
            }
            
            System.out.println("Desea retornar al menu de teléfonos celulares S/s");
            condicion = menu.next();
            
        } while (condicion.equalsIgnoreCase("s"));
       
        return;
    }
}
