package com.exercise04;

public class SmartPhone extends SmartDevice{

    //atributos

    double pantalla;

    //constructores
    public SmartPhone (){}

    public SmartPhone(String tecnologia, String fabricante, String sistemaOperativo, double pantalla) {
        super(tecnologia, fabricante, sistemaOperativo);
        this.pantalla = pantalla;

    }



    //métodos
    public void call (){
        System.out.println("está sonando algún Smart Phone");
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "pantalla=" + pantalla +
                ", tecnologia='" + tecnologia + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                '}';
    }
}
