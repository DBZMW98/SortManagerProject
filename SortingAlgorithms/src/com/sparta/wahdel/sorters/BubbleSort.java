package com.sparta.wahdel.sorters;

import com.sparta.wahdel.Printer;

public class BubbleSort implements Sorter {
    @Override
    public int[] sortArray(int[] unsortedArray) {
        int temp, numberOfIterations = 0;
        boolean swapsMade = true;
        if(unsortedArray.length < 1) {
            Printer.printErrorMessage("The array is empty and cannot be sorted!");
            return null;
        } else {
            while (swapsMade) {
                swapsMade = false;
                for (int count = 0; count < unsortedArray.length - 1; count++) {
                    if (unsortedArray[count] > unsortedArray[count + 1]) {
                        temp = unsortedArray[count];
                        unsortedArray[count] = unsortedArray[count + 1];
                        unsortedArray[count + 1] = temp;
                        swapsMade = true;
                    }
                }
                if (swapsMade == true) {
                    numberOfIterations++;
                }
            }
            if (numberOfIterations == 0) {
                Printer.printErrorMessage("This array is already sorted!");
                return null;
            } else {
                return unsortedArray;
            }
        }
    }
}