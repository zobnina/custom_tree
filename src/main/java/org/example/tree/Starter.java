package org.example.tree;

import org.example.tree.traversing.TraversalInWidth;

public class Starter {
    public static void main(String[] args) {
        CommonTree<Integer> tree = new CommonTree<>();
        tree.setRoot(1);
        Node<Integer> treeNode2 = tree.add(tree.getRoot(), 2);
        Node<Integer> treeNode3 = tree.add(treeNode2, 3);
        Node<Integer> treeNode4 = tree.add(tree.getRoot(), 4);
        Node<Integer> treeNode5 = tree.add(treeNode4, 5);
        Node<Integer> treeNode6 = tree.add(treeNode4, 6);
        Node<Integer> treeNode7 = tree.add(treeNode5, 7);
        Node<Integer> treeNode8 = tree.add(treeNode5, 8);
        Node<Integer> treeNode9 = tree.add(treeNode8, 9);

        for (Integer i : tree) {
            System.out.print(i+" ");
        }

        System.out.println("\n==============================");

        tree.setTraversal(new TraversalInWidth<>());

        for (Integer i : tree) {
            System.out.print(i+" ");
        }
    }
}
