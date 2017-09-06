/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ManejadorRaquetas;
import java.util.Scanner;
import modelo.Raquetas;

/**
 *
 * @author BP-LABREDES00
 */
public class MenuRaquetas {
    
    Scanner leer = new Scanner (System.in);
    ManejadorRaquetas manraque = new ManejadorRaquetas();
    
    public void insertarNeveras() {
        
        
        Raquetas raque = new Raquetas();
        
        System.out.println("Digite el Id de la raqueta");
        raque.setIdArticulo(leer.nextInt());
        System.out.println("Digite el Id de la marca de la raqueta");
        raque.setNombre(leer.next());
        System.out.println("Digite el Id de la categoria");
        raque.setIdCategoria(leer.nextInt());
        System.out.println("Digite el nombre del articulo");
        raque.setNombre(leer.next());
        System.out.println("Digite la cantidad del articulo");
        raque.setCantidad(leer.nextInt());
        System.out.println("Digite el precio");
        raque.setPrecio(leer.nextFloat());
        System.out.println("Color");
        raque.setColor(leer.next());
        System.out.println("Url Imagen");
        raque.setImagen(leer.next());
        System.out.println("Tipo de marco"); 
        raque.setTipomarco(leer.next());
        System.out.println("Longitud");
        raque.setLongitud(leer.nextInt());
        System.out.println("Ancho");
        raque.setAncho(leer.nextFloat());
        System.out.println("Peso");
        raque.setPeso(leer.nextFloat());
        
        if (manraque.insertar(raque)) {
            System.out.println("Raqueta insertada");
        } else {
            System.out.println("Raqueta No insertada");
        }

    }
    
        public void consultarUnaRaqueta() {
        System.out.println("Digite el ID a buscar");
        int a = leer.nextInt();
        Raquetas resultado = (Raquetas) manraque.consultarId(a);
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
            System.out.println("1- Insertar raqueta");
            System.out.println("2- Consultar todas las raquetas");
            System.out.println("3- Consultar por Id de la raqueta");
            System.out.println("4- Modificar raqueta");
            System.out.println("5- Eliminar raqueta");
            System.out.println("Digite su opción");
            int opcion = menu.nextInt();
            switch (opcion) {
                case 1:
                    insertarNeveras();
                    break;
                case 2:
                    manraque.consultarTodos();
                    break;
                case 3:
                    consultarUnaRaqueta();
                    break;

                default:
                    System.out.println("Opcion no permitida");
            }
            System.out.println("Desea retornar al menu de Raquetas S/s");
            condicion = menu.next();
        } while (condicion.equalsIgnoreCase("s"));

        return;
    }
}
