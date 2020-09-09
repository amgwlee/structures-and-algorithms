package com.example.structures;


import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

class BinaryTreeTests {


    @Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
        BinaryTree bt = createBinaryTree();

        assertTrue(bt.containsNode(6));
        assertTrue(bt.containsNode(4));

        assertFalse(bt.containsNode(1));
    }

    @Test
    public void givenABinaryTree_WhenDeletingElements_ThenTreeDoesNotContainThoseElements() {
        BinaryTree bt = createBinaryTree();

        assertTrue(bt.containsNode(9));
        bt.delete(9);
        assertFalse(bt.containsNode(9));
    }

    private BinaryTree createBinaryTree() {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        return bt;
    }

}
