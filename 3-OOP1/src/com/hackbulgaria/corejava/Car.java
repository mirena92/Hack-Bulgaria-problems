package com.hackbulgaria.corejava;

public class Car {
    
    public String model;
    
    public static void main (String args[])
    {
        Audi audi = new Audi();
        BMW bmw = new BMW();
        Wolkswagen wolkswagen = new Wolkswagen();
        System.out.println(audi.toString());
        System.out.println(bmw.toString());
        System.out.println(wolkswagen.toString());
    }
}
