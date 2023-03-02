package com.company.oop.herencia;

import com.company.oop.clases.Motor;
import com.company.oop.clases.Vehiculo;

public class Motocicleta extends Vehiculo {

    //atributos

    boolean baul;

    //constructor
    public Motocicleta() {
    }

    public Motocicleta(String modelo, String fabricante, double cc, int year, String color, boolean sport, int speed, Motor motor, boolean baul) {
        super(modelo, fabricante, cc, year, color, sport, speed, motor);
        this.baul = baul;
    }

}
