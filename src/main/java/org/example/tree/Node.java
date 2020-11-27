package org.example.tree;

import java.util.ArrayList;

public interface Node<T> {
    T getData();

    ArrayList<Node<T>> getChildren();
}