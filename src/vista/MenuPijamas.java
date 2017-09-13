/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ManejadorPijamas;
import java.util.Scanner;
import modelo.Pijamas;

/**
 *
 * @author danie
 */
public class MenuPijamas {
    
    Scanner leer = new Scanner(System.in);
    ManejadorPijamas manpijam = new ManejadorPijamas();
    Pijamas pijam = new Pijamas();
    
     public void insertarPijamas(){
        
        System.out.println("Digite el ID de la pijama");
        pijam.setIdArticulo(leer.nextInt());
        System.out.println("Digite el Id de la marca de la pijama");
        pijam.setIdMarca(leer.nextInt());
        System.out.println("Digite el nombre del articulo");
        pijam.setNombre(leer.next());
        System.out.println("Digite la cantidad del articulo");
        pijam.setCantidad(leer.nextInt());
        System.out.println("Digite el precio");
        pijam.setPrecio(leer.nextFloat());
        System.out.println("Color");
        pijam.setColor(leer.next());
        System.out.println("Url Imagen");
        pijam.setImagen(leer.next());
        System.out.println("Tipo: ");
        System.out.println("0- Pantalon");
        System.out.println("1- Camiseta");
        System.out.println("2- Ropa interior");
        System.out.println("Digite la opcion tipo de vestido");
        int op= leer.nextInt();
        if (op==0) {
            pijam.setTipo("Pantalon");
         }
        else if(op==1){
            pijam.setTipo("Camiseta");
        }
        else if(op==2){
            pijam.setTipo("Ropa interior");
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
            pijam.setTalla("S");
         }
        else if(op==1){
            pijam.setTalla("M");
        }
        else if(op==2){
            pijam.setTalla("L");
        }
        else if(op==3){
            pijam.setTalla("XL");
        }
        else if(op==4){
            pijam.setTalla("XXL");
        }
        else if(op==5){
            pijam.setTalla("XXXL");
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
            pijam.setTipousuario("niño");
        }
        else if (op==1) {
             pijam.setTipousuario("niña");
         }
        else if (op==2) {
             pijam.setTipousuario("Hombre");
        }
        else if (op==3) {
             pijam.setTipousuario("Mujer");
        }
        else{
            System.out.println("Opcion erronea");
        }
        
       if (manpijam.insertar(pijam)) {
            System.out.println("Pijama insertado");
        } else {
            System.out.println("Pijama No insertado");
        }

    }
     
    public void consultarUnaPijama() {
        System.out.println("Digite el ID a buscar");
        int a = leer.nextInt();
        Pijamas resultado = (Pijamas) manpijam.consultarId(a);
        if (resultado == null) {
            System.out.println("No se encontro el articulo");
        }
        else{
            System.out.println("Los datos consultados son " + resultado.toString());
        }
    }
    public void menuPijamas() {
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
                    insertarPijamas();
                    break;
                case 2:
                    manpijam.consultarTodos();
                    break;
                case 3:
                    consultarUnaPijama();
                    break;
                case 4:
                    Pijamas pijmod = new Pijamas();
                    
                    System.out.println("Digite el Id a modificar");
                    int a = leer.nextInt();
                    
                    int posicion = manpijam.busquedaBinaria(a);
                    if (!(posicion==-1)) {
                    System.out.println("Digite el nuevo Id de la marca de la pijama");
                    pijmod.setIdMarca(leer.nextInt());
                    System.out.println("Digite el nuevo nombre del articulo");
                    pijmod.setNombre(leer.next());
                    System.out.println("Digite la nueva cantidad del articulo");
                    pijmod.setCantidad(leer.nextInt());
                    System.out.println("Digite el nuevo precio");
                    pijmod.setPrecio(leer.nextFloat());
                    System.out.println("nuevo Color");
                    pijmod.setColor(leer.next());
                    System.out.println("nueva Url Imagen");
                    pijmod.setImagen(leer.next());
                    System.out.println("Tipo: ");
                    System.out.println("0- Pantalon");
                    System.out.println("1- Camiseta");
                    System.out.println("2- Ropa interior");
                    System.out.println("Digite la opcion tipo de vestido");
                    int op= leer.nextInt();
                    if (op==0) {
                        pijmod.setTipo("Pantalon");
                    }
                    else if(op==1){
                        pijmod.setTipo("Camiseta");
                    }
                    else if(op==2){
                        pijmod.setTipo("Ropa interior");
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
                        pijmod.setTalla("S");
                    }
                    else if(op==1){
                        pijmod.setTalla("M");
                    }
                    else if(op==2){
                        pijmod.setTalla("L");
                    }
                    else if(op==3){
                        pijmod.setTalla("XL");
                    }
                    else if(op==4){
                        pijmod.setTalla("XXL");
                    }
                    else if(op==5){
                        pijmod.setTalla("XXXL");
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
                        pijmod.setTipousuario("niño");
                    }
                    else if (op==1) {
                        pijmod.setTipousuario("niña");
                    }
                    else if (op==2) {
                        pijmod.setTipousuario("Hombre");
                    }
                    else if (op==3) {
                        pijmod.setTipousuario("Mujer");
                    }
                    else{
                        System.out.println("Opcion erronea");
                    }

                    
                    if (manpijam.modificar(posicion, pijmod)) {
                        System.out.println("Modificación correcta");
                    }
                    }
                    else{
                        System.out.println("Error al modificar");
                    }
                    
                    break;
                case 5:
                    System.out.println("Digite el ID a eliminar");
                    ideliminar = leer.nextInt();
                    
                    if (manpijam.borrar(ideliminar)) {
                        System.out.println("El articulo fue eliminado");
                    }
                    else{
                        System.out.println("El articulo no pudo ser borrado");
                    }
                    break;
                case 6:
                    manpijam.borrarTodo();
                    break;

                default:
                    System.out.println("Opcion no permitida");
            }
            System.out.println("Desea retornar al menu de Pijamas S/s");
            condicion = menu.next();
        } while (condicion.equalsIgnoreCase("s"));

        return;
    }
}
