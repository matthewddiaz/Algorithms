package com.matthewddiaz.algorithms.sorting.comparisonSorts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by matthewdiaz on 2/15/17.
 */
class MergeSortTest {
    private InputDataAndResultsHelper inputDataAndResultsHelper = new InputDataAndResultsHelper();

    @Test
    void testMergeSortInteger() {
        Integer[] expectedResult = inputDataAndResultsHelper.getSortedIntegerArray();
        Integer[] integerArray = inputDataAndResultsHelper.getIntegerArray();
        MergeSort.mergeSort(integerArray);
        Arrays.equals(expectedResult, integerArray);
    }

    @Test
    void testMergeSortDouble() {
        Double[] expectedResult = inputDataAndResultsHelper.getSortedDoubleArray();
        Double[] doubleArray = inputDataAndResultsHelper.getDoubleArray();
        MergeSort.mergeSort(doubleArray);
        Arrays.equals(expectedResult, doubleArray);
    }

    @Test
    void testMergeSortString() {
        String[] expectedResult = inputDataAndResultsHelper.getSortedStringArray();
        String[] stringArray = inputDataAndResultsHelper.getStringArray();
        MergeSort.mergeSort(stringArray);
        Arrays.equals(expectedResult, stringArray);
    }
}