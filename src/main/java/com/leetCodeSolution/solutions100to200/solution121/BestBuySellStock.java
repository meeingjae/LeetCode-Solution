package com.leetCodeSolution.solutions100to200.solution121;

public class BestBuySellStock {
    public static int maxProfit(int[] prices) {
        int length = prices.length;
        if (length == 1) {
            return 0;
        }
        int maxProfit = 0;
        for (int i = 0; i < length; i++) {
            int iter = prices[i];
            int sell = 0;
            for (int j = i; j < length; j++) {
                sell = Integer.max(sell, (prices[j] - iter));
            }
            maxProfit = Integer.max(maxProfit, sell);
        }
        return maxProfit;
    }
}
