package com.thealgorithms.audiofilters;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class IIRFilterDiffblueTest {
    /**
     * Method under test: {@link IIRFilter#setCoeffs(double[], double[])}
     */
    @Test
    void testSetCoeffs() throws IllegalArgumentException {
        // Arrange, Act and Assert
        assertThrows(IllegalArgumentException.class, () -> (new IIRFilter(1))
                .setCoeffs(new double[]{10.0d, 1.0d, 10.0d, 1.0d}, new double[]{10.0d, 1.0d, 10.0d, 1.0d}));
        assertThrows(IllegalArgumentException.class,
                () -> (new IIRFilter(1)).setCoeffs(new double[]{0.0d}, new double[]{10.0d, 1.0d, 10.0d, 1.0d}));
        assertThrows(IllegalArgumentException.class,
                () -> (new IIRFilter(4)).setCoeffs(new double[]{10.0d, 1.0d, 10.0d, 1.0d}, new double[]{}));
    }

    /**
     * Method under test: {@link IIRFilter#setCoeffs(double[], double[])}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetCoeffs2() throws IllegalArgumentException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        //       at com.thealgorithms.audiofilters.IIRFilter.setCoeffs(IIRFilter.java:62)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new IIRFilter(4)).setCoeffs(new double[]{10.0d, 1.0d, 10.0d, 1.0d}, new double[]{10.0d, 1.0d, 10.0d, 1.0d});
    }

    /**
     * Method under test: {@link IIRFilter#IIRFilter(int)}
     */
    @Test
    void testNewIIRFilter() throws IllegalArgumentException {
        // Arrange, Act and Assert
        assertEquals(10.0d, (new IIRFilter(1)).process(10.0d));
        assertThrows(IllegalArgumentException.class, () -> new IIRFilter(0));
    }

    /**
     * Method under test: {@link IIRFilter#process(double)}
     */
    @Test
    void testProcess() throws IllegalArgumentException {
        // Arrange, Act and Assert
        assertEquals(10.0d, (new IIRFilter(2)).process(10.0d));
    }
}
