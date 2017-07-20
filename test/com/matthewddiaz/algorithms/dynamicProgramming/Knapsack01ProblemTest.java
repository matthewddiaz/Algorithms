package com.matthewddiaz.algorithms.dynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 7/19/17.
 */
class Knapsack01ProblemTest {
    private int[] values = {60, 100, 120};
    private int[] weights = {10, 20, 30};

    @Test
    void knapsack01Problem() {
        int expectedResult = 220;
        int actualResult = Knapsack01Problem.knapsack01Problem(values,weights,50);
        assertEquals(expectedResult, actualResult);
    }

}