package com.leetCodeSolution.solutions.solution66;

import java.math.BigInteger;

public class PlusOne {

    public static int[] plustOne(int[] digits) {

        StringBuilder sb = new StringBuilder();
        for(int num:digits)
            sb.append(num);
        String s = ((new BigInteger(sb.toString())).add(new BigInteger("1"))).toString();
        int arr[] = new int[s.length()];
        int i = 0;
        for(char ch:s.toCharArray())
            arr[i++]=Character.getNumericValue(ch);
        return arr;
    }
}
