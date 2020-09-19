/*
 * Copyright (c) 2020 GreatApps4you LLC All rights reserved
 * https://greatapps4you.us
 * CSSML NDSMD VRS + NSMV SMQL IVB
 */

package us.greatapps4you.codeinterview.corejava;

/**
 * Given an Array of Integers representing a number,
 * increment that array in 1 unit at each method call
 * and return the incremented array.
 */
public class NumberIncrementer {

    public int[] increment(int[] input) {
        int number = extractNumber(input);
        String incremented = number + 1 + "";
        int[] output = new int[incremented.length()];
        for (int i = 0; i < incremented.length(); i++) {
            output[i] = Integer.parseInt(incremented.substring(i, i + 1));
        }
        return output;
    }

    private int extractNumber(int[] input) {
        StringBuilder number = new StringBuilder();
        for (Integer n : input) {
            number.append(n);
        }
        return Integer.parseInt(number.toString());
    }
}
