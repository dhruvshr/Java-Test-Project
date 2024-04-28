package com.thealgorithms.matrixexponentiation;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FibonacciDiffblueTest {
    /**
     * Method under test: {@link Fibonacci#fib(int)}
     */
    @Test
    void testFib() {
        // Arrange and Act
        int[][] actualFibResult = Fibonacci.fib(1);

        // Assert
        assertEquals(2, actualFibResult.length);
        assertEquals(2, (actualFibResult[0]).length);
        assertArrayEquals(new int[]{1, 0}, actualFibResult[1]);
    }

    /**
     * Method under test: {@link Fibonacci#fib(int)}
     */
    @Test
    void testFib2() {
        // Arrange and Act
        int[][] actualFibResult = Fibonacci.fib(2);

        // Assert
        assertEquals(2, actualFibResult.length);
        assertEquals(2, (actualFibResult[0]).length);
        assertArrayEquals(new int[]{1, 1}, actualFibResult[1]);
    }
}
