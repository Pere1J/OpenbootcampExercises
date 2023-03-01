package com.company.oop.clases;

public class Vehiculo {

    // atributos
    protected String modelo;
    protected String fabricante;
    protected double cc;
    protected int year;
    protected String color;
    protected boolean sport;
    protected int speed;
    protected Motor motor;


    // constructores
    public Vehiculo() {

    }

    //constructor vacío


    public Vehiculo(String modelo, String fabricante, double cc, int year, String color, boolean sport, int speed, Motor motor) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.cc = cc;
        this.year = year;
        this.color = color;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    public Vehiculo(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }


    // métodos
    public void acelerar(int quantity) {
        this.speed += quantity;
    }


}

