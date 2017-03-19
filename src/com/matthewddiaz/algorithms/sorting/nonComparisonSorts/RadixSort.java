package com.matthewddiaz.algorithms.sorting.nonComparisonSorts;

/**
 * Created by matthewdiaz on 3/19/17.
 */
public class RadixSort {
    public static void radixSort(int[] array, int digitLength){
        int maxDigitValue = 9;
        for(int col = 1; col <= digitLength; col++){
            DigitCountingSort.digitCountingSort(array, col, maxDigitValue);
        }
    }
}

