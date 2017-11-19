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
class ValidaPassword extends Exception{
    
    public static boolean validaPassword(String prueba){
        boolean pruebaValido = false;
        
        Pattern pat = Pattern.compile("(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$");

        Matcher mat = pat.matcher(prueba);
        pruebaValido = mat.find();
        return pruebaValido;
    }
}
