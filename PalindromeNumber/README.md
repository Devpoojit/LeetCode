# [Palindrome Number](https://leetcode.com/problems/palindrome-number/)
-   Problem Statement:
    Given an integer x, return true if x is a palindrome, and false otherwise.

    - Test Cases:
        - Case 1:
            Input: x = 121
            Output: true
            Explanation: 121 reads as 121 from left to right and from right to left.

        - Case 2:
            Input: x = -121
            Output: false
            Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

        - Case 3:
            Input: x = 10
            Output: false
            Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

        - Solution:
            Reverses the orignal number and compares them.