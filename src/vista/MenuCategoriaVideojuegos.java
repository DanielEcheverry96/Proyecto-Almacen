/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class MenuCategoriaVideojuegos {
    
    MenuJuegos menvid = new MenuJuegos();
    MenuConsolas mencons = new MenuConsolas();

    
    Scanner menu = new Scanner(System.in);
    String condicion = "";

    public void MenuVideojuegos() {
        do {

            System.out.println("1- Juegos");
            System.out.println("2- Consolas");
            int opcion = menu.nextInt();
            switch (opcion) {
                case 1:
                    menvid.menuJuegos();
                    break;
                case 2:
                    mencons.menuConsolas();
                    break;

                default:
                    System.out.println("Opcion no permitida");
            }
            System.out.println("Desea retornar al menu categoria Videojuegos S/s");
            condicion = menu.next();
        } while (condicion.equalsIgnoreCase("s"));
    }
}

