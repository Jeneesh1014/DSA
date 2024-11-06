package com.dsa.Array.Easy.Medium;

//https://leetcode.com/problems/find-if-array-can-be-sorted/description/

public class ArrayCanBeSorted {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4}; // Sample input array
        Solution solution = new Solution();

        if (solution.canSortArray(nums)) {
            System.out.println("The array can be sorted.");
        } else {
            System.out.println("The array cannot be sorted.");
        }
    }
}
class Solution {
    public boolean canSortArray(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[i]) {
                    if (Integer.bitCount(nums[i]) == Integer.bitCount(nums[j])) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    } else {
                        return false;
                    }
                }
            }
        }

        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }

        return true;
    }
}