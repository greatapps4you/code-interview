/*
 * Copyright (c) 2020 GreatApps4you LLC All rights reserved
 * https://greatapps4you.us
 * CSSML NDSMD VRS + NSMV SMQL IVB
 */

package us.greatapps4you.codeinterview.corejava;

import java.util.Arrays;

public class NumberIncrementerWithPrimitives {

    /**
     * Algorithm: increment number in Array of int form in 1 unit and output array of int
     *
     * @param input
     * @return
     */
    public int[] increment(int[] input) {

        // 0 - Initial state
        int[] output = Arrays.copyOf(input, input.length);
        final int FIRST_DIGIT_INDEX = 0;
        final int LAST_DIGIT_INDEX = input.length - 1;
        int currentDigitIndex = input.length - 1;
        int carryOne = 0;

        // 1 - Iterate over the input from right to left
        while (currentDigitIndex >= 0) {

            // 2 - Increment the current digit
            int currentDigitIncremented = input[currentDigitIndex] + 1;

            // 3 - Treat carry
            carryOne = currentDigitIncremented >= 10 ? 1 : 0;

                if (carryOne == 1) {
                    output[currentDigitIndex] = (currentDigitIncremented - 10) + carryOne;
                } else {
                    output[currentDigitIndex] = input[currentDigitIndex];
                }
//            //First of all let's treat the unity digit
//            if (currentDigitIndex == LAST_DIGIT_INDEX) {
//                if ((input[currentDigitIndex] + carry - 10) + 1 > 0) {
//                    output[currentDigitIndex] = 0;
//                } else {
//                    output[currentDigitIndex] = input[currentDigitIndex] + 1;
//                }
//            } else {
//                if (carry > 0) {
//                    //Let's take carry in
//                    int valueWithCarry = input[currentDigitIndex] + carry;
//
//                    if ((valueWithCarry - 10) + 1 > 0) {
//                        output[currentDigitIndex] = 0;
//                    } else {
//                        output[currentDigitIndex] = valueWithCarry;
//                    }
//                } else {
//                    output[currentDigitIndex] = input[currentDigitIndex];
//                }
//            }
//            //Always Calculate carry
//            carry = (input[currentDigitIndex] + carry - 10) + 1;
//            //Go towards the first INDEX


            System.out.println(output[currentDigitIndex]);
            System.out.println("Carry: " + carryOne);

            // 3 - Must carry on?


            currentDigitIndex--;
        }

        return output;
    }
}
