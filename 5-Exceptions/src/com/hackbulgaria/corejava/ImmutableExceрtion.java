package com.hackbulgaria.corejava;

public class ImmutableExceðtion extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ImmutableExceðtion(ImmutableExceptionParameter parameterObject) {
           super("You can't change immutable argument!");
       }
}
