/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ManejadorObjetos;
import controlador.ManejadorVestidosCalle;
import java.util.Scanner;
import modelo.VestidosCalle;

/**
 *
 * @author danie
 */
public class MenuVestidosCalle {
    
    Scanner leer = new Scanner(System.in);
    ManejadorVestidosCalle manvesca = new ManejadorVestidosCalle();
    VestidosCalle vesca = new VestidosCalle();
    ManejadorObjetos manobj = new ManejadorObjetos();
    
     public void insertarVestidosCalle(){
        
        System.out.println("Digite el ID del vestido");
        vesca.setIdArticulo(leer.nextInt());
        System.out.println("Digite el Id de la marca del vestido");
        int id= leer.nextInt();
        vesca.setMar(manobj.arregloMarcas.get(manobj.busquedaBinaria(id)));
        System.out.println("Digite el nombre del articulo");
        vesca.setNombre(leer.next());
        System.out.println("Digite la cantidad del articulo");
        vesca.setCantidad(leer.nextInt());
        System.out.println("Digite el precio");
        vesca.setPrecio(leer.nextFloat());
        System.out.println("Color");
        vesca.setColor(leer.next());
        System.out.println("Url Imagen");
        vesca.setImagen(leer.next());
        System.out.println("Tipo: ");
        System.out.println("0- Pantalon");
        System.out.println("1- Camiseta");
        System.out.println("2- Ropa interior");
        System.out.println("Digite la opcion tipo de vestido");
        int op= leer.nextInt();
        if (op==0) {
            vesca.setTipo("Pantalon");
         }
        else if(op==1){
            vesca.setTipo("Camiseta");
        }
        else if(op==2){
            vesca.setTipo("Ropa interior");
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
            vesca.setTalla("S");
         }
        else if(op==1){
            vesca.setTalla("M");
        }
        else if(op==2){
            vesca.setTalla("L");
        }
        else if(op==3){
            vesca.setTalla("XL");
        }
        else if(op==4){
            vesca.setTalla("XXL");
        }
        else if(op==5){
            vesca.setTalla("XXXL");
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
            vesca.setTipousuario("niño");
        }
        else if (op==1) {
             vesca.setTipousuario("niña");
         }
        else if (op==2) {
             vesca.setTipousuario("Hombre");
        }
        else if (op==3) {
             vesca.setTipousuario("Mujer");
        }
        else{
            System.out.println("Opcion erronea");
        }
        
       if (manvesca.insertar(vesca)) {
            System.out.println("Vestido insertado");
        } else {
            System.out.println("Vestido No insertado");
        }

    }
     
    public void consultarUnVestidoCalle() {
        System.out.println("Digite el ID a buscar");
        int a = leer.nextInt();
        VestidosCalle resultado = (VestidosCalle) manvesca.consultarId(a);
        if (resultado == null) {
            System.out.println("No se encontro el articulo");
        }
        else{
            System.out.println("Los datos consultados son " + resultado.toString());
        }
    }
    public void menuVestidosCalle() {
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
                    insertarVestidosCalle();
                    break;
                case 2:
                    manvesca.consultarTodos();
                    break;
                case 3:
                    consultarUnVestidoCalle();
                    break;
                case 4:
                     VestidosCalle vesmod = new VestidosCalle();
                    
                    System.out.println("Digite el Id a modificar");
                    int a = leer.nextInt();
                    
                    int posicion = manvesca.busquedaBinaria(a);
                    if (!(posicion==-1)) {
                    System.out.println("Digite el nuevo Id de la marca del vestido");
                    vesmod.setIdMarca(leer.nextInt());
                    System.out.println("Digite el nuevo nombre del articulo");
                    vesmod.setNombre(leer.next());
                    System.out.println("Digite la nueva cantidad del articulo");
                    vesmod.setCantidad(leer.nextInt());
                    System.out.println("Digite el nuevo precio");
                    vesmod.setPrecio(leer.nextFloat());
                    System.out.println("nuevo Color");
                    vesmod.setColor(leer.next());
                    System.out.println("nueva Url Imagen");
                    vesmod.setImagen(leer.next());
                    System.out.println("Tipo: ");
                    System.out.println("0- Pantalon");
                    System.out.println("1- Camiseta");
                    System.out.println("2- Ropa interior");
                    System.out.println("Digite la opcion tipo de vestido");
                    int op= leer.nextInt();
                    if (op==0) {
                        vesmod.setTipo("Pantalon");
                    }
                    else if(op==1){
                        vesmod.setTipo("Camiseta");
                    }
                    else if(op==2){
                        vesmod.setTipo("Ropa interior");
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
                        vesmod.setTalla("S");
                    }
                    else if(op==1){
                        vesmod.setTalla("M");
                    }
                    else if(op==2){
                        vesmod.setTalla("L");
                    }
                    else if(op==3){
                        vesmod.setTalla("XL");
                    }
                    else if(op==4){
                        vesmod.setTalla("XXL");
                    }
                    else if(op==5){
                        vesmod.setTalla("XXXL");
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
                        vesmod.setTipousuario("niño");
                    }
                    else if (op==1) {
                        vesmod.setTipousuario("niña");
                    }
                    else if (op==2) {
                        vesmod.setTipousuario("Hombre");
                    }
                    else if (op==3) {
                        vesmod.setTipousuario("Mujer");
                    }
                    else{
                        System.out.println("Opcion erronea");
                    }

                    
                    if (manvesca.modificar(posicion, vesmod)) {
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
                    
                    if (manvesca.borrar(ideliminar)) {
                        System.out.println("El articulo fue eliminado");
                    }
                    else{
                        System.out.println("El articulo no pudo ser borrado");
                    }
                    break;
                case 6:
                    manvesca.borrarTodo();
                    break;

                default:
                    System.out.println("Opcion no permitida");
            }
            System.out.println("Desea retornar al menu de Vestidos de calle S/s");
            condicion = menu.next();
        } while (condicion.equalsIgnoreCase("s"));

        return;
    }
}
