package com.leetCodeSolution.dp.solution62;

public class UniquePaths {
    public static int uniquePaths(int m, int n) {
        // m = 세로
        // n = 가로

        final int curIndex = 0;
        return find(m,n,curIndex,0,0);
    }

    private static int find(int maxM, int maxN, int curIndex, int curM, int curN) {
        if(curIndex == maxM + maxN - 2) {
            return 1;
        }
        int sum = 0;
        if(curM + 1 < maxM) {
            sum += find(maxM,maxN,curIndex+1,curM +1, curN);
        }
        if (curN + 1 < maxN) {
            sum += find(maxM, maxN, curIndex+1, curM, curN + 1);
        }
        return sum;
    }
}
