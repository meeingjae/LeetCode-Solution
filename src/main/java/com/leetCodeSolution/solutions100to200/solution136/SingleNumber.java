package com.leetCodeSolution.solutions100to200.solution136;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        Set<Integer> result = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (result.contains(nums[i])) {
                result.remove(nums[i]);
            } else {
                result.add(nums[i]);
            }
        }
        return (int) result.toArray()[0];
    }

    public static int xorSingleNumber(int[] nums) {
        int result = 0;
        for (int i =0; i<nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
