package com.company;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        Scanner escaneo = new Scanner(System.in);
        System.out.println("escribe tu nombre");
        String nombre = escaneo.nextLine();
        System.out.println("tu nombre es " + nombre);
    }
}
