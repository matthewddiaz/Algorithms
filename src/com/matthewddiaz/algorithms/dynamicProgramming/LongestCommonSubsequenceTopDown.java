package com.matthewddiaz.algorithms.dynamicProgramming;

/**
 * Created by matthewdiaz on 7/18/17.
 */

/**
 * NOTE: Top Down refers to solving the problem using recursion; memoization.
 * NOTE: table row length ranges from [0, str1.length()] & table col length ranges
 * from [0, str2.length()]. This is because row0 and col0 represent the empty substring
 * of str1 and str2 respectively.
 *
 */
public class LongestCommonSubsequenceTopDown {
    /**
     *
     * @param str1 input string1
     * @param str2 input string2
     * @return the length of the LCS
     */
    public static int longestCommonSubsequenceTopDown(String str1, String str2) {
        //if either input is null or any of the string lengths are 0 return 0
        if (str1 == null || str2 == null || str1.length() == 0 || str2.length() == 0) {
            return 0;
        }
        //table to store subsequence length at each index
        int[][] subsequenceLengthTable = new int[str1.length() + 1][str2.length() + 1];
        return longestCommonSubsequenceTopDown(str1, str2, subsequenceLengthTable, str1.length(), str2.length());
    }

    /**
     * Helper function
     * @param str1 input string1
     * @param str2 input string2
     * @param subsequenceLengthTable table of LCS length's at every index size
     * @param str1Length length of str1
     * @param str2Length length of str2
     * @return int value of longest LCS
     */
    private static int longestCommonSubsequenceTopDown(String str1, String str2, int[][] subsequenceLengthTable, int str1Length, int str2Length) {
        //base case: if either string length is equal to 0
        if (str1Length == 0 || str2Length == 0) {
            return 0;
        }

        //checking to determine if sub-problem has already been solved.
        if (subsequenceLengthTable[str1Length][str2Length] != 0) {
            return subsequenceLengthTable[str1Length][str2Length];
        }

        if (str1.charAt(str1Length - 1) == str2.charAt(str2Length - 1)) {
            return subsequenceLengthTable[str1Length][str2Length] =
                    longestCommonSubsequenceTopDown(str1, str2, subsequenceLengthTable, str1Length - 1, str2Length - 1) + 1;
        } else {
            //
            return subsequenceLengthTable[str1Length][str2Length] =
                    max(longestCommonSubsequenceTopDown(str1, str2, subsequenceLengthTable, str1Length - 1, str2Length)
                            , longestCommonSubsequenceTopDown(str1, str2, subsequenceLengthTable, str1Length, str2Length - 1));
        }
    }

    /**
     * @param value1
     * @param value2
     * @return max value between value1 and value2
     */
    private static int max(int value1, int value2) {
        return (value1 > value2) ? value1 : value2;
    }
}
