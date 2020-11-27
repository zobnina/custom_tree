package org.example.tree;

public interface Tree<T> {
    Node<T> getRoot();

    void setRoot(T value);

    Node<T> add(Node<T> parent, T value);

    boolean remove(Node<T> node);
}
