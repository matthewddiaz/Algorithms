package com.matthewddiaz.algorithms.sorting.nonComparisonSorts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Created by matthewdiaz on 3/19/17.
 */
class RadixSortTest {
    private int[] simpleDataSet = {329, 457,657, 839, 436, 720, 355};
    private int[] largeDataSet = {329, 457, 111, 657, 789, 767, 911, 301, 561, 839, 436, 895, 190, 523, 156, 156, 444, 306, 720, 999,355};
    private int[] alreadySortedDataSet = {329, 457,657, 720, 839, 899, 900, 989};
    private int[] inversedDataSet = {989, 900,  899, 839, 720, 657, 457, 329};
    private int[] largerDigitNumberDataSet = {32915, 45712, 33657, 44444, 43123, 47813, 39876, 37711, 48111, 39180};

    @Test
    void testingRadixSortWithSimpleData() {
        int[] expectedSortedData = {329, 355, 436, 457, 657, 720, 839};
        RadixSort.radixSort(simpleDataSet, 3);
        assertArrayEquals(expectedSortedData, simpleDataSet);
    }

    @Test
    void testingRadixSortWithLargeData() {
        int[] expectedSortedData = {111, 156, 156, 190, 301, 306, 329, 355, 436, 444, 457, 523, 561, 657, 720, 767, 789, 839, 895, 911, 999};
        RadixSort.radixSort(largeDataSet, 3);
        assertArrayEquals(expectedSortedData, largeDataSet);
    }

    @Test
    void testingRadixSortWithAlreadySortedData() {
        int[] expectedSortedData = {329, 457,657, 720, 839, 899, 900, 989};
        RadixSort.radixSort(alreadySortedDataSet, 3);
        assertArrayEquals(expectedSortedData, alreadySortedDataSet);
    }

    @Test
    void testingRadixSortWithInversedData() {
        int[] expectedSortedData = {329, 457,657, 720, 839, 899, 900, 989};
        RadixSort.radixSort(inversedDataSet, 3);
        assertArrayEquals(expectedSortedData, inversedDataSet);
    }

    @Test
    void testingRadixSortWithLargerDigitNumberData() {
        int[] expectedSortedData = {32915, 33657, 37711, 39180, 39876, 43123, 44444, 45712, 47813, 48111};
        RadixSort.radixSort(largerDigitNumberDataSet, 5);
        assertArrayEquals(expectedSortedData, largerDigitNumberDataSet);
    }
}