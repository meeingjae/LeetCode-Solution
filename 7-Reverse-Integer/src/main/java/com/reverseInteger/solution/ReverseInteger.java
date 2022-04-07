package com.reverseInteger.solution;

public class ReverseInteger {

    public static int reverse(int x) {

        //54321
        //12345

        //4321
        //5

        //432
        //45

        int rev = 0;
        while (x != 0) {
            // 1의자리 수를 가져온다 (나머지 계산)
            int pop = x % 10;
            // 1의자리 수 뽑았으니, 1의자리 수를 없앤다
            x /= 10;
            // Integer의 Max값보다 한자리 아래여서, 더하면 Error가 발생하는 상황을 예외로 잡는다
            // 마찬가지로, Integer의 Max값과 같은 자리수 이면서, 7 이상 값이 들어오는 경우를 예외로 잡는다
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            //reverse 값을 한 자리씩 올리고, 1의 자리에 뽑아온 값을 넣는다
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
