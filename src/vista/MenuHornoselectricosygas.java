/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ManejadorHornoselectricosygas;
import java.util.Scanner;
import modelo.Hornoselectricosygas;

/**
 *
 * @author Daniel
 */
public class MenuHornoselectricosygas {
    Scanner leer = new Scanner (System.in);
    ManejadorHornoselectricosygas manheg = new ManejadorHornoselectricosygas();
    
    
    public void insertarHornoselectricosygas() {
        Hornoselectricosygas heg = new Hornoselectricosygas();
        
        System.out.println("Digite el ID del horno");
        heg.setIdArticulo(leer.nextInt());
        System.out.println("Digite el Id de la marca del horno");
        heg.setNombre(leer.next());
        System.out.println("Digite el Id de la categoria");
        heg.setIdCategoria(leer.nextInt());
        System.out.println("Digite el nombre del articulo");
        heg.setNombre(leer.next());
        System.out.println("Digite la cantidad del articulo");
        heg.setCantidad(leer.nextInt());
        System.out.println("Digite el precio");
        heg.setPrecio(leer.nextFloat());
        System.out.println("Color");
        heg.setColor(leer.next());
        System.out.println("Url Imagen");
        heg.setImagen(leer.next());
        System.out.println("Digite la potencia del horno");
        heg.setPotencia(leer.next());
        System.out.println("Digite el número de bandejas del horno");
        heg.setNumbandejas(leer.nextInt());
        System.out.println("Digite el gratinador del horno");
        heg.setGratinador(leer.next());
        System.out.println("Digite el tipo de control del horno");
        heg.setTipocontrol(leer.next());
        System.out.println("Digite la temperatura maxima del horno");
        heg.setTemperaturamax(leer.nextInt());
        
        if (manheg.insertar(heg)) {
            System.out.println("Horno insertado");
        } else {
            System.out.println("Horno No insertado");
        }

    }

    public void consultarUnHornoelectricoygas() {
        System.out.println("Digite el ID a buscar");
        int a = leer.nextInt();
        Hornoselectricosygas resultado = (Hornoselectricosygas) manheg.consultarId(a);
        if (resultado == null) {
            System.out.println("No se encontro el articulo");
        }
        else{
            System.out.println("Los datos consultados son " + resultado.toString());
        }
    }
    public void menuHornoselectricosygas() {
        String condicion = "";

        do {
            Scanner menu = new Scanner(System.in);
            System.out.println("1- Insertar horno");
            System.out.println("2- Consultar todos los hornos");
            System.out.println("3- Consultar por Id del horno");
            System.out.println("4- Modificar horno");
            System.out.println("5- Eliminar horno");
            System.out.println("Digite su opción");
            int opcion = menu.nextInt();
            switch (opcion) {
                case 1:
                    insertarHornoselectricosygas();
                    break;
                case 2:
                    manheg.consultarTodos();
                    break;
                case 3:
                    consultarUnHornoelectricoygas();
                    break;

                default:
                    System.out.println("Opcion no permitida");
            }
            System.out.println("Desea retornar al menu de Hornor electricos y de gas S/s");
            condicion = menu.next();
        } while (condicion.equalsIgnoreCase("s"));

        return;
    }
}