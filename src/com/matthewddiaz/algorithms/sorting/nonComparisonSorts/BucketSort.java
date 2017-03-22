package com.matthewddiaz.algorithms.sorting.nonComparisonSorts;

import com.matthewddiaz.algorithms.sorting.comparisonSorts.QuickSort;
import com.matthewddiaz.datastructures.linkedList.LinkedList;
import com.matthewddiaz.designpatterns.behavioralPatterns.Iterator;

import java.util.Arrays;

/**
 * Created by matthewdiaz on 3/21/17.
 */
public class BucketSort {

    /**
     *
     * @param inputArr
     */
    public static void bucketSort(Double[] inputArr){
        int numOfElements = inputArr.length;
        LinkedList<Double>[] arrayOfLinkedLists = new LinkedList[inputArr.length];

        //initializing a new linkedLists for every index
        for(int index = 0; index < arrayOfLinkedLists.length; index++){
            arrayOfLinkedLists[index] = new LinkedList<>();
        }

        for(double element : inputArr){
            int elementIndex = getElementIndex(element, numOfElements);

            LinkedList<Double> list = arrayOfLinkedLists[elementIndex];
            list.appendElement(element);
        }

        int index = 0;
        for (LinkedList<Double> linkedList : arrayOfLinkedLists) {
            //converting linkedlist to array
            int listSize = linkedList.size();
            if(listSize > 0){
                Double[] array = linkedList.toArray(new Double[listSize]);
                //sorting array using QuickSort
                QuickSort.quickSort(array);

                for(Double element : array){
                    inputArr[index++] = element;
                }
            }
        }
    }

    /**
     *
     * @param element
     * @param numOfElements
     * @return
     */
    private static int getElementIndex(double element, int numOfElements){
        return (int)Math.floor(element * numOfElements);
    }
}
