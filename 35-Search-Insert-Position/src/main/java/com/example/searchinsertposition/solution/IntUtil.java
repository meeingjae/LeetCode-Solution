package com.example.searchinsertposition.solution;

public class IntUtil {

    private final int[] nums;

    public IntUtil(int[] nums) {

        this.nums = nums;
    }

    public int searchInsert(int target) {

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                index++;
            }
        }
        return index;
    }

}
