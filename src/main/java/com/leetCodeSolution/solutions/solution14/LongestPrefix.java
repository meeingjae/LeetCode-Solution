package com.leetCodeSolution.solutions.solution14;

public class LongestPrefix {

    public static String longestPrefix(String[] strs) {

        // 예외 처리
        if (strs == null || strs.length == 0) return "";

        for (int i = 0; i < strs[0].length() ; i++){
            // 배열 첫번째 String의 글자를 순회하며 c 값에 대입
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                // 전체 strs 배열 중 같지 않은 값이 나올때까지 순회
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    // 결과 값까지 substring
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
}
