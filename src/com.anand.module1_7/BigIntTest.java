package com.anand.module1_7;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class BigIntTest {

    // Partition
    /*
    a and b are positive
    a and b are negative
    a is positive and b is negative
    a is negative and b is positive
    Boundary Cases
    a or b = 1, 0, -1
     */

    /**
     * Partitioned the inputs as follows:
     * a and b -> positive
     * a -> positive b -> negative
     * a and b -> negative
     *
     * a = 0, b positive
     * a = 1, b positive
     */

    @Test
    public void testabpositive() {
        // 34 * 56
        // 34 * 34
        // 65 * 42
        Assert.assertEquals(new BigInteger("34").multiply(new BigInteger("56")), BigInt.multiply(new BigInteger("34"), new BigInteger("56")));
    }

    @Test
    public void testboundaires() {
        // 0 * 4353
        // 1 * 2424
        // 32424 * -1
        assertEquals(new BigInteger("1").multiply(new BigInteger("2424")), BigInt.multiply(new BigInteger("1"), new BigInteger("2424")));
    }
}
