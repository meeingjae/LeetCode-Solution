package com.leetCodeSolution.solutions150to200.solutions153;

import java.util.Arrays;

public class MinRotatedSortedArray {

    public static int findMin(int[] nums) {
        return Arrays.stream(nums).min().getAsInt();
    }
}
