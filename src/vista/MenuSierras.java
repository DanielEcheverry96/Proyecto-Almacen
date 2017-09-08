/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ManejadorSierras;
import java.util.Scanner;
import modelo.Sierras;

/**
 *
 * @author Daniel
 */
class MenuSierras {
    
    Scanner leer = new Scanner(System.in);
    ManejadorSierras mansie = new ManejadorSierras();
    
     public void insertarSierra(){
        
        Sierras sie = new Sierras();
        
        System.out.println("Digite el ID de la remachadora");
        sie.setIdArticulo(leer.nextInt());
        System.out.println("Digite el Id de la marca de la remachadora");
        sie.setNombre(leer.next());
        System.out.println("Digite el Id de la categoria");
        sie.setIdCategoria(leer.nextInt());
        System.out.println("Digite el nombre del articulo");
        sie.setNombre(leer.next());
        System.out.println("Digite la cantidad del articulo");
        sie.setCantidad(leer.nextInt());
        System.out.println("Digite el precio");
        sie.setPrecio(leer.nextFloat());
        System.out.println("Color");
        sie.setColor(leer.next());
        System.out.println("Url Imagen");
        sie.setImagen(leer.next());
        System.out.println("Digite el tipo de sierra");
        sie.setTipo(leer.next());
        System.out.println("Digite la potencia de la sierra");
        sie.setPotencia(leer.nextInt());
        System.out.println("Digite la velocidad de la sierra");
        sie.setVelocidad(leer.nextInt());
        System.out.println("Digite el peso de la sierra");
        sie.setPeso(leer.nextInt());
        System.out.println("Digite el diametro del disco de la sierra");
        sie.setDiametrodisco(leer.nextFloat());
    
       if (mansie.insertar(sie)) {
            System.out.println("Sierra insertada");
        } else {
            System.out.println("Sierra No insertada");
        }

    }
     
    public void consultarUnaSierra() {
        System.out.println("Digite el ID a buscar");
        int a = leer.nextInt();
        Sierras resultado = (Sierras) mansie.consultarId(a);
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
                    insertarSierra();
                    break;
                case 2:
                    mansie.consultarTodos();
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