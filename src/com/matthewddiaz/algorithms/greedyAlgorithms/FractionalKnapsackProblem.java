package com.matthewddiaz.algorithms.greedyAlgorithms;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by matthewdiaz on 7/19/17.
 */
public class FractionalKnapsackProblem {
    static public class Item implements Comparable<Item>{
        private int value;
        private int weight;
        private int unitPrice;

        public Item(int value, int weight){
            this.value = value;
            this.weight = weight;
            this.unitPrice = this.value/this.weight;
        }

        @Override
        public int compareTo(Item other) {
            if(this.unitPrice == other.unitPrice){
                return 0;
            }else if(this.unitPrice > other.unitPrice){
                return 1;
            }else{
                return -1;
            }
        }

        public int getWeight(){
            return this.weight;
        }

        public int getValue(){
            return this.value;
        }

        public int getUnitPrice(){
            return this.unitPrice;
        }
    }

    /**
     *
     * @param valuesArr an array of values for each item
     * @param weightArr an array of weights for each item
     * @param maxWeight max amount of weight that can be picked up
     * @return max revenue that can be obtained from the items times with the given weight limit
     */
    public static int fractionalKnapsack(int[] valuesArr, int[] weightArr, int maxWeight){
        Item[] items = generateItems(valuesArr, weightArr);
        //sort array in non-increasing order. This will allow optimal (greedy) choice to always be picked first
        Arrays.sort(items, Collections.reverseOrder());

        return fractionalKnapsack(items, maxWeight);
    }

    /**
     *
     * @param valuesArr
     * @param weightArr
     * @return
     */
    private static Item[] generateItems(int[] valuesArr, int[] weightArr){
        //create new items array
        Item[] items = new Item[valuesArr.length];

        //populate items with newly created item instances
        for(int index = 0; index < items.length; index++){
            items[index] = new Item(valuesArr[index], weightArr[index]);
        }

        return items;
    }

    /**
     *
     * @param items an array of items
     * @param maxWeight max amount of weight that can be picked up
     * @return max revenue that can be obtained from the items times with the given weight limit
     */
    private static int fractionalKnapsack(Item[] items, int maxWeight){
        int remainingWeight = maxWeight;

        int currentIndex = 0;
        int maxValue = 0;

        while((remainingWeight > 0)  && (currentIndex < items.length)){
            Item currentItem = items[currentIndex];
            int currentItemWeight = currentItem.getWeight();
            int currentItemValue = currentItem.getValue();

            //If item weighs less than the remaining weight add all of the item's value to maxValue
            //decrement the remaining weight by the item's weight and advance to the next item in the list.
            if(currentItemWeight < remainingWeight){
                maxValue += currentItemValue;
                remainingWeight -= currentItemWeight;
                currentIndex++;
            }//only a fraction (remaining weight) of this item can be taken
            else{
                maxValue += remainingWeight * currentItem.getUnitPrice();
                remainingWeight = 0;
            }
        }

        return maxValue;
    }
}


