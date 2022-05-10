package com.leetCodeSolution.solutions.solution20;

import java.util.Stack;

public class ParenthesesValidator {

    private static final char START_PARENTHESES = '(';
    private static final char START_BRACES      = '{';
    private static final char START_BRACKETS    = '[';
    private static final char END_PARENTHESES   = ')';
    private static final char END_BRACES        = '}';
    private static final char END_BRACKETS      = ']';

    private final String input;
    private Stack<Character> stack = new Stack<>();

    public ParenthesesValidator(String input) {

        this.input = input;
    }

    public boolean isValid() {

        if(input.length() % 2 !=0) {
            return false;
        }

        char[] chars = input.toCharArray();
        for (char c : chars) {
            if(c== END_PARENTHESES && !stack.isEmpty() && stack.peek() == START_PARENTHESES) {
                stack.pop();
            } else if (c == END_BRACES && !stack.isEmpty() && stack.peek() == START_BRACES) {
                stack.pop();
            } else if (c == END_BRACKETS && !stack.isEmpty() && stack.peek() == START_BRACKETS) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

}
