package com.company.interfaces;

import com.company.Coche;
import com.company.CocheElectrico;
import com.company.interfaces.CocheService;

public class CocheServiceClassicCarImpl implements CocheService {
    @Override
    public Coche createCoche() {
        System.out.println("creando un nuevo coche");
        return new CocheElectrico("","",1d,"","");
    }
}
