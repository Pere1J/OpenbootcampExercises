package com.exercise04;

/*En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.

        Agregaréis atributos tal cual tendrían esos objetos en la realidad.

        Crear constructor vacío y con todos los parámetros para cada clase.

        Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.*/

public class SmartDevice {

    //atributos

    String tecnologia;
    String fabricante;
    String sistemaOperativo;

    //constructores

    public SmartDevice() {
    }

    public SmartDevice(String tecnologia, String fabricante, String sistemaOperativo) {
        this.tecnologia = tecnologia;
        this.fabricante = fabricante;
        this.sistemaOperativo = sistemaOperativo;
    }

    //SmartDevice smart = new SmartDevice("5G","Samsung","Android"); ERROR!! no declarar objetos en las clases.


    //métodos

    public void call (){
        System.out.println("está sonando algún Smart Device");
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "tecnologia='" + tecnologia + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                '}';
    }
}
