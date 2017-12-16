package com.assignment.tdd;

import org.apache.commons.lang.ArrayUtils;

public class RemoveContinuousDuplicateElements {

    public int[] removeContinuousDuplicateElements(int[] inputArray) {

        int index = 1;
        while (index < inputArray.length) {
            if (inputArray[index] == inputArray[index-1]) {
                inputArray = ArrayUtils.remove(inputArray, index);
            } else {
                index++;
            }
        }
        return inputArray;
    }
}
