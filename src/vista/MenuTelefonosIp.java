/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ManejadorObjetos;
import controlador.ManejadorTelefonosIp;
import java.util.Scanner;
import modelo.TelefonosIp;

/**
 *
 * @author danie
 */
public class MenuTelefonosIp {
    
    Scanner leer = new Scanner(System.in);
    ManejadorTelefonosIp mantelip = new ManejadorTelefonosIp();
    ManejadorObjetos manobj = new ManejadorObjetos();
    
    public void insertarTelefonosIp(){
        
        TelefonosIp telip = new TelefonosIp();
             
        System.out.println("Digite el Id del telefono ip");
        telip.setIdArticulo(leer.nextInt());
        System.out.println("Digite el Id de la marca del telefono ip");
        int id= leer.nextInt();
        telip.setMar(manobj.arregloMarcas.get(manobj.busquedaBinaria(id)));
        System.out.println("Digite el nombre del articulo");
        telip.setNombre(leer.next());
        System.out.println("Digite la cantidad del articulo");
        telip.setCantidad(leer.nextInt());
        System.out.println("Precio");
        telip.setPrecio(leer.nextFloat());
        System.out.println("Color");
        telip.setColor(leer.next());
        System.out.println("Url Imagen");
        telip.setImagen(leer.next());
        System.out.println("Tipo de procesador");
        telip.setTipoprocesador(leer.next());
        System.out.println("Interface de red");
        telip.setInterfacered(leer.next());
        
        if (mantelip.insertar(telip)) {
            System.out.println("El telefono ip ha sido insertado");
        }
        else{
            System.out.println("El telefono ip no ha sido insertado");
        }
    }
    
    public void consultarUnTelefonoIp(){
        System.out.println("Digite el Id a buscar");
        int a = leer.nextInt();
        TelefonosIp resultado = (TelefonosIp)mantelip.consultarId(a);
        if (resultado == null) {
            System.out.println("No se encontro el articulo");
        }
        else{
            System.out.println("Los datos consultados son "+resultado.toString());
        }
    }
    
     public void menuTelefonoIp(){
        
        String condicion = "";
        
        do {
            Scanner menu = new Scanner(System.in);
            
            System.out.println("1- Insertar telefono ip");
            System.out.println("2- Consultar todos los telefonos ip");
            System.out.println("3- Consultar por Id del telefono ip");
            System.out.println("4- Modificar telefono ip");
            System.out.println("5- Eliminar telefono ip");
            System.out.println("6- Eliminar todos los telefonos ip");
            System.out.println("Digite su opción");
            int opcion = menu.nextInt();
            int ideliminar;
            switch (opcion) {
                case 1:
                        insertarTelefonosIp();
                    break;
                case 2: 
                        mantelip.consultarTodos();
                    break;
                case 3:
                        consultarUnTelefonoIp();
                    break;
                case 4:
                    TelefonosIp telipmod = new TelefonosIp();
                    
                    System.out.println("Digite el Id a modificar");
                    int a = leer.nextInt();
                    
                    int posicion = mantelip.busquedaBinaria(a);
                    if (!(posicion==-1)) {
                    System.out.println("Digite el nuevo Id de la marca del telefono Ip");
                    telipmod.setIdMarca(leer.nextInt());
                    System.out.println("Digite el nuevo nombre del articulo");
                    telipmod.setNombre(leer.next());
                    System.out.println("Digite la nueva cantidad del articulo");
                    telipmod.setCantidad(leer.nextInt());
                    System.out.println("Digite el nuevo precio");
                    telipmod.setPrecio(leer.nextFloat());
                    System.out.println("nuevo Color");
                    telipmod.setColor(leer.next());
                    System.out.println("nueva Url Imagen");
                    telipmod.setImagen(leer.next());
                    System.out.println("Tipo de procesador");
                    telipmod.setTipoprocesador(leer.next());
                    System.out.println("Interface de red");
                    telipmod.setInterfacered(leer.next());
                    
                    if (mantelip.modificar(posicion, telipmod)) {
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
                    
                    if (mantelip.borrar(ideliminar)) {
                        System.out.println("El articulo fue eliminado");
                    }
                    else{
                        System.out.println("El articulo no pudo ser borrado");
                    }
                    break;
                case 6:
                    mantelip.borrarTodo();
                    break;
                default:
                    System.out.println("Opcion no permitida");
            }
            
            System.out.println("Desea retornar al menu de teléfonos IP S/s");
            condicion = menu.next();
            
        } while (condicion.equalsIgnoreCase("s"));
       
        return;
    }
}
