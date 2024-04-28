package com.thealgorithms.ciphers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class VigenereDiffblueTest {
    /**
     * Method under test: {@link Vigenere#encrypt(String, String)}
     */
    @Test
    void testEncrypt() {
        // Arrange, Act and Assert
        assertEquals("Xsr ejv urs gelnip epo jywr", (new Vigenere()).encrypt("Not all who wander are lost", "Key"));
        assertThrows(ArithmeticException.class, () -> (new Vigenere()).encrypt("42", ""));
    }

    /**
     * Method under test: {@link Vigenere#decrypt(String, String)}
     */
    @Test
    void testDecrypt() {
        // Arrange, Act and Assert
        assertEquals("Dkv wnb yxk mwptat wtu neov", (new Vigenere()).decrypt("Not all who wander are lost", "Key"));
        assertThrows(ArithmeticException.class, () -> (new Vigenere()).decrypt("42", ""));
    }
}
