/*
 * Copyright (c) 2020 GreatApps4you LLC All rights reserved
 * https://greatapps4you.us
 * CSSML NDSMD VRS + NSMV SMQL IVB
 */

package us.greatapps4you.codeinterview.corejava;

public class NumberIncrementerWithPrimitives {

    /**
     * Algorithm: increment number in Array of int form in 1 unit and output array of int
     */
    public int[] increment(int[] input) {

        /*
         *   Initial state
         */
        int[] output = new int[input.length];
        final int MOST_LEFT_DIGIT_INDEX = 0;
        final int UNITY_DIGIT_INDEX = input.length - 1;
        int currentDigitIndex = input.length - 1;
        int previousCarryOne = 0;

        // Iterate over the input from right to left
        while (currentDigitIndex >= 0) {

            // The End
            // Carry one reached the most left digit
            if (currentDigitIndex == MOST_LEFT_DIGIT_INDEX && previousCarryOne == 1) {
                output = increaseArraySize(output);
                output[0] = 1;
                return output;
            }

            //The initial digit value considers the previous carried one
            int currentDigitValue = input[currentDigitIndex];

            // Only in two cases should increment:
            // when there is a previous one carried and when the current digit is the unity
            if (previousCarryOne == 1 || currentDigitIndex == UNITY_DIGIT_INDEX) {
                currentDigitValue += 1;
            }

            // The current carry on is needed in order to properly initilize currentDigitValue
            int currentCarryOne = currentDigitValue >= 10 ? 1 : 0;

            // Initialize the output
            if (currentCarryOne == 1) {
                // Take only the Unity part of the decimal
                output[currentDigitIndex] = currentDigitValue - 10;
            } else {
                output[currentDigitIndex] = currentDigitValue;
            }

            System.out.println("previousCarryOne: " + previousCarryOne);
            System.out.println("currentCarryOne: " + currentCarryOne);
            System.out.println("Initilized output: " + output[currentDigitIndex]);
            System.out.println("-------------------");

            previousCarryOne = currentCarryOne;
            currentDigitIndex--;
        }

        return output;
    }

    private int[] increaseArraySize(int[] old) {
        int[] increased = new int[old.length + 1];
        int counter = old.length - 1;
        while (counter >= 0) {
            increased[counter] = old[counter];
            counter--;
        }
        return increased;
    }
}
