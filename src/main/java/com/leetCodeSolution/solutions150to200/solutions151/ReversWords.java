package com.leetCodeSolution.solutions150to200.solutions151;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReversWords {

    public static String reverseWords(String s) {
        List<String> list = Arrays.asList(s.trim().split(" "));

        List<String> result = list.stream()
                                  .filter(it -> !it.trim().equals(""))
                                  .collect(Collectors.toList());
        Collections.reverse(result);
        return result.stream().collect(Collectors.joining(" "));
    }
}
