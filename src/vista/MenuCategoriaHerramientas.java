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
public class MenuCategoriaHerramientas {
    
    MenuMartillos menmart = new MenuMartillos();
    MenuRemachadoras menrem = new MenuRemachadoras();
    MenuSierras mensie= new MenuSierras();

    
    Scanner menu = new Scanner(System.in);
    String condicion = "";

    public void MenuHerramientas() {
        do {

            System.out.println("1- Martillos");
            System.out.println("2- Remachadoras");
            System.out.println("3- Sierras");
            int opcion = menu.nextInt();
            switch (opcion) {
                case 1:
                    menmart.menuMartillos();
                    break;
                case 2:
                    menrem.menuRemachadoras();
                    break;
                case 3:
                    mensie.menuSierras();
                    break;

                default:
                    System.out.println("Opcion no permitida");
            }
            System.out.println("Desea retornar al menu categoria Herramientas S/s");
            condicion = menu.next();
        } while (condicion.equalsIgnoreCase("s"));
    }
}


