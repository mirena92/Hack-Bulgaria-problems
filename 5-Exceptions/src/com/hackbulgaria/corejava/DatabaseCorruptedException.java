package com.hackbulgaria.corejava;
public class DatabaseCorruptedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DatabaseCorruptedException() {
        super("Database is corrupted, likely a communication packed has failed");

    }
}