package com.hackbulgaria.corejava;

public enum Day {
    MONDAY("Hi! I'm Monday!"), TUESDAY("Hi! I'm Tuesday!"), WEDNESDAY("Hi! I'm Wednesday!"), THURSDAY("Hi! I'm Thursday!"), FRIDAY("Hi! I'm Friday!"), SATURADY("Hi! I'm Saturday!"), SUNDAY("Hi! I'm Sunday!");
    
    Day(String text) {
        this.text = text;
    }
    
    public final String text;
    
    public static String greetMe(Day day) {
        return day.text;
    }
}
