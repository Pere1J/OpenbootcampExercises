package com.company.estructurasControl.repeticion;

public class While {
    public static void main(String[] args) {
        int contador = 0;

        while (contador < 10){
            contador++;


            if (contador == 4){
                //break; // para el bucle
                continue; // salta este momento del bucle

            }
            System.out.println("valor de contador " + contador);
        }
    }
}
