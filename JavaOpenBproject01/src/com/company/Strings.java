package com.company;

public class Strings {
    public static void main(String[] args) {
        /*
        length()
        startWith ("")
        endsWith("")
        indexOf("")
        subString(1,5)
        trim()
        equals()
        compareTo()
         */

        String mensaje = "Hola mundo";
        mensaje.length(); //esto  deberia devolver la longitud pero hay que guardarlo en un estado nuevo

        int longitudMensaje = mensaje.length(); //creamos un estado que lo contenga
        System.out.println(longitudMensaje); //imprimimos el estado

    }
}
