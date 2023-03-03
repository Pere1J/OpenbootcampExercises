package com.company.oop.interfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {

    //Aquí definiremos todas las operaciones y bases de datos para trabajar con las clases y objetos

    //creamos una lista con todos los Empleados que se creen
    //Esto es una estructura de datos (la lista)

    private  List<Empleado> plantillaEmpleados = new ArrayList<>();

    //CREATE guardar empleados .Creamos una función que añada los objetos clase Empleado a la lista creada más arriba
    //"save"
    public void guardarEmpleados(Empleado employee) {

        plantillaEmpleados.add(employee);
    }

    //READ obtener los datos(empleados).Creamos función que nos retorne la lista de objetos Empleado

    public List<Empleado> getAllEmpleados(){
        return plantillaEmpleados;

    }

}
