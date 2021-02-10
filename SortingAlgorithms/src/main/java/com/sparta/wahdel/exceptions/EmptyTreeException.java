package com.sparta.wahdel.exceptions;

public class EmptyTreeException extends Exception {
    public EmptyTreeException() {

    }

    public String toString() {
        return ("The called tree is empty");
    }
}
