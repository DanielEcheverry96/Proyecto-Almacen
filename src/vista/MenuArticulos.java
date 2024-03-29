package vista;

import controlador.ManejadorArticulos;
import java.util.Scanner;
import modelo.Articulos;

public class MenuArticulos {

    ManejadorArticulos manejadorarticulos = new ManejadorArticulos();

    public void insertarArticulos() {
        String salir = "s";
        Scanner leer = new Scanner(System.in);
        do {
            Articulos art = new Articulos();
            System.out.println("Digite el Id de la marca");
            art.setIdMarca(leer.nextInt());
            System.out.println("Digite el Id del articulo");
            art.setIdArticulo(leer.nextInt());
            System.out.println("Digite nombre del articulo");
            art.setNombre(leer.next());
            System.out.println("Digite la descripcion del articulo");
            art.setDescripcion(leer.next());
            System.out.println("Digite el precio del articulo");
            art.setPrecio(leer.nextFloat());
            System.out.println("Digite la cantidad del articulo");
            art.setCantidad(leer.nextInt());
            System.out.println("Digite el color del articulo");
            art.setColor(leer.next());
            System.out.println("Ingrese la imagen");
            art.setImagen(leer.next());
            if (manejadorarticulos.insertar(art)) {
                System.out.println("Articulo insertado");
            } else {
                System.out.println("Problemas al insertar el articulo");
            }
            System.out.println("Digite S/s si desea continuar");
            salir = leer.next();
        } while (salir.equalsIgnoreCase("s"));
    }

    public void consultarUnArticulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el ID a buscar");
        int a = leer.nextInt();
        Articulos resultado = (Articulos) manejadorarticulos.consultarId(a);
        System.out.println("Los datos consultados son " + resultado.toString());
    }

    public void menuArticulos() {
        String condicion = "";
        do {
            Scanner menu = new Scanner(System.in);
            System.out.println("1-Insertar articulos");
            System.out.println("2-Consultar todos los articulos");
            System.out.println("3-Consultar articulos por Id");
            System.out.println("Digite su opción");
            int opcion = menu.nextInt();
            switch (opcion) {
                case 1:
                    insertarArticulos();
                    break;
                case 2:
                    manejadorarticulos.consultarTodos();
                    break;
                case 3:
                    consultarUnArticulo();
                    break;
                
                default:
                    System.out.println("Opción no permitida");
            }
            System.out.println("Desea retornar al menu de Articulos S/s");
            condicion = menu.next();
        } while (condicion.equalsIgnoreCase("s"));
    }

}
