package com.leetCodeSolution.solutions.solution3;

import java.util.ArrayList;
import java.util.List;

public class LengthOfLongestSubString {

    public static int lengthOfLongestSubstring(String s) {

        int longestLength = 0;

        List<Character> charArray = new ArrayList<>();

        if (s.length() ==0) {
            return 0;
        }

        for(char c : s.toCharArray()) {
            if (charArray.contains(c)) {
                longestLength = charArray.size();
                int nextLength = lengthOfLongestSubstring(s.substring(1));
                return Math.max(longestLength, nextLength);
            } else {
                charArray.add(c);
            }
        }
        return charArray.size();
    }
}
