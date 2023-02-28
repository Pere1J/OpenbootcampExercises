package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();//creación de array

        nombres.add("Art");
        nombres.add("Bart");
        nombres.add("Mart");
        nombres.add("Part");

        for (String alias: nombres){
            System.out.println(alias);
        }

    }
}
