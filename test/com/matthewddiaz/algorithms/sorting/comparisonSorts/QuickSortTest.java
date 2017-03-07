package com.matthewddiaz.algorithms.sorting.comparisonSorts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by matthewdiaz on 2/18/17.
 */
class QuickSortTest {
    private InputDataAndResultsHelper inputDataAndResultsHelper = new InputDataAndResultsHelper();

    @Test
    void testQuickSortInteger() {
        Integer[] expectedResult = inputDataAndResultsHelper.getSortedIntegerArray();
        Integer[] integerArray = inputDataAndResultsHelper.getIntegerArray();
        QuickSort.quickSort(integerArray);
        Arrays.equals(expectedResult, integerArray);
    }

    @Test
    void testQuickSortDouble() {
        Double[] expectedResult = inputDataAndResultsHelper.getSortedDoubleArray();
        Double[] doubleArray = inputDataAndResultsHelper.getDoubleArray();
        QuickSort.quickSort(doubleArray);
        Arrays.equals(expectedResult, doubleArray);
    }

    @Test
    void testQuickSortString() {
        String[] expectedResult = inputDataAndResultsHelper.getSortedStringArray();
        String[] stringArray = inputDataAndResultsHelper.getStringArray();
        QuickSort.quickSort(stringArray);
        Arrays.equals(expectedResult, stringArray);
    }
}