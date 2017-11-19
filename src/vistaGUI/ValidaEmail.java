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
class ValidaEmail extends Exception{
    
    public static boolean validaEmail(String prueba){
        boolean pruebaValido = false;
        
        Pattern pat = Pattern.compile("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,3})$");

        Matcher mat = pat.matcher(prueba);
        pruebaValido = mat.find();
        return pruebaValido;
    }
}
