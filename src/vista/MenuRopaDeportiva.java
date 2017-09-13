/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ManejadorRopaDeportiva;
import java.util.Scanner;
import modelo.RopaDeportiva;

/**
 *
 * @author danie
 */
public class MenuRopaDeportiva {
    
    Scanner leer = new Scanner(System.in);
    ManejadorRopaDeportiva manropdep = new ManejadorRopaDeportiva();
    RopaDeportiva ropdep = new RopaDeportiva();
    
     public void insertarRopaDeportiva(){
        
        System.out.println("Digite el ID de la ropa deportiva");
        ropdep.setIdArticulo(leer.nextInt());
        System.out.println("Digite el Id de la marca de la ropa deportiva");
        ropdep.setIdMarca(leer.nextInt());
        System.out.println("Digite el Id de la categoria");
        ropdep.setIdCategoria(leer.nextInt());
        System.out.println("Digite el nombre del articulo");
        ropdep.setNombre(leer.next());
        System.out.println("Digite la cantidad del articulo");
        ropdep.setCantidad(leer.nextInt());
        System.out.println("Digite el precio");
        ropdep.setPrecio(leer.nextFloat());
        System.out.println("Color");
        ropdep.setColor(leer.next());
        System.out.println("Url Imagen");
        ropdep.setImagen(leer.next());
        System.out.println("Tipo: ");
        System.out.println("0- Pantalon");
        System.out.println("1- Camiseta");
        System.out.println("2- Ropa interior");
        System.out.println("Digite la opcion tipo de vestido");
        int op= leer.nextInt();
        if (op==0) {
            ropdep.setTipo("Pantalon");
         }
        else if(op==1){
            ropdep.setTipo("Camiseta");
        }
        else if(op==2){
            ropdep.setTipo("Ropa interior");
        }
        else{
            System.out.println("Opcion erronea");
        }
        System.out.println("Talla: ");
        System.out.println("0- S");
        System.out.println("1- M");
        System.out.println("2- L");
        System.out.println("3- XL");
        System.out.println("4- XXL");
        System.out.println("5- XXXL");
        System.out.println("Digite la opcion talla");
        op= leer.nextInt();
        if (op==0) {
            ropdep.setTalla("S");
         }
        else if(op==1){
            ropdep.setTalla("M");
        }
        else if(op==2){
            ropdep.setTalla("L");
        }
        else if(op==3){
            ropdep.setTalla("XL");
        }
        else if(op==4){
            ropdep.setTalla("XXL");
        }
        else if(op==5){
            ropdep.setTalla("XXXL");
        }
        else{
            System.out.println("Opcion erronea");
        }
        System.out.println("Tipo de usuario");
        System.out.println("0-niño");
        System.out.println("1-niña");
        System.out.println("2-hombre");
        System.out.println("3-mujer");
        System.out.println("Digite la opcion tipo de usuario");
        op= leer.nextInt();
        if (op==0) {
            ropdep.setTipousuario("niño");
        }
        else if (op==1) {
             ropdep.setTipousuario("niña");
         }
        else if (op==2) {
             ropdep.setTipousuario("Hombre");
        }
        else if (op==3) {
             ropdep.setTipousuario("Mujer");
        }
        else{
            System.out.println("Opcion erronea");
        }
        
       if (manropdep.insertar(ropdep)) {
            System.out.println("Ropa deportiva insertado");
        } else {
            System.out.println("Ropa deportiva No insertado");
        }

    }
     
