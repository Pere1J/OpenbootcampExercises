package com.exercise04;

public class SmartWatch extends SmartDevice {


    //atributos

    boolean hasGpxReader;

    //constructores
    public SmartWatch() {
    }
    public SmartWatch(String tecnologia, String fabricante, String sistemaOperativo, boolean hasGpxReader) {

        super(tecnologia, fabricante, sistemaOperativo);
        this.hasGpxReader = hasGpxReader;
    }

    //métodos
    public void call (){
        System.out.println("está sonando algún Smart Watch");
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "hasGpxReader=" + hasGpxReader +
                ", tecnologia='" + tecnologia + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                '}';
    }
}
