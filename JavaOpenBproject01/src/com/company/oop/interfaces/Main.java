package com.company.oop.interfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //a partir de la clase Empleado creamos objetos de clase Empleado

        Empleado juanito = new Empleado("John", 25, 25000,true);
        Empleado pablito = new Empleado("Paul", 35, 27000,false);
        Empleado jorgito = new Empleado("George", 19, 13500,true);

        // a partir de la clase EmpleadoCRUD creamos un objeto de clase EmpleadoCRUD

        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        //Guardar Datos >>> llamamos al método

        empleadoCRUD.guardarEmpleados(juanito);
        empleadoCRUD.guardarEmpleados(pablito);
        empleadoCRUD.guardarEmpleados(jorgito);

        //consultar Datos >>> llamamos al método

        empleadoCRUD.getAllEmpleados();

        //...y para que lo muestre creamos la lista

        List<Empleado> plantillaEmpleados = empleadoCRUD.getAllEmpleados();
        System.out.println(plantillaEmpleados);





    }
}
