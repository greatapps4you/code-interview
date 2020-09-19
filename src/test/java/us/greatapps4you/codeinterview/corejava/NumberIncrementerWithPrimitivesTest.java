/*
 * Copyright (c) 2020 GreatApps4you LLC All rights reserved
 * https://greatapps4you.us
 * CSSML NDSMD VRS + NSMV SMQL IVB
 */

package us.greatapps4you.codeinterview.corejava;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberIncrementerWithPrimitivesTest {

    private NumberIncrementerWithPrimitives numberIncrementerWithPrimitives;

    @BeforeEach
    void setUp() {
        this.numberIncrementerWithPrimitives = new NumberIncrementerWithPrimitives();
    }

    @Test
    void givenNumberArrayWhenIncrementedThenReturnIncrementedArray() {
        int[] given = {1, 2, 3};
        int[] actual = numberIncrementerWithPrimitives.increment(given);
        int[] expected = {1, 2, 4};
        assertArrayEquals(expected, actual);
    }


}