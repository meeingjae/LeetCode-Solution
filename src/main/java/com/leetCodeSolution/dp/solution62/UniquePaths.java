package com.leetCodeSolution.dp.solution62;

public class UniquePaths {
    public static int uniquePaths(int m, int n) {
        // m = 세로
        // n = 가로

        final int curIndex = 0;
        return find(m, n, curIndex, 0, 0);
    }

    private static int find(int maxM, int maxN, int curIndex, int curM, int curN) {
        if (curIndex == maxM + maxN - 2) {
            return 1;
        }
        int sum = 0;
        if (curM + 1 < maxM) {
            sum += find(maxM, maxN, curIndex + 1, curM + 1, curN);
        }
        if (curN + 1 < maxN) {
            sum += find(maxM, maxN, curIndex + 1, curM, curN + 1);
        }
        return sum;
    }

    public static int memoization(int m, int n) {
        return memoizationHelper(m - 1, n - 1, new int[n][m]);
    }

    private static int memoizationHelper(int m, int n, int[][] memo) {
        if (m < 0 || n < 0) {
            return 0;
        } else if (m == 0 || n == 0) {
            return 1;
        } else if (memo[n][m] > 0) {
            return memo[n][m];
        } else {
            memo[n][m] = memoizationHelper(m - 1, n, memo) + memoizationHelper(m, n - 1, memo);
            return memo[n][m];
        }
    }

    public static int dp(int m, int n) {
        int[][] grid = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0) grid[0][j] = 1;
                if (j == 0) grid[i][j] = 1;
                if (i != 0 && j != 0) {
                    int up = grid[i - 1][j];
                    int left = grid[i][j - 1];
                    grid[i][j] = up + left;
                }
            }
        }
        return grid[n - 1][m - 1];
    }
}
