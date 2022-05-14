package com.leetCodeSolution.solutions.solution67;

public class AddBinary {

    public static String addBinary(String a, String b) {

        int aLength, bLength;
        aLength = a.length() - 1;
        bLength = b.length() - 1;
        int sum, carry = 0;
        StringBuilder ans = new StringBuilder();
        while (aLength >= 0 || bLength >= 0) {
            sum = carry + (aLength >= 0 ? a.charAt(aLength) - '0' : 0) + (bLength >= 0 ? b.charAt(bLength) - '0' : 0);
            carry = (sum >= 2 ? 1 : 0);
            if (sum == 2) {
                sum = 0;
            } else if (sum == 3) {
                sum = 1;
            }
            ans.insert(0, sum);
            aLength--;
            bLength--;
        }
        if (carry > 0) {
            ans.insert(0, carry);
        }
        return ans.toString();
    }
}
