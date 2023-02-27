package com.company;

public class Coche {
    // atributos
    String marca;
    String fabricante;
    String modelo;
    Double peso;
    String color;
    Integer velocidad = 0;

    //constructores (métodos q permiten crear objetos de esta clase)

    public Coche (String marca, String fabricante, String modelo, Double peso, String color){
        this marca = marca,
        this fabricante = fabricante;
        // etc...

        // comportamiento
        public void acelerar(Integer cantidad){
            if (cantidad > 0 && cantidad <= 120){
                this.velocidad += cantidad;
            //si cantidad es superior a 0 y inferior o igual a 120 suma a velocidad el valor de cantidad
            }
        }

    }

}
