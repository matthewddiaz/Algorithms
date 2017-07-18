package com.matthewddiaz.algorithms.dynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by matthewdiaz on 6/22/17.
 */
class MatrixChainOrderTest {
    private int[] matricesDimensions1 = {30,35,15,5,10,20,25};
    private int[] matricesDimensions2 = {40, 20, 30, 10, 30};
    private int[] matricesDimensions3 = {10, 20, 30, 40, 30};
    private int[] matricesDimensions4 = {10, 20, 30};

    @Test
    void minNumOfMatrixMultiplications1() {
        checkMinNumOfMatrixMultiplicationsCorrectness(matricesDimensions1, 15125);
    }

    @Test
    void minNumOfMatrixMultiplications2() {
        checkMinNumOfMatrixMultiplicationsCorrectness(matricesDimensions2, 26000);
    }

    @Test
    void minNumOfMatrixMultiplications3() {
        checkMinNumOfMatrixMultiplicationsCorrectness(matricesDimensions3, 30000);
    }

    @Test
    void minNumOfMatrixMultiplications4() {
        checkMinNumOfMatrixMultiplicationsCorrectness(matricesDimensions4, 6000);
    }

    private void checkMinNumOfMatrixMultiplicationsCorrectness(int[] matricesDimensions, int expectedMinNumOfMultiplications){
        int actualMinNumberOfMultiplications = MatrixChainOrder.minNumOfMatrixMultiplications(matricesDimensions);
        assertEquals(expectedMinNumOfMultiplications, actualMinNumberOfMultiplications);
    }

}