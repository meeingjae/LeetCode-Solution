package com.leetCodeSolution.solutions100to150.solution142;

import com.leetCodeSolution.common.ListNode;

public class LinkedListCycleII {
    public static ListNode hasCycle(ListNode head) {
        // walker와 runner에 Assign
        ListNode walker = head;
        ListNode runner = head;

        // ruuner와 runner의 next가 null이 아닌 경우 Cycle 존재
        while (runner != null && runner.next != null) {
            // walker = 1칸, runner = 2칸씩 이동
            walker = walker.next;
            runner = runner.next.next;

            //walker와 runner가 만나는 지점 (Cycle의 존재가 확인되는 순간 (어디가 cycle인지는 모름))
            if (walker == runner) {
                // cycle을 진행중이던 walker 혹은 runner 아무에게나 최초 head 할당
                // 새로운 sloe2 라는 Node를 생성해도 무방하다
                runner = head;
                // cycle을 진행중이던 Node와 새로 head를 할당받은 node가 다시 순환
                // (A) runner가 head 부터 cycle 시작 지점 'P'까지 도착하는 거리
                // (B) walker가 이전에 cycle의 존재가 확인 된 순간으로부터 다시 cycle 시작 지점 'P'까지 도착하는 거리
                // A == B
                while (runner != walker) {
                    runner = runner.next;
                    walker = walker.next;
                }
                return walker;
            }
        }
        return null;
    }
}
