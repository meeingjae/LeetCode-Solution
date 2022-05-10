package com.leetCodeSolution.solutions.solution8;

public class StringToInteger {

    public static int stringToInteger(String s) {

        // 상수 정의
        final char ZERO = '0';
        final char SPACE = ' ';
        final char PLUS = '+';
        final char MINUS = '-';

        char[] charArray = s.toCharArray();
        //양수, 음수 여부
        boolean isPlus = true;
        int result = 0;
        int index = 0;
        int sLength = s.length();

        //공백 무시
        while (index < sLength && charArray[index] == SPACE) {
            index++;
        }

        // '+' 여부
        if (index < sLength && charArray[index] == PLUS) {
            index++;
        // '-' 여부
        } else if (index < sLength && charArray[index] == MINUS) {
            isPlus = false;
            index++;
        }

        while (index < sLength && Character.isDigit(charArray[index])) {
            // char 값 - 자기 자신 = 0 --> '0' - '0' = (int) 0
            // 0 값 제거
            int digit = charArray[index] - ZERO;

            // int형 변수의 Max, Min 값 체크
            if ((result > Integer.MAX_VALUE / 10) ||
                    (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return isPlus ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            // 한자리씩 올리며 결과 값에 더해줌
            result = 10 * result + digit;
            index++;
        }

        //음수, 양수 여부는 마지막에 체크한다
        // 양수 음수 여부에 따른 결과
        return isPlus ? result : result * -1;
    }
}
