package com.company;

public class CocheElectrico extends Coche{
        //atributo
        String motorElectrico;

// definimos constructor para poder usarlo en los objetos




    public CocheElectrico(String marca, String modelo, Double peso, String color, String motorElectrico) {
        super(marca, modelo, peso, color);
        this.motorElectrico = motorElectrico;
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", color='" + color + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}


