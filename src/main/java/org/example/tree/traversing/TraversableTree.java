package org.example.tree.traversing;

public interface TraversableTree<T> {
    TreeTraversal<T> getTraversal();

    void setTraversal(TreeTraversal<T> traversal);
}
