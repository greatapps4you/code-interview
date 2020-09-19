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

        int LAST_DIGIT_INDEX = output.length - 1;
        int CURRENT_DIGIT_INDEX = input.length - 1;
        int carry = 0;

        while (CURRENT_DIGIT_INDEX >= 0) {
            System.out.println(input[CURRENT_DIGIT_INDEX]);
            int incrementedValue = input[CURRENT_DIGIT_INDEX] + 1;

            if (carry > 0) {
                output[CURRENT_DIGIT_INDEX] = input[CURRENT_DIGIT_INDEX] + carry;
            }

            carry = (incrementedValue - 10) + 1;

            if (carry > 0) {
                output[CURRENT_DIGIT_INDEX] = 0;
            } else if (CURRENT_DIGIT_INDEX == LAST_DIGIT_INDEX) {
                output[CURRENT_DIGIT_INDEX] = incrementedValue;
                carry = 0;
            } else {
                output[CURRENT_DIGIT_INDEX] = input[CURRENT_DIGIT_INDEX];
            }


            CURRENT_DIGIT_INDEX--;
        }

        return output;
    }
}
