package org.example.tree.test;

import org.example.tree.CommonTree;
import org.example.tree.Node;
import org.example.tree.UniqTree;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class UniqTreeTest {

    private UniqTree<Integer> uniqTree;

    @Before
    public void init() {
        CommonTree<Integer> commonTree = new CommonTree<>();
        uniqTree = new UniqTree<>(commonTree);
    }

    @Test
    public void addTest() {
        uniqTree.setRoot(1);
        Node<Integer> node = uniqTree.add(uniqTree.getRoot(), 2);
        Node<Integer> repeatNode = uniqTree.add(uniqTree.getRoot(), 2);
        assertEquals(2, node.getData().intValue());

        assertNull(repeatNode);

        repeatNode = uniqTree.add(node, 2);
        assertNull(repeatNode);
    }
}
