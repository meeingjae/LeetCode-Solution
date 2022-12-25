package com.leetCodeSolution.solutions200to250.solutions202;

public class HappyNumber {
    public static boolean isHappyNumber(int n) {
        if (n < 10) {
            if (n == 1 || n == 7) {return true;} else {return false;}
        }
        int b;
        int sum = 0;
        while (n > 0) {
            b = n % 10;
            sum = sum + b * b;
            n = n / 10;
        }
        return isHappyNumber(sum);
    }
}
