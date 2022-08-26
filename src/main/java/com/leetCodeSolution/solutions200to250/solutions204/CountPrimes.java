package com.leetCodeSolution.solutions200to250.solutions204;

public class CountPrimes {
    public static int countPrimes(int n) {
        boolean[] checkedPrime = new boolean[n+1];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!checkedPrime[i]) {
                count++;
            }
            for (int j = i; j <= n; j += i) {
                checkedPrime[j] = true;
            }
        }
        return count;
    }
}
