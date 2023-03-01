package com.exercise02;

public class exercise02 {
    public static void main(String[] args) {

        double precio = 15;
        double iva = 0.12; // iva = 12%

        precioMasIva(iva,precio);

        double precioTotal = precioMasIva(iva,precio);

        System.out.println("el precio total con iva es " + precioTotal);

    }

    private static double precioMasIva(double iva, double precio) {
        return precio + (precio * iva);


    }
}
