package com.leetCodeSolution.solutions.solution26;

public class Solution {

    public static int removeDuplicates(int[] nums) {

        int start = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[start++] = nums[i];
            }
        }

        return start;
    }
}
