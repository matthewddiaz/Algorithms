package com.matthewddiaz.algorithms.sorting.comparisonSorts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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
        assertArrayEquals(expectedResult, integerArray);
    }

    @Test
    void testQuickSortDouble() {
        Double[] expectedResult = inputDataAndResultsHelper.getSortedDoubleArray();
        Double[] doubleArray = inputDataAndResultsHelper.getDoubleArray();
        QuickSort.quickSort(doubleArray);
        assertArrayEquals(expectedResult, doubleArray);
    }

    @Test
    void testQuickSortString() {
        String[] expectedResult = inputDataAndResultsHelper.getSortedStringArray();
        String[] stringArray = inputDataAndResultsHelper.getStringArray();
        QuickSort.quickSort(stringArray);
        assertArrayEquals(expectedResult, stringArray);
    }
}