package com.sparta.wahdel.start;

import com.sparta.wahdel.Printer;
import com.sparta.wahdel.exceptions.ChildNotFoundException;
import com.sparta.wahdel.sorters.*;

public class Starter {
    public static void start() {
        Sorter bubbleSort = new BubbleSort();
        Sorter mergeSort = new MergeSort();
        BinaryTree binarySearchTree = new BinarySearchTree();

        int[] array1 = {3, 4, 1, 20, 6, 2, 17, 22};
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
//        binarySearchTree.addElement(5);
//        binarySearchTree.addElement(1);
//        binarySearchTree.addElement(10);
//        binarySearchTree.addElement(2);
//        binarySearchTree.addElement(3);
//        binarySearchTree.addElement(7);
//        binarySearchTree.addElement(8);
        binarySearchTree.addElements(array1);
        Printer.printMessage("Root element: " + binarySearchTree.getRootElement());
        Printer.printMessage("20: " + binarySearchTree.findElement(20));
        Printer.printMessage("200: " + binarySearchTree.findElement(200));
        try {
            Printer.printMessage("20: Left: " + binarySearchTree.getLeftChild(20));
        } catch (ChildNotFoundException cnfe) {
            Printer.printMessage(cnfe.getMessage());
        } catch (Exception e) {
            Printer.printMessage(e.getMessage());
        }

        try {
            Printer.printMessage("20: Right: " + binarySearchTree.getRightChild(20));
        } catch (ChildNotFoundException cnfe) {
            Printer.printMessage(cnfe.getMessage());
        } catch (Exception e) {
            Printer.printMessage(e.getMessage());
        }

        try {
            Printer.printMessage("0: Right: " + binarySearchTree.getRightChild(0));
        } catch (ChildNotFoundException cnfe) {
            Printer.printMessage(cnfe.getMessage());
        } catch (Exception e) {
            Printer.printMessage(e.getMessage());
        }

        try {
            Printer.printMessage("22: Left: " + binarySearchTree.getRightChild(22));
        } catch (ChildNotFoundException cnfe) {
            Printer.printMessage(cnfe.getMessage());
        } catch (Exception e) {
            Printer.printMessage(e.getMessage());
        }


    }
}
