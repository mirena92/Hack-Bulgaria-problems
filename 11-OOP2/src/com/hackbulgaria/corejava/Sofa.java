package com.hackbulgaria.corejava;


public class Sofa extends Furniture {

    public Sofa(Material material, int price) {
        super(material, price);
    }

    @Override
    public String toString() {
        return "sofa";
    }

}