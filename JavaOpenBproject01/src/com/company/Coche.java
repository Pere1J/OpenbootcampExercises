package com.company;

public class Coche {
    // atributos
    String marca;
    String modelo;
    Double peso;
    String color;
    Integer velocidad = 0;

    //constructores (métodos q permiten crear objetos de esta clase)



    public Coche (String marca, String modelo, Double peso, String color) {
        this.marca = marca;
        this.modelo=modelo;
        this.peso=peso;
        this.color = color;

        // etc...
    }

    // comportamiento
        public void acelerar(Integer cantidad){
            if (cantidad > 0 && cantidad <= 120){
                this.velocidad += cantidad;
            //si cantidad es superior a 0 y inferior o igual a 120 suma a velocidad el valor de cantidad
            }
        }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", color='" + color + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}


