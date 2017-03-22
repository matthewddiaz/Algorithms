package com.matthewddiaz.algorithms.sorting.nonComparisonSorts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 3/21/17.
 */
class BucketSortTest {

    @Test
    void testingBucketSortOnSimpleData() {
        Double[] expectedSortedArr = {0.12, 0.17, 0.21, 0.23, 0.26, 0.39, 0.68, 0.72, 0.78, 0.94};
        Double[] inputArr = {.78, .17, .39, .26, .72, .94, .21, .12, .23, .68};
        BucketSort.bucketSort(inputArr);
        assertArrayEquals(expectedSortedArr, inputArr);
    }

    @Test
    void testingBucketSortOnLargeData() {
        Double[] expectedSortedArr = {0.05, 0.11, 0.12, 0.17, 0.21, 0.23, 0.26, 0.29, 0.33, 0.39, 0.43, 0.47, 0.54, 0.57, 0.64, 0.68, 0.72, 0.78, 0.84, 0.89, 0.94, 0.99};
        Double[] inputArr = {.64, .05, .29, .57, .33, .89, .84, .47, .11, .78, .99, .17, .39, .26, .72, .94, .54, .21, .43, .12, .23, .68};
        BucketSort.bucketSort(inputArr);
        assertArrayEquals(expectedSortedArr, inputArr);
    }
}