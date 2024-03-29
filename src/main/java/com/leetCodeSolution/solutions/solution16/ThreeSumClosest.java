package com.leetCodeSolution.solutions.solution16;

import java.util.Arrays;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int res = 0;
        if (n <= 3) {
            for (int num:nums)
                res += num;
            return res;
        }

        res = nums[0] + nums[1] + nums[2];
        for (int i = 0; i <= n - 3; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(target - res) >= Math.abs(target - sum)) {
                    res = sum;
                    if (res == target) return res;
                }
                if (sum > target) k--;
                else if (sum < target) j++;
            }
        }
        return res;
    }
}
