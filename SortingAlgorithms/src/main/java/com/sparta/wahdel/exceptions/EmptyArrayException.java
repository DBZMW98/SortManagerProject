package com.sparta.wahdel.exceptions;

public class EmptyArrayException extends Exception {
    public EmptyArrayException() {

    }

    public String toString() {
        return ("The called array is empty");
    }
}
