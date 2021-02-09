package com.sparta.wahdel.sorters;

import com.sparta.wahdel.Printer;
import com.sparta.wahdel.exceptions.ChildNotFoundException;

public class BinarySearchTree implements BinaryTree {
    private Node root;

    private class Node {
        private int data;
        private Node leftChild;
        private Node rightChild;

        Node(int data) {
            this.data = data;
        }
    }

    @Override
    public int getRootElement() {
        return root.data;
    }

    @Override
    public int getNumberOfElements() {
        return 0;
    }

    @Override
    public void addElement(int element) {
        if (root == null) {
            root = new Node(element);
        } else {
            Node current, previous;
            current = previous = root;
            while (current != null) {
                if (element < current.data) {
                    previous = current;
                    current = current.leftChild;
                } else {
                    previous = current;
                    current = current.rightChild;
                }
            }
            if (element < previous.data) {
                previous.leftChild = new Node(element);
                Printer.printMessage(previous.data + ": Left: " + previous.leftChild.data);
            } else {
                previous.rightChild = new Node(element);
                Printer.printMessage(previous.data + ": Right: " + previous.rightChild.data);
            }
        }
    }

    @Override
    public void addElements(int[] elements) {

    }

    @Override
    public boolean findElement(int value) {
        return false;
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        return 0;
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        return 0;
    }

    @Override
    public int[] getSortedTreeAsc() {
        return new int[0];
    }

    @Override
    public int[] getSortedTreeDesc() {
        return new int[0];
    }
}
