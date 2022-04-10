package com.palindromeNumber.solution;

public class PalindromeNumber {

    public static boolean palindromeNumber(int x) {

        //음수일 경우 false
        if (x < 0) {
            return false;
        }

        // x 갑을 담고 동작할 source 선언
        int source = x;
        int popNum = 0;
        int reverseNum = 0;

        //source 값이 0 보다 크다면, source의 1의 자리 값을 꺼내 와서 reverseNum의 값에 pop 해줌 (자리 올림으로 값을 더해줌)
        while(source > 0) {
            popNum = source % 10;
            source = source / 10;
            reverseNum = reverseNum * 10 + popNum;
        }

        //초기 input 값(x)과 결과 값의 비교 반환
        return reverseNum == x;
    }
}
