package org.example.tree.test;

import org.example.tree.CommonTree;
import org.example.tree.Node;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CommonTreeTest {
    private CommonTree<Integer> tree;

    @Before
    public void init() {
        tree = new CommonTree<>();
    }

    @Test
    public void getRootTest() {
        Node<Integer> actual = tree.getRoot();
        assertNull(actual);

        tree.setRoot(3);
        actual = tree.getRoot();
        assertNotNull(actual);
    }

    @Test
    public void setRootTest() {
        tree.setRoot(1);
        Integer expectedRootValue = 1;
        Integer actualRootValue = tree.getRoot().getData();
        assertEquals(expectedRootValue, actualRootValue);
    }

    @Test
    public void addTest() {
        CommonTree<Integer> tree = new CommonTree<>();
        tree.setRoot(1);
        Node<Integer> childNode = tree.add(tree.getRoot(), 2);
        Integer expectedChildValue = 2;
        Integer actualChildValue = childNode.getData();
        assertEquals(expectedChildValue, actualChildValue);
    }

    @Test
    public void removeTest() {
        tree.setRoot(1);
        Node<Integer> node = tree.add(tree.getRoot(), 2);
        boolean result = tree.remove(node);
        assertTrue(result);

        result = tree.remove(node);
        assertFalse(result);
    }

    @Test
    public void iteratorHasNextEmptyTest() {
        assertFalse(tree.iterator().hasNext());
    }

    @Test
    public void iteratorHasNextTest() {
        tree.setRoot(1);
        assertTrue(tree.iterator().hasNext());
    }

    @Test(expected = NullPointerException.class)
    public void iteratorNextEmptyTest() {
        tree.iterator().next();
    }

    @Test
    public void iteratorNextTest() {
        tree.setRoot(1);
        int rootValue = tree.iterator().next();
        assertEquals(1, rootValue);

        Node<Integer> root = tree.getRoot();
        Node<Integer> node1 = tree.add(tree.getRoot(), 2);
        Node<Integer> node2 = tree.add(tree.getRoot(), 3);
        Node<Integer> node3 = tree.add(tree.getRoot(), 4);
        int[] checkValues = {1, 2, 3, 4};
        int ind = 0;
        for (int nodeVal : tree) {
            assertEquals(checkValues[ind], nodeVal);
            ind++;
        }
    }
}
