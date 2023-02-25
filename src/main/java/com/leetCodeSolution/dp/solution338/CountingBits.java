package com.leetCodeSolution.dp.solution338;

public class CountingBits {
    public static int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            result[i] = solve(i);
        }
        return result;
    }

    private static int solve(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i % 2 == 0) { //even
            return solve(i / 2);
        } else {
            return solve(i / 2) + 1;
        }
    }

    public static int[] countBits2(int n) {
        int[] result = new int[n + 1];
        if (n == 0) {
            return result;
        }
        for (int i = 0; i < n + 1; i++) {
            if (i % 2 == 0) {
                result[i] = result[i / 2];
                continue;
            }
            result[i] = result[i - 1] + 1;
        }
        return result;
    }
}
