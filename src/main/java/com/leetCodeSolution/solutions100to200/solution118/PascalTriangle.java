package com.leetCodeSolution.solutions100to200.solution118;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of(1));

        for (int i = 0; i< numRows; i++) {
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < i + 1; j++) {
                if( j==0 || j == i) {
                    list.add(1);
                } else {
                    int pre = result.get(i).get(j-1);
                    int cur = result.get(i).get(j);
                    list.add(pre + cur);
                }
            }
            result.add(list);
        }
        return result;
    }
}
