package com.matthewddiaz.algorithms.sorting.comparisonSorts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 2/28/17.
 */
class HeapSortTest {
    private HeapSort heapSort;
    private InputDataAndResultsHelper inputDataAndResultsHelper;

    @BeforeEach
    void setUp() {
        heapSort = new HeapSort();
        inputDataAndResultsHelper = new InputDataAndResultsHelper();
    }

    @Test
    void heapSortWithEvenSizeArray() {
        Integer[] array = {7,1,45,19,100,20,11,15};
        Integer[] expectedAnswer = {1,7,11,15,19,20,45,100};
        heapSort.heapSort(array);
        assertArrayEquals(expectedAnswer, array);
    }

    @Test
    void heapSortWithOddSizeArray() {
        Integer[] array = {7,1,45,19,100,-1,20,11,15};
        Integer[] expectedAnswer = {-1,1,7,11,15,19,20,45,100};
        heapSort.heapSort(array);
        assertArrayEquals(expectedAnswer, array);
    }

    @Test
    void heapSortWithReversedArray() {
        Integer[] array = {150,100,95,26,17,15,14,10,0,-1,-100};
        Integer[] expectedAnswer = {-100,-1,0,10,14,15,17,26,95,100,150};
        heapSort.heapSort(array);
        assertArrayEquals(expectedAnswer, array);
    }

    @Test
    void testQuickSortInteger() {
        Integer[] expectedResult = inputDataAndResultsHelper.getSortedIntegerArray();
        Integer[] integerArray = inputDataAndResultsHelper.getIntegerArray();
        heapSort.heapSort(integerArray);
        assertArrayEquals(expectedResult, integerArray);
    }

    @Test
    void testQuickSortDouble() {
        Double[] expectedResult = inputDataAndResultsHelper.getSortedDoubleArray();
        Double[] doubleArray = inputDataAndResultsHelper.getDoubleArray();
        heapSort.heapSort(doubleArray);
        assertArrayEquals(expectedResult, doubleArray);
    }

    @Test
    void testQuickSortString() {
        String[] expectedResult = inputDataAndResultsHelper.getSortedStringArray();
        String[] stringArray = inputDataAndResultsHelper.getStringArray();
        heapSort.heapSort(stringArray);
        assertArrayEquals(expectedResult, stringArray);
    }
}