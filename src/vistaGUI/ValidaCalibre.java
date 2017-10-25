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
 * @author danie
 */
public class ValidaCalibre extends Exception {
        public static boolean validaCalibre(String prueba){
        boolean pruebaValido = false;
        
        Pattern pat = Pattern.compile("^-?[0-9]+([,\\.][0-9]*)?$"); //^-?[0-9]+([,\\.][0-9]*)?$
        Matcher mat = pat.matcher(prueba);
        pruebaValido = mat.find();
        return pruebaValido;
    }
}
