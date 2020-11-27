package org.example.tree.traversing;

import org.example.tree.Node;

import java.util.ArrayList;

public interface TreeTraversal<T> {
    ArrayList<Node<T>> traverse(Node<T> root);
}
