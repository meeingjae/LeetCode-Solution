package com.medianOfTwoSortedArrays.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MedianOfTwoSortedArrays {

    public static double medianOfTwoSortedArrays(int[] lst1, int[] lst2) {

        // 원하는 index 값을 얻기 위해 두 Array의 size를 구함
        int totalSize = lst1.length + lst2.length;

        // lst1과 lst2의 모든 수를 담을 그릇
        List<Integer> resultArray = new ArrayList<>();

        for (int num : lst1) {
            resultArray.add(num);
        }
        for (int num : lst2) {
            resultArray.add(num);
        }

        // lst1과 lst2를 담은 그릇을 오름차순 정렬
        List<Integer> sortedArray = resultArray.stream().sorted().collect(Collectors.toList());

        // 전체 목록 size의 홀수 짝수 여부로 분기
        if (totalSize % 2 == 1) {
            // 정수임을 보증하기 위한 형변환을 포함
            return sortedArray.get((int) ((totalSize + 1) * 0.5) - 1);
        } else {
            return (sortedArray.get((int) (totalSize * 0.5) - 1) + sortedArray.get((int) (totalSize * 0.5))) * 0.5;
        }
    }

}
