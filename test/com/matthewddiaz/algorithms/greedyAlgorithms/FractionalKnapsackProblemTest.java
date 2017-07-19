package com.matthewddiaz.algorithms.greedyAlgorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 7/19/17.
 */
class FractionalKnapsackProblemTest {
    private int[] values = {60, 100, 120};
    private int[] weights = {10, 20, 30};

    @Test
    void fractionalKnapsack() {
        int expectedMaxValue = 240;
        int actualMaxValue = FractionalKnapsackProblem.fractionalKnapsack(values, weights, 50);
        assertEquals(expectedMaxValue, actualMaxValue);
    }
}