package com.matthewddiaz.algorithms.sorting.nonComparisonSorts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 3/21/17.
 */
class BucketSortTest {

    @Test
    void bucketSort() {
        Double[] inputArr = {.78, .17, .39, .26, .72, .94, .21, .12, .23, .68};
        BucketSort.bucketSort(inputArr);
        System.out.println(Arrays.toString(inputArr));
    }

}