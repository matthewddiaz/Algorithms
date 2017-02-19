package sorting.comparisonSorts;

import java.util.Random;

/**
 * Created by matthewdiaz on 2/15/17.
 */

/**
 * QuickSort in-place Divide & conqueror sorting algorithm using random sampling
 *
 * Divide: Partition the array with range [start ... end] into two sub-arrays (potentially empty)
 * left-array ranges [start ... (pivot - 1)] and right-array ranges [(pivot + 1) ... end]
 * Conqueror: Sort the two sub-arrays left-array and right-array with recursive calls to quickSort
 * Combine: Nothing
 *
 * Time Complexity: Worst Case: θ(n^2)
 *                  Expected Case: θ(nlg(n))
 *
 * Link: http://algs4.cs.princeton.edu/23quicksort/Quick.java.html
 *
 * Reference: Introduction to Algorithms, 3rd Edition CLRS
 *            Ch: 7 Sections 1 - 3
 */
public class QuickSort {
    private static final Random random = new Random();

    public static void quickSort(int[] array){
        quickSort(array, 0, array.length - 1);
    }

    /**
     * Divides the array around the pivot recursively calling
     * quickSort with the left sub-array ranging from [start ... (pivot - 1)]
     * and the right sub-array ranging from from [(pivot + 1) ... end]
     * Note: the pivot element does not get included in either of the subarrays
     * because it is already sorted with itself.
     */
    private static void quickSort(int[] array, int start, int end){
        if(start < end){
            int pivot = randomizedPartition(array, start, end);
            quickSort(array, start, pivot - 1);
            quickSort(array, pivot + 1, end);
        }
    }

    /**
     * In place sorting around pivot element (the last element: array[end])
     * NOTE: prior to
     * @return pivot index position
     */
    private static int partition(int[] array, int start, int end){
        int endOfLessThanIndex = start - 1;
        int comparisonElement = array[end];

        /**
         * If currentElement is less than comparisonElement
         * increment endOfLessThanIndex & swap current Element
         * with element at endOfLessThanIndex
         */
        for(int index = start; index <= end; index++){
                if(array[index] < comparisonElement){
                    endOfLessThanIndex++;
                    if(index != endOfLessThanIndex){
                        swap(array, endOfLessThanIndex, index);
                    }
                }
        }
        int pivot = endOfLessThanIndex + 1;
        swap(array, pivot, end);
        return pivot;
    }

    /**
     * Helper method that swaps element1 and element2 in array
     */
    private static void swap(int[] array,int positionOfElement1, int positionOfElement2){
        int tempElementHolder = array[positionOfElement1];
        array[positionOfElement1] = array[positionOfElement2];
        array[positionOfElement2] = tempElementHolder;
    }

    /**
     * Selects a random position from the range [start ... end]
     * and then swaps the element in this position with the array[end] the last element
     * NOTE 1: This method ensures that we have a randomly selected pivot element
     * NOTE 2: Partition method sorts based on the pivot element which is array[end]
     * thus swapping end element and randomPivotPosition element must be done prior to partitioning.
     * @return
     */
    private static int randomizedPartition(int[] array, int start, int end){
        int range = (end - start) + 1;
        int randomPivotPosition = random.nextInt(range) + start;
        swap(array, end, randomPivotPosition);
        return partition(array, start, end);
    }
}
