package com.exercise04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SmartDevice smart = new SmartDevice("5G", "Samsung", "Android");

        SmartPhone mobile = new SmartPhone("3G", "Samsung", "Android", 6.5);

        SmartWatch watch = new SmartWatch("5G", "Xiaomi", "Android", true);

        System.out.println(mobile.fabricante);
        System.out.println(smart.tecnologia);
        System.out.println(watch.hasGpxReader);
        System.out.println(watch);


// Polimorf



        List<SmartDevice> smartDevsList = new ArrayList<>();

        smartDevsList.add(mobile);
        smartDevsList.add(watch);

        for (SmartDevice device : smartDevsList
        ) {
            device.call();
            System.out.println(device);
        }

    }


}

