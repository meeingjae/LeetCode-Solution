package com.leetCodeSolution.dp.solution392;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if(s.isBlank()) {
            return true;
        }
        if(t.isBlank()) {
            return false;
        }
        int sIndex = 0;
        int tIndex = 0;
        while(tIndex < t.length()) {
            if(t.charAt(tIndex) == s.charAt(sIndex)) {
                sIndex++;
                if(sIndex == s.length()) {
                    return true;
                }
            }
            tIndex++;
        }
        return false;
    }
}
