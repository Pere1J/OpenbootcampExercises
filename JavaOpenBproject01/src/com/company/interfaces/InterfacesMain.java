package com.company.interfaces;

import com.company.Coche;

public class InterfacesMain {
    public static void main(String[] args) {

        CocheService service = new CocheServiceClassicCarImpl();

        Coche cocheChulo = service.createCoche();
    }
}
