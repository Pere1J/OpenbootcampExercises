package com.company.estructurasControl.condicionales;

public class If {
    public static void main(String[] args) {
        int age = 20;
        boolean mayorEdad = age >= 18;

        if (age >= 18) {
            System.out.println("es mayor de edad");
        }
        if (age < 18) {
            System.out.println("es menor de edad");
        }
        if (mayorEdad) {
            System.out.println("es mayor de edad");
        }
    }
}
