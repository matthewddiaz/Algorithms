package com.matthewddiaz.algorithms.sorting.comparisonSorts;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Created by matthewdiaz on 2/15/17.
 */
class MergeSortTest {
    private InputDataAndResultsHelper inputDataAndResultsHelper = new InputDataAndResultsHelper();

    /**
     * NOTE: using assertArraysEquals instead of Arrays.equals() since array comparison for
     * assertArraysEquals tests that each element in the arrays are equal to each other.
     */
    @Test
    void testMergeSortInteger() {
        Integer[] expectedResult = inputDataAndResultsHelper.getSortedIntegerArray();
        Integer[] integerArray = inputDataAndResultsHelper.getIntegerArray();
        MergeSort.mergeSort(integerArray);
        assertArrayEquals(expectedResult, integerArray);
    }

    @Test
    void testMergeSortDouble() {
        Double[] expectedResult = inputDataAndResultsHelper.getSortedDoubleArray();
        Double[] doubleArray = inputDataAndResultsHelper.getDoubleArray();
        MergeSort.mergeSort(doubleArray);
        assertArrayEquals(expectedResult, doubleArray);
    }

    @Test
    void testMergeSortString() {
        String[] expectedResult = inputDataAndResultsHelper.getSortedStringArray();
        String[] stringArray = inputDataAndResultsHelper.getStringArray();
        MergeSort.mergeSort(stringArray);
        assertArrayEquals(expectedResult, stringArray);
    }
}