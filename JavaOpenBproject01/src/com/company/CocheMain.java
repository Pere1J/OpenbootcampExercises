package com.company;

public class CocheMain {
    public static void main(String[] args) {

        //error pq Coche es abstract
        // Coche cocheObjeto = new Coche("seat", "600", 750.00, "rojo");

        //cocheObjeto.velocidad = 110;
        //cocheObjeto.modelo="Panda"; //>> puedo modificar sus parámetros individualmente

        //System.out.println(cocheObjeto);

        //para definir un coche eléctrico repetimos paso anterior

        CocheElectrico cocheObjeto2 = new CocheElectrico("Opel","Manta",1950.23,"breen apple","a pilas");

        cocheObjeto2.color = "black";

        System.out.println(cocheObjeto2);

    }}
