package com.matthewddiaz.algorithms.dynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 6/17/17.
 */
class RodCuttingProblemBottomUpApproachTest {
    int[] prices = {0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30};

    @Test
    void maxRevenueRodCutBottomUpApproach() {
        //8 should be 22
        int expectedResult1 = 22;
        int result1 = RodCuttingProblemBottomUpApproach.maxRevenueRodCutBottomUpApproach(8,prices);

        //9 should be 25
        int expectedResult2 = 25;
        int result2 = RodCuttingProblemBottomUpApproach.maxRevenueRodCutBottomUpApproach(9, prices);

        assertEquals(expectedResult1, result1);
        assertEquals(expectedResult2, result2);
    }

    @Test
    void maxRevenueRodCutBottomUpApproachWithSolution() {
        int[] maxRevenueTable = new int[prices.length];
        int[] solutionsTable = new int[prices.length];

        //8 should be 22
        int expectedResult1 = 30;
        int result1 = RodCuttingProblemBottomUpApproach.
                maxRevenueCutBottomUpApproachWithSolution(10,prices, maxRevenueTable, solutionsTable);

        RodCuttingProblemBottomUpApproach.printMaxRevenueSolution(9, maxRevenueTable, solutionsTable);

        assertEquals(expectedResult1, result1);
    }

}