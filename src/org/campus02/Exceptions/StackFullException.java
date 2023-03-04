package org.campus02.Exceptions;

public class StackFullException extends Exception {

    public StackFullException(String message) {
        super(message);
    }

    //Wir können einen eigenen Konstruktor definieren
    //Übernimm die max. Größe des Stacks und gib sie aus

    public StackFullException(int size) {
        super("<<< error >>> Stack is full - max size is " + size);
    }
}