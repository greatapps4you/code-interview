/*
 * Copyright (c) 2020 GreatApps4you LLC All rights reserved
 * https://greatapps4you.us
 * CSSML NDSMD VRS + NSMV SMQL IVB
 */

package us.greatapps4you.codeinterview.corejava;

import java.util.Arrays;

public class NumberIncrementerWithPrimitives {
    public int[] increment(int[] input) {

        int[] output = Arrays.copyOf(input, input.length);

        final int LAST_DIGIT_INDEX = output.length - 1;
        int CURRENT_DIGIT_INDEX = input.length - 1;
        int carry = 0;

        while (CURRENT_DIGIT_INDEX >= 0) {

            //First of all let's treat the unity digit
            if (CURRENT_DIGIT_INDEX == LAST_DIGIT_INDEX) {
                if ((input[CURRENT_DIGIT_INDEX] + carry - 10) + 1 > 0) {
                    output[CURRENT_DIGIT_INDEX] = 0;
                } else {
                    output[CURRENT_DIGIT_INDEX] = input[CURRENT_DIGIT_INDEX] + 1;
                }
            } else {
                if (carry > 0) {
                    //Let's take carry in
                    int valueWithCarry = input[CURRENT_DIGIT_INDEX] + carry;

                    if ((valueWithCarry - 10) + 1 > 0) {
                        output[CURRENT_DIGIT_INDEX] = 0;
                    } else {
                        output[CURRENT_DIGIT_INDEX] = valueWithCarry;
                    }
                } else {
                    output[CURRENT_DIGIT_INDEX] = input[CURRENT_DIGIT_INDEX];
                }
            }
            //Always Calculate carry
            carry = (input[CURRENT_DIGIT_INDEX] + carry - 10) + 1;
            //Go towards the first INDEX
            CURRENT_DIGIT_INDEX--;
        }

        return output;
    }
}
