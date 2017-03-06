package com.matthewddiaz.algorithms.sorting.comparisonSorts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by matthewdiaz on 2/15/17.
 */
class MergeSortTest {
    private Integer[] array = {15, 1, 19, 16, 17, 100, 105, 103, 11, 4, 20,180};
    private Double[] array1 = {15.1, 18.18, 1.1, 16.5, 19.3, 16.6, 17.4, 100.4, 105.4, 103.2, 11.1, 4.3, 2.3, -180.2};
    private String[] array2 = {"Goku", "Krillian", "Gohan", "Vegeta","Master Roshi", "Piccolo", "Bulma", "Cell"};

    @Test
    void testMergeSortInteger() {
        Integer[] expectedResult = {1, 4, 15, 11, 16, 17, 19, 20, 100, 103, 105,180};
        MergeSort.mergeSort(array);
        Arrays.equals(expectedResult,array);
    }

    @Test
    void testMergeSortDouble() {
        MergeSort.mergeSort(array1);
        Double[] expectedResult = {-180.2, 1.1, 2.3, 4.3, 11.1, 15.1, 16.5, 16.6, 17.4, 18.18, 19.3, 100.4, 103.2, 105.4};
        Arrays.equals(expectedResult,array1);
    }

    @Test
    void testMergeSortString() {
        String[] expectedResult = {"Bulma", "Cell", "Gohan", "Goku", "Krillian", "Master Roshi", "Piccolo", "Vegeta"};
        MergeSort.mergeSort(array2);
        Arrays.equals(expectedResult,array2);
    }
}