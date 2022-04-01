package com.twosum.solution;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int firstIndex = 0;
        int secondIndex = 0;
        int[] result = new int[2];

        // 배열 내 두 원소 값의 합이 target이 될 때까지 자기 자신(nums)을 순회한다.
        for (int fi=0; fi<nums.length; fi++) {
            for (int si=0; si<nums.length; si++) {
                if (fi != si) {
                    if (target == (nums[fi] + nums[si])) {
                        firstIndex = fi;
                        secondIndex = si;
                    }
                }
            }
        }
        result[0] = firstIndex;
        result[1] = secondIndex;

        return result;
    }
}
