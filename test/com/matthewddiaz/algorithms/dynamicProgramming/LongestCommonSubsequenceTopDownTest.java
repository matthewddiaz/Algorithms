package com.matthewddiaz.algorithms.dynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 7/18/17.
 */
class LongestCommonSubsequenceTopDownTest {
    private String str1 = "BDCABA";
    private String str2 = "ABCBDAB";

    @Test
    void longestCommonSubsequenceTopDown() {
        int expectedLength = 4;
        int lCSLength = LongestCommonSubsequenceTopDown.longestCommonSubsequenceTopDown(str1,str2);
        assertEquals(expectedLength, lCSLength);
    }
}