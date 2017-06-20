package com.matthewddiaz.algorithms.dynamicProgramming;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 6/19/17.
 */
class MatrixMultiplicationTest {
    private int[][] matrixA =
                    {{1, 5, 6},
                    {2, 1, 0}};

    private int[][] matrixB =
                    {{5},
                    {10},
                    {3}};

    @Test
    void matrixMultiplication() {
        int[][] matrixC = MatrixMultiplication.matrixMultiplication(matrixA, matrixB);
        System.out.println(printMatrix(matrixC));
    }

    private String printMatrix(int[][] matrix){
        StringBuffer buffer = new StringBuffer();

        for(int[] row : matrix){
            buffer.append("[ ");
            for(int element : row){
                buffer.append(element + " ");
            }
            buffer.append("]\n");
        }
        return buffer.toString();
    }

}