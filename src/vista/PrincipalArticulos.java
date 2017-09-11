/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Scanner;

/**
 *
 *
 * @author Unalman
 */
public class PrincipalArticulos {

    public static void main(String[] args) {
    
          MenuMarcas marcasmen = new MenuMarcas();
          
//        MenuArticulos articulosmenu = new MenuArticulos();
//        articulosmenu.menuArticulos();
          MenuCategoriaElectronicosOficina menelec = new MenuCategoriaElectronicosOficina();
          MenuCategoriaElectrodomesticos mendom = new MenuCategoriaElectrodomesticos();
          MenuCategoriaDeportivos mendep = new MenuCategoriaDeportivos();
          MenuCategoriaRopa menrop = new MenuCategoriaRopa();
          MenuCategoriaHerramientas menher = new MenuCategoriaHerramientas();
          MenuCategoriaVideojuegos menvid = new MenuCategoriaVideojuegos();
          
           String condicion = "";

        do {
            Scanner menu = new Scanner(System.in);
            System.out.printf("%25s","TIENDA VIRTUAL\n");
            System.out.println("1- Marcas");
            System.out.println("2- Categoria Electronicos oficina");
            System.out.println("3- Categoria Electronicos para el hogar");
            System.out.println("4- Categoria Articulos Deportivos");
            System.out.println("5- Categoria Ropa ");
            System.out.println("6- Categoria Herramientas");
            System.out.println("7- Categoria Videojuegos");
            System.out.println("Digite su opción");
            int opcion = menu.nextInt();
            switch (opcion) {
                case 1:
                    marcasmen.menuMarcas();
                    break;
                case 2:
                    menelec.MenuElectronicosOficina();
                    break;
                case 3:
                    mendom.MenuElectrodomesticos();
                    break;
                case 4:
                    mendep.MenuDeportivos();
                    break;
                case 5:
                    menrop.MenuRopa();
                    break;
                case 6:
                    menher.MenuHerramientas();
                    break;
                case 7:
                    menvid.MenuVideojuegos();
                    break;

                default:
                    System.out.println("Opcion no permitida");
            }
            System.out.println("Desea retornar al menu principal S/s");
            condicion = menu.next();
        } while (condicion.equalsIgnoreCase("s"));

    }
}
