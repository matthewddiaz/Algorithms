package com.matthewddiaz.algorithms.searching;

/**
 * Created by matthewdiaz on 8/29/16.
 */
public class BinarySearch {
    /**
     * Given a sorted array and an input element.
     * Returns the index position of the element in the array.
     * If the element is not present in the array returns -1.
     * @param arr
     * @param element
     * @return
     */
    public static int binarySearch(int[] arr, Comparable element){
        return binarySearch(arr, element, 0 , arr.length - 1);
    }

    private static int binarySearch(int[] arr, Comparable element, int low, int high){
        //element is not in the array
        if(low > high){
            return -1;
        }

        //calculating mid index
        int mid = (low + high)/2;
        int midValue = arr[mid];

        if(element.equals(midValue)){
            return mid;
        }else if(element.compareTo(midValue) > 0){
            //search for element in the top half of the input interval
            return binarySearch(arr, element, mid + 1, high);
        }else{
            //search for eleemt in the lower half of the input interval
            return binarySearch(arr, element, 0, mid - 1);
        }
    }
}
