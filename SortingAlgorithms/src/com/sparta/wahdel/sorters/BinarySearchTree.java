package com.sparta.wahdel.sorters;

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
            Node current = root;
            if (element < current.data) {
                current.leftChild = new Node(element);
            } else {
                current.rightChild = new Node(element);
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
        boolean found = true;

        return root.leftChild.data;
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        return root.rightChild.data;
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
