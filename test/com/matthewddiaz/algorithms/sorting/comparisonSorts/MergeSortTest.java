package com.matthewddiaz.algorithms.sorting.comparisonSorts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by matthewdiaz on 2/15/17.
 */
class MergeSortTest {
    private int[] array = {15, 1, 16, 17, 11, 4, 20};

    @Test
    void testMergeSort() {
        MergeSort.mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}