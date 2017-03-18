package com.matthewddiaz.algorithms.sorting.nonComparisonSorts;

/**
 * Created by matthewdiaz on 3/18/17.
 */

/**
 * Counting Sort is a non-comparison sorting algorithm that makes the assumption that the input data set values
 * range from [0, maxValue] which the user passes in as a parameter. For an input set of size n; if
 * k = O(n) when Counting Sort sorts in linear time, θ(n).
 */
public class CountingSort {
    public static void countingSort(int[] array, int maxValue){
        //creating elementIndexArray of size maxValue. Ranges from [0, maxValue]
        int[] elementIndexArray = new int[maxValue + 1];

        //populating elementIndexArray with occurrence number of each element in input array.
        for(int currentElement : array){
            elementIndexArray[currentElement] = elementIndexArray[currentElement] + 1;
        }

        //since array ranges [0, array.length - 1] the correct index position is offset by 1
        elementIndexArray[0] = elementIndexArray[0] - 1;
        //calculating correct index for each element in array
        for(int index = 1; index < elementIndexArray.length; index++){
            elementIndexArray[index] = elementIndexArray[index] + elementIndexArray[index - 1];
        }

        //create auxiliary array and copy elements from array to aux
        int[] aux = new int[array.length];
        for(int index = 0; index < aux.length; index++){
            aux[index] = array[index];
        }

        //populate elements in their correct index thus sorting input array
        for(int index = aux.length - 1; index >= 0; index--){
            int currentElement = aux[index];
            int correctSortedIndex = elementIndexArray[currentElement];
            array[correctSortedIndex] = currentElement;
            elementIndexArray[currentElement] = correctSortedIndex - 1;
        }
    }
}
