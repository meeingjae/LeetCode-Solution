# 142. Linked List Cycle II

-- --
Given the `head` of a linked list, return the node where the cycle begins. If there is no cycle, return `null`.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously
following the `next` pointer. Internally, `pos` is used to denote the index of the node that tail's `next`
pointer is connected to (**0-indexed**). It is -1 if there is no cycle. **Note that `pos` is not passed as a
parameter**.

**Do not modify** the linked list.

### Example 1:

![](img/example1.png)
> **Input** : head = [3,2,0,-4], pos = 1
>
> **Output** : tail connects to node index 1
>
> **Explanation** : There is a cycle in the linked list, where tail connects to the second node.

### Example 2:

![](img/example2.png)
> **Input** : head = [1,2], pos = 0
>
> **Output** : tail connects to node index 0
>
> > **Explanation** : There is a cycle in the linked list, where tail connects to the first node.

> ### Example 3:
![](img/example3.png)
> **Input** : head = [1], pos = -1
>
> **Output** : no cycle (null)
>
> **Explanation** : There is no cycle in the linked list.

### Constraints:

* The number of the nodes in the list is in the range `[0, 10^4]`.
* `-10^5 <= Node.val <= 10^5`
* `pos` is `-1` or a `valid index` in the linked-list. memory?

**Follow up**: Can you solve it using `O(1)` (i.e. constant) memory?
-- --
Source : [142. Linked List Cycle II
](https://leetcode.com/problems/linked-list-cycle-ii/)

-- --

## Submit Result

### Runtime: **1 ms**, **faster than 74.29%** of Java online submissions for Linked List Cycle II.


### Memory Usage: 44.9 MB, **less than 66.54%** of Java online submissions for Linked List Cycle II.