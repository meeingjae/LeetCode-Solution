package com.leetCodeSolution.solutions200to250.solutions201;

public class BitwiseAndNumRange {
    /**
     * 10 - 01010
     * 11 - 01011
     * 12 - 01100
     * 13 - 01001
     * 14 - 01010
     * 15 - 01100
     * 16 - 01101
     * 17 - 01110
     * 18 - 01111
     * 19 - 10000
     * 20 - 10001
     */
    public static int rangeBitwiseAnd(int left, int right) {
        int i = 0;
        while(left != right){
            left >>= 1;
            right >>= 1;
            i++;
        }
        return left << i;
    }
}
