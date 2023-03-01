package com.company.estructurasControl.repeticion;

public class ForEach {
    public static void main(String[] args) {
        int[] nums = {1, 25, 33, 44};
        int suma = 0;
        for (int numero : nums) {
            suma = suma + numero; //esto se guardaría el resultado y se iría autosumando

        }
        System.out.println(suma); //Warning esto tiene que estar fuera del bucle
    }
}
