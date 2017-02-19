package sorting.comparisonSorts;

/**
 * Created by matthewdiaz on 2/15/17.
 */


public class QuickSort {
    public static void quickSort(int[] array){
        quickSort(array, 0, array.length - 1);
    }

    /**
     * Helper function
     * @param array
     * @param start
     * @param end
     */
    private static void quickSort(int[] array, int start, int end){
        if(start < end){
            int pivot = partition(array, start, end);
            quickSort(array, start, pivot - 1);
            quickSort(array, pivot + 1, end);
        }
    }

    /**
     * In place sorting around pivot element
     * @return
     */
    private static int partition(int[] array, int start, int end){
        int endOfLessThanIndex = start - 1;
        int comparisonElement = array[end];

        //if currentElement is less than comparisonElement
        //increment endOfLessThanIndex & swap current Element
        //with element at endOfLessThanIndex
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
}
