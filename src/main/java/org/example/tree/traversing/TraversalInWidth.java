package org.example.tree.traversing;

import org.example.tree.Node;

import java.util.ArrayList;

public class TraversalInWidth<T> implements TreeTraversal<T> {
    @Override
    public ArrayList<Node<T>> traverse(Node<T> root) {
        if (root == null) return new ArrayList<>();
        ArrayList<Node<T>> nodes = new ArrayList<>();
        ArrayList<Node<T>> temp = new ArrayList<>();
        nodes.add(root);
        temp.add(root);
        while (temp.size() != 0) {
            Node<T> current = temp.get(0);
            temp.remove(0);
            nodes.addAll(current.getChildren());
            temp.addAll(current.getChildren());
        }
        return nodes;
    }
}
