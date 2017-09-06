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
public class MenuCategoriaElectrodomesticos {
    MenuNeveras mennev = new MenuNeveras();
    MenuTelevisores mentv = new MenuTelevisores();
    MenuHornoselectricosygas menhornelygas = new MenuHornoselectricosygas();
    MenuHornosmicroondas menhornmic = new MenuHornosmicroondas();
    

    Scanner menu = new Scanner(System.in);
    String condicion = "";

    public void MenuElectrodomesticos() {
        do {

            System.out.println("1- Neveras");
            System.out.println("2- Televisores");
            System.out.println("3- Hornos electricos y a gas");
            System.out.println("4- Hornos microondas");
            int opcion = menu.nextInt();
            switch (opcion) {
                case 1:
                    mennev.menuNeveras();
                    break;
                case 2:
                    mentv.menuTelevisores();
                    break;
                case 3:
                    menhornelygas.menuHornoselectricosygas();
                    break;
                case 4:
                    menhornmic.menuHornosmicroondas();
                    break;
                default:
                    System.out.println("Opcion no permitida");
            }
            System.out.println("Desea retornar al menu categorias electrodomesticos S/s");
            condicion = menu.next();
        } while (condicion.equalsIgnoreCase("s"));
    }
}
