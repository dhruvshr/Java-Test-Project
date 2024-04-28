package com.thealgorithms.ciphers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CaesarDiffblueTest {

    /**
     * Method under test: {@link Caesar#encode(String, int)}
     */
    @Test
    void testEncode() {
        // Arrange, Act and Assert
        assertEquals("Opu bmm xip xboefs bsf mptu", (new Caesar()).encode("Not all who wander are lost", 1));
        assertEquals("Abg nyy jub jnaqre ner ybfg", (new Caesar()).encode("Not all who wander are lost", 65));
    }

    /**
     * Method under test: {@link Caesar#decode(String, int)}
     */
    @Test
    void testDecode() {
        // Arrange
        // TODO: Populate arranged inputs
        Caesar caesar = null;
        String encryptedMessage = "";
        int shift = 0;

        // Act
        String actualDecodeResult = caesar.decode(encryptedMessage, shift);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Caesar#bruteforce(String)}
     */
    @Test
    void testBruteforce() {
        // Arrange
        // TODO: Populate arranged inputs
        Caesar caesar = null;
        String encryptedMessage = "";

        // Act
        String[] actualBruteforceResult = caesar.bruteforce(encryptedMessage);

        // Assert
        // TODO: Add assertions on result
    }
}
