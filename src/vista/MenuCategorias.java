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
            System.out.println("Digite el nombre de la categoria");
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
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el ID a buscar");
        int a = leer.nextInt();
        Categorias resultado = (Categorias) manejadorcategorias.consultarId(a);
        System.out.println("Los datos consultados son " + resultado.toString());
    }

    public void menuCategorias() {
        String condicion = "";

        do {
            Scanner menu = new Scanner(System.in);
            System.out.println("1-Insertar categorias");
            System.out.println("2-Consultar todas las categorias");
            System.out.println("3-Consultar categorias por Id");
            System.out.println("Digite su opción");
            int opcion = menu.nextInt();
            switch (opcion) {
                case 1:
                    insertarCategorias();
                    break;
                case 2:
                    manejadorcategorias.consultarTodos();
                    break;
                case 3:
                    consultarUnaCategoria();
                    break;
                default:
                    System.out.println("Opcion no permitida");
            }
            System.out.println("Desea retornar al menu de Categorias S/s");
            condicion = menu.next();
        } while (condicion.equalsIgnoreCase("s"));

    }
}
