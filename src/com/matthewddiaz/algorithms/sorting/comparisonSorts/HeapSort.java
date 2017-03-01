package com.matthewddiaz.algorithms.sorting.comparisonSorts;

import com.matthewddiaz.datastructures.heap.MaxHeap;

/**
 * Created by matthewdiaz on 2/27/17.
 */
public class HeapSort {
    private MaxHeap maxHeap;

    HeapSort(){
        maxHeap = new MaxHeap();
    }

    public void heapSort(int[] array){
        //construct a max heap. Note that A[0] is the largest element in the array
        maxHeap.buildMaxHeapify(array);

        for(int index = array.length - 1; index >= 1; index--){
            //swaps the first element with the element at heapSize
            swap(array, 0, maxHeap.getHeapSize());
            //decrement the heapSize
            maxHeap.decrementHeapSize();
            //perform maxHeapify on the first element to ensure that the heap rule still applies
            //this will ensure that the largest element be in A[0]
            maxHeap.maxHeapify(array,0);
        }
    }

    private void swap(int[] array, int leftElement, int rightElement){
        int tempElement = array[leftElement];
        array[leftElement] = array[rightElement];
        array[rightElement] = tempElement;
    }
}
