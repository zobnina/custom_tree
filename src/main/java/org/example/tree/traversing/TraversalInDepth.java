package org.example.tree.traversing;

import org.example.tree.Node;

import java.util.ArrayList;

public class TraversalInDepth<T> implements TreeTraversal<T> {
    @Override
    public ArrayList<Node<T>> traverse(Node<T> root) {
        ArrayList<Node<T>> nodes = new ArrayList<>();
        ArrayList<Node<T>> temp = new ArrayList<>();
        temp.add(root);
        nodes.add(root);
        while (temp.size() != 0) {
            Node<T> current = temp.get(0);
            temp.remove(0);
            temp.addAll(current.getChildren());
            int tempIndex = nodes.indexOf(current) + 1;
            for (Node<T> node : current.getChildren()) {
                nodes.add(tempIndex, node);
                tempIndex++;
            }
        }
        return nodes;
    }
}
