package guiaPseudocodigo;

import java.io.*;

public class Invertir {

    public String InvertirCadena(String palabra) throws IOException {
        String salida="";
        int i=0;
        for(i=palabra.length()-1;i>=0;i--){
            salida= salida + palabra.charAt(i);
        }
        return salida;
    }
}