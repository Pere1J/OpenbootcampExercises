package com.company;

public class CocheMain {
    public static void main(String[] args) {

        Coche cocheObjeto = new Coche("seat", "600", 750.00, "rojo");

        cocheObjeto.velocidad = 110;
        cocheObjeto.modelo="Panda"; //>> puedo modificar sus parámetros individualmente

        System.out.println(cocheObjeto);

        //para definir un coche eléctrico repetimos paso anterior

        CocheElectrico cocheObjeto2 = new CocheElectrico("a pilas");

        cocheObjeto2.color = "black";

        System.out.println(cocheObjeto2);

    }}
