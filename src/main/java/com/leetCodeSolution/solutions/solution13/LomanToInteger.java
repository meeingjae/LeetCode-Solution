package com.leetCodeSolution.solutions.solution13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LomanToInteger {

    public static Integer romanToInteger(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // HashMap에 로마 숫자와 값 매핑
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        List<Character> sList = new ArrayList<>();

        // input String을 Char Array로 변환
        for (int i = 0; i < s.length(); i++) {
            sList.add(s.charAt(i));
        }

        Integer sum = 0;
        int index = 0;
        for (char c : sList) {
            // c가 s의 마지막 index인지 확인
            if (index + 1 < s.length()) {
                // 다음 index의 값이 현재 index 값보다 크면 현재 index 값을 뺀다
                if (map.get(s.charAt(index)) < map.get(s.charAt(index + 1))) {
                    sum -= map.get(c);
                    index++;
                }
                // 다음 index의 값이 현재 index 값보다 작으면 현재 index 값을 더한다
                else {
                    sum += map.get(c);
                    index++;
                }
            } else {
                sum += map.get(c);
            }
        }
        System.out.println("sum : " + sum);
        return sum;
    }
}
