/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ManejadorZapatos;
import java.util.Scanner;
import modelo.Zapatos;

/**
 *
 * @author Daniel
 */
public class MenuZapatos {
    
    Scanner leer = new Scanner(System.in);
    ManejadorZapatos manzap = new ManejadorZapatos();
    Zapatos zap = new Zapatos();
     public void insertarZapatos(){
        
        System.out.println("Digite el ID del zapato");
        zap.setIdArticulo(leer.nextInt());
        System.out.println("Digite el Id de la marca del zapato");
        zap.setNombre(leer.next());
        System.out.println("Digite el Id de la categoria");
        zap.setIdCategoria(leer.nextInt());
        System.out.println("Digite el nombre del articulo");
        zap.setNombre(leer.next());
        System.out.println("Digite la cantidad del articulo");
        zap.setCantidad(leer.nextInt());
        System.out.println("Digite el precio");
        zap.setPrecio(leer.nextFloat());
        System.out.println("Color");
        zap.setColor(leer.next());
        System.out.println("Url Imagen");
        zap.setImagen(leer.next());
        System.out.println("Tipo de zapato");
        System.out.println("0-Deporivo");
        System.out.println("1-Calle");
        System.out.println("Digite la opcion tipo de zapato");
        int op= leer.nextInt();
        if (op==0) {
            zap.setTipozapato("Deportivo");
         }
        else if(op==1){
            zap.setTipozapato("Calle");
        }
        else{
            System.out.println("Opcion erronea");
        }
        System.out.println("Digite la talla numerica");
        zap.setTallanumerica(leer.nextInt());
        System.out.println("Tipo de usuario");
        System.out.println("0-niño");
        System.out.println("1-niña");
        System.out.println("2-hombre");
        System.out.println("3-mujer");
        System.out.println("Digite la opcion tipo de usuario");
        op= leer.nextInt();
        if (op==0) {
            zap.setTipousuario("niño");
        }
        else if (op==1) {
             zap.setTipousuario("niña");
         }
        else if (op==2) {
             zap.setTipousuario("Hombre");
        }
        else if (op==3) {
             zap.setTipousuario("Mujer");
        }
        else{
            System.out.println("Opcion erronea");
        }
        
       if (manzap.insertar(zap)) {
            System.out.println("Zapato insertado");
        } else {
            System.out.println("Zapato No insertado");
        }

    }
     
    public void consultarUnZapato() {
        System.out.println("Digite el ID a buscar");
        int a = leer.nextInt();
        Zapatos resultado = (Zapatos) manzap.consultarId(a);
        if (resultado == null) {
            System.out.println("No se encontro el articulo");
        }
        else{
            System.out.println("Los datos consultados son " + resultado.toString());
        }
    }
    public void menuZapatos() {
        String condicion = "";

        do {
            Scanner menu = new Scanner(System.in);
            System.out.println("1- Insertar zapatos");
            System.out.println("2- Consultar todas los zapatos");
            System.out.println("3- Consultar por Id del zapato");
            System.out.println("4- Modificar zapato");
            System.out.println("5- Eliminar zapato");
            System.out.println("6- Eliminar todos los zapatos");
            System.out.println("Digite su opción");
            int opcion = menu.nextInt();
            int ideliminar, idmodificar;
            switch (opcion) {
                case 1:
                    insertarZapatos();
                    break;
                case 2:
                    manzap.consultarTodos();
                    break;
                case 3:
                    consultarUnZapato();
                    break;
                case 4:
                    System.out.println("Digite el ID a modificar");//Falta completar esta opcion
                    idmodificar = leer.nextInt();
                    manzap.modificar(idmodificar, zap);
                    break;
                case 5:
                    System.out.println("Digite el ID a eliminar");
                    ideliminar = leer.nextInt();
                    if (manzap.borrar(ideliminar)) {
                        System.out.println("El articulo fue eliminado");
                    }
                    else{
                        System.out.println("El articulo no pudo ser borrado");
                    }
                    break;
                case 6:
                    manzap.borrarTodo();
                    break;

                default:
                    System.out.println("Opcion no permitida");
            }
            System.out.println("Desea retornar al menu de Zapatos S/s");
            condicion = menu.next();
        } while (condicion.equalsIgnoreCase("s"));

        return;
    }
}
