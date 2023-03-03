package com.company.oop.conInterfaces;

import com.company.oop.interfaces.Empleado;

import java.util.List;

public interface EmpleadoCRUD {

    //las interfaces solo declaran métodos, no los implementan

    void guardarEmpleado(Empleado employee);

    List<Empleado> getAllEmpleados();

    void delete(Empleado employee);


}
