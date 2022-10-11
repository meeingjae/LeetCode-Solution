package com.leetCodeSolution.solutions.solution17;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsPhoneNumber {
    public static List<String> letterCombinations(String input) {
        LinkedList<String> ans = new LinkedList<String>();
        if (input.isEmpty()) {return ans;}
        String[] mapping = new String[] { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        ans.add("");
        for (int i = 0; i < input.length(); i++) {
            int x = Character.getNumericValue(input.charAt(i));
            while (ans.peek().length() == i) {
                String t = ans.remove();
                for (char s : mapping[x].toCharArray()) {ans.add(t + s);}
            }
        }
        return ans;
    }
}
