package com.leetCodeSolution.dp.solution122;

public class BestTimeToBuyAndSellStockII {
    public static int maxProfit(int[] prices) {
        int i = 0;
        int maxProfit = 0;
        int valley;
        int peak;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1]) {i++;}

            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1]) {i++;}

            peak = prices[i];
            maxProfit += peak - valley;
        }
        return maxProfit;
    }

    public static int maxProfit2(int[] prices) {

        int i = 0;
        int maxProfit = 0;
        while (i < prices.length - 1) {
            if (prices[i] < prices[i + 1]) {
                maxProfit += prices[i + 1] - prices[i];
            }
            i++;
        }
        return maxProfit;
    }
}
