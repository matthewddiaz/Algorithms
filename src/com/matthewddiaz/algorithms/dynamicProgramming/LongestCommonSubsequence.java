package com.matthewddiaz.algorithms.dynamicProgramming;

/**
 * Created by matthewdiaz on 6/30/17.
 */
public class LongestCommonSubsequence {

    /**
     *
     * @param str1
     * @param str2
     * @return
     */
    public static int longestCommonSubSequenceBottomUp(String str1, String str2){
        //if either input is null or any of the string lengths are 0 return 0
        if(str1 == null || str2 == null || str1.length() == 0 || str2.length() == 0){
            return 0;
        }
        //table to store subsequence length at each index
        int[][] subsequenceLengthTable = new int[str1.length() + 1][str2.length() + 1];
        return longestCommonSubSequenceBottomUp(str1, str2, subsequenceLengthTable);
    }

    public static int longestCommonSubSequenceBottomUp2(String str1, String str2, int[][] subsequenceLengthTable){
        //if either input is null or any of the string lengths are 0 return 0
        if(str1 == null || str2 == null || str1.length() == 0 || str2.length() == 0){
            return 0;
        }
        return longestCommonSubSequenceBottomUp(str1, str2, subsequenceLengthTable);
    }

    /**
     *
     * @param str1
     * @param str2
     * @param subsequenceLengthTable
     * @return
     */
    private static int longestCommonSubSequenceBottomUp(String str1, String str2, int[][] subsequenceLengthTable){
        for(int str1Index = 1; str1Index <= str1.length(); str1Index++ ){
            for(int str2Index = 1; str2Index <= str2.length(); str2Index++){
                //if current character for str1 'c1' equals current character for str2 'c2'
                if(str1.charAt(str1Index - 1) == str2.charAt(str2Index - 1)){
                    subsequenceLengthTable[str1Index][str2Index] = subsequenceLengthTable[str1Index - 1][str2Index - 1] + 1;
                }
                else{
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
     * @param value1
     * @param value2
     * @return
     */
    private static int max(int value1, int value2){
        return (value1 > value2) ? value1 : value2;
    }

    public static int longestCommonSubsequenceTopDown(String str1, String str2){
        //if either input is null or any of the string lengths are 0 return 0
        if(str1 == null || str2 == null || str1.length() == 0 || str2.length() == 0){
            return 0;
        }
        //table to store subsequence length at each index
        int[][] subsequenceLengthTable = new int[str1.length() + 1][str2.length() + 1];
        return longestCommonSubsequenceTopDown(str1, str2, subsequenceLengthTable, str1.length(), str2.length());
    }

    private static int longestCommonSubsequenceTopDown(String str1, String str2, int[][] subsequenceLengthTable, int str1Length, int str2Length){
        if(str1Length == 0 || str2Length == 0){
            return 0;
        }

        if(subsequenceLengthTable[str1Length][str2Length] != 0){
            return subsequenceLengthTable[str1Length][str2Length];
        }

        if(str1.charAt(str1Length - 1) == str2.charAt(str2Length - 1)){
            return subsequenceLengthTable[str1Length][str2Length] =
                     longestCommonSubsequenceTopDown(str1,str2,subsequenceLengthTable,str1Length - 1, str2Length - 1) + 1;
        }else{
            return subsequenceLengthTable[str1Length][str2Length] =
                     max(longestCommonSubsequenceTopDown(str1,str2,subsequenceLengthTable,str1Length - 1, str2Length )
                            ,longestCommonSubsequenceTopDown(str1,str2,subsequenceLengthTable,str1Length, str2Length - 1));
        }
    }

//    public static String longestCommonSubsequenceSolution(int[][] subsequenceLengthTable, String str1, int xLength, int yLength){
//        if(xLength == 0 || yLength == 0){
//            return "";
//        }
//
//        if(subsequenceLengthTable[xLength][yLength] == subsequenceLengthTable[xLength - 1][yLength - 1] + 1){
//
//        }
//
//    }
}
