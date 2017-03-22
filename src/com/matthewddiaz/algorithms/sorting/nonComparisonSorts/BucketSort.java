package com.matthewddiaz.algorithms.sorting.nonComparisonSorts;

import com.matthewddiaz.algorithms.sorting.comparisonSorts.QuickSort;
import com.matthewddiaz.datastructures.linkedList.LinkedList;

/**
 * Created by matthewdiaz on 3/21/17.
 */
public class BucketSort {

    /**
     * Sorts inputArr.
     * NOTE: bucketSort assumes that inputArr input data ranges from [0,1] and
     * that the data is equally distributed from [0,1]
     * @param inputArr
     */
    public static void bucketSort(Double[] inputArr){
        int numOfElements = inputArr.length;
        LinkedList<Double>[] arrayOfLinkedLists = new LinkedList[inputArr.length];

        //initializing a new linkedLists for every index
        for(int index = 0; index < arrayOfLinkedLists.length; index++){
            arrayOfLinkedLists[index] = new LinkedList<>();
        }

        //inserting each element in inputArr into its correct bucket
        for(double element : inputArr){
            int elementIndex = getElementIndex(element, numOfElements);

            LinkedList<Double> list = arrayOfLinkedLists[elementIndex];
            list.appendElement(element);
        }

        int index = 0;
        for (LinkedList<Double> linkedList : arrayOfLinkedLists) {
            //converting linked list to array
            int listSize = linkedList.size();
            if(listSize > 0){
                Double[] array = linkedList.toArray(new Double[listSize]);
                //sorting array using QuickSort
                QuickSort.quickSort(array);
                //repopulating inputArr with the elements sorted
                for(Double element : array){
                    inputArr[index++] = element;
                }
            }
        }
    }

    /**
     *Calculates the index of the bucket that the element is going to be inserted into.
     * @param element
     * @param numOfElements
     * @return
     */
    private static int getElementIndex(double element, int numOfElements){
        return (int)Math.floor(element * numOfElements);
    }
}
