/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 *
 * @author Unalman
 */
public class PrincipalArticulos {

    public static void main(String[] args) {

        MenuCategorias categoriasmenu = new MenuCategorias();
        categoriasmenu.menuCategorias();
        MenuMarcas marcasmen = new MenuMarcas();
        marcasmen.menuMarcas();
        MenuArticulos articulosmenu = new MenuArticulos();
        articulosmenu.menuArticulos();

    }

}
