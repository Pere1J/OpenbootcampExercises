package com.company;

public class Arrays {
    public static void main(String[] args) {
        int[] notasExamen = {1, 2, 1, 3, 5,}; // declaramos Qué tipo de array y su nombre
        // entre llaves los valores

        //otra manera
        int[] notasE2 = new int[10]; //declaro q notasE2 será un array de 10 posiciones

        notasE2[0] = 5;
        notasE2[1] = 2;
        //notasE2 [10] = 5; >>> esto da error pq index va de 0 a 9


        //ejemplo for
        for (int i = 0; i < notasExamen.length; i++) {
            if (notasExamen[i] >= 5) {
                System.out.println("Aprobado");
            } else {
                System.out.println("suspenso");
            }
        }
        //ejemplo foreach
        for (int item : notasExamen) {
        }

    }
}
