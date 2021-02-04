package com.sparta.wahdel.Start;

import com.sparta.wahdel.Printer;
import com.sparta.wahdel.sorters.BubbleSort;
import com.sparta.wahdel.sorters.Sorter;

public class Starter {
    public static void start() {
        Sorter bubbleSort;
        bubbleSort = new BubbleSort();
        Printer.printIntArray(bubbleSort.sortArray(new int[] {3,4,1,20,6,2,17}));
        Printer.printIntArray(bubbleSort.sortArray(new int[] {3,4,1,-20,6,-2,17}));
        Printer.printIntArray(bubbleSort.sortArray(new int[] {1,2,3,4}));
        Printer.printIntArray(bubbleSort.sortArray(new int[] {}));
    }
}
