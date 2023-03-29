package com.leetCodeSolution.dp.solution746;

public class MinCostClimbingStairs {
    public static int minCostClimbingStairs(int[] cost) {
        int current = 0;
        int cost1 = 0;
        int cost2 = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            current = cost[i] + Math.min(cost1, cost2);
            cost2 = cost1;
            cost1 = current;
        }
        return Math.min(cost1, cost2);
    }
}
