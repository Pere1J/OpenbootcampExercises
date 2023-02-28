package com.exercise02;

public class exercise02 {
    public static void main(String[] args) {

        int precio = 5;
        double iva = 0.12; // iva = 12%

        double precioMasIva = precio + (precio * iva);

        System.out.println(precioMasIva);
    }
}
