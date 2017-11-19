/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaGUI;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Daniel
 */
class ValidaNombreusuario extends Exception{
    
    public static boolean validaNombreusuario(String prueba){
        boolean pruebaValido = false;
        
        Pattern pat = Pattern.compile("^[a-zA-Z]{8,8}+$");

        Matcher mat = pat.matcher(prueba);
        pruebaValido = mat.find();
        return pruebaValido;
    }
}
