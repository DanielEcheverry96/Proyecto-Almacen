package vista;

import controlador.ManejadorCategorias;
import java.util.Scanner;
import modelo.Categorias;

public class MenuCategorias {

    ManejadorCategorias manejadorcategorias = new ManejadorCategorias();

    public void insertarCategorias() {
        String salir = "s";
        Scanner leer = new Scanner(System.in);
        do {
            Categorias cat = new Categorias();
            System.out.println("Digite el Id de la categoria");
            cat.setId(leer.nextInt());
            System.out.println("Digite el nombre de la marca");
            cat.setDescripcion(leer.next());
            if (manejadorcategorias.insertar(cat)) {
                System.out.println("Categoria insertada");

            } else {
                System.out.println("Problemas al insertar la categoria");

            }
            System.out.println("Digite S/s si desea continuar");
            salir = leer.next();

        } while (salir.equalsIgnoreCase("s"));

    }

    public void consultarUnaCategoria() {
        System.out.println("Digite el Id que quiere consultar ");
        Scanner leer = new Scanner(System.in);
        Categorias cat = new Categorias();
        cat.setId(leer.nextInt());
        Categorias cat2 = new Categorias();
        cat2 = (Categorias) manejadorcategorias.consultar(cat);
        if (!cat2.getDescripcion().equals(null)) {

        }
    }

}
