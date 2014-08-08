package com.hackbulgaria.corejava;

public class NullKeyException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public NullKeyException() {
        super("Null key argument!");
    }
}
