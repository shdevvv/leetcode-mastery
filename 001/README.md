# LeetCode 001

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

## Approach

Check one by one increases time complexity. O(n^2)
Use other method which is sorting. O(nlogn)
Fastest approach we need, hashset :

- make hashset container O(1), if already exist means contains duplicated. O(1)
  time : O(n) space: O(n)

[3,1,2,5,6,1]

