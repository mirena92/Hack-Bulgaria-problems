package com.hackbulgaria.corejava;

public class ImmutableExce�tion extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ImmutableExce�tion(ImmutableExceptionParameter parameterObject) {
           super("You can't change immutable argument!");
       }
}
