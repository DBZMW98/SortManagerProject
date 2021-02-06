package com.sparta.wahdel.Start;

import com.sparta.wahdel.Printer;
import com.sparta.wahdel.sorters.BubbleSort;
import com.sparta.wahdel.sorters.MergeSort;
import com.sparta.wahdel.sorters.Sorter;

public class Starter {
    public static void start() {
        Sorter bubbleSort;
        bubbleSort = new BubbleSort();
        int[] array1 = {1,4,7};
        int[] array2 = {2,3,5,6};
        int[] array = {3,4,1,20,6,2,17};
        int[] array4 = {34,1,20,6,2,17};
//        Printer.printIntArray(bubbleSort.sortArray(new int[] {3,4,1,20,6,2,17}));
//        Printer.printIntArray(bubbleSort.sortArray(new int[] {3,4,1,-20,6,-2,17}));
//        Printer.printIntArray(bubbleSort.sortArray(new int[] {1,2,3,4}));
//        Printer.printIntArray(bubbleSort.sortArray(new int[] {}));

        Printer.printIntArray(MergeSort.mergeSort(array));
        Printer.printIntArray(MergeSort.mergeSort(array4));
    }
}
