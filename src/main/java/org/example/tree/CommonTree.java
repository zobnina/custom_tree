package org.example.tree;

import org.example.tree.traversing.TraversableTree;
import org.example.tree.traversing.TraversalInDepth;
import org.example.tree.traversing.TreeTraversal;

import java.util.ArrayList;
import java.util.Iterator;

public class CommonTree<T> implements Tree<T>, Iterable<T>, TraversableTree<T> {
    private CommonNode root;
    private TreeTraversal<T> traversal;

    public CommonTree() {
        root = null;
        traversal = new TraversalInDepth<>();
    }

    public CommonTree(TreeTraversal<T> traversal) {
        this.traversal = traversal;
    }

    @Override
    public Iterator<T> iterator() {
        return new TreeIterator();
    }

    @Override
    public Node<T> getRoot() {
        return root;
    }

    @Override
    public void setRoot(T value) {
        this.root = new CommonNode(value);
    }

    @Override
    public Node<T> add(Node<T> parent, T value) {
        if (root == null) setRoot(parent.getData());
        ArrayList<Node<T>> nodes = traversal.traverse(root);
        if (nodes.contains(parent)) {
            CommonNode newNode = new CommonNode(value);
            parent.getChildren().add(newNode);
            return newNode;
        }
        return null;
    }

    @Override
    public boolean remove(Node<T> node) {
        if (root == node) setRoot(null);
        ArrayList<Node<T>> nodes = traversal.traverse(root);
        for (Node<T> n : nodes
        ) {
            if (n.getChildren().contains(node)) return n.getChildren().remove(node);
        }
        return false;
    }

    @Override
    public TreeTraversal<T> getTraversal() {
        return traversal;
    }

    @Override
    public void setTraversal(TreeTraversal<T> traversal) {
        this.traversal = traversal;
    }

    class TreeIterator implements Iterator<T>{
        private CommonNode current;

        public TreeIterator() {
            current = root;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T data = current.data;
            ArrayList<Node<T>> nodes = traversal.traverse(root);
            int currentIndex = nodes.indexOf(current);
            current = currentIndex < nodes.size() - 1 ? (CommonNode) nodes.get(currentIndex + 1) : null;
            return data;
        }
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
