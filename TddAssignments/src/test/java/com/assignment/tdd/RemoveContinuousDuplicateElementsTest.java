package com.assignment.tdd;

import org.junit.Assert;
import org.junit.Test;

public class RemoveContinuousDuplicateElementsTest {

    RemoveContinuousDuplicateElements removeContinuousDuplicateElements = new RemoveContinuousDuplicateElements();

    @Test
    public void testRemoveDuplicateElementsCase1() {
        int [] input = {1,1,1,2,2,3,3,4,5,5,5};
        int [] expectedResult = {1,2,3,4,5};
        int[] actualResult = removeContinuousDuplicateElements.removeContinuousDuplicateElements(input);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDuplicateElementsCase2() {
        int [] input = {1};
        int [] expectedResult = {1};
        int[] actualResult = removeContinuousDuplicateElements.removeContinuousDuplicateElements(input);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDuplicateElementsCase3() {
        int [] input = {};
        int [] expectedResult = {};
        int[] actualResult = removeContinuousDuplicateElements.removeContinuousDuplicateElements(input);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDuplicateElementsCase4() {
        int [] input = {1,2,1,2,1};
        int [] expectedResult = {1,2,1,2,1};
        int[] actualResult = removeContinuousDuplicateElements.removeContinuousDuplicateElements(input);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDuplicateElementsCase5() {
        int [] input = {1,2,3,4,5};
        int [] expectedResult = {1,2,3,4,5};
        int[] actualResult = removeContinuousDuplicateElements.removeContinuousDuplicateElements(input);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDuplicateElementsCase6() {
        int [] input = {1,1,1,1,1};
        int [] expectedResult = {1};
        int[] actualResult = removeContinuousDuplicateElements.removeContinuousDuplicateElements(input);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

} 