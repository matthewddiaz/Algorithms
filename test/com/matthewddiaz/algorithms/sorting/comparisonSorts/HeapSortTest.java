package com.matthewddiaz.algorithms.sorting.comparisonSorts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 2/28/17.
 */
class HeapSortTest {
    private HeapSort heapSort;

    @BeforeEach
    void setUp() {
        heapSort = new HeapSort();
    }

    @Test
    void heapSortWithEvenSizeArray() {
        int[] array = {7,1,45,19,100,20,11,15};
        int[] expectedAnswer = {1,7,11,15,19,20,45,100};
        heapSort.heapSort(array);
        assertArrayEquals(expectedAnswer, array);
    }

    @Test
    void heapSortWithOddSizeArray() {
        int[] array = {7,1,45,19,100,-1,20,11,15};
        int[] expectedAnswer = {-1,1,7,11,15,19,20,45,100};
        heapSort.heapSort(array);
        assertArrayEquals(expectedAnswer, array);
    }

    @Test
    void heapSortWithReversedArray() {
        int[] array = {150,100,95,26,17,15,14,10,0,-1,-100};
        int[] expectedAnswer = {-100,-1,0,10,14,15,17,26,95,100,150};
        heapSort.heapSort(array);
        assertArrayEquals(expectedAnswer, array);
    }

    @Test
    void heapSortWithArrayOfSize2() {
        int[] array = {7,1};
        int[] expectedAnswer = {1,7};
        heapSort.heapSort(array);
        assertArrayEquals(expectedAnswer, array);
    }

    @Test
    void heapSortWithArrayOfSize1() {
        int[] array = {1};
        int[] expectedAnswer = {1};
        heapSort.heapSort(array);
        assertArrayEquals(expectedAnswer, array);
    }
}