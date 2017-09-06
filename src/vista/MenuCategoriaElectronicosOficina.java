/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MenuCategoriaElectronicosOficina {

    MenuComputadores mencomp = new MenuComputadores();
    MenuTelefonosCelulares mentelcel = new MenuTelefonosCelulares();
    MenuTelefonosIp mentelip = new MenuTelefonosIp();
    MenuImpresores menimpre = new MenuImpresores();
    

    Scanner menu = new Scanner(System.in);
    String condicion = "";

    public void MenuElectronicosOficina() {
        do {

            System.out.println("1- Computadores");
            System.out.println("2- Telefonos Celulares");
            System.out.println("3- Telefonos Ip");
            System.out.println("4- Impresores");
            int opcion = menu.nextInt();
            switch (opcion) {
                case 1:
                    mencomp.menuComputador();
                    break;
                case 2:
                    mentelcel.menuTelefonoCelular();
                    break;
                case 3:
                    mentelip.menuTelefonoIp();
                    break;
                case 4:
                    menimpre.menuImpresor();
                    break;
                default:
                    System.out.println("Opcion no permitida");
            }
            System.out.println("Desea retornar al menu categorias electronicos de oficina S/s");
            condicion = menu.next();
        } while (condicion.equalsIgnoreCase("s"));
    }
}
