package com.leetCodeSolution.dp.solution221;

public class MaximalSquare {
    public static int maximalSquare(int[][] matrix) {
        //get maxRows and maxCols
        int rows = matrix.length;
        int cols = rows > 0 ? matrix[0].length : 0;
        // init dp space
        int[] dp = new int[cols + 1];
        // 최대 사각형 길이와, 이전 값 생성
        int maxsqlen = 0, prev = 0;
        // 1부터 열만큼 순회
        for (int i = 1; i <= rows; i++) {
            // 1부터 행만큼 순회
            for (int j = 1; j <= cols; j++) {
                // 순회하는 행을 temp에 넣음
                int temp = dp[j];
                // 만약 대각선 왼쪽 행이 1이면? (위, 왼쪽이 1이면 사각현 완성)
                if (matrix[i - 1][j - 1] == '1') {
                    dp[j] = Math.min(Math.min(dp[j - 1], prev), dp[j]) + 1;
                    maxsqlen = Math.max(maxsqlen, dp[j]);
                } else {
                    dp[j] = 0;
                }
                prev = temp;
            }
        }
        return maxsqlen * maxsqlen;
    }
}
