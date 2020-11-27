package org.example.tree.test;

import org.example.tree.CommonTree;
import org.example.tree.Node;
import org.example.tree.traversing.TraversalInDepth;
import org.example.tree.traversing.TraversalInWidth;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreeTraversalTest {
    private CommonTree<Integer> tree;

    @Before
    public void init() {
        tree = new CommonTree<>();
        tree.setRoot(1);
        Node<Integer> treeNode2 = tree.add(tree.getRoot(), 2);
        Node<Integer> treeNode3 = tree.add(treeNode2, 3);
        Node<Integer> treeNode4 = tree.add(tree.getRoot(), 4);
        Node<Integer> treeNode5 = tree.add(treeNode4, 5);
        Node<Integer> treeNode6 = tree.add(treeNode4, 6);
        Node<Integer> treeNode7 = tree.add(treeNode5, 7);
        Node<Integer> treeNode8 = tree.add(treeNode5, 8);
        Node<Integer> treeNode9 = tree.add(treeNode8, 9);
    }

    @Test
    public void inDepthTest() {
        tree.setTraversal(new TraversalInDepth<>());
        int[] checkValues = {1, 2, 3, 4, 5, 7, 8, 9, 6};
        int ind = 0;
        for (int nodeVal : tree) {
            assertEquals(checkValues[ind], nodeVal);
            ind++;
        }
    }

    @Test
    public void inWidthTest() {
        tree.setTraversal(new TraversalInWidth<>());
        int[] checkValues = {1, 2, 4, 3, 5, 6, 7, 8, 9};
        int ind = 0;

        for (int nodeVal : tree) {
            assertEquals(checkValues[ind], nodeVal);
            ind++;
        }
    }
}
