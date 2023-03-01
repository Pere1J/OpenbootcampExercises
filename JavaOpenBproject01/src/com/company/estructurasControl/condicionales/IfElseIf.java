package com.company.estructurasControl.condicionales;

public class IfElseIf {
    public static void main(String[] args) {

        String dia = "jueves";

        // comparadores  ' == ' para nums y ' equals ' para text

        boolean diaSemana = dia.equals("martes");

        if (dia.equals("lunes")) {
            System.out.println("empieza la semana");
        } else if (dia.equals("martes")) {
            System.out.println("la semana continua");
        } else if (dia.equals("miércoles")) {
            System.out.println("la semana continua");
        } else if (dia.equals("jueves")) {
            System.out.println("la semana continua");
        } else if (dia.equals("viernes")) {
            System.out.println("la semana continua");
        }
        else {
            System.out.println("introduce un día válido");
        }

    }
}

