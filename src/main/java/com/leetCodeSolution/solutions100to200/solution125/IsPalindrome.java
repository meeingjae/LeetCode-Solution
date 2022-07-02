package com.leetCodeSolution.solutions100to200.solution125;

public class IsPalindrome {

    public static boolean isPalindrome(String s) {
        char[] charArray = s.toLowerCase().toCharArray();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i< charArray.length; i++) {
            char cur = charArray[i];
            if (Character.isLetterOrDigit(cur)){
                builder.append(cur);
            }
        }
        return builder.toString().equals(builder.reverse().toString());
    }
}
