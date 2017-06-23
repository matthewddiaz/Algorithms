package com.matthewddiaz.algorithms.dynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 6/22/17.
 */
class MatrixChainOrderTest {
    private int[] matricesDimensions = {30,35,15,5,10,20,25};

    @Test
    void matrixChainOrder() {
        int optimalMinNumberOfMultiplications = MatrixChainOrder.matrixChainOrder(matricesDimensions);
        System.out.println(optimalMinNumberOfMultiplications);
    }

}