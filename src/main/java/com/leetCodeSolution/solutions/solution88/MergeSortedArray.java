package com.leetCodeSolution.solutions.solution88;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;

        for (int i = 0; i < m; i++) {
            map.put(index++, nums1[i]);
        }
        for (int i = 0; i < n; i++) {
            map.put(index++, nums2[i]);
        }
        List<Integer> result = map.values().stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < m + n; i++) {
            nums1[i] = result.get(i);
        }
    }
}
