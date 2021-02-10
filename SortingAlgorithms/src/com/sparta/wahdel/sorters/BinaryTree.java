package com.sparta.wahdel.sorters;

import com.sparta.wahdel.exceptions.ChildNotFoundException;
import com.sparta.wahdel.exceptions.EmptyTreeException;

public interface BinaryTree {
    int getRootElement();

    int getNumberOfElements();

    void addElement(int element);

    void addElements(int[] elements);

    boolean findElement(int value);

    int getLeftChild(int element) throws ChildNotFoundException;

    int getRightChild(int element) throws ChildNotFoundException;

    int[] getSortedTreeAsc();

    int[] getSortedTreeDesc();
}
