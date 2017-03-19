package com.matthewddiaz.algorithms.sorting.nonComparisonSorts;

/**
 * Created by matthewdiaz on 3/19/17.
 */
public class DigitCountingSort {
    /**
     * DigitCountingSort is a small modification on Counting Sort in that
     * there is an extra parameter col which refers to the current column being sorted.
     * DigitCountingSort then uses the column to extract the correct digit for each element.
     * Also else is the same from Counting Sort.
     * @param array
     * @param col
     * @param maxValue
     */
    public static void digitCountingSort(int[] array, int col, int maxValue){
        //creating elementIndexArray of size maxValue. Ranges from [0, maxValue]
        int[] elementIndexArray = new int[maxValue + 1];

        //populating elementIndexArray with occurrence number of each element in input array.
        for(int currentElement : array){
            int digit = getCurrentDigit(currentElement, col);
            elementIndexArray[digit] = elementIndexArray[digit] + 1;
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
            int digit = getCurrentDigit(currentElement, col);
            int correctSortedIndex = elementIndexArray[digit];
            array[correctSortedIndex] = currentElement;
            elementIndexArray[digit] = correctSortedIndex - 1;
        }
    }

    /**
     * Current Digit = [(num) / (10^(col - 1))] % 10;
     * @param num
     * @param col
     * @return
     */
    private static int getCurrentDigit(int num, int col){
        int divisor = (int)Math.pow(10, col - 1);
        return (num/divisor) % 10;
    }
}
