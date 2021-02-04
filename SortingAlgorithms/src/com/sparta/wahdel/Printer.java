package com.sparta.wahdel;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Printer {
    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printInteger(int number) {
        System.out.println(number);
    }

    public static void printErrorMessage(String message) {
        System.err.println(message);
    }

    public static void printIntArray(int[] array) {
        printMessage(Arrays.toString(array));
    }
}
