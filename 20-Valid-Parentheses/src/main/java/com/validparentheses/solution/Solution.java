package com.validparentheses.solution;

public class Solution {

    public boolean isValid(String s) {
        ParenthesesValidator validator = new ParenthesesValidator(s);
        return validator.isValid();
    }
}
