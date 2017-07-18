package com.matthewddiaz.algorithms.dynamicProgramming;

/**
 * Created by matthewdiaz on 6/30/17.
 *
 * NOTE: Bottom Up refers to solving the problem iteratively. Solving smaller size sub-problems
 * to solve the large sub-problems.
 *
 * NOTE: table row length ranges from [0, str1.length()] & table col length ranges
 * from [0, str2.length()]. This is because row0 and col0 represent the empty substring
 * of str1 and str2 respectively.
 */
public class LongestCommonSubsequenceBottomUp {

    /**
     * @param str1 input str1
     * @param str2 input str2
     * @return length of a LCS
     */
    public static int longestCommonSubSequenceBottomUp(String str1, String str2) {
        //if either input is null or any of the string lengths are 0 return 0
        if (str1 == null || str2 == null || str1.length() == 0 || str2.length() == 0) {
            return 0;
        }
        //table to store sub-sequence length at each index
        int[][] subsequenceLengthTable = new int[str1.length() + 1][str2.length() + 1];
        return longestCommonSubSequenceBottomUp(str1, str2, subsequenceLengthTable);
    }

    /**
     *
     * @param str1 input str1
     * @param str2 input str2
     * @return a String being a LCS
     */
    public static String longestCommonSubSequenceSolutionBottomUp(String str1, String str2) {
        //if either input is null or any of the string lengths are 0 return 0
        if (str1 == null || str2 == null || str1.length() == 0 || str2.length() == 0) {
            return "";
        }
        int[][] subsequenceLengthTable = new int[str1.length() + 1][str2.length() + 1];
        longestCommonSubSequenceBottomUp(str1, str2, subsequenceLengthTable);
        return generateLongestCommonSubsequenceSolutionRecursive(subsequenceLengthTable, str1);
    }

    /**
     * @param str1 input str1
     * @param str2 input str2
     * @param subsequenceLengthTable table of LCS length's at every index size
     * @return length of a LCS
     */
    private static int longestCommonSubSequenceBottomUp(String str1, String str2, int[][] subsequenceLengthTable) {
        for (int str1Index = 1; str1Index <= str1.length(); str1Index++) {
            for (int str2Index = 1; str2Index <= str2.length(); str2Index++) {
                //if current character for str1 'c1' equals current character for str2 'c2'
                if (str1.charAt(str1Index - 1) == str2.charAt(str2Index - 1)) {
                    subsequenceLengthTable[str1Index][str2Index] = subsequenceLengthTable[str1Index - 1][str2Index - 1] + 1;
                } else {
                    //case when 'c1' and 'c2' are not equal choose the larger length
                    subsequenceLengthTable[str1Index][str2Index] =
                            max(subsequenceLengthTable[str1Index - 1][str2Index], subsequenceLengthTable[str1Index][str2Index - 1]);
                }
            }
        }

        //return the value of the max length
        return subsequenceLengthTable[str1.length()][str2.length()];
    }

    /**
     *
     * @param subsequenceLengthTable table of LCS length's at every index size
     * @param str1 The first string being compared
     * @return String of a LCS
     */
    private static String generateLongestCommonSubsequenceSolutionRecursive(int[][] subsequenceLengthTable, String str1) {
        int row = subsequenceLengthTable.length - 1;
        int col = subsequenceLengthTable[0].length - 1;
        return generateLongestCommonSubsequenceSolutionRecursive(subsequenceLengthTable, str1, row, col);
    }

    /**
     * Helper method to generateLCS
     * @param subsequenceLengthTable table of LCS length's at every index size
     * @param str1 The first string being compared
     * @param row Current Row
     * @param col Current Col
     * @return String of a LCS
     */
    private static String generateLongestCommonSubsequenceSolutionRecursive(int[][] subsequenceLengthTable, String str1, int row, int col) {
        //if either str1 or str2 length is equal to zero then the longest common subsequence is an empty string
        if (row <= 0 || col <= 0) {
            return "";
        }

        int lengthOfAboveSequence = subsequenceLengthTable[row - 1][col];
        int lengthOfLeftSequence = subsequenceLengthTable[row][col - 1];

        int optimalRow;
        int optimalCol;

        //determining between left and above slot which has a longer subsequence
        if (lengthOfLeftSequence > lengthOfAboveSequence) {
            optimalRow = row;
            optimalCol = col - 1;
        } else {
            optimalRow = row - 1;
            optimalCol = col;
        }

        //if optimal slot has same length as diagonal. Then this is an element in the longest subsequence
        int lengthOfDiagonalSequence = subsequenceLengthTable[row - 1][col - 1];
        if (subsequenceLengthTable[optimalRow][optimalCol] == lengthOfDiagonalSequence) {
            //adding the character at the current row to the stack
            return generateLongestCommonSubsequenceSolutionRecursive(subsequenceLengthTable, str1, row - 1, col - 1)
                    + str1.charAt(row - 1);
        } else {
            //else move on to the slot with the largest lcs; already determined as table[optimalRow][optimalCol]
            return generateLongestCommonSubsequenceSolutionRecursive(subsequenceLengthTable, str1, optimalRow, optimalCol);
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
