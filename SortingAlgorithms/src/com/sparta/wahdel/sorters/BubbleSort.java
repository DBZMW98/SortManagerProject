package com.sparta.wahdel.sorters;

import com.sparta.wahdel.Printer;

public class BubbleSort implements Sorter {
    @Override
    public int[] sortArray(int[] unsortedArray) {
        int temp, numberOfIterations = 0;
        boolean swapsMade = true;
        if(unsortedArray.length < 1) {
            throw new IllegalArgumentException("The array is empty and cannot be sorted");
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
                throw new IllegalArgumentException("The array is already sorted");
            } else {
                return unsortedArray;
            }
        }
    }
}