package com.leetCodeSolution.solutions.solution35;

public class Solution {

    public static int searchInsert(int[] nums, int target) {
        IntUtil intUtil = new IntUtil(nums);
        return intUtil.searchInsert(target);
    }
}
