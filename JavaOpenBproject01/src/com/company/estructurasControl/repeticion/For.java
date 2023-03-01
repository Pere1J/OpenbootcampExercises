package com.company.estructurasControl.repeticion;

public class For {
    public static void main(String[] args) {
        /*for (int i = 0; i < 10; i++) {
            System.out.println("el valor de i es " + i);
        }*/

        String[] names= {"John", "Paul", "Ringo", "George"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("The Beatles are " + names[i]);

        }
        int[] nums={1,25,33,44};
        int suma = 0;
        for (int i = 0; i < nums.length; i++) {
            suma = suma + nums[i]; //esto se guardaría el resultado y se iría autosumando

        }
        System.out.println(suma);
    }
}
