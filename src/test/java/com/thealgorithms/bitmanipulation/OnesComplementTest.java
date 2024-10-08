package com.thealgorithms.bitmanipulation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * Test case for Highest Set Bit
 * 
 * @author Abhinay Verma(https://github.com/Monk-AbhinayVerma)
 */
public class OnesComplementTest {

    @Test
    public void testOnesComplement_AllZeroes() {

        // Test cases with all-zero binary strings
        assertEquals("1111", OnesComplement.onesComplement("0000"));
        assertEquals("111", OnesComplement.onesComplement("000"));
        assertEquals("11", OnesComplement.onesComplement("00"));
        assertEquals("1", OnesComplement.onesComplement("0"));
    }

    @Test
    public void testOnesComplement_AllOnes() {
        // Test cases with all-one binary strings
        assertEquals("0000", OnesComplement.onesComplement("1111"));
        assertEquals("000", OnesComplement.onesComplement("111"));
        assertEquals("00", OnesComplement.onesComplement("11"));
        assertEquals("0", OnesComplement.onesComplement("1"));
    }

    @Test
    public void testOnesComplement_MixedBits() {
        // Test more mixed binary patterns
        assertEquals("1010", OnesComplement.onesComplement("0101"));
        assertEquals("0101", OnesComplement.onesComplement("1010"));
        assertEquals("1100", OnesComplement.onesComplement("0011"));
        assertEquals("0011", OnesComplement.onesComplement("1100"));
        assertEquals("1001", OnesComplement.onesComplement("0110"));
    }

    @Test
    public void testOnesComplement_EmptyString() {
        // Test empty string scenario
        assertEquals("", OnesComplement.onesComplement(""));
    }

    @Test
    public void testOnesComplement_InvalidInput() {
        // Test invalid binary strings with additional non-binary characters
        assertThrows(IllegalArgumentException.class, () -> OnesComplement.onesComplement("1020"));
        assertThrows(IllegalArgumentException.class, () -> OnesComplement.onesComplement("abc"));
        assertThrows(IllegalArgumentException.class, () -> OnesComplement.onesComplement("12"));
    }
}
