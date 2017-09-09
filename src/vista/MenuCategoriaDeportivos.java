/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author BP-LABREDES00
 */
public class MenuCategoriaDeportivos {
    
        
    MenuRaquetas menraq = new MenuRaquetas();
    MenuBicicletas menbici = new MenuBicicletas();
    

    
    Scanner menu = new Scanner(System.in);
    String condicion = "";

    public void MenuRaquetas() {
        do {

            System.out.println("1- Raquetas");
            System.out.println("2- Bicicletas");
            int opcion = menu.nextInt();
            switch (opcion) {
                case 1:
                   menraq.menuRaquetas();
                    break;
                case 2:
                    menbici.menuBicicletas();
                    break;
                default:
                    System.out.println("Opcion no permitida");
            }
            System.out.println("Desea retornar al menu categoria Deportiva S/s");
            condicion = menu.next();
        } while (condicion.equalsIgnoreCase("s"));
    }
}
