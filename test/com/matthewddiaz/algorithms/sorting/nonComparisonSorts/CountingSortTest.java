package com.matthewddiaz.algorithms.sorting.nonComparisonSorts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 3/18/17.
 */
class CountingSortTest {
    private int[] simpleDataSet = {2,5,3,0,2,3,0,3};
    private int[] homologousDataSet = {2,2,2,2,2,2,2,2,2,2};
    private int[] oneDifferenceDataSet = {2,2,2,2,2,2,3,2,2,2};
    private int[] largeDataSet = {2,5,1,3,0,6,9,6,8,7,1,6,5,4,7,8,9,2,4,4,1,0,9,5,5,7,6,6,8,8,2,3,7,0,3};
    private int[] alreadySortedDataSet = {1,2,3,3,3,4,5,6,6,7,8,8,9};

    @Test
    void testingCountingSortWithSimpleData() {
        int[] expectedSortedData = {0, 0, 2, 2, 3, 3, 3, 5};
        CountingSort.countingSort(simpleDataSet, 5);
        assertArrayEquals(expectedSortedData, simpleDataSet);
    }

    @Test
    void testingCountingSortWithHomologousData() {
        int[] expectedSortedData = {2,2,2,2,2,2,2,2,2,2};
        CountingSort.countingSort(homologousDataSet, 5);
        assertArrayEquals(expectedSortedData, homologousDataSet);
    }
    @Test
    void testingCountingSortWithOneDifference() {
        int[] expectedSortedData = {2,2,2,2,2,2,2,2,2,3};
        CountingSort.countingSort(oneDifferenceDataSet, 5);
        assertArrayEquals(expectedSortedData, oneDifferenceDataSet);
    }

    @Test
    void testingCountingSortWithLargeData() {
        int[] expectedSortedData = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9};
        CountingSort.countingSort(largeDataSet, 9);
        assertArrayEquals(expectedSortedData, largeDataSet);
    }

    @Test
    void testingCountingSortWithAlreadySortedData() {
        int[] expectedSortedData = {1,2,3,3,3,4,5,6,6,7,8,8,9};
        CountingSort.countingSort(alreadySortedDataSet, 9);
        assertArrayEquals(expectedSortedData, alreadySortedDataSet);
    }
}