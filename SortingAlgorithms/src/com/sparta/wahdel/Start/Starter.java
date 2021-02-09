package com.sparta.wahdel.Start;

import com.sparta.wahdel.Printer;
import com.sparta.wahdel.exceptions.ChildNotFoundException;
import com.sparta.wahdel.sorters.*;

public class Starter {
    public static void start() {
        Sorter bubbleSort = new BubbleSort();
        Sorter mergeSort = new MergeSort();
        BinaryTree binarySearchTree = new BinarySearchTree();

        int[] array1 = {3, 4, 1, 20, 6, 2, 17};
        int[] array2 = {1, 4, 7};
        int[] array3 = {};
        int[] array4 = {34, -1, -20, 6, 2, 17};

//        Printer.printMessage("---------------Bubble Sort---------------");
//        Printer.printIntArray(bubbleSort.sortArray(array1));
//        Printer.printIntArray(bubbleSort.sortArray(array4));
//        try {
//            Printer.printIntArray(mergeSort.sortArray(array3));
//        } catch (IllegalArgumentException iae) {
//            Printer.printMessage(iae.getMessage());
//        } catch (Exception e) {
//            e.getStackTrace();
//        }
//
//        try {
//            Printer.printIntArray(bubbleSort.sortArray(array2));
//        } catch (IllegalArgumentException iae) {
//            Printer.printMessage(iae.getMessage());
//        } catch (Exception e) {
//            e.getStackTrace();
//        }
//
//
//        Printer.printMessage("---------------Merge Sort---------------");
//        Printer.printIntArray(mergeSort.sortArray(array1));
//        Printer.printIntArray(mergeSort.sortArray(array2));
//        try {
//            Printer.printIntArray(mergeSort.sortArray(array3));
//        } catch (IllegalArgumentException iae) {
//            Printer.printMessage(iae.getMessage());
//        } catch (Exception e) {
//            e.getStackTrace();
//        }
//
//        Printer.printIntArray(mergeSort.sortArray(array4));

        Printer.printMessage("---------------Binary Search Tree---------------");
        binarySearchTree.addElement(5);
        binarySearchTree.addElement(1);
        binarySearchTree.addElement(10);
        binarySearchTree.addElement(2);
        binarySearchTree.addElement(3);
        binarySearchTree.addElement(7);
        binarySearchTree.addElement(8);
        Printer.printMessage("Root element: " + binarySearchTree.getRootElement());
    }
}
