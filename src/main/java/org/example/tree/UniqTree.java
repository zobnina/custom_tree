package org.example.tree;

import org.example.tree.traversing.TraversableTree;
import org.example.tree.traversing.TreeTraversal;

import java.util.Iterator;

public class UniqTree<T> implements Iterable<T>, Tree<T>, TraversableTree<T> {
    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Node<T> getRoot() {
        return null;
    }

    @Override
    public void setRoot(T value) {

    }

    @Override
    public Node<T> add(Node<T> parent, T value) {
        return null;
    }

    @Override
    public boolean remove(Node<T> node) {
        return false;
    }

    @Override
    public TreeTraversal<T> getTraversal() {
        return null;
    }

    @Override
    public void setTraversal(TreeTraversal<T> traversal) {

    }
}
