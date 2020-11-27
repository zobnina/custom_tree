package org.example.tree;

import org.example.tree.traversing.TraversableTree;
import org.example.tree.traversing.TreeTraversal;

import java.util.ArrayList;
import java.util.Iterator;

public class CommonTree<T> implements Tree<T>, Iterable<T>, TraversableTree<T> {
    private CommonNode root;
    private TreeTraversal<T> traversal;

    public CommonTree() {

    }

    public CommonTree(TreeTraversal<T> traversal) {
        this.traversal = traversal;
    }

    public Iterator<T> iterator() {
        return null;
    }

    public Node<T> getRoot() {
        return null;
    }

    public void setRoot(T value) {

    }

    public Node<T> add(Node<T> parent, T value) {
        return null;
    }

    public boolean remove(Node<T> node) {
        return false;
    }

    public TreeTraversal<T> getTraversal() {
        return null;
    }

    public void setTraversal(TreeTraversal<T> traversal) {

    }

    class CommonNode implements Node<T>{
        private final T data;
        private final ArrayList<Node<T>> childNodes;

        private CommonNode(T value) {
            data = value;
            childNodes = new ArrayList<>();
        }

        @Override
        public T getData() {
            return data;
        }

        @Override
        public ArrayList<Node<T>> getChildren() {
            return childNodes;
        }
    }
}
