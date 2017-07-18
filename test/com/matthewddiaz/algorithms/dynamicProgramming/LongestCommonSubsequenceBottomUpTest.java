package com.matthewddiaz.algorithms.dynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 7/18/17.
 */
class LongestCommonSubsequenceBottomUpTest {
    private String str1 = "BDCABA";
    private String str2 = "ABCBDAB";

    @Test
    void longestCommonSubSequenceBottomUp() {
        int expectedLength = 4;
        int actualLCSLength =  LongestCommonSubsequenceBottomUp.longestCommonSubSequenceBottomUp(str1, str2);
        assertEquals(expectedLength, actualLCSLength);
    }

    @Test
    void longestCommonSubSequenceSolutionBottomUp() {
        String expectedResult = "BDAB";
        String actualLCS = LongestCommonSubsequenceBottomUp.longestCommonSubSequenceSolutionBottomUp(str1, str2);
        assertEquals(expectedResult, actualLCS);
    }
}