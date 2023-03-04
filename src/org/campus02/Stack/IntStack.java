package org.campus02.Stack;

import org.campus02.Exceptions.StackEmptyException;
import org.campus02.Exceptions.StackFullException;

public class IntStack {

    private int[] stack;
    private int pointer;

    public IntStack(int maxSize) {
        this.stack = new int[maxSize];
        this.pointer = -1;
    }

    public void push(int value) throws StackFullException {

        if (this.pointer == stack.length-1) {
            throw new StackFullException("Stack is full");
        }

        pointer++;
        stack[pointer] = value;
    }

    public int pop() throws StackEmptyException {
        if (pointer == -1) {
            throw new StackEmptyException("Stack is empty");
        }
        int value = stack[pointer];
        stack[pointer--] = 0;
        return value;
    }
}
