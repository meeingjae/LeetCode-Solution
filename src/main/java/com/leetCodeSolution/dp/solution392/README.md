# 338. Counting Bits[README.md](..%2Fsolution338%2FREADME.md)

-- --
Given two strings `s` and `t`, return `true` if `s` is a **subsequence** of `t`, or `false` otherwise.

A **subsequence** of a string is a new string that is formed from the original string by deleting some (can be
none) of the characters without disturbing the relative positions of the remaining characters. (i.e., `"ace"` is
a subsequence of `"abcde"` while "aec" is not).

### Example 1:

> **Input** : s = "abc", t = "ahbgdc"
>
> **Output** : true

### Example 2:

> **Input** : s = "axc", t = "ahbgdc"
>
> **Output** : false

### Constraints:

* 0 <= s.length <= 100
* 0 <= t.length <= 104
* s and t consist only of lowercase English letters.

### Follow up:

* Suppose there are lots of incoming `s`, say `s1`, `s2, ..., sk` where `k >= 10^9`, and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?

-- --
Source : [leetcode - 392. Is Subsequence](https://leetcode.com/problems/is-subsequence/)

-- --

### 풀이

* s의 인덱스와 t의 인덱스를 하나씩 증가시키며 t를 딱 한번 순회할 동안 s의 인덱스가 s의 크기와 같아지면 true를 반환한다. (t 캐릭터 값과 s 캐릭터 값이 일치하면 s 인덱스 증가)
* 위와 같이 구현했을 경우, 시간 복잡도는 O(t) 를 초과하지 않으므로 가장 효율적인 방법으로 보인다
* 위와같이 구현하지 않고 s 값을 찾을 경우 매번 t를 새로 순회하는 구현방법도 있을텐데, 그것은 최대 시간복잡도 O(st) 를 가질 수 있어 위 구현 방법보다 비효율적이다

