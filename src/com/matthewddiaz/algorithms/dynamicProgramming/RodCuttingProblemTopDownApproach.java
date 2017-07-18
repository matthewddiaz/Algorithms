package com.matthewddiaz.algorithms.dynamicProgramming;

/**
 * Created by matthewdiaz on 7/18/17.
 */

/**
 * NOTE: Top Down Approach refers to using recursion and memoization.
 */
public class RodCuttingProblemTopDownApproach {
    /**
     * Returns the max revenue given a rod of input length (N) and a table
     * of prices for the prices of each rod length from 1 to N
     * NOTE: The Rod Cutting Problem is solved using Top-Down Approach
     * @param length
     * @param prices
     * @return
     */
    public static int maxRevenueRodCutTopDownApproach(int length, int[] prices){
        //initialize an empty table to store calculated max revenues for smaller sizes
        int[] maxRevenues = new int[prices.length];
        return maxRevenueRodCutTopDownApproach(length, prices, maxRevenues);
    }

    /**
     * Helper method that uses input maxRevenues array to store previous calculated revenues
     * @param length
     * @param prices
     * @param maxRevenues
     * @return
     */
    private static int maxRevenueRodCutTopDownApproach(int length, int[] prices, int[] maxRevenues){
        //base case: when length is equal to 0 revenue is 0
        if(length == 0){
            return 0;
        }
        //case where sub-problem has previously been solved
        if(maxRevenues[length] > 0){
            return maxRevenues[length];
        }
        //case when max revenue has not been solved for the following length

        int revenue = 0;

        //calculating the max revenue by obtaining the max value at every index from 1 to input length
        for(int index = 1; index <= length; index++){
            /**
             * Two possible options. Choose the option that produces more revenue
             * 1) Either don't cut at current index, no change to the revenue
             * 2) or cut at the current index and add price at index plus max revenue for the rest of the rod.
             * NOTE: Can't access revenue from maxRevenue table because the revenue may not have been calculated for that length yet.
             */
            revenue = max(revenue, prices[index] + maxRevenueRodCutTopDownApproach(length - index, prices, maxRevenues));
        }

        //storing max revenue value for the input length into maxRevenues table for future retrieval
        maxRevenues[length] = revenue;
        return  revenue;
    }

    /**
     * Returns the larger value of the 2 input values
     * @param value1
     * @param value2
     * @return
     */
    private static int max(int value1, int value2){
        return (value1 > value2) ? value1 : value2;
    }
}
