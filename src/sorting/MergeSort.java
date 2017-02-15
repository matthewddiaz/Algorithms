package sorting;

import java.util.Arrays;

/**
 * Created by matthewdiaz on 8/31/16.
 */

/*
    MergeSort: A Divide & Conqueror Sorting Algorithm

    Divide Step: Split the n-element sequence into two (n/2) sized sub-sequences. Time Complexity: θ(1)
    Conqueror Step: Recursively keep dividing, until we can apply brute force
                    comparison between two elements. Time Complexity: 2T(n/2). T(n) is worst case running time.
    Combine Step: combine the solutions to the sub-problems into the original problem. Time Complexity: θ(n)

    Total Time Complexity: θ(nlg(n))


    Example:
    Input: int[] arr = {15, 1, 16, 17, 20, 11, 4, 20};

    Divide:
    divide 1: {15, 1, 16, 17} {20, 11, 4, 20}

    Conquering:
    divide 2: {15, 1} {16,17} {20,11} {4,20}
    divide 3: {15} {1} {16} {17} {20} {11} {4} {20}
    Done dividing

    Combine:
    {1,15} {16,17} {11,20} {4,20}
    {1,15,16,17} {4,11,20,20}
    {1,4,11,15,16,17,20,20)

    Link:
    http://algs4.cs.princeton.edu/22mergesort/

 */

public class MergeSort {
    /**
     *NOTE: Using an auxiliary array to space memory space. Requires only an additional n size amount of space.
     * Space Complexity: θ(n)
     */
    public void mergeSort(int[] array) {
        int[] aux = new int[array.length];
        mergeSort(array, aux, 0, array.length - 1);
    }

    private void mergeSort(int[] array, int[] aux, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int midPoint = (startIndex + endIndex) / 2;
            mergeSort(array, aux, startIndex, midPoint);
            mergeSort(array, aux, midPoint + 1, endIndex);
            merge(array, aux, startIndex, midPoint, endIndex);
        }
    }

    /**
     * Merges two pre-sorted arrays of size m into 1 sorted array of size 2m.
     * NOTE: In this implementation startingIndex to midpPoint represent the elements in the sorted left array
     * & (midPoint + 1) to endIndex represent the elements in the sorted right array
     */
    private void merge(int[] array, int[] aux, int startingIndex, int midPoint, int endIndex) {
        for(int index = startingIndex; index <= endIndex; index++){
            aux[index] = array[index];
        }

        int leftElementPosition = startingIndex;
        int rightElementPosition = midPoint + 1;

        for (int index = startingIndex; index <= endIndex; index++) {
            if (leftElementPosition > midPoint) {
                array[index] = aux[rightElementPosition++];
            } else if (rightElementPosition > endIndex) {
                array[index] = aux[leftElementPosition++];
            } else if (array[leftElementPosition] <= array[rightElementPosition]) {
                array[index] = aux[leftElementPosition++];
            } else {
                array[index] = aux[rightElementPosition++];
            }
        }

    }
}





