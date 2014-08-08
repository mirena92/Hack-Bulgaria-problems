package com.hackbulgaria.corejava;
public class User {

    String name;
    String password;

    public User(String name, String password) {
        if (name.equals(""))
            throw new DatabaseCorruptedException();
        else
            this.name = name;
        this.password = password;
    }

    public static void main(String[] args) {
        //User anyone = new User("", "123");
    }
}
