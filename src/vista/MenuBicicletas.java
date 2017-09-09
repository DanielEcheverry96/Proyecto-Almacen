/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ManejadorBicicletas;
import java.util.Scanner;
import modelo.Bicicletas;

/**
 *
 * @author danie
 */
public class MenuBicicletas {
    
    Scanner leer = new Scanner (System.in);
    ManejadorBicicletas manbici = new ManejadorBicicletas();
    
    public void insertarBicicletas() {

            Bicicletas bici = new Bicicletas();
        
        System.out.println("Digite el ID del Juego");
        bici.setIdArticulo(leer.nextInt());
        System.out.println("Digite el Id de la marca del juego");
        bici.setNombre(leer.next());
        System.out.println("Digite el Id de la categoria");
        bici.setIdCategoria(leer.nextInt());
        System.out.println("Digite el nombre del articulo");
        bici.setNombre(leer.next());
        System.out.println("Digite la cantidad del articulo");
        bici.setCantidad(leer.nextInt());
        System.out.println("Digite el precio");
        bici.setPrecio(leer.nextFloat());
        System.out.println("Url Imagen");
        bici.setImagen(leer.next());
        System.out.println("Digite el tamaño de la rueda");
        bici.setTamaniorueda(leer.nextInt());
        System.out.println("Digite el material de la montura");
        bici.setMaterial(leer.next());
        System.out.println("Digite el tipo de bicicleta");
        bici.setTipo(leer.next());
        
        if (manbici.insertar(bici)) {
            System.out.println("Bicicleta insertada");
        } else {
            System.out.println("Bicicleta No insertada");
        }

    }
        
    public void consultarUnaBicicleta() {
        System.out.println("Digite el ID a buscar");
        int a = leer.nextInt();
        Bicicletas resultado = (Bicicletas) manbici.consultarId(a);
        if (resultado == null) {
            System.out.println("No se encontro el articulo");
        }
        else {
            System.out.println("Los datos consultados son " + resultado.toString());
        }
    }
    
    public void menuBicicletas() {
        String condicion = "";

        do {
            Scanner menu = new Scanner(System.in);
            System.out.println("1- Insertar bicicleta");
            System.out.println("2- Consultar todas las bicicletas");
            System.out.println("3- Consultar por Id de la bicicleta");
            System.out.println("4- Modificar bicicleta");
            System.out.println("5- Eliminar bicicleta");
            System.out.println("6- Eliminar todas las bicicletas");
            System.out.println("Digite su opción");
            int opcion = menu.nextInt();
            int ideliminar;
            switch (opcion) {
                case 1:
                    insertarBicicletas();
                    break;
                case 2:
                    manbici.consultarTodos();
                    break;
                case 3:
                    consultarUnaBicicleta();
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Digite el ID a eliminar");
                    ideliminar = leer.nextInt();
                    if (manbici.borrar(ideliminar)) {
                        System.out.println("El articulo fue eliminado");
                    }
                    else{
                        System.out.println("El articulo no pudo ser borrado");
                    }
                    break;
                case 6:
                    manbici.borrarTodo();
                    break;

                default:
                    System.out.println("Opcion no permitida");
            }
            System.out.println("Desea retornar al menu de Bicicletas S/s");
            condicion = menu.next();
        } while (condicion.equalsIgnoreCase("s"));

        return;
    }
}
