package com.leetCodeSolution.solutions.solution53;

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int i = 0;

        while(i < nums.length) {
            currSum = Math.max(currSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currSum);
            i++;
        }
        return maxSum;
    }
}
