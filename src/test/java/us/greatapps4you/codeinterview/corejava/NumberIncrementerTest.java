/*
 * Copyright (c) 2020 GreatApps4you LLC All rights reserved
 * https://greatapps4you.us
 * CSSML NDSMD VRS + NSMV SMQL IVB
 */

package us.greatapps4you.codeinterview.corejava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class NumberIncrementerTest {

    private NumberIncrementer numberIncrementer;

    @BeforeEach
    void init() {
        this.numberIncrementer = new NumberIncrementer();
    }

    @Test
    void givenNumberArrayWhenIncrementedThenReturnIncrementedArray() {
        int[] given = {1, 2, 3};
        int[] actual = numberIncrementer.increment(given);
        int[] expected = {1, 2, 4};
        assertArrayEquals(expected, actual);
    }

    @Test
    void givenLargeArrayOfNineWhenIncrementedThenReturnIncrementedArray() {
        int[] given = {9, 9, 9, 9, 9, 9, 9};
        int[] actual = numberIncrementer.increment(given);
        int[] expected = {1, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void giveMixedArrayOfNumbersWhenIncrementedThenReturnIncrementedArray() {
        int[] given = {1,3,8,9};
        int[] actual = numberIncrementer.increment(given);
        int[] expected = {1,3,9,0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void giveTooLargeArrayOfNumbersWhenIncrementedThenThrowNumberFormatException() {
        int[] given = {1,3,8,9,5,4,3,7,8,6,5,3,2,4,5,6,7,8,0,9};
        Assertions.assertThrows(NumberFormatException.class, () -> numberIncrementer.increment(given));
    }

}