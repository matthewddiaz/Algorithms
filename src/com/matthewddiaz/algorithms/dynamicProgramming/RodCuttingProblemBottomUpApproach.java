package com.matthewddiaz.algorithms.dynamicProgramming;

/**
 * Created by matthewdiaz on 6/17/17.
 */

/**
 * NOTE: Bottom Up refers to iterative approach to solving the problem
 */
public class RodCuttingProblemBottomUpApproach {
    /**
     * Returns the max revenue given a rod of input length (N) and a table
     * of prices for the prices of each rod length from 1 to N
     * NOTE: The Rod Cutting Problem is solved using Bottom-Up Approach
     * @param length
     * @param prices
     * @return
     */
    public static int maxRevenueRodCutBottomUpApproach(int length, int[] prices){
        //initialize a max revenue table the size as prices table to store the max revenue at every index
        int[] maxRevenue = new int[prices.length];

        //finding the max revenue for each sub-length from 1 to length
        for(int subLength = 1; subLength <= length; subLength++){
            //set revenue for current sub-length set to 0
            int revenue = 0;
            //iterate from 1 to subLength and calculate the max revenue for current sub-length
            for(int index = 1; index <= subLength; index++){
                //revenue is either not changed or set to price at index plus revenue of (rod length sub-length - index)
                revenue = max(revenue, prices[index] + maxRevenue[subLength - index]);
            }
            //storing max revenue value at the current sub-length in maxRevenue array for future reference
            maxRevenue[subLength] = revenue;
        }
        return maxRevenue[length];
    }

    /**
     * @param length the length of a rod
     * @param prices a table of prices for each index cut of the rod from 1 to length
     * @param maxRevenue empty max revenue table the function will store the values as it's computed
     * @param solutionCutTable empty solution cut table the function will store the values as it's computed
     * @return
     */
    public static int maxRevenueCutBottomUpApproachWithSolution(int length, int[] prices,
                                                                int[] maxRevenue, int[] solutionCutTable){
        //case when input length is invalid
        if(length < 0 || length >= prices.length){
            throw new IndexOutOfBoundsException();
        }

        //all input arrays must have the same size
        if((maxRevenue.length != prices.length) && (solutionCutTable.length != prices.length)){
            throw new ArrayIndexOutOfBoundsException();
        }

        //finding the max revenue for each sub-length from 1 to length
        for(int subLength = 1; subLength <= length; subLength++){
            //set revenue for current sub-length set to 0
            int currentRevenue = 0;
            //iterate from 1 to subLength and calculate the max revenue for current sub-length
            for(int index = 1; index <= subLength; index++){
                //revenue is either not changed or set to price at index plus revenue of (rod length sub-length - index)
                int cutRevenue = prices[index] + maxRevenue[subLength - index];
                if(cutRevenue > currentRevenue){
                    currentRevenue = cutRevenue;
                    solutionCutTable[subLength] = index;
                }
            }
            //storing max revenue value at the current sub-length in maxRevenue array for future reference
            maxRevenue[subLength] = currentRevenue;
        }
        return maxRevenue[length];
    }

    /**
     * Prints the max revenue (value) plus the cuts (solution) for the input length
     * @param length
     * @param maxRevenueTable
     * @param solutionsTable
     */
    public static void printMaxRevenueSolution(int length, int[] maxRevenueTable, int[] solutionsTable){
        //case were input length is invalid
        if(length < 0 || length >= solutionsTable.length){
            throw new IndexOutOfBoundsException();
        }

        //case were either maxRevenueTable or solutionsTable is of invalid length
        if(maxRevenueTable.length != solutionsTable.length){
            throw new ArrayIndexOutOfBoundsException();
        }

        System.out.print("Max Revenue " + maxRevenueTable[length] + ". The solution is: ");
        while(length > 0){
            //print the cut amount
            int cutAmount = solutionsTable[length];
            System.out.print(cutAmount + " ");
            length = length - cutAmount;
        }
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
