package com.thealgorithms.datastructures.trees;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

class InorderTraversalDiffblueTest {
    /**
     * Method under test: {@link InorderTraversal#recursiveInorder(BinaryTree.Node)}
     */
    @Test
    void testRecursiveInorder() {
        // Arrange and Act
        List<Integer> actualRecursiveInorderResult = InorderTraversal.recursiveInorder(new BinaryTree.Node(42));

        // Assert
        assertEquals(1, actualRecursiveInorderResult.size());
        assertEquals(42, actualRecursiveInorderResult.get(0).intValue());
    }

    /**
     * Method under test: {@link InorderTraversal#iterativeInorder(BinaryTree.Node)}
     */
    @Test
    void testIterativeInorder() {
        // Arrange and Act
        List<Integer> actualIterativeInorderResult = InorderTraversal.iterativeInorder(new BinaryTree.Node(42));

        // Assert
        assertEquals(1, actualIterativeInorderResult.size());
        assertEquals(42, actualIterativeInorderResult.get(0).intValue());
    }

    /**
     * Method under test: {@link InorderTraversal#iterativeInorder(BinaryTree.Node)}
     */
    @Test
    void testIterativeInorder2() {
        // Arrange and Act
        List<Integer> actualIterativeInorderResult = InorderTraversal.iterativeInorder(null);

        // Assert
        assertTrue(actualIterativeInorderResult.isEmpty());
    }

    /**
     * Method under test: {@link InorderTraversal#iterativeInorder(BinaryTree.Node)}
     */
    @Test
    void testIterativeInorder3() {
        // Arrange
        BinaryTree.Node root = new BinaryTree.Node(42);
        root.left = new BinaryTree.Node(42);

        // Act
        List<Integer> actualIterativeInorderResult = InorderTraversal.iterativeInorder(root);

        // Assert
        assertEquals(2, actualIterativeInorderResult.size());
        assertEquals(42, actualIterativeInorderResult.get(0).intValue());
        assertEquals(42, actualIterativeInorderResult.get(1).intValue());
    }
}
