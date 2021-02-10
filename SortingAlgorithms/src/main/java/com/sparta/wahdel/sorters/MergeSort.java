package com.sparta.wahdel.sorters;

public class MergeSort implements Sorter{
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

    @Override
    public int[] sortArray(int[] unsortedArray) {
        int[] leftArray, rightArray;
        int left = 0, right = unsortedArray.length, middle = (left+right)/2;

        if (unsortedArray.length < 1) {
            throw new IllegalArgumentException("The array is empty and cannot be sorted");
        }

        if (unsortedArray.length < 2) {
            return unsortedArray;
        }

        leftArray = new int[middle];
        rightArray = new int[right - middle];

        for (int count = left; count < leftArray.length; count++) {
            leftArray[count] = unsortedArray[count];
        }

        for (int count = middle; count < right; count++) {
            rightArray[count-middle] = unsortedArray[count];
        }
        leftArray = sortArray(leftArray);
        rightArray = sortArray(rightArray);
        unsortedArray = merge(leftArray, rightArray);
        return unsortedArray;
    }
}
