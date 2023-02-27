package com.leetCodeSolution.dp.solution22;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        make(0, 0, result, "", n);
        return result;
    }

    private static void make(int open, int close, List<String> result, String s, int n) {
        if (s.length() == n * 2) {
            result.add(s);
            return;
        }
        if (open < n) {
            make(open + 1, close, result, s + "(", n);
        }
        if (open > close) {
            make(open, close + 1, result, s + ")", n);
        }
    }
}
