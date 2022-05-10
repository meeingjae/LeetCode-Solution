# 6. Zigzag Conversion

-- --

The string ```"PAYPALISHIRING"``` is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

> P&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;H&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;N
> 
> A&nbsp; P&nbsp; L&nbsp; S &nbsp;I &nbsp;I&nbsp; G 
> 
> Y&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;R


And then read line by line: ```PAHNAPLSIIGYIR```

Write the code that will take a string and make this conversion given a number of rows:

> string convert(string s, int numRows);

### Example 1:

> **Input:** s = "PAYPALISHIRING", numRows = 3
> 
> **Output:** "PAHNAPLSIIGYIR" 

### Example 2:

> **Input:** s = "PAYPALISHIRING", numRows = 4
> 
> **Output:** "PINALSIGYAHRPI"
> 
> Explanation:
> 
> P &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; N
> 
> A &nbsp;&nbsp;&nbsp;&nbsp;L &nbsp;S  &nbsp;&nbsp;&nbsp;&nbsp;I &nbsp;G 
> 
> Y &nbsp;A &nbsp;&nbsp;&nbsp;H &nbsp;R
> 
> P &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;I 

### Example 3:

> Input: s = "A", numRows = 1
> 
> Output: "A"

### Constraints:

* ```1 <= s.length <= 1000```
* ```s``` consists of English letters (lower-case and upper-case), ```','``` and ```'.'```.
* ```1 <= numRows <= 1000```

-- -- 
Source : [leetcode - 6. Zigzag Conversion](https://leetcode.com/problems/zigzag-conversion/)

-- --
## Submit result