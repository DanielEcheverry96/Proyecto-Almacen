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
        
        System.out.println("Digite el Id");
        telcel.setIdArticulo(leer.nextInt());
        System.out.println("Digite el Id de la marca");
        telcel.setIdMarca(leer.nextInt());
        System.out.println("Digite el Id de la categoria");
        telcel.setIdCategoria(leer.nextInt());
        System.out.println("Digite el nombre del articulo");
        telcel.setNombre(leer.next());
        System.out.println("Digite la cantidad del articulo");
        telcel.setCantidad(leer.nextInt());
        System.out.println("Precio");
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
        System.out.println("Los datos consultados son "+resultado.toString());
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
            System.out.println("Digite su opción");
            int opcion = menu.nextInt();
            
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
                default:
                    System.out.println("Opcion no permitida");
            }
            
            System.out.println("Desea retornar al menu de Categorias electronicos para oficina S/s");
            condicion = menu.next();
            
        } while (condicion.equalsIgnoreCase("s"));
       
        return;
    }
}
