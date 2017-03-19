package com.matthewddiaz.algorithms.sorting.nonComparisonSorts;

/**
 * Created by matthewdiaz on 3/19/17.
 */

/**
 * Radix Sort relies on DigitCountingSort to sort the input array with d-length digits in linear time
 * assuming that the maxValue is linear with respect to array.length and that digitalLength is constant.
 * Radix Sort sorts from least sig digit to most thus why loop col goes from 1 to d
 */
public class RadixSort {
    public static void radixSort(int[] array, int digitLength){
        int maxDigitValue = 9;
        for(int col = 1; col <= digitLength; col++){
            DigitCountingSort.digitCountingSort(array, col, maxDigitValue);
        }
    }
}

