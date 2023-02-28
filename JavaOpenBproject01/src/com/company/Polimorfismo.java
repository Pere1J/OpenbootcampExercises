package com.company;

public class Polimorfismo {
    public static void main(String[] args) {

        //myCar da error porqué Coche es una class abstracta y no puede crear objetos idénticos
        // Coche myCar = new Coche("","",12d,"");
        CocheElectrico myECar = new CocheElectrico("","",1d,"","");


        // con el polimorfirsmo puedo aprovechar la clase padre

        Coche myECar2 = new CocheElectrico("","",1d,"","");

        if (myECar2 instanceof CocheElectrico) {
            System.out.println("coche eléctrico");

        }
    }
}
