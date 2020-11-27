package org.example.tree;

import org.example.tree.traversing.TraversableTree;
import org.example.tree.traversing.TreeTraversal;

import java.util.Iterator;

public class UniqTree<T> implements Iterable<T>, Tree<T>, TraversableTree<T> {
    private final CommonTree<T> tree;

    public UniqTree(CommonTree<T> tree) {
        this.tree = tree;
    }

    @Override
    public Node<T> getRoot() {
        return tree.getRoot();
    }

    @Override
    public void setRoot(T value) {
        tree.setRoot(value);
    }

    @Override
    public Node<T> add(Node<T> parent, T value) {
        for (T element : tree) {
            if (element.equals(value)) return null;
        }
        return tree.add(parent, value);
    }

    @Override
    public boolean remove(Node<T> node) {
        return tree.remove(node);
    }

    @Override
    public Iterator<T> iterator() {
        return tree.iterator();
    }

    @Override
    public TreeTraversal<T> getTraversal() {
        return tree.getTraversal();
    }

    @Override
    public void setTraversal(TreeTraversal<T> traversal) {
        tree.setTraversal(traversal);
    }
}
