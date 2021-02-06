package com.sparta.wahdel.sorters;

import com.sparta.wahdel.Printer;

public class MergeSort {
    private static int[] merge(int[] leftArray, int[] rightArray) {
        int leftArraySize = leftArray.length, rightArraySize = rightArray.length, mergedArraySize = leftArraySize + rightArraySize,
                leftArrayCount = 0, rightArrayCount = 0, mergedArrayCount = 0;
        int[] mergedArray = new int[mergedArraySize];

        while (leftArrayCount < leftArraySize && rightArrayCount < rightArraySize) {
                if (leftArray[leftArrayCount] <= rightArray[rightArrayCount]) {
                    mergedArray[mergedArrayCount++] = leftArray[leftArrayCount++];
                } else {
                    mergedArray[mergedArrayCount++] = rightArray[rightArrayCount++];
                }
        }

        while (leftArrayCount < leftArraySize) {
            mergedArray[mergedArrayCount++] = leftArray[leftArrayCount++];
        }

        while (rightArrayCount < rightArraySize) {
            mergedArray[mergedArrayCount++] = rightArray[rightArrayCount++];
        }

        return mergedArray;
    }

    public static int[] mergeSort(int[] unsortedArray) {
        if (unsortedArray.length < 2) {
            return unsortedArray;
        }
        int[] leftArray, rightArray;
        int left = 0, right = unsortedArray.length, middle = (left+right)/2;
        leftArray = new int[middle];
        rightArray = new int[right - middle];
        for (int count = left; count < leftArray.length; count++) {
            leftArray[count] = unsortedArray[count];
        }
        for (int count = middle; count < right; count++) {
            rightArray[count-middle] = unsortedArray[count];
        }
        leftArray = mergeSort(leftArray);
        rightArray = mergeSort(rightArray);
        unsortedArray = merge(leftArray, rightArray);
        return unsortedArray;
    }
}
