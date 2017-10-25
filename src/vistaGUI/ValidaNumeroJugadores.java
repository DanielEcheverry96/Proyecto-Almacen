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
public class ValidaNumeroJugadores extends Exception {
    public static boolean validaNumeroJugadores(String prueba){
        boolean pruebaValido = false;
        
        Pattern pat = Pattern.compile("^[0-9]+$");
        //Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mat = pat.matcher(prueba);
        pruebaValido = mat.find();
        return pruebaValido;
    }
}
