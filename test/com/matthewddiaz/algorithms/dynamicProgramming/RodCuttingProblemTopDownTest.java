package com.matthewddiaz.algorithms.dynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 7/18/17.
 */
class RodCuttingProblemTopDownTest {
    int[] prices = {0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30};

    @Test
    void maxRevenueRodCutTopDownApproach() {
        //8 should be 22
        int expectedResult1 = 22;
        int result1 = RodCuttingProblemTopDown.maxRevenueRodCutTopDownApproach(8,prices);

        //9 should be 25
        int expectedResult2 = 25;
        int result2 = RodCuttingProblemTopDown.maxRevenueRodCutTopDownApproach(9, prices);

        assertEquals(expectedResult1, result1);
        assertEquals(expectedResult2, result2);
    }

}