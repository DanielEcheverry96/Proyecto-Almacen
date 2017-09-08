/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ManejadorZapatos;
import java.util.Scanner;
import modelo.Zapatos;

/**
 *
 * @author Daniel
 */
public class MenuZapatos {
    
    Scanner leer = new Scanner(System.in);
    ManejadorZapatos manzap = new ManejadorZapatos();
    
     public void insertarZapatos(){
        
        Zapatos zap = new Zapatos();
        
        System.out.println("Digite el ID del zapato");
        zap.setIdArticulo(leer.nextInt());
        System.out.println("Digite el Id de la marca del zapato");
        zap.setNombre(leer.next());
        System.out.println("Digite el Id de la categoria");
        zap.setIdCategoria(leer.nextInt());
        System.out.println("Digite el nombre del articulo");
        zap.setNombre(leer.next());
        System.out.println("Digite la cantidad del articulo");
        zap.setCantidad(leer.nextInt());
        System.out.println("Digite el precio");
        zap.setPrecio(leer.nextFloat());
        System.out.println("Color");
        zap.setColor(leer.next());
        System.out.println("Url Imagen");
        zap.setImagen(leer.next());
        System.out.println("Tipo de zapato");
        System.out.println("0-Deporivo");
        System.out.println("1-Calle");
        System.out.println("Digite la opcion tipo de zapato");
        zap.setTipozapato(leer.nextInt());
        System.out.println("Digite la talla numerica");
        zap.setTallanumerica(leer.nextInt());
        System.out.println("Tipo de usuario");
        System.out.println("0-niño");
        System.out.println("1-niña");
        System.out.println("2-hombre");
        System.out.println("3-mujer");
        System.out.println("Digite la opcion tipo de usuario");
        zap.setTipousuario(leer.nextInt());
        
    
       if (manzap.insertar(zap)) {
            System.out.println("Zapato insertado");
        } else {
            System.out.println("Zapato No insertado");
        }

    }
     
    public void consultarUnaSierra() {
        System.out.println("Digite el ID a buscar");
        int a = leer.nextInt();
        Zapatos resultado = (Zapatos) manzap.consultarId(a);
        if (resultado == null) {
            System.out.println("No se encontro el articulo");
        }
        else{
            System.out.println("Los datos consultados son " + resultado.toString());
        }
    }
    public void menuSierras() {
        String condicion = "";

        do {
            Scanner menu = new Scanner(System.in);
            System.out.println("1- Insertar sierra");
            System.out.println("2- Consultar todas las sierras");
            System.out.println("3- Consultar por Id de la sierra");
            System.out.println("4- Modificar sierra");
            System.out.println("5- Eliminar sierra");
            System.out.println("6- Eliminar todos las sierras");
            System.out.println("Digite su opción");
            int opcion = menu.nextInt();
            int ideliminar;
            switch (opcion) {
                case 1:
                    insertarZapatos();
                    break;
                case 2:
                    manzap.consultarTodos();
                    break;
                case 3:
                    consultarUnaSierra();
                    break;
                case 4:
                    
                    break;
                case 5:
                    System.out.println("Digite el ID a eliminar");
                    ideliminar = leer.nextInt();
                    if (mansie.borrar(ideliminar)) {
                        System.out.println("El articulo fue eliminado");
                    }
                    else{
                        System.out.println("El articulo no pudo ser borrado");
                    }
                    break;
                case 6:
                    mansie.borrarTodo();
                    break;

                default:
                    System.out.println("Opcion no permitida");
            }
            System.out.println("Desea retornar al menu de Sierras S/s");
            condicion = menu.next();
        } while (condicion.equalsIgnoreCase("s"));

        return;
    }
}
