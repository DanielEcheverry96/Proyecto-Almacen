/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class MenuCategoriaRopa {
    
        
    MenuZapatos menzap = new MenuZapatos();
    MenuVestidosCalle menvesc = new MenuVestidosCalle();

    
    Scanner menu = new Scanner(System.in);
    String condicion = "";

    public void MenuRopa() {
        do {

            System.out.println("1- Zapatos");
            System.out.println("2- Vestidos de calle");
            System.out.println("3- Pijamas");
            System.out.println("4- Ropa deportiva");
            int opcion = menu.nextInt();
            switch (opcion) {
                case 1:
                    menzap.menuZapatos();
                    break;
                case 2:
                    menvesc.menuVestidosCalle();
                    break;
                case 3:
                    menpij.menuPijamas();
                    break;
                case 4:
                    menrodep.menuRopaDeportiva();
                    break;

                default:
                    System.out.println("Opcion no permitida");
            }
            System.out.println("Desea retornar al menu categoria Ropa S/s");
            condicion = menu.next();
        } while (condicion.equalsIgnoreCase("s"));
    }
}
