package com.matthewddiaz.algorithms.dynamicProgramming;

/**
 * Created by matthewdiaz on 6/19/17.
 */
public class MatrixMultiplication {

    /**
     *
     * @param matrixA input matrix A
     * @param matrixB input matrix B
     * @return returns a new matrix C; which is the matrix multiplication of A and B
     * NOTE: matrixA has to have equal number of cols as matrix B has of rows
     *
     *
     * Ex: Multiplying matrix A and B will generate matrix C
     *     [1, 5, 6]         [5 ]     [ 73 ]
     *     [2, 1, 0]   X     [10]  =  [ 20 ]
     *                       [3 ]
     */
    public static int[][] matrixMultiplication(int[][] matrixA, int[][] matrixB){
        //The # of matrixA columns has to equal the # of matrixB rows for proper multiplication.
        if(matrixA[0].length != matrixB.length){
            throw new ArrayIndexOutOfBoundsException();
        }

        //matrixC has the dimensions of (matrixA's rows by matrixB's cols)
        int[][] matrixC = new int[matrixA.length][matrixB[0].length];

        //for each coordinate (row, col) in the new matrixC determine the multiplication
        //product of matrixA's row by matrixB's col
        for(int row = 0; row < matrixC.length; row++){
            for(int col = 0; col < matrixC[0].length; col++){
                matrixC[row][col] = multiplyMatrixRowByCol(matrixA, row, matrixB, col);
            }
        }
        return matrixC;
    }

    /**
     *
     * @param matrixA
     * @param rowOfA
     * @param matrixB
     * @param colOfB
     * @return sum of multiplying every element in matrixA's row by each corresponding element in matrixB's col
     * NOTE: matrixA has to have equal number of cols as matrix B has of rows
     */
    private static int multiplyMatrixRowByCol(int[][] matrixA, int rowOfA, int[][] matrixB, int colOfB){
        //causes where either the input row number or the input col number are invalid
        if((rowOfA < 0) || (rowOfA >= matrixA.length) || (colOfB < 0) || colOfB >= matrixA.length){
            throw new IndexOutOfBoundsException();
        }

        int sum = 0;
        //sum is the addition of the multiplication of each element in matrixA's row by
        // its corresponding element in matrixB's col
        for(int index = 0; index < matrixA[rowOfA].length; index++){
            sum += matrixA[rowOfA][index] * matrixB[index][colOfB];
        }

        return sum;
    }

}
