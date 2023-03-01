package com.company.oop.clases;

import com.company.oop.herencia.Motocicleta;

public class Main {
    public static void main(String[] args) {
        // Clase identificador = new Clase ()  => código a seguir para construir un objeto

        Vehiculo toyotaPrius = new Vehiculo();

        //como motor es una clase, tengo que declarar un objeto a patir de la clase

        Motor motorGti = new Motor();

        // Creando Objetos utilizando un constructor con parámetros

        Vehiculo fordMondeo = new Vehiculo("Ford", "Mondeo", 2.1, 2009, "pink", false, 0, motorGti);

        System.out.println(fordMondeo.year);
        fordMondeo.acelerar(100);

        System.out.println(fordMondeo.speed);


        //HERENCIAS
        // otro objeto a partir de una clase hija

        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante = "Kawasaki";

        System.out.println(kawasakiNinja);

        //POLIMORFISMO


    }
}