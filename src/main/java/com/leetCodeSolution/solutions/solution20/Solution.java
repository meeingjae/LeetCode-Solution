package com.leetCodeSolution.solutions.solution20;

public class Solution {

    public boolean isValid(String s) {
        ParenthesesValidator validator = new ParenthesesValidator(s);
        return validator.isValid();
    }
}
