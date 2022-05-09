package com.example.searchinsertposition.solution;

public class Solution {

    public static int searchInsert(int[] nums, int target) {
        IntUtil intUtil = new IntUtil(nums);
        return intUtil.searchInsert(target);
    }
}
