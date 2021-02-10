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
                //Printer.printMessage(previous.data + ": Left: " + previous.leftChild.data);
            } else {
                previous.rightChild = new Node(element);
                //Printer.printMessage(previous.data + ": Right: " + previous.rightChild.data);
            }
        }
    }

    @Override
    public void addElements(int[] elements) {
        for (int element : elements) {
            addElement(element);
        }
    }

    @Override
    public boolean findElement(int value) {
        if (root == null) {
            return false;
        } else {
            Node current;
            current = root;
            while (current != null) {
                if (value < current.data) {
                    current = current.leftChild;
                } else if (value > current.data) {
                    current = current.rightChild;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        Node current, previous;
        current = previous = root;
        int leftChildData;
        if (root == null) {
            //throw new EmptyTreeException();
        } else {
            while (current != null) {
                if (element < current.data) {
                    current = current.leftChild;
                } else if (element > current.data) {
                    current = current.rightChild;
                } else {
                    //Printer.printInteger(current.leftChild.data);
                    if (current.leftChild == null) {
                        throw new ChildNotFoundException(element + " does not have a left child node.");
                    } else {
                        return current.leftChild.data;
                    }
                }
            }
        }
        throw new ChildNotFoundException(element + " is not in the list");
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        Node current, previous;
        current = previous = root;
        int leftChildData;
        if (root == null) {
            //throw new EmptyTreeException();
        } else {
            while (current != null) {
                if (element < current.data) {
                    current = current.leftChild;
                } else if (element > current.data) {
                    current = current.rightChild;
                } else {
                    if (current.rightChild == null) {
                        throw new ChildNotFoundException(element + " does not have a right child node.");
                    } else {
                        return current.rightChild.data;
                    }
                }
            }
        }
        throw new ChildNotFoundException(element + " is not in the list");
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
