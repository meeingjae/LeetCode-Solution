package com.leetCodeSolution.solutions.solution58;

public class LengthOfLastWord {

    private static final String SPACE = " ";

    public static int lengthOfLastWord(String s) {

        String[] stringList = s.trim().split(SPACE);
        return stringList[stringList.length - 1].length();
    }
}
