package com.company;

public class Funciones {

    public static void main(String[] args) {

        imprimeNombre("Pepe"); //ejecucion de la función
        calculaIva(100, 12);

        precioMasIva (100, 0.12);
        double precioMasIvaCalc =  precioMasIva (100, 0.12);
        System.out.println(precioMasIvaCalc);

        showText();
        sumaTonta();
        // las funciones con return no suelen imprimir el resultado
        //hay que asignarlas a una variable e imprimir esta variable
        int printSumaTonta = sumaTonta();
        System.out.println(printSumaTonta);

    }

    public static void imprimeNombre(String name) {
        System.out.println("hola " + name);

    }
    //Funciones con parámetros sin retorno


    static void calculaIva (double precio, double iva){
        System.out.println(iva/precio);;
    }
    //Funciones con parámetros con retorno
    static double precioMasIva (double precio, double iva){
        return precio + (precio * iva);

    }
    //Función tonta sin parámetro
    static void showText (){
        System.out.println("ejemplo función sin parámetros y sin return");
    }
    //Función retorno sin parámetro
    static int sumaTonta (){
        return 20000 + 4000;
    }

}
