package com.matthewddiaz.algorithms.dynamicProgramming;

/**
 * Created by matthewdiaz on 6/22/17.
 */
public class MatrixChainOrder {

    /**
     * NOTE: matricesDimensions is actually N + 1 length; where N is the number of matrices
     * NOTE2: We start computing from index 1 and not index 0
     * @param matricesDimensions
     * @return
     */
    public static int minNumOfMatrixMultiplications(int[] matricesDimensions){
        //creating table to store min costs at every sub-problem size
        int[][] minCost = new int[matricesDimensions.length][matricesDimensions.length];

        for(int[] row : minCost){
            for(int index = 0; index < row.length; index++){
                row[index] = Integer.MAX_VALUE;
            }
        }

        return minNumOfMatrixMultiplications(matricesDimensions, minCost, 1, minCost.length - 1 );
    }

    private static int minNumOfMatrixMultiplications(int[] matricesDimensions, int[][] minCost, int startIndex, int endIndex){
        //base case where the matrixChain is of size one. This is just a single matrix and therefore no order is required.
        if(startIndex == endIndex){
            return 0;
        }

        //base case where the sub-problem with startIndex and endIndex interval has been solved
        if(minCost[startIndex][endIndex] < Integer.MAX_VALUE){
            return minCost[startIndex][endIndex];
        }

        //set min to largest possible int value
        int min = Integer.MAX_VALUE;
        for(int splitIndex = startIndex; splitIndex < endIndex; splitIndex++){
            int costAtSplit = minNumOfMatrixMultiplications(matricesDimensions, minCost, startIndex, splitIndex) +
                              minNumOfMatrixMultiplications(matricesDimensions, minCost, splitIndex + 1, endIndex) +
                              matricesDimensions[startIndex  - 1] * matricesDimensions[splitIndex] * matricesDimensions[endIndex];
            if(costAtSplit < min){
                min = costAtSplit;
            }
        }

        return minCost[startIndex][endIndex] = min;
    }
}
