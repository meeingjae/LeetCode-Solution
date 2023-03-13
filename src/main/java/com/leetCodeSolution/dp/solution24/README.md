# 24. Swap Nodes in Pairs

-- --
Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without
modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

### Example 1:

![](img/1.png)

> **Input** : head = [1,2,3,4]
>
> **Output** : [2,1,4,3]

### Example 2:

> **Input** : head = []
>
> **Output** : []

### Example 3:

> **Input** : head = [1]
>
> **Output** : [1]

### Constraints:

* The number of nodes in the list is in the range `[0, 100]`.
* `0 <= Node.val <= 100`

-- --
Source : [leetcode - 24. Swap Nodes in Pairs](https://leetcode.com/problems/swap-nodes-in-pairs/)

-- --

### Solution

소거법을 사용한다
0,0 ~ max,max 까지 오른쪽 대각선으로 향한다
세로가 0 일때는 이전 가로 값을 더해준다
가로가 0 일때는 이전 세로 값을 더해준다
가로 세로가 둘다 0이 아닐때는 현재 값 + Math.min(이전세로값, 이전가로값) 으로 현재 값 + 이전 최소 값을 구한다
결국 마지막 값도 이전 가로 값(최소값만 골라서 sum한 것) 과 이전 세로 값(최소값만 골라서 sum한 것) 둘 중 작은 값을 현재 값에 더할 것이고
결국 그 값이 정답이 될 것이다.
더하면서 이전 값은 고민하지 않는다
