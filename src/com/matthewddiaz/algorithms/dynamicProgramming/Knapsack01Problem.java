package com.matthewddiaz.algorithms.dynamicProgramming;

/**
 * Created by matthewdiaz on 7/19/17.
 */
public class Knapsack01Problem {
    public static class Item {
        private int value;
        private int weight;

        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }

        public int getValue() {
            return this.value;
        }

        public int getWeight() {
            return this.weight;
        }
    }

    /**
     *
     * @param valuesArr array of items values
     * @param weightsArr array of items weights
     * @param maxWeight max weight limit
     * @return max value that can be obtained for the given maxWeight limit
     */
    public static int knapsack01Problem(int[] valuesArr, int[] weightsArr, int maxWeight) {
        //convert an the two separate arrays into items for clarity
        Item[] items = generateItemsArray(valuesArr, weightsArr);
        return knapsack01Problem(items, maxWeight);
    }

    /**
     * Helper function
     * @param items an array of items
     * @param maxWeight max weight limit
     * @return max value that can be obtained for the given maxWeight limit
     * NOTE: optimalTable is an array with the following dimensions T[0... num Of Items][0 ... maxWeight]
     */
    private static int knapsack01Problem(Item[] items, int maxWeight) {
        int[][] optimalTable = new int[items.length + 1][maxWeight + 1];
        //this optimization is dependant on the number of items present
        for (int currentItems = 0; currentItems <= items.length; currentItems++) {
            //the second variable this problem is dependant on is the max weight limit
            for (int currentMaxWeight = 0; currentMaxWeight <= maxWeight; currentMaxWeight++) {
                //when there are no items or the max weight limit is zero the max value is 0
                if (currentItems == 0 || currentMaxWeight == 0) {
                    optimalTable[currentItems][currentMaxWeight] = 0;
                }else{
                    //obtain the current item from the array items.
                    Item currentItem = items[currentItems - 1];
                    int currentItemWeight = currentItem.getWeight();
                    int currentItemValue = currentItem.getValue();

                    //case where the current Item is less than the current max weight
                    if(currentItemWeight <= currentMaxWeight){
                        //choice the max between:
                        //1) not picking up the item.
                        //2)picking up the item. The value is equal to the value at the difference
                        //between (currentMaxWeight and currentItemWeight) plus the currentItemValue
                        optimalTable[currentItems][currentMaxWeight] = max(optimalTable[currentItems - 1][currentMaxWeight],
                                optimalTable[currentItems - 1][currentMaxWeight - currentItemWeight] + currentItemValue);
                    }else{
                        //the current Item weighs to much and is not picked up/
                        optimalTable[currentItems][currentMaxWeight] = optimalTable[currentItems-1][currentMaxWeight];
                    }
                }
            }
        }
        return optimalTable[items.length][maxWeight];
    }

    private static int max(int val1, int val2) {
        return val1 > val2 ? val1 : val2;
    }

    private static Item[] generateItemsArray(int[] valuesArr, int[] weightsArr) {
        Item[] items = new Item[valuesArr.length];
        for (int index = 0; index < items.length; index++) {
            items[index] = new Item(valuesArr[index], weightsArr[index]);
        }
        return items;
    }
}
