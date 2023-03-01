package com.company.estructurasControl.condicionales;

public class Switch {
    public static void main(String[] args) {
        //utilizamos método switch como si fuera if else if
        //es necesario poner "break" para que si se cumple el "case" no continue ejecutándose

        String dia = "lunes";

        switch (dia) {
            case "lunes":
                System.out.println("empieza la semana");
               // break;
            case "martes":
                System.out.println("empieza la semana");
                break;
            case "miercoles":
                System.out.println("empieza la semana");
                break;
            case "jueves":
                System.out.println("empieza la semana");
                break;
            case "viernes":
                System.out.println("empieza la semana");
                break;
            default:
                System.out.println("pon un dia válido");

        }
    }
}
