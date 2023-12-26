# Add Two Numbers
- Problem Statement: 
    You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
    
    - Test Cases:
        Case 1:
        ![image](AddTwoNum.jpeg)
        Input: l1 = [2,4,3], l2 = [5,6,4]
        Output: [7,0,8]
        Explanation: 342 + 465 = 807

        Case 2:
        Input: l1 = [0], l2 = [0]
        Output: [0]

        Case 3:
        Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        Output: [8,9,9,9,0,0,0,1]
        
    - Solution:
        Sum of each digit is computed along with carry over amount. If sum is greater than 9, the tens place is carried over to the next sum calculation. End reuslt is returned.