    public void consultarUnaRopaDeportiva() {
        System.out.println("Digite el ID a buscar");
        int a = leer.nextInt();
        RopaDeportiva resultado = (RopaDeportiva) manropdep.consultarId(a);
        if (resultado == null) {
            System.out.println("No se encontro el articulo");
        }
        else{
            System.out.println("Los datos consultados son " + resultado.toString());
        }
    }
    public void menuRopaDeportiva() {
        String condicion = "";

        do {
            Scanner menu = new Scanner(System.in);
            System.out.println("1- Insertar vestido");
            System.out.println("2- Consultar todas los vestidos");
            System.out.println("3- Consultar por Id del vestido");
            System.out.println("4- Modificar vestido");
            System.out.println("5- Eliminar vestido");
            System.out.println("6- Eliminar todos los vestidos");
            System.out.println("Digite su opción");
            int opcion = menu.nextInt();
            int ideliminar, idmodificar;
            switch (opcion) {
                case 1:
                    insertarRopaDeportiva();
                    break;
                case 2:
                    manropdep.consultarTodos();
                    break;
                case 3:
                    consultarUnaRopaDeportiva();
                    break;
                case 4:
                    RopaDeportiva ropdepmod = new RopaDeportiva();
                    
                    System.out.println("Digite el Id a modificar");
                    int a = leer.nextInt();
                    
                    int posicion = manropdep.busquedaBinaria(a);
                    if (!(posicion==-1)) {
                    System.out.println("Digite el nuevo ID de la ropa deportiva");
                    ropdepmod.setIdArticulo(leer.nextInt());
                    System.out.println("Digite el nuevo Id de la marca de la ropa deportiva");
                    ropdepmod.setIdMarca(leer.nextInt());
                    System.out.println("Digite el nuevo Id de la categoria");
                    ropdepmod.setIdCategoria(leer.nextInt());
                    System.out.println("Digite el nuevo nombre del articulo");
                    ropdepmod.setNombre(leer.next());
                    System.out.println("Digite la nueva cantidad del articulo");
                    ropdepmod.setCantidad(leer.nextInt());
                    System.out.println("Digite el nuevo precio");
                    ropdepmod.setPrecio(leer.nextFloat());
                    System.out.println("nuevo Color");
                    ropdepmod.setColor(leer.next());
                    System.out.println("nueva Url Imagen");
                    ropdepmod.setImagen(leer.next());
                    System.out.println("Tipo: ");
                    System.out.println("0- Pantalon");
                    System.out.println("1- Camiseta");
                    System.out.println("2- Ropa interior");
                    System.out.println("Digite la opcion tipo de vestido");
                    int op= leer.nextInt();
                    if (op==0) {
                        ropdepmod.setTipo("Pantalon");
                    }
                    else if(op==1){
                        ropdepmod.setTipo("Camiseta");
                    }
                    else if(op==2){
                        ropdepmod.setTipo("Ropa interior");
                    }
                    else{
                    System.out.println("Opcion erronea");
                    }
                    System.out.println("Talla: ");
                    System.out.println("0- S");
                    System.out.println("1- M");
                    System.out.println("2- L");
                    System.out.println("3- XL");
                    System.out.println("4- XXL");
                    System.out.println("5- XXXL");
                    System.out.println("Digite la opcion talla");
                    op= leer.nextInt();
                    if (op==0) {
                        ropdepmod.setTalla("S");
                    }
                    else if(op==1){
                        ropdepmod.setTalla("M");
                    }
                    else if(op==2){
                        ropdepmod.setTalla("L");
                    }
                    else if(op==3){
                        ropdepmod.setTalla("XL");
                    }
                    else if(op==4){
                        ropdepmod.setTalla("XXL");
                    }
                    else if(op==5){
                        ropdepmod.setTalla("XXXL");
                    }
                    else{
                    System.out.println("Opcion erronea");
                    }
                    System.out.println("Tipo de usuario");
                    System.out.println("0-niño");
                    System.out.println("1-niña");
                    System.out.println("2-hombre");
                    System.out.println("3-mujer");
                    System.out.println("Digite la opcion tipo de usuario");
                    op= leer.nextInt();
                    if (op==0) {
                        ropdepmod.setTipousuario("niño");
                    }
                    else if (op==1) {
                        ropdepmod.setTipousuario("niña");
                    }
                    else if (op==2) {
                        ropdepmod.setTipousuario("Hombre");
                    }
                    else if (op==3) {
                        ropdepmod.setTipousuario("Mujer");
                    }
                    else{
                        System.out.println("Opcion erronea");
                    }

                    
                    if (manropdep.modificar(a, ropdepmod)) {
                        System.out.println("Modificación correcta");
                    }
                    }
                    else{
                        System.out.println("Error al modificar");
                    }
                    
                case 5:
                    System.out.println("Digite el ID a eliminar");
                    ideliminar = leer.nextInt();
                    
                    if (manropdep.borrar(ideliminar)) {
                        System.out.println("El articulo fue eliminado");
                    }
                    else{
                        System.out.println("El articulo no pudo ser borrado");
                    }
                    break;
                case 6:
                    manropdep.borrarTodo();
                    break;

                default:
                    System.out.println("Opcion no permitida");
            }
            System.out.println("Desea retornar al menu de Ropa deportiva S/s");
            condicion = menu.next();
        } while (condicion.equalsIgnoreCase("s"));

        return;
    }
}
