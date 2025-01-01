package com.dsa.leetcode;

//https://leetcode.com/problems/contiguous-array
public class ContiguosArray {
//    class Solution {
//        public int findMaxLength(int[] nums) {
//            int count = 0;
//            for (int i = 0; i < nums.length; i++) {
//                int zeros = 0, ones = 0;
//                for (int j = i; j < nums.length; j++) {
//                    if (nums[j] == 0) {
//                        zeros++;
//                    } else {
//                        ones++;
//                    }
//                    if (zeros == ones) {
//                        count = Math.max(count, j - i + 1);
//                    }
//                }
//            }
//            return count;
//        }
//    }
}


// 2 Solution
//class Solution {
//    public int findMaxLength(int[] nums) {
//        if (nums == null || nums.length == 0) { // Base Case
//            return 0;
//        }
//        // Converting all 0 to -1
//        for(int i = 0; i < nums.length; i++){
//            if(nums[i] == 0) nums[i] = -1;
//        }
//        int sum = 0; // current
//        int max = 0; // final-ans
//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(0, -1); // put reference in the starting of 0 & -1, as i have tell you in the starting
//        for(int i = 0; i < nums.length; i++){
//            sum += nums[i]; // cumulative sum
//            if(map.containsKey(sum)){ // if cumulative sum key :- 0, -1, 1 already present
//                int last = map.get(sum); // we get it's value
//                max = Math.max(max, i - last); // and update max
//            }
//            else{ // if it's not present then create it's key-value pair
//                map.put(sum, i);
//            }
//        }
//        return max; // finally return it
//    }
//}