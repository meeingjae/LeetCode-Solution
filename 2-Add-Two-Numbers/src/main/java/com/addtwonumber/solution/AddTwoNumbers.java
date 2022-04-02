package com.addtwonumber.solution;

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // 재귀 호출 문제
        // 자기 자신의 값을 구하는 것이 목적이고,
        // 다음 녀석한테 너의 값을 계산해 라는 메세지를 줄 수 있어야 한다. -- 이 문제의 의도라고 판단

        int risingNum = 0;
        int sum = 0;

        if (l1.val + l2.val >= 10) {
            risingNum = 1;
            sum = l1.val + l2.val - 10;
        } else {
            sum = l1.val + l2.val;
        }

        if (l1.next == null && l2.next == null) {
            if (risingNum == 0) {
                return new ListNode(sum);
            } else {
                return new ListNode(sum, new ListNode(risingNum));
            }
        } else if (l1.next != null && l2.next == null) {
            l1.next.val += risingNum;
            return new ListNode(sum, addTwoNumbers(l1.next, new ListNode()));
        } else if (l1.next == null && l2.next != null) {
            l2.next.val += risingNum;
            return new ListNode(sum, addTwoNumbers(l2.next, new ListNode()));
        } else {
            l1.next.val += risingNum;
            return new ListNode(sum, addTwoNumbers(l1.next, l2.next));
        }
    }
}

