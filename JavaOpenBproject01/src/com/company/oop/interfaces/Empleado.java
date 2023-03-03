package com.company.oop.interfaces;

public class Empleado {
    //Creamos clase empleado y empezamos a asignar los diferentes valores
    //atributos
    String name;
    int age;
    double salary;
    boolean isActive;

    //constructor
    public Empleado(){};

    public Empleado(String name, int age, double salary, boolean isActive) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isActive = isActive;
    }

    //method


    @Override
    public String toString() {
        return "Empleado{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary + " €" +
                ", isActive=" + isActive +
                '}';
    }
}